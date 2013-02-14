package gr.manousos.bean;

import gr.manousos.annotations.LoggedIn;

import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.representation.Form;

@Named
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private boolean loggedIn;
	private String errorMsg;
	private String loggedInUsername;

	Properties config = new Properties();

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Produces
	@LoggedIn
	String getLoggedInUsername() {
		// if (this.loggedIn)
		System.err.println("Logariosmenos xristis " + this.loggedInUsername);
		return loggedInUsername;

		// return "";
	}

	// public void setLoginUsername(String loginUsername) {
	// this.loginUsername = loginUsername;
	// }

	public String Login() {
		ClientConfig conf = new DefaultClientConfig();
		Client client = Client.create(conf);

		try {
			config.load(getClass().getClassLoader().getResourceAsStream(
					"config.properties"));

			WebResource r = client.resource("http://localhost:"
					+ config.getProperty("web_port") + "/TaxisNet/rest/");

			Form f = new Form();
			f.add("username", this.userName);
			f.add("password", this.password);

			ClientResponse response = r.path("UserService/Login")
					.type(MediaType.APPLICATION_FORM_URLENCODED)
					.post(ClientResponse.class, f);

			if (response.getStatus() == 200)
				if (response.getEntity(String.class).equals("1")) {
					this.loggedIn = true;
					this.loggedInUsername = this.userName;
					return "E2";
				} else {
					this.errorMsg = "Δεν υπάρχει ο χρήστης ή ο κωδικός είναι λανθασμένος !";
				}
			else
				this.errorMsg = "Failed : HTTP error code : "
						+ response.getStatus();

		} catch (Exception e) {
			this.errorMsg = e.toString();
		}

		return "";
	}

	public String Logout() {
		((javax.servlet.http.HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false)).invalidate();
		return "";
	}

	public void login() {

		// boolean result = businessBean.checkCredentiais(username, password);

		if (this.loggedIn) {
			try {
				// errorMessageLogin = "";
				FacesContext.getCurrentInstance().getExternalContext()
						.getSessionMap().put("username", this.userName);
				FacesContext.getCurrentInstance().getExternalContext()
						.redirect("main.xhtml");

			} catch (IOException ex) {
				Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		} else {
			FacesContext.getCurrentInstance().getExternalContext()
					.getSessionMap().put("username", "");
			// errorMessageLogin = "Credentials not supported.";
		}
	}

}
