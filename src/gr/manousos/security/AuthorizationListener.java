package gr.manousos.security;

import gr.manousos.bean.LoginBean;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

public class AuthorizationListener implements PhaseListener {

    private static final long serialVersionUID = -6636167275041696510L;

    @Override
    public void afterPhase(PhaseEvent event) {
	FacesContext facesContext = event.getFacesContext();
	String currentPage = facesContext.getViewRoot().getViewId();

	boolean requiresAuthentication = (currentPage
		.lastIndexOf("Login.xhtml") > -1 || currentPage
		.lastIndexOf("Register.xhtml") > -1);

	HttpSession session = (HttpSession) facesContext.getExternalContext()
		.getSession(false);

	if (session == null) {
	    NavigationHandler nh = facesContext.getApplication()
		    .getNavigationHandler();
	    nh.handleNavigation(facesContext, null, "loginPage");
	} else {
	    String currentUser = "";
	    LoginBean login = (LoginBean) session.getAttribute("loginBean");
	    if (login != null)
		currentUser = login.getUserName();// session.getAttribute("userName");

	    if (!requiresAuthentication && (currentUser.trim().isEmpty())) {
		NavigationHandler nh = facesContext.getApplication()
			.getNavigationHandler();
		nh.handleNavigation(facesContext, null, "loginPage");
	    }
	}
    }

    @Override
    public void beforePhase(PhaseEvent event) {
	// TODO Auto-generated method stub

    }

    @Override
    public PhaseId getPhaseId() {
	return PhaseId.RESTORE_VIEW;
	// return null;
    }

}
