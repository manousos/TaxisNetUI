package gr.manousos.test.jUnit;

import gr.manousos.model.Contact;
import gr.manousos.model.Taxpayer;
import gr.manousos.model.User;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class TaxisNetTest extends TestCase {

    private int fromAFM, toAFM;

    public TaxisNetTest(String fromAFM, String toAFM) {
	try {
	    this.fromAFM = Integer.parseInt(fromAFM);
	    this.toAFM = Integer.parseInt(toAFM);
	} catch (NumberFormatException nfx) {
	    this.fromAFM = -1;
	    this.toAFM = -1;
	}
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
	if (this.fromAFM > 0 && this.toAFM > 0 && this.fromAFM <= this.toAFM) {
	    for (; fromAFM != toAFM; fromAFM++) {
		ClientConfig conf = new DefaultClientConfig();
		Client client = Client.create(conf);

		User u = new User();
		u.setUserName("user" + String.valueOf(fromAFM));
		u.setPassword("123456");
		u.setActive(1);
		u.setOtp("987654");

		Contact con = new Contact();
		con.setPhone("+302101234567");
		con.setFax("");
		con.setCell("+306956234797");
		con.setEmail("manouso1@freemail.gr");

		Taxpayer taxPayer = new Taxpayer();
		taxPayer.setAfm(String.valueOf(fromAFM));
		taxPayer.setContact(con);
		taxPayer.setFatherName("Αλέκος");
		taxPayer.setFname("Μάριος");
		taxPayer.setLname("Παπαδόπουλος");
		taxPayer.setUser(u);

		try {
		    Taxpayer newUser = null;
		    WebResource r = client
			    .resource("http://localhost:8098/TaxisNet/rest/");

		    newUser = r.path("UserService/Register")
			    .accept("application/json")
			    .type("application/json")
			    .post(Taxpayer.class, taxPayer);
		    if (newUser.getId() < 0)
			fail("Register for user with AFM"
				+ String.valueOf(fromAFM) + "failed");
		    // return ("SuccessPage");
		} catch (Exception ex) {
		    System.err.println(ex);
		}

	    }
	} else
	    fail("Wrong input AFM");
    }
}
