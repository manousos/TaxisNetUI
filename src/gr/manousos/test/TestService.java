package gr.manousos.test;

import gr.manousos.bean.E2Bean;
import gr.manousos.bean.E2Bean.LeasesProperties;
import gr.manousos.bean.E2Bean.OtherEstates;
import gr.manousos.bean.E2Bean.PartialEstates;
import gr.manousos.model.Contact;
import gr.manousos.model.E1;
import gr.manousos.model.E1Id;
import gr.manousos.model.E1dataFromTaxPayerFolder;
import gr.manousos.model.E1expensesRemovedFromTotalIncome;
import gr.manousos.model.E1incomesReduceTaxes;
import gr.manousos.model.E1infoData;
import gr.manousos.model.E1nauticalincomes;
import gr.manousos.model.E1objectiveSpending;
import gr.manousos.model.E1personDataBorneTaxpayer;
import gr.manousos.model.E1prepaidTaxes;
import gr.manousos.model.E1reduceTax;
import gr.manousos.model.E1taxPayerBankAccount;
import gr.manousos.model.E1taxableIncomes;
import gr.manousos.model.E2;
import gr.manousos.model.E2Id;
import gr.manousos.model.E2coOwner;
import gr.manousos.model.E2estate;
import gr.manousos.model.E2otherEstate;
import gr.manousos.model.RelatePerson;
import gr.manousos.model.Taxpayer;

import java.io.FileInputStream;
import java.net.URI;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.core.impl.provider.entity.XMLJAXBElementProvider.App;

public class TestService {

    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
	/*
	 * UserSrvImplService userService = new UserSrvImplService(); UserSrv
	 * userClient = userService.getUserSrvImplPort(); Taxpayer taxpayer =
	 * userClient.getTaxPayerById(9);
	 */
	ClientConfig conf = new DefaultClientConfig();
	Client client = Client.create(conf);

	// testReadProperties(conf);
	// testSubmitE2(client);
	// testE1SubmitService(client);
	Taxpayer t = getTaxPayerFromUserName("manousos2");
    }

    private static void testE1SubmitService(Client client) {
	Set<RelatePerson> relatePersons = new HashSet<RelatePerson>();

	Contact wifeContact = new Contact("2111231233", "6956565656", "");
	Contact delegateContact = new Contact("2111231236", "", "");

	RelatePerson wife = new RelatePerson();
	wife.setAddress("LALAL 43");
	wife.setAfm("9876546544");
	wife.setAtid("W123456");
	wife.setContact(wifeContact);
	// wife.setE1relatePersonses(e1relatePersonses)
	wife.setFatherName("Nontas");
	wife.setFname("ASpasia");
	wife.setLname("Markoulaki");
	// wife.setIdRelatePerson(idRelatePerson)
	wife.setType(1);

	RelatePerson delegate = new RelatePerson();
	delegate.setAddress("EVROU 22");
	delegate.setAfm("9876546548");
	delegate.setFatherName("Anestis");
	delegate.setFname("Nikos");
	delegate.setLname("Nikolaou");
	delegate.setContact(delegateContact);
	delegate.setType(2);

	relatePersons.add(wife);
	relatePersons.add(delegate);

	E1Id key = new E1Id(9, Calendar.getInstance().get(Calendar.YEAR));

	E1dataFromTaxPayerFolder dataFromTaxPayerFolderObj = new E1dataFromTaxPayerFolder();
	dataFromTaxPayerFolderObj.set_341(341.40f);
	E1expensesRemovedFromTotalIncome expensesRemovedFromTotalIncomeObj = new E1expensesRemovedFromTotalIncome();
	expensesRemovedFromTotalIncomeObj.set_033(1);
	E1incomesReduceTaxes incomesReduceTaxesObj = new E1incomesReduceTaxes();
	incomesReduceTaxesObj.set_417("0123456780");
	E1infoData infoDataObj = new E1infoData();
	infoDataObj.set_007(1);
	E1objectiveSpending objectiveSpendingObj = new E1objectiveSpending();
	objectiveSpendingObj.set_211(211.11f);
	E1personDataBorneTaxpayer personDataBorneTaxpayerObj = new E1personDataBorneTaxpayer();
	personDataBorneTaxpayerObj.set_831("0123456789");
	E1prepaidTaxes prepaidTaxesObj = new E1prepaidTaxes();
	prepaidTaxesObj.set_127(127.27f);
	E1reduceTax reduceTaxObj = new E1reduceTax();
	reduceTaxObj.set001(1);
	E1taxableIncomes taxableIncomeObj = new E1taxableIncomes();
	taxableIncomeObj.set_101(101.01f);
	E1taxPayerBankAccount taxPayerBankAccountObj = new E1taxPayerBankAccount();
	taxPayerBankAccountObj.setBic("Alpha");
	taxPayerBankAccountObj.setIban("salkjfhas654654654654");
	E1nauticalincomes nautical = new E1nauticalincomes();
	nautical.set_201(201.01f);

	E1 e1 = new E1();
	e1.setId(key);
	e1.setIsComplete(0);
	e1.setAtid("X900157");
	e1.setDoy("Μήλου");
	e1.setMarriage(1);
	e1.setTaxpayerAddress("Καπου 32");
	e1.setDateInserted(new java.util.Date());
	e1.setE1dataFromTaxPayerFolder(dataFromTaxPayerFolderObj);
	e1.setE1expensesRemovedFromTotalIncome(expensesRemovedFromTotalIncomeObj);
	e1.setE1incomesReduceTaxes(incomesReduceTaxesObj);
	e1.setE1infoData(infoDataObj);
	e1.setE1objectiveSpending(objectiveSpendingObj);
	e1.setE1personDataBorneTaxpayer(personDataBorneTaxpayerObj);
	e1.setE1prepaidTaxes(prepaidTaxesObj);
	e1.setE1personDataBorneTaxpayer(personDataBorneTaxpayerObj);
	e1.setE1reduceTax(reduceTaxObj);
	e1.setE1taxableIncomes(taxableIncomeObj);
	e1.setE1taxPayerBankAccount(taxPayerBankAccountObj);
	e1.setE1nauticalincomes(nautical);
	e1.setRelatePersons(relatePersons); // Many to Many

	String result = "";
	try {

	    WebResource r = client
		    .resource("http://localhost:8098/TaxisNet/rest/");

	    result = r.path("DocumentService/submitE1")
		    .accept("application/json").type("application/json")
		    .post(String.class, e1);
	    // if (newUser.getId() > 0)
	    // return ("SuccessPage");
	} catch (Exception ex) {
	    System.err.println(ex);
	    System.err.println(ex.getCause());
	}
	System.out.println(result);
    }

    private static void testReadProperties(ClientConfig conf) {
	Properties config = new Properties();
	try {
	    // config.load(new FileInputStream("config.properties"));
	    config.load(App.class.getClassLoader().getResourceAsStream(
		    "config.properties"));
	    System.out.println(conf.getProperty("web_port"));
	} catch (Exception ex) {
	    System.out.println(ex.toString());
	}
    }

    private static Taxpayer getTaxPayerFromUserName(String name) {
	Taxpayer taxpayer = null;
	ClientConfig conf = new DefaultClientConfig();
	try {

	    Client client = Client.create(conf);
	    WebResource restSrv = client.resource(new URI(
		    "http://localhost:8098/TaxisNet/rest/"));
	    taxpayer = (Taxpayer) restSrv
		    .path("UserService/getTaxPayerByUserName/").path(name)
		    .accept(MediaType.APPLICATION_JSON).get(Taxpayer.class);

	} catch (Exception ex) {
	    System.out.println("Exeption: " + ex.toString()
		    + "<br /> Stack Trace " + ex.getStackTrace()
		    + "<br /> Caouse " + ex.getCause());

	}

	return taxpayer;
    }

    private static void testSubmitE2(Client client) {
	Taxpayer taxpayer = null;
	try {
	    WebResource restSrv = client.resource(new URI(
		    "http://localhost:8098/TaxisNet/rest/"));
	    taxpayer = (Taxpayer) restSrv.path("UserService/TaxPayer/9")
		    .accept(MediaType.APPLICATION_JSON).get(Taxpayer.class);
	} catch (Exception ex) {
	    System.out.println(ex.toString());
	    System.out.println(ex.getStackTrace());
	}
	if (taxpayer != null)
	    System.out.println(taxpayer.getAfm());

	// E2 primary KEY
	E2Id key = new E2Id();
	key.setTaxierId(9);
	key.setYear(Calendar.getInstance().get(Calendar.YEAR));

	// master table !
	E2 e2 = new E2();
	e2.setId(key);
	e2.setIsComplete(0);

	E2estate e2estateObj = new E2estate();
	e2estateObj.setArea(10);
	e2estateObj.setFrom(2);
	e2estateObj.setLocation("location test");
	e2estateObj.setMonthlyRental(100);
	e2estateObj.setPosition("position from test");
	e2estateObj.setRersentCoOwner(50);
	e2estateObj.setTenantAfm("0000000000");
	e2estateObj.setTenantFullName("tenantFullName from test");
	e2estateObj.setTo(10);
	e2estateObj.setUsage("usage from test");

	E2coOwner e2coOwners = new E2coOwner();
	e2coOwners.setAddress("address from test");
	e2coOwners.setAfm("0000000");
	e2coOwners.setFullName("fullName from test");
	e2coOwners.setPercent(50);
	e2coOwners.setRent(new Float(100f));

	E2otherEstate otherEst = new E2otherEstate();
	otherEst.setArea(111);
	otherEst.setLocation("o location from test");
	otherEst.setPosition("o position from test");
	otherEst.setTitle("o title from test");
	otherEst.setUsage("o usage from test");

	Set<E2estate> listOfE2estates = new HashSet<E2estate>();
	Set<E2coOwner> listOfE2coOwner = new HashSet<E2coOwner>();
	Set<E2otherEstate> listOfOtherEstates = new HashSet<E2otherEstate>();

	listOfOtherEstates.add(otherEst);
	listOfE2coOwner.add(e2coOwners);
	listOfE2estates.add(e2estateObj);

	e2.setE2otherEstates(listOfOtherEstates);
	e2estateObj.setE2coOwners(listOfE2coOwner);
	e2.setE2estates(listOfE2estates);

	String result = "";
	try {

	    WebResource r = client
		    .resource("http://localhost:8098/TaxisNet/rest/");

	    result = r.path("DocumentService/submitE2")
		    .accept("application/json").type("application/json")
		    .post(String.class, e2);
	    // if (newUser.getId() > 0)
	    // return ("SuccessPage");
	} catch (Exception ex) {
	    System.err.println(ex);
	    System.err.println(ex.getCause());
	}
	System.out.println(result);
    }
}
