package gr.manousos.bean;

import gr.manousos.service.DocumentSrv;
import gr.manousos.service.DocumentSrvImplService;
import gr.manousos.service.E2;
import gr.manousos.service.E2CoOwner;
import gr.manousos.service.E2Estate;
import gr.manousos.service.E2Id;
import gr.manousos.service.E2OtherEstate;
import gr.manousos.service.Taxpayer;
import gr.manousos.service.UserSrv;
import gr.manousos.service.UserSrvImplService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class E2Bean implements Serializable {

	private static final long serialVersionUID = 1L;

	private static ArrayList<PartialEstates> partialEstateLst = new ArrayList<E2Bean.PartialEstates>();
	private static ArrayList<OtherEstates> otherEstateLst = new ArrayList<E2Bean.OtherEstates>();
	private static ArrayList<LeasesProperties> rnEstateList = new ArrayList<E2Bean.LeasesProperties>();

	private boolean dtPartialEstLstVisible = partialEstateLst.size() > 0 ? true
			: false;
	private boolean dtOtherEstLstVisible = false;
	private boolean dtEstLstVisible = false;
	private boolean pnPartialEstates = partialEstateLst.size() > 0 ? true
			: false;

	private String location;
	private String point;
	private String usage;
	private float area;
	private float rent;
	private String coFullName;
	private String coAFM;
	private String coAddress;
	private float cOwnPesr;

	private String location2;
	private String point2;
	private String usage2;
	private float area2;
	private String titleProp;

	private String rentierFullName;
	private String rentierAFM;
	private String rentierFatherName;
	private String rnLocation;
	private String rnPoint;
	private String rnUsage;
	private float rnArea;
	private String rnFullName;
	private String rnAFM;
	private int fromMonth;
	private int toMonth;
	private int totalMonth;
	private float rnRent;
	private float rnPesr;
	private float revFreeBuilding;
	private float revFreeOffice;
	private float revFreeLand;
	private float revPropHotel;
	private float revPropOffice;

	public ArrayList<PartialEstates> getPartialEstateLst() {
		return partialEstateLst;
	}

	public void setPartialEstateLst(ArrayList<PartialEstates> partialEstateLst) {
		E2Bean.partialEstateLst = partialEstateLst;
	}

	public ArrayList<OtherEstates> getOtherEstateLst() {
		return otherEstateLst;
	}

	public void setOtherEstateLst(ArrayList<OtherEstates> otherEstateLst) {
		E2Bean.otherEstateLst = otherEstateLst;
	}

	public ArrayList<LeasesProperties> getRnEstateList() {
		return rnEstateList;
	}

	public void setRnEstateList(ArrayList<LeasesProperties> rnEstateList) {
		E2Bean.rnEstateList = rnEstateList;
	}

	public boolean isDtPartialEstLstVisible() {
		return dtPartialEstLstVisible;
	}

	public void setDtPartialEstLstVisible(boolean dtPartialEstLstVisible) {
		this.dtPartialEstLstVisible = dtPartialEstLstVisible;
	}

	public boolean isDtOtherEstLstVisible() {
		return dtOtherEstLstVisible;
	}

	public void setDtOtherEstLstVisible(boolean dtOtherEstLstVisible) {
		this.dtOtherEstLstVisible = dtOtherEstLstVisible;
	}

	public boolean isDtEstLstVisible() {
		return dtEstLstVisible;
	}

	public void setDtEstLstVisible(boolean dtEstLstVisible) {
		this.dtEstLstVisible = dtEstLstVisible;
	}

	public boolean isPnPartialEstates() {
		return pnPartialEstates;
	}

	public void setPnPartialEstates(boolean pnPartialEstates) {
		this.pnPartialEstates = pnPartialEstates;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getRent() {
		return rent;
	}

	public void setRent(float rent) {
		this.rent = rent;
	}

	public String getCoFullName() {
		return coFullName;
	}

	public void setCoFullName(String coFullName) {
		this.coFullName = coFullName;
	}

	public String getCoAFM() {
		return coAFM;
	}

	public void setCoAFM(String coAFM) {
		this.coAFM = coAFM;
	}

	public String getCoAddress() {
		return coAddress;
	}

	public void setCoAddress(String coAddress) {
		this.coAddress = coAddress;
	}

	public float getcOwnPesr() {
		return cOwnPesr;
	}

	public void setcOwnPesr(float cOwnPesr) {
		this.cOwnPesr = cOwnPesr;
	}

	public String getLocation2() {
		return location2;
	}

	public void setLocation2(String location2) {
		this.location2 = location2;
	}

	public String getPoint2() {
		return point2;
	}

	public void setPoint2(String point2) {
		this.point2 = point2;
	}

	public String getUsage2() {
		return usage2;
	}

	public void setUsage2(String usage2) {
		this.usage2 = usage2;
	}

	public float getArea2() {
		return area2;
	}

	public void setArea2(float area2) {
		this.area2 = area2;
	}

	public String getTitleProp() {
		return titleProp;
	}

	public void setTitleProp(String titleProp) {
		this.titleProp = titleProp;
	}

	public String getRentierFullName() {
		return rentierFullName;
	}

	public void setRentierFullName(String rentierFullName) {
		this.rentierFullName = rentierFullName;
	}

	public String getRentierAFM() {
		return rentierAFM;
	}

	public void setRentierAFM(String rentierAFM) {
		this.rentierAFM = rentierAFM;
	}

	public String getRentierFatherName() {
		return rentierFatherName;
	}

	public void setRentierFatherName(String rentierFatherName) {
		this.rentierFatherName = rentierFatherName;
	}

	public String getRnLocation() {
		return rnLocation;
	}

	public void setRnLocation(String rnLocation) {
		this.rnLocation = rnLocation;
	}

	public String getRnPoint() {
		return rnPoint;
	}

	public void setRnPoint(String rnPoint) {
		this.rnPoint = rnPoint;
	}

	public String getRnUsage() {
		return rnUsage;
	}

	public void setRnUsage(String rnUsage) {
		this.rnUsage = rnUsage;
	}

	public float getRnArea() {
		return rnArea;
	}

	public void setRnArea(float rnArea) {
		this.rnArea = rnArea;
	}

	public String getRnFullName() {
		return rnFullName;
	}

	public void setRnFullName(String rnFullName) {
		this.rnFullName = rnFullName;
	}

	public String getRnAFM() {
		return rnAFM;
	}

	public void setRnAFM(String rnAFM) {
		this.rnAFM = rnAFM;
	}

	public int getFromMonth() {
		return fromMonth;
	}

	public void setFromMonth(int fromMonth) {
		this.fromMonth = fromMonth;
	}

	public int getToMonth() {
		return toMonth;
	}

	public void setToMonth(int toMonth) {
		this.toMonth = toMonth;
	}

	public int getTotalMonth() {
		return totalMonth;
	}

	public void setTotalMonth(int totalMonth) {
		this.totalMonth = totalMonth;
	}

	public float getRnRent() {
		return rnRent;
	}

	public void setRnRent(float rnRent) {
		this.rnRent = rnRent;
	}

	public float getRnPesr() {
		return rnPesr;
	}

	public void setRnPesr(float rnPesr) {
		this.rnPesr = rnPesr;
	}

	public float getRevFreeBuilding() {
		return revFreeBuilding;
	}

	public void setRevFreeBuilding(float revFreeBuilding) {
		this.revFreeBuilding = revFreeBuilding;
	}

	public float getRevFreeOffice() {
		return revFreeOffice;
	}

	public void setRevFreeOffice(float revFreeOffice) {
		this.revFreeOffice = revFreeOffice;
	}

	public float getRevFreeLand() {
		return revFreeLand;
	}

	public void setRevFreeLand(float revFreeLand) {
		this.revFreeLand = revFreeLand;
	}

	public float getRevPropHotel() {
		return revPropHotel;
	}

	public void setRevPropHotel(float revPropHotel) {
		this.revPropHotel = revPropHotel;
	}

	public float getRevPropOffice() {
		return revPropOffice;
	}

	public void setRevPropOffice(float revPropOffice) {
		this.revPropOffice = revPropOffice;
	}

	/*
	 * propList estateList rnEstateList LeasesProperties
	 */
	public String saveE2() {
		// TODO: Is Valid Form ?
		// 1 estate with coOwn ->1,,* PartialEstates

		UserSrvImplService userService = new UserSrvImplService();
		UserSrv userClient = userService.getUserSrvImplPort();
		Taxpayer taxpayer = userClient.getTaxPayerById(0);

		// E2 primary KEY
		E2Id key = new E2Id();
		key.setTaxierId(taxpayer.getId());
		key.setYear(new Date().getYear());

		// master table !
		E2 e2 = new E2();
		e2.setId(key);
		e2.setIsComplete(1);
		e2.setTaxpayer(taxpayer);

		// property table
		E2Estate estate = new E2Estate();
		List<E2Estate> estatesList = new ArrayList<E2Estate>();
		for (LeasesProperties item : E2Bean.rnEstateList) {
			estate.setE2(e2);
			estate.setArea(item.getArea());
			estate.setLocation(item.getLocation());
			estate.setMonthlyRental(item.getRent());
			estate.setPosition(item.getPoint());
			estate.setRersentCoOwner(item.getRnPesr());
			estate.setRevenueFreeHome(item.getRevFreeBuilding());
			estate.setRevenueFreeOffice(item.getRevFreeOffice());
			estate.setRevenuePrivateHotel(item.getRevPropHotel());
			estate.setRevenuePrivateOffice(item.getRevPropOffice());
			estate.setTenantAfm(item.getRnAFM());
			estate.setTenantFullName(item.getRnFullName());
			estate.setUsage(item.getUsage());
			estate.setFrom(item.getFromMonth());
			estate.setTo(item.getToMonth());

			E2CoOwner coOwner = new E2CoOwner();
			// TODO: how to get the correct estates co owners ?
			if (estate.getRersentCoOwner() > 0) {
				for (PartialEstates pEstate : E2Bean.partialEstateLst) {
					coOwner.setAddress(pEstate.getCoAddress());
					coOwner.setAfm(pEstate.getCoAFM());
					coOwner.setE2Estate(estate); // 1 estate has 0 - * owners
					coOwner.setFullName(pEstate.getCoFullName());
					coOwner.setPercent(pEstate.getcOwnPers());
					coOwner.setRent(pEstate.getCoRent());
				}
			}
		}

		E2OtherEstate oEstate = new E2OtherEstate();
		for (OtherEstates otherEstItem : E2Bean.otherEstateLst) {
			oEstate.setArea(otherEstItem.getArea());
			oEstate.setE2(e2);
			oEstate.setLocation(otherEstItem.getLocation());
			oEstate.setPosition(otherEstItem.getPoint());
			oEstate.setTitle(otherEstItem.getTitleProp());
			oEstate.setUsage(otherEstItem.getUsage());
		}
		estatesList.add(estate);
		/*
		 * public E2(E2Id id, Taxpayer taxpayer, String location, String
		 * position, String usage, float area, String tenantFullName, String
		 * tenantAfm, Date from, Date to, float monthlyRental, float
		 * rersentCoOwner, float revenueFreeHome, float revenueFreeOffice, float
		 * revenuePrivateHotel, float revenuePrivateOffice, Set<E2estateTranfer>
		 * e2estateTranfers, Set<E2coOwner> e2coOwners)
		 */

		// Step1
		// gr.manousos.service.Taxpayer taxpayer = service.getTaxpayerByXX(xx);

		DocumentSrvImplService service = new DocumentSrvImplService();
		DocumentSrv client = service.getDocumentSrvImplPort();

		try {
			client.finalSubmitE2(e2);
		} catch (Exception ex) {
			/*
			 * this.setError(ex.toString()); //
			 * System.err.println("submit Register Error= " + ex.toString());
			 */
		}
		System.out.println(client.test("my service test Message !!"));
		// TODO: clear static Lists!!
		return "";
	}

	public String addPartialEstateAction() {
		partialEstateLst.add(new PartialEstates(this.location, this.point,
				this.usage, this.area, this.coFullName, this.coAddress,
				this.coAFM, this.cOwnPesr, this.rent));

		return "";
	}

	public String addOtherEstatesAction() {

		this.dtOtherEstLstVisible = true;

		otherEstateLst.add(new OtherEstates(this.location2, this.point2,
				this.usage2, this.area2, this.titleProp));

		return "";
	}

	public String addEstatesRevenue() {

		this.dtEstLstVisible = true;
		rnEstateList.add(new LeasesProperties(this.rnLocation, this.rnPoint,
				this.rnUsage, this.rnArea, this.rnFullName, this.rnAFM,
				this.fromMonth, this.toMonth, this.totalMonth, this.rnRent,
				this.rnPesr, this.revFreeBuilding, this.revFreeOffice,
				this.revFreeLand, this.revPropHotel, this.revPropOffice));
		//TODO: Δες γιατί γεμίζει το other και όχι το partial
		if (this.rnPesr > 0) {
			this.dtPartialEstLstVisible = true;
			this.location = this.rnLocation;
			this.point = this.rnPoint;
			this.usage = this.rnUsage;
			this.area = this.rnArea;

			/*
			 * partialEstateLst.add(new PartialEstates(this.location,
			 * this.point, this.usage, this.area, this.coFullName,
			 * this.coAddress, this.coAFM, this.cOwnPesr, this.rent));
			 */
		}
		return "";
	}

	public String deletePartialEstateAction(PartialEstates objList) {
		partialEstateLst.remove(objList);
		return "";
	}

	public String deleteOtherEstates(OtherEstates objList) {
		otherEstateLst.remove(objList);
		return null;
	}

	public String deleteEstatesRevenue(LeasesProperties objList) {
		rnEstateList.remove(objList);
		return null;
	}

	public String saveAction() {

		return "";
	}

	public static class OtherEstates {
		private String location;
		private String point;
		private String usage;
		private float area;
		private String titleProp;

		public OtherEstates(String location, String point, String usage,
				float area, String title) {
			this.location = location;
			this.point = point;
			this.usage = usage;
			this.area = area;
			this.titleProp = title;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getPoint() {
			return point;
		}

		public void setPoint(String point) {
			this.point = point;
		}

		public String getUsage() {
			return usage;
		}

		public void setUsage(String usage) {
			this.usage = usage;
		}

		public float getArea() {
			return area;
		}

		public void setArea(float area) {
			this.area = area;
		}

		public String getTitleProp() {
			return titleProp;
		}

		public void setTitleProp(String titleProp) {
			this.titleProp = titleProp;
		}

	}

	public static class PartialEstates {
		private String location;
		private String point;
		private String usage;
		private float area;
		private String coFullName;
		private String coAFM;
		private String coAddress;
		private float cOwnPers;
		private float coRent;

		public PartialEstates(String location, String point, String usage,
				float area, String coFullName, String coAFM, String coAddress,
				float coPercent, float coRent) {
			this.location = location;
			this.point = point;
			this.usage = usage;
			this.area = area;
			this.coFullName = coFullName;
			this.coAFM = coAFM;
			this.coAddress = coAddress;
			this.cOwnPers = coPercent;
			this.coRent = coRent;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getPoint() {
			return point;
		}

		public void setPoint(String point) {
			this.point = point;
		}

		public String getUsage() {
			return usage;
		}

		public void setUsage(String usage) {
			this.usage = usage;
		}

		public float getArea() {
			return area;
		}

		public void setArea(float area) {
			this.area = area;
		}

		public String getCoFullName() {
			return coFullName;
		}

		public void setCoFullName(String coFullName) {
			this.coFullName = coFullName;
		}

		public String getCoAFM() {
			return coAFM;
		}

		public void setCoAFM(String coAFM) {
			this.coAFM = coAFM;
		}

		public String getCoAddress() {
			return coAddress;
		}

		public void setCoAddress(String coAddress) {
			this.coAddress = coAddress;
		}

		public float getcOwnPers() {
			return cOwnPers;
		}

		public void setcOwnPers(float cOwnPers) {
			this.cOwnPers = cOwnPers;
		}

		public float getCoRent() {
			return coRent;
		}

		public void setCoRent(float coRent) {
			this.coRent = coRent;
		}

	}

	public static class LeasesProperties {
		private String location;
		private String point;
		private String usage;
		private float area;
		private float rent;
		private int fromMonth;
		private int toMonth;
		private int totalMonth;
		private float rnPesr;
		private float revFreeBuilding;
		private float revFreeOffice;
		private float revFreeLand;
		private float revPropHotel;
		private float revPropOffice;
		private String rnFullName;
		private String rnAFM;

		public LeasesProperties(String location, String point, String usage,
				float area, String rnFullName, String rnAFM, int fromMonth,
				int toMonth, int totalMonth, float rent, float coPerecent,
				float revFreeBuilding, float revFreeOffice, float revFreeLand,
				float revPropHotel, float revPropOffice) {
			this.area = area;
			this.location = location;
			this.point = point;
			this.usage = usage;
			this.rnAFM = rnAFM;
			this.rnFullName = rnFullName;
			this.rent = rent;
			this.fromMonth = fromMonth;
			this.toMonth = toMonth;
			this.toMonth = totalMonth;
			this.rnPesr = coPerecent;
			this.revFreeBuilding = revFreeBuilding;
			this.revFreeLand = revFreeLand;
			this.revFreeOffice = revFreeOffice;
			this.revPropHotel = revPropHotel;
			this.revPropOffice = revPropOffice;
		}

		public String getRnFullName() {
			return rnFullName;
		}

		public void setRnFullName(String rnFullName) {
			this.rnFullName = rnFullName;
		}

		public String getRnAFM() {
			return rnAFM;
		}

		public void setRnAFM(String rnAFM) {
			this.rnAFM = rnAFM;
		}

		public int getFromMonth() {
			return fromMonth;
		}

		public void setFromMonth(int fromMonth) {
			this.fromMonth = fromMonth;
		}

		public int getToMonth() {
			return toMonth;
		}

		public void setToMonth(int toMonth) {
			this.toMonth = toMonth;
		}

		public int getTotalMonth() {
			return totalMonth;
		}

		public void setTotalMonth(int totalMonth) {
			this.totalMonth = totalMonth;
		}

		public float getRnPesr() {
			return rnPesr;
		}

		public void setRnPesr(float rnPesr) {
			this.rnPesr = rnPesr;
		}

		public float getRevFreeBuilding() {
			return revFreeBuilding;
		}

		public void setRevFreeBuilding(float revFreeBuilding) {
			this.revFreeBuilding = revFreeBuilding;
		}

		public float getRevFreeOffice() {
			return revFreeOffice;
		}

		public void setRevFreeOffice(float revFreeOffice) {
			this.revFreeOffice = revFreeOffice;
		}

		public float getRevFreeLand() {
			return revFreeLand;
		}

		public void setRevFreeLand(float revFreeLand) {
			this.revFreeLand = revFreeLand;
		}

		public float getRevPropHotel() {
			return revPropHotel;
		}

		public void setRevPropHotel(float revPropHotel) {
			this.revPropHotel = revPropHotel;
		}

		public float getRevPropOffice() {
			return revPropOffice;
		}

		public void setRevPropOffice(float revPropOffice) {
			this.revPropOffice = revPropOffice;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getPoint() {
			return point;
		}

		public void setPoint(String point) {
			this.point = point;
		}

		public String getUsage() {
			return usage;
		}

		public void setUsage(String usage) {
			this.usage = usage;
		}

		public float getArea() {
			return area;
		}

		public void setArea(float area) {
			this.area = area;
		}

		public float getRent() {
			return rent;
		}

		public void setRent(float rent) {
			this.rent = rent;
		}

	}
}
