
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package gr.manousos.service;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2013-01-14T21:57:35.520+02:00
 * Generated source version: 2.7.0
 * 
 */

@javax.jws.WebService(
                      serviceName = "DocumentSrvImplService",
                      portName = "DocumentSrvImplPort",
                      targetNamespace = "http://service.manousos.gr/",
                      wsdlLocation = "http://localhost:8088/TaxisNet/services/DocumentSrvImplPort?wsdl",
                      endpointInterface = "gr.manousos.service.DocumentSrv")
                      
public class DocumentSrvImpl implements DocumentSrv {

    private static final Logger LOG = Logger.getLogger(DocumentSrvImpl.class.getName());

    /* (non-Javadoc)
     * @see gr.manousos.service.DocumentSrv#getE2DocById(int  arg0 ,)int  arg1 )*
     */
    public gr.manousos.service.E2 getE2DocById(int arg0,int arg1) { 
        LOG.info("Executing operation getE2DocById");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            gr.manousos.service.E2 _return = new gr.manousos.service.E2();
            java.util.List<gr.manousos.service.E2Estate> _returnE2Estates = new java.util.ArrayList<gr.manousos.service.E2Estate>();
            gr.manousos.service.E2Estate _returnE2EstatesVal1 = new gr.manousos.service.E2Estate();
            _returnE2EstatesVal1.setArea(0.51286876f);
            gr.manousos.service.E2 _returnE2EstatesVal1E2 = new gr.manousos.service.E2();
            java.util.List<gr.manousos.service.E2Estate> _returnE2EstatesVal1E2E2Estates = new java.util.ArrayList<gr.manousos.service.E2Estate>();
            _returnE2EstatesVal1E2.getE2Estates().addAll(_returnE2EstatesVal1E2E2Estates);
            java.util.List<gr.manousos.service.E2OtherEstate> _returnE2EstatesVal1E2E2OtherEstates = new java.util.ArrayList<gr.manousos.service.E2OtherEstate>();
            _returnE2EstatesVal1E2.getE2OtherEstates().addAll(_returnE2EstatesVal1E2E2OtherEstates);
            gr.manousos.service.E2Id _returnE2EstatesVal1E2Id = new gr.manousos.service.E2Id();
            _returnE2EstatesVal1E2Id.setTaxierId(417550831);
            _returnE2EstatesVal1E2Id.setYear(846999822);
            _returnE2EstatesVal1E2.setId(_returnE2EstatesVal1E2Id);
            _returnE2EstatesVal1E2.setIsComplete(Integer.valueOf(2087465562));
            gr.manousos.service.Taxpayer _returnE2EstatesVal1E2Taxpayer = new gr.manousos.service.Taxpayer();
            _returnE2EstatesVal1E2Taxpayer.setAfm("Afm-191886258");
            gr.manousos.service.Contact _returnE2EstatesVal1E2TaxpayerContact = new gr.manousos.service.Contact();
            _returnE2EstatesVal1E2TaxpayerContact.setCell("Cell-369299616");
            _returnE2EstatesVal1E2TaxpayerContact.setContactId(Integer.valueOf(1363819097));
            _returnE2EstatesVal1E2TaxpayerContact.setEmail("Email211977893");
            _returnE2EstatesVal1E2TaxpayerContact.setFax("Fax-1794288304");
            _returnE2EstatesVal1E2TaxpayerContact.setPhone("Phone-181162683");
            java.util.List<gr.manousos.service.Taxpayer> _returnE2EstatesVal1E2TaxpayerContactTaxpayers = new java.util.ArrayList<gr.manousos.service.Taxpayer>();
            _returnE2EstatesVal1E2TaxpayerContact.getTaxpayers().addAll(_returnE2EstatesVal1E2TaxpayerContactTaxpayers);
            _returnE2EstatesVal1E2Taxpayer.setContact(_returnE2EstatesVal1E2TaxpayerContact);
            _returnE2EstatesVal1E2Taxpayer.setFatherName("FatherName1695961333");
            _returnE2EstatesVal1E2Taxpayer.setFname("Fname166816630");
            _returnE2EstatesVal1E2Taxpayer.setId(Integer.valueOf(1622055604));
            _returnE2EstatesVal1E2Taxpayer.setLname("Lname233268865");
            gr.manousos.service.User _returnE2EstatesVal1E2TaxpayerUser = new gr.manousos.service.User();
            _returnE2EstatesVal1E2TaxpayerUser.setActive(-2114465301);
            _returnE2EstatesVal1E2TaxpayerUser.setOtp("Otp-2036728420");
            _returnE2EstatesVal1E2TaxpayerUser.setPassword("Password-1693919687");
            java.util.List<gr.manousos.service.Taxpayer> _returnE2EstatesVal1E2TaxpayerUserTaxpayers = new java.util.ArrayList<gr.manousos.service.Taxpayer>();
            _returnE2EstatesVal1E2TaxpayerUser.getTaxpayers().addAll(_returnE2EstatesVal1E2TaxpayerUserTaxpayers);
            _returnE2EstatesVal1E2TaxpayerUser.setUserId(Integer.valueOf(1354532197));
            _returnE2EstatesVal1E2TaxpayerUser.setUserName("UserName2065965088");
            _returnE2EstatesVal1E2Taxpayer.setUser(_returnE2EstatesVal1E2TaxpayerUser);
            _returnE2EstatesVal1E2.setTaxpayer(_returnE2EstatesVal1E2Taxpayer);
            _returnE2EstatesVal1.setE2(_returnE2EstatesVal1E2);
            java.util.List<gr.manousos.service.E2CoOwner> _returnE2EstatesVal1E2CoOwners = new java.util.ArrayList<gr.manousos.service.E2CoOwner>();
            _returnE2EstatesVal1.getE2CoOwners().addAll(_returnE2EstatesVal1E2CoOwners);
            _returnE2EstatesVal1.setEstateId(Integer.valueOf(1380878088));
            _returnE2EstatesVal1.setFrom(-1886119868);
            _returnE2EstatesVal1.setLocation("Location1191068516");
            _returnE2EstatesVal1.setMonthlyRental(0.042716682f);
            _returnE2EstatesVal1.setPosition("Position-948197472");
            _returnE2EstatesVal1.setRersentCoOwner(0.1872617f);
            _returnE2EstatesVal1.setRevenueFreeHome(0.3309431f);
            _returnE2EstatesVal1.setRevenueFreeOffice(0.09010607f);
            _returnE2EstatesVal1.setRevenuePrivateHotel(0.13956779f);
            _returnE2EstatesVal1.setRevenuePrivateOffice(0.26231956f);
            _returnE2EstatesVal1.setTenantAfm("TenantAfm1324856117");
            _returnE2EstatesVal1.setTenantFullName("TenantFullName1700937594");
            _returnE2EstatesVal1.setTo(20952429);
            _returnE2EstatesVal1.setUsage("Usage1475398344");
            _returnE2Estates.add(_returnE2EstatesVal1);
            _return.getE2Estates().addAll(_returnE2Estates);
            java.util.List<gr.manousos.service.E2OtherEstate> _returnE2OtherEstates = new java.util.ArrayList<gr.manousos.service.E2OtherEstate>();
            gr.manousos.service.E2OtherEstate _returnE2OtherEstatesVal1 = new gr.manousos.service.E2OtherEstate();
            _returnE2OtherEstatesVal1.setArea(0.39342487f);
            gr.manousos.service.E2 _returnE2OtherEstatesVal1E2 = new gr.manousos.service.E2();
            java.util.List<gr.manousos.service.E2Estate> _returnE2OtherEstatesVal1E2E2Estates = new java.util.ArrayList<gr.manousos.service.E2Estate>();
            _returnE2OtherEstatesVal1E2.getE2Estates().addAll(_returnE2OtherEstatesVal1E2E2Estates);
            java.util.List<gr.manousos.service.E2OtherEstate> _returnE2OtherEstatesVal1E2E2OtherEstates = new java.util.ArrayList<gr.manousos.service.E2OtherEstate>();
            _returnE2OtherEstatesVal1E2.getE2OtherEstates().addAll(_returnE2OtherEstatesVal1E2E2OtherEstates);
            gr.manousos.service.E2Id _returnE2OtherEstatesVal1E2Id = new gr.manousos.service.E2Id();
            _returnE2OtherEstatesVal1E2Id.setTaxierId(-14950471);
            _returnE2OtherEstatesVal1E2Id.setYear(1634097451);
            _returnE2OtherEstatesVal1E2.setId(_returnE2OtherEstatesVal1E2Id);
            _returnE2OtherEstatesVal1E2.setIsComplete(Integer.valueOf(-1609078616));
            gr.manousos.service.Taxpayer _returnE2OtherEstatesVal1E2Taxpayer = new gr.manousos.service.Taxpayer();
            _returnE2OtherEstatesVal1E2Taxpayer.setAfm("Afm1021714896");
            gr.manousos.service.Contact _returnE2OtherEstatesVal1E2TaxpayerContact = new gr.manousos.service.Contact();
            _returnE2OtherEstatesVal1E2TaxpayerContact.setCell("Cell-1861382679");
            _returnE2OtherEstatesVal1E2TaxpayerContact.setContactId(Integer.valueOf(1588008850));
            _returnE2OtherEstatesVal1E2TaxpayerContact.setEmail("Email276367097");
            _returnE2OtherEstatesVal1E2TaxpayerContact.setFax("Fax-979552321");
            _returnE2OtherEstatesVal1E2TaxpayerContact.setPhone("Phone-1801947302");
            java.util.List<gr.manousos.service.Taxpayer> _returnE2OtherEstatesVal1E2TaxpayerContactTaxpayers = new java.util.ArrayList<gr.manousos.service.Taxpayer>();
            _returnE2OtherEstatesVal1E2TaxpayerContact.getTaxpayers().addAll(_returnE2OtherEstatesVal1E2TaxpayerContactTaxpayers);
            _returnE2OtherEstatesVal1E2Taxpayer.setContact(_returnE2OtherEstatesVal1E2TaxpayerContact);
            _returnE2OtherEstatesVal1E2Taxpayer.setFatherName("FatherName2004234876");
            _returnE2OtherEstatesVal1E2Taxpayer.setFname("Fname-402924950");
            _returnE2OtherEstatesVal1E2Taxpayer.setId(Integer.valueOf(1471536202));
            _returnE2OtherEstatesVal1E2Taxpayer.setLname("Lname1639478263");
            gr.manousos.service.User _returnE2OtherEstatesVal1E2TaxpayerUser = new gr.manousos.service.User();
            _returnE2OtherEstatesVal1E2TaxpayerUser.setActive(823928051);
            _returnE2OtherEstatesVal1E2TaxpayerUser.setOtp("Otp746067817");
            _returnE2OtherEstatesVal1E2TaxpayerUser.setPassword("Password-1521982578");
            java.util.List<gr.manousos.service.Taxpayer> _returnE2OtherEstatesVal1E2TaxpayerUserTaxpayers = new java.util.ArrayList<gr.manousos.service.Taxpayer>();
            _returnE2OtherEstatesVal1E2TaxpayerUser.getTaxpayers().addAll(_returnE2OtherEstatesVal1E2TaxpayerUserTaxpayers);
            _returnE2OtherEstatesVal1E2TaxpayerUser.setUserId(Integer.valueOf(1145105832));
            _returnE2OtherEstatesVal1E2TaxpayerUser.setUserName("UserName-491257663");
            _returnE2OtherEstatesVal1E2Taxpayer.setUser(_returnE2OtherEstatesVal1E2TaxpayerUser);
            _returnE2OtherEstatesVal1E2.setTaxpayer(_returnE2OtherEstatesVal1E2Taxpayer);
            _returnE2OtherEstatesVal1.setE2(_returnE2OtherEstatesVal1E2);
            _returnE2OtherEstatesVal1.setId(-683883983);
            _returnE2OtherEstatesVal1.setLocation("Location1020035945");
            _returnE2OtherEstatesVal1.setPosition("Position-1074374152");
            _returnE2OtherEstatesVal1.setTitle("Title-225341113");
            _returnE2OtherEstatesVal1.setUsage("Usage-1346176249");
            _returnE2OtherEstates.add(_returnE2OtherEstatesVal1);
            _return.getE2OtherEstates().addAll(_returnE2OtherEstates);
            gr.manousos.service.E2Id _returnId = new gr.manousos.service.E2Id();
            _returnId.setTaxierId(77980785);
            _returnId.setYear(-1366087176);
            _return.setId(_returnId);
            _return.setIsComplete(Integer.valueOf(-336963699));
            gr.manousos.service.Taxpayer _returnTaxpayer = new gr.manousos.service.Taxpayer();
            _returnTaxpayer.setAfm("Afm311642815");
            gr.manousos.service.Contact _returnTaxpayerContact = new gr.manousos.service.Contact();
            _returnTaxpayerContact.setCell("Cell-281784793");
            _returnTaxpayerContact.setContactId(Integer.valueOf(1246844002));
            _returnTaxpayerContact.setEmail("Email517583770");
            _returnTaxpayerContact.setFax("Fax-1063996539");
            _returnTaxpayerContact.setPhone("Phone-1254235540");
            java.util.List<gr.manousos.service.Taxpayer> _returnTaxpayerContactTaxpayers = new java.util.ArrayList<gr.manousos.service.Taxpayer>();
            _returnTaxpayerContact.getTaxpayers().addAll(_returnTaxpayerContactTaxpayers);
            _returnTaxpayer.setContact(_returnTaxpayerContact);
            _returnTaxpayer.setFatherName("FatherName1702878720");
            _returnTaxpayer.setFname("Fname397528838");
            _returnTaxpayer.setId(Integer.valueOf(-130709031));
            _returnTaxpayer.setLname("Lname-956490701");
            gr.manousos.service.User _returnTaxpayerUser = new gr.manousos.service.User();
            _returnTaxpayerUser.setActive(-2042756018);
            _returnTaxpayerUser.setOtp("Otp489692365");
            _returnTaxpayerUser.setPassword("Password1918523867");
            java.util.List<gr.manousos.service.Taxpayer> _returnTaxpayerUserTaxpayers = new java.util.ArrayList<gr.manousos.service.Taxpayer>();
            _returnTaxpayerUser.getTaxpayers().addAll(_returnTaxpayerUserTaxpayers);
            _returnTaxpayerUser.setUserId(Integer.valueOf(-226261641));
            _returnTaxpayerUser.setUserName("UserName-1024725410");
            _returnTaxpayer.setUser(_returnTaxpayerUser);
            _return.setTaxpayer(_returnTaxpayer);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gr.manousos.service.DocumentSrv#test(java.lang.String  arg0 )*
     */
    public java.lang.String test(java.lang.String arg0) { 
        LOG.info("Executing operation test");
        System.out.println(arg0);
        try {
            java.lang.String _return = "_return362119781";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see gr.manousos.service.DocumentSrv#finalSubmitE2(gr.manousos.service.E2  arg0 )*
     */
    public gr.manousos.service.E2 finalSubmitE2(gr.manousos.service.E2 arg0) { 
        LOG.info("Executing operation finalSubmitE2");
        System.out.println(arg0);
        try {
            gr.manousos.service.E2 _return = new gr.manousos.service.E2();
            java.util.List<gr.manousos.service.E2Estate> _returnE2Estates = new java.util.ArrayList<gr.manousos.service.E2Estate>();
            gr.manousos.service.E2Estate _returnE2EstatesVal1 = new gr.manousos.service.E2Estate();
            _returnE2EstatesVal1.setArea(0.8476465f);
            gr.manousos.service.E2 _returnE2EstatesVal1E2 = new gr.manousos.service.E2();
            java.util.List<gr.manousos.service.E2Estate> _returnE2EstatesVal1E2E2Estates = new java.util.ArrayList<gr.manousos.service.E2Estate>();
            _returnE2EstatesVal1E2.getE2Estates().addAll(_returnE2EstatesVal1E2E2Estates);
            java.util.List<gr.manousos.service.E2OtherEstate> _returnE2EstatesVal1E2E2OtherEstates = new java.util.ArrayList<gr.manousos.service.E2OtherEstate>();
            _returnE2EstatesVal1E2.getE2OtherEstates().addAll(_returnE2EstatesVal1E2E2OtherEstates);
            gr.manousos.service.E2Id _returnE2EstatesVal1E2Id = new gr.manousos.service.E2Id();
            _returnE2EstatesVal1E2Id.setTaxierId(-1011001233);
            _returnE2EstatesVal1E2Id.setYear(-1703213061);
            _returnE2EstatesVal1E2.setId(_returnE2EstatesVal1E2Id);
            _returnE2EstatesVal1E2.setIsComplete(Integer.valueOf(267353617));
            gr.manousos.service.Taxpayer _returnE2EstatesVal1E2Taxpayer = new gr.manousos.service.Taxpayer();
            _returnE2EstatesVal1E2Taxpayer.setAfm("Afm557662916");
            gr.manousos.service.Contact _returnE2EstatesVal1E2TaxpayerContact = new gr.manousos.service.Contact();
            _returnE2EstatesVal1E2TaxpayerContact.setCell("Cell510754816");
            _returnE2EstatesVal1E2TaxpayerContact.setContactId(Integer.valueOf(-1983485167));
            _returnE2EstatesVal1E2TaxpayerContact.setEmail("Email698146423");
            _returnE2EstatesVal1E2TaxpayerContact.setFax("Fax371872985");
            _returnE2EstatesVal1E2TaxpayerContact.setPhone("Phone2019339123");
            java.util.List<gr.manousos.service.Taxpayer> _returnE2EstatesVal1E2TaxpayerContactTaxpayers = new java.util.ArrayList<gr.manousos.service.Taxpayer>();
            _returnE2EstatesVal1E2TaxpayerContact.getTaxpayers().addAll(_returnE2EstatesVal1E2TaxpayerContactTaxpayers);
            _returnE2EstatesVal1E2Taxpayer.setContact(_returnE2EstatesVal1E2TaxpayerContact);
            _returnE2EstatesVal1E2Taxpayer.setFatherName("FatherName1589508939");
            _returnE2EstatesVal1E2Taxpayer.setFname("Fname1705893744");
            _returnE2EstatesVal1E2Taxpayer.setId(Integer.valueOf(-769838273));
            _returnE2EstatesVal1E2Taxpayer.setLname("Lname-801281689");
            gr.manousos.service.User _returnE2EstatesVal1E2TaxpayerUser = new gr.manousos.service.User();
            _returnE2EstatesVal1E2TaxpayerUser.setActive(-1179314178);
            _returnE2EstatesVal1E2TaxpayerUser.setOtp("Otp627621919");
            _returnE2EstatesVal1E2TaxpayerUser.setPassword("Password-530140195");
            java.util.List<gr.manousos.service.Taxpayer> _returnE2EstatesVal1E2TaxpayerUserTaxpayers = new java.util.ArrayList<gr.manousos.service.Taxpayer>();
            _returnE2EstatesVal1E2TaxpayerUser.getTaxpayers().addAll(_returnE2EstatesVal1E2TaxpayerUserTaxpayers);
            _returnE2EstatesVal1E2TaxpayerUser.setUserId(Integer.valueOf(-1584234999));
            _returnE2EstatesVal1E2TaxpayerUser.setUserName("UserName1724909637");
            _returnE2EstatesVal1E2Taxpayer.setUser(_returnE2EstatesVal1E2TaxpayerUser);
            _returnE2EstatesVal1E2.setTaxpayer(_returnE2EstatesVal1E2Taxpayer);
            _returnE2EstatesVal1.setE2(_returnE2EstatesVal1E2);
            java.util.List<gr.manousos.service.E2CoOwner> _returnE2EstatesVal1E2CoOwners = new java.util.ArrayList<gr.manousos.service.E2CoOwner>();
            _returnE2EstatesVal1.getE2CoOwners().addAll(_returnE2EstatesVal1E2CoOwners);
            _returnE2EstatesVal1.setEstateId(Integer.valueOf(1949902404));
            _returnE2EstatesVal1.setFrom(250389775);
            _returnE2EstatesVal1.setLocation("Location-1288968063");
            _returnE2EstatesVal1.setMonthlyRental(0.23281127f);
            _returnE2EstatesVal1.setPosition("Position115466962");
            _returnE2EstatesVal1.setRersentCoOwner(0.36486006f);
            _returnE2EstatesVal1.setRevenueFreeHome(0.48343343f);
            _returnE2EstatesVal1.setRevenueFreeOffice(0.56829876f);
            _returnE2EstatesVal1.setRevenuePrivateHotel(0.2311694f);
            _returnE2EstatesVal1.setRevenuePrivateOffice(0.014177024f);
            _returnE2EstatesVal1.setTenantAfm("TenantAfm-1429230058");
            _returnE2EstatesVal1.setTenantFullName("TenantFullName-747587448");
            _returnE2EstatesVal1.setTo(1003921177);
            _returnE2EstatesVal1.setUsage("Usage-919372905");
            _returnE2Estates.add(_returnE2EstatesVal1);
            _return.getE2Estates().addAll(_returnE2Estates);
            java.util.List<gr.manousos.service.E2OtherEstate> _returnE2OtherEstates = new java.util.ArrayList<gr.manousos.service.E2OtherEstate>();
            gr.manousos.service.E2OtherEstate _returnE2OtherEstatesVal1 = new gr.manousos.service.E2OtherEstate();
            _returnE2OtherEstatesVal1.setArea(0.094234765f);
            gr.manousos.service.E2 _returnE2OtherEstatesVal1E2 = new gr.manousos.service.E2();
            java.util.List<gr.manousos.service.E2Estate> _returnE2OtherEstatesVal1E2E2Estates = new java.util.ArrayList<gr.manousos.service.E2Estate>();
            _returnE2OtherEstatesVal1E2.getE2Estates().addAll(_returnE2OtherEstatesVal1E2E2Estates);
            java.util.List<gr.manousos.service.E2OtherEstate> _returnE2OtherEstatesVal1E2E2OtherEstates = new java.util.ArrayList<gr.manousos.service.E2OtherEstate>();
            _returnE2OtherEstatesVal1E2.getE2OtherEstates().addAll(_returnE2OtherEstatesVal1E2E2OtherEstates);
            gr.manousos.service.E2Id _returnE2OtherEstatesVal1E2Id = new gr.manousos.service.E2Id();
            _returnE2OtherEstatesVal1E2Id.setTaxierId(-1913638657);
            _returnE2OtherEstatesVal1E2Id.setYear(-1457347744);
            _returnE2OtherEstatesVal1E2.setId(_returnE2OtherEstatesVal1E2Id);
            _returnE2OtherEstatesVal1E2.setIsComplete(Integer.valueOf(875136656));
            gr.manousos.service.Taxpayer _returnE2OtherEstatesVal1E2Taxpayer = new gr.manousos.service.Taxpayer();
            _returnE2OtherEstatesVal1E2Taxpayer.setAfm("Afm1362968419");
            gr.manousos.service.Contact _returnE2OtherEstatesVal1E2TaxpayerContact = new gr.manousos.service.Contact();
            _returnE2OtherEstatesVal1E2TaxpayerContact.setCell("Cell307192802");
            _returnE2OtherEstatesVal1E2TaxpayerContact.setContactId(Integer.valueOf(1528953106));
            _returnE2OtherEstatesVal1E2TaxpayerContact.setEmail("Email-1060267260");
            _returnE2OtherEstatesVal1E2TaxpayerContact.setFax("Fax1145356971");
            _returnE2OtherEstatesVal1E2TaxpayerContact.setPhone("Phone-1133159424");
            java.util.List<gr.manousos.service.Taxpayer> _returnE2OtherEstatesVal1E2TaxpayerContactTaxpayers = new java.util.ArrayList<gr.manousos.service.Taxpayer>();
            _returnE2OtherEstatesVal1E2TaxpayerContact.getTaxpayers().addAll(_returnE2OtherEstatesVal1E2TaxpayerContactTaxpayers);
            _returnE2OtherEstatesVal1E2Taxpayer.setContact(_returnE2OtherEstatesVal1E2TaxpayerContact);
            _returnE2OtherEstatesVal1E2Taxpayer.setFatherName("FatherName1671500163");
            _returnE2OtherEstatesVal1E2Taxpayer.setFname("Fname1882651");
            _returnE2OtherEstatesVal1E2Taxpayer.setId(Integer.valueOf(721260697));
            _returnE2OtherEstatesVal1E2Taxpayer.setLname("Lname-646139922");
            gr.manousos.service.User _returnE2OtherEstatesVal1E2TaxpayerUser = new gr.manousos.service.User();
            _returnE2OtherEstatesVal1E2TaxpayerUser.setActive(-583663888);
            _returnE2OtherEstatesVal1E2TaxpayerUser.setOtp("Otp1141241808");
            _returnE2OtherEstatesVal1E2TaxpayerUser.setPassword("Password312674050");
            java.util.List<gr.manousos.service.Taxpayer> _returnE2OtherEstatesVal1E2TaxpayerUserTaxpayers = new java.util.ArrayList<gr.manousos.service.Taxpayer>();
            _returnE2OtherEstatesVal1E2TaxpayerUser.getTaxpayers().addAll(_returnE2OtherEstatesVal1E2TaxpayerUserTaxpayers);
            _returnE2OtherEstatesVal1E2TaxpayerUser.setUserId(Integer.valueOf(-912404437));
            _returnE2OtherEstatesVal1E2TaxpayerUser.setUserName("UserName526914002");
            _returnE2OtherEstatesVal1E2Taxpayer.setUser(_returnE2OtherEstatesVal1E2TaxpayerUser);
            _returnE2OtherEstatesVal1E2.setTaxpayer(_returnE2OtherEstatesVal1E2Taxpayer);
            _returnE2OtherEstatesVal1.setE2(_returnE2OtherEstatesVal1E2);
            _returnE2OtherEstatesVal1.setId(1293021104);
            _returnE2OtherEstatesVal1.setLocation("Location-607555748");
            _returnE2OtherEstatesVal1.setPosition("Position1575850885");
            _returnE2OtherEstatesVal1.setTitle("Title-14452873");
            _returnE2OtherEstatesVal1.setUsage("Usage612778465");
            _returnE2OtherEstates.add(_returnE2OtherEstatesVal1);
            _return.getE2OtherEstates().addAll(_returnE2OtherEstates);
            gr.manousos.service.E2Id _returnId = new gr.manousos.service.E2Id();
            _returnId.setTaxierId(-1250176659);
            _returnId.setYear(1699587514);
            _return.setId(_returnId);
            _return.setIsComplete(Integer.valueOf(196062669));
            gr.manousos.service.Taxpayer _returnTaxpayer = new gr.manousos.service.Taxpayer();
            _returnTaxpayer.setAfm("Afm483744869");
            gr.manousos.service.Contact _returnTaxpayerContact = new gr.manousos.service.Contact();
            _returnTaxpayerContact.setCell("Cell1045937476");
            _returnTaxpayerContact.setContactId(Integer.valueOf(-2120041375));
            _returnTaxpayerContact.setEmail("Email-2072452992");
            _returnTaxpayerContact.setFax("Fax-2006248288");
            _returnTaxpayerContact.setPhone("Phone692535405");
            java.util.List<gr.manousos.service.Taxpayer> _returnTaxpayerContactTaxpayers = new java.util.ArrayList<gr.manousos.service.Taxpayer>();
            _returnTaxpayerContact.getTaxpayers().addAll(_returnTaxpayerContactTaxpayers);
            _returnTaxpayer.setContact(_returnTaxpayerContact);
            _returnTaxpayer.setFatherName("FatherName-2126596598");
            _returnTaxpayer.setFname("Fname-1335262392");
            _returnTaxpayer.setId(Integer.valueOf(-1997875945));
            _returnTaxpayer.setLname("Lname-2134345121");
            gr.manousos.service.User _returnTaxpayerUser = new gr.manousos.service.User();
            _returnTaxpayerUser.setActive(-961869916);
            _returnTaxpayerUser.setOtp("Otp2106768763");
            _returnTaxpayerUser.setPassword("Password-553884806");
            java.util.List<gr.manousos.service.Taxpayer> _returnTaxpayerUserTaxpayers = new java.util.ArrayList<gr.manousos.service.Taxpayer>();
            _returnTaxpayerUser.getTaxpayers().addAll(_returnTaxpayerUserTaxpayers);
            _returnTaxpayerUser.setUserId(Integer.valueOf(515212345));
            _returnTaxpayerUser.setUserName("UserName-1797120993");
            _returnTaxpayer.setUser(_returnTaxpayerUser);
            _return.setTaxpayer(_returnTaxpayer);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}