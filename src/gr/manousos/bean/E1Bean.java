package gr.manousos.bean;

import java.io.IOException;
import java.net.URI;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jndi.cosnaming.IiopUrl.Address;
import com.sun.org.apache.xpath.internal.operations.Bool;

import gr.manousos.model.Contact;
import gr.manousos.model.E1;
import gr.manousos.model.E1Id;
import gr.manousos.model.E1dataFromTaxPayerFolder;
import gr.manousos.model.E1expensesRemovedFromTotalIncome;
import gr.manousos.model.E1incomeFromAgricularCompanyData;
import gr.manousos.model.E1incomesReduceTaxes;
import gr.manousos.model.E1infoData;
import gr.manousos.model.E1objectiveSpending;
import gr.manousos.model.E1personDataBorneTaxpayer;
import gr.manousos.model.E1prepaidTaxes;
import gr.manousos.model.E1reduceTax;
import gr.manousos.model.E1relatePersons;
import gr.manousos.model.E1taxPayerBankAccount;
import gr.manousos.model.E1taxableIncomes;
import gr.manousos.model.RelatePerson;
import gr.manousos.model.Taxpayer;

public class E1Bean {

	@ManagedProperty(value = "#{loginBean}")
	private LoginBean login;
	private String error;
	private int taxPayerId = 0;
	// table 1
	private String wifeFName;
	private String wifeLName;
	private String wifeFaName;
	private String wifeAT;
	private String wifeAFM;
	private String wifeAddress;
	private String wifePhone;
	private String wifeCell;
	private String delegateFName;
	private String delegateLName;
	private String delegateFaName;
	private String delegateAFM;
	private String delegateAddress;
	private String delegatePhone;
	// table 2
	private Boolean _327;
	private Boolean _328;
	private Boolean _319;
	private Boolean _320;
	private Boolean _023;
	private Boolean _024;
	private Boolean _329;
	private Boolean _330;
	private Boolean _331;
	private Boolean _011;
	private Boolean _012;
	private Boolean _013;
	private Boolean _014;
	private Boolean _015;
	private Boolean _016;
	private Boolean _017;
	private Boolean _018;
	private Boolean _021;
	private Boolean _022;
	private Boolean _025;
	private Boolean _026;
	private Boolean _007;
	private Boolean _008;
	private Boolean _617;
	private Boolean _385;
	private Boolean _386;
	private Boolean _029;
	private Boolean _030;
	private Boolean _905;
	private Boolean _906;
	private Boolean _911;
	private Boolean _912;
	private Boolean _010;
	// table 3
	private Boolean _001;
	private Boolean _002;
	private Integer _003;
	private Integer _004;
	private Integer _005;
	private Integer _006;

	// table 4

	private Float _301;
	private Float _302;
	private Float _303;
	private Float _304;
	private Float _321;
	private Float _322;
	private Float _317;
	private Float _318;
	private Float _461;
	private Float _462;
	private Float _921;
	private Float _922;
	private Float _919;
	private Float _920;
	private String location;
	private Integer prodKind;
	private Float population;
	private Integer locationType;
	private Integer hasWater;
	private Float netIncome;
	private Float _915;
	private Float _916;
	private Float _923;
	private Float _924;
	private Float _335;
	private Float _336;
	private Float _326;
	private Float _337;
	private Float _338;
	private Float _339;
	private Float _340;
	private Float _465;
	private Float _466;
	private Float _467;
	private Float _468;
	private Float _475;
	private Float _476;
	private Float _479;
	private Float _480;
	private Float _481;
	private Float _482;
	private Float _401;
	private Float _402;
	private Float _403;
	private Float _404;
	private Float _405;
	private Float _406;
	private Float _407;
	private Float _408;
	private Float _413;
	private Float _414;
	private Float _415;
	private Float _416;
	private Float _425;
	private Float _426;
	private Float _501;
	private Float _502;
	private Float _503;
	private Float _504;
	private Float _505;
	private Float _506;
	private Float _507;
	private Float _508;
	private Float _511;
	private Float _512;
	private Float _515;
	private Float _516;
	private Float _517;
	private Float _518;
	private Float _103;
	private Float _104;
	private Float _121;
	private Float _122;
	private Float _105;
	private Float _106;
	private Float _107;
	private Float _108;
	private Float _109;
	private Float _110;
	private Float _101;
	private Float _102;
	private Float _909;
	private Float _910;
	private Float _111;
	private Float _112;
	private Float _113;
	private Float _114;
	private Float _129;
	private Float _130;
	private Float _143;
	private Float _144;
	private Float _145;
	private Float _146;
	private Float _147;
	private Float _148;
	private Float _141;
	private Float _142;
	private Float _701;
	private Float _702;
	private Float _123;
	private Float _124;
	private Float _125;
	private Float _126;
	private Float _151;
	private Float _152;
	private Float _163;
	private Float _164;
	private Float _165;
	private Float _166;
	private Float _159;
	private Float _160;
	private Float _175;
	private Float _176;
	private Float _131;
	private Float _132;
	private Float _133;
	private Float _134;
	private Float _741;
	private Float _742;
	private Float _291;
	private Float _292;
	private Float _389;
	private Float _390;
	private Float _391;
	private Float _392;
	private Float _463;
	private Float _464;
	private Float _471;
	private Float _472;
	private Float _411;
	private Float _412;
	private Float _421;
	private Float _422;
	private Float _509;
	private Float _510;
	private Float _513;
	private Float _514;
	private Float _295;
	private Float _296;
	private Float _171;
	private Float _172;
	private Float _173;
	private Float _174;
	private Float _395;
	private Float _396;
	// table 5
	private String _205;
	private String houseAddr1;
	private Boolean _203;
	private Boolean _240;
	private Float _211;
	private Float _212;
	private Float _213;
	private Float _214;
	private Integer _215;
	private Float _216;
	private String houseAddr2;
	private Boolean _207;
	private Boolean _241;
	private Float _218;
	private Float _219;
	private Float _220;
	private Float _221;
	private Integer _222;
	private Float _223;
	private String houseAddr3;
	private Boolean _209;
	private Boolean _242;
	private Float _225;
	private Float _226;
	private Float _227;
	private Float _228;
	private Integer _229;
	private Float _230;
	private Float _707;
	private Float _708;
	private String afm1;
	private String _750;
	private Integer _703;
	private Integer _761;
	private Float _771;
	private Integer _775;
	private String afm2;
	private String _751;
	private Integer _704;
	private Integer _762;
	private Float _772;
	private Integer _776;
	private String afm3;
	private String _752;
	private Integer _705;
	private Integer _763;
	private Float _773;
	private Integer _777;
	private String afm4;
	private String _753;
	private Integer _706;
	private Integer _764;
	private Float _774;
	private Integer _778;
	private Float _851;
	private Float _852;
	private Float _853;
	private Float _854;
	private Float _855;
	private Float _856;
	private Float _857;
	private Float _858;
	private String shippingName1;
	private String shippingRegister1;
	private String shippingCountry1;
	private Integer sailShip1;
	private Integer accommodationSpace1;
	private Float percentPrincipalCoOwner1;
	private Float percentWifeCoOwner1;
	private Integer firstRegister1;
	private Integer ownershipMonths1;
	private Float _747;
	private String shippingName2;
	private String shippingRegister2;
	private String shippingCountry2;
	private Integer sailShip2;
	private Integer accommodationSpace2;
	private Float percentPrincipalCoOwner2;
	private Float percentWifeCoOwner2;
	private Integer firstRegister2;
	private Integer ownershipMonths2;
	private Float _748;
	private Float _711;
	private Float _712;
	private Float _713;
	private Float _714;
	private Float _731;
	private Float _732;
	private String aircraftRegisterData;
	private String aircraftType;
	private String aircraftSn;
	private String airportBase;
	private Integer aircraftOwnerShip;
	private Integer aircraftPowerLibres;
	private Integer aircraftFirstRegister;
	private Float _715;
	private Float _716;
	private Float _767;
	private Float poolPrincipalCoOwnerOutdoor;
	private Float poolWifeCoOwnerOutdoor;
	private Float _768;
	private Float poolPrincipalCoOwnerIndoor;
	private Float poolWifeCoOwnerIndoor;
	private Float _765;
	private Float _766;
	private Float _769;
	private Float _770;
	private Float _719;
	private Float _720;
	private Float _721;
	private Float _722;
	private Float _723;
	private Float _724;
	private Float _725;
	private Float _726;
	private Float _727;
	private Float _728;
	// table 6
	private Float _655;
	private Float _656;
	private Float _693;
	private Float _694;
	private Float _659;
	private Float _660;
	private Float _657;
	private Float _658;
	private Float _661;
	private Float _662;
	private Float _431;
	private Float _432;
	private Float _433;
	private Float _434;
	private Float _305;
	private Float _306;
	private Float _477;
	private Float _478;
	private String lessorName1;
	private String _790;
	private Float _795;
	private String lassorName2;
	private String _791;
	private Float _796;
	private Float _793;
	private Float _794;
	private Float _615;
	private String _616;
	private String lassorNameForStudent;
	private String _417;
	private Float areaStudentHouse;
	private Float _419;
	private Float _420;
	private Float _735;
	private Float _736;
	private Float _781;
	private Float _782;
	private Float _783;
	private Float _784;
	private Float _787;
	private Float _788;
	// table 7
	private Float _049;
	private Float _051;
	private Float _052;
	private Float _053;
	private Float _054;
	private Float _057;
	private Float _058;
	private Float _031;
	private Float _032;
	private Float _059;
	private Float _060;
	private Float _075;
	private Float _076;
	private Float _061;
	private Float _062;
	private Float _071;
	private Float _063;
	private Float _064;
	private Float _069;
	private Float _070;
	private String rentalForFamilyOwnerName1;
	private String _801;
	private Boolean _092;
	private Float _091;
	private Integer _097;
	private Float _811;
	private Float _812;
	private String rentalForFamilyOwnerName2;
	private String _802;
	private Boolean _094;
	private Float _093;
	private Integer _098;
	private Float _813;
	private Float _814;
	private String rentalForFamilyOwnerName3;
	private String _803;
	private Boolean _096;
	private Float _095;
	private Float _099;
	private Float _815;
	private Float _816;
	private String rentalForStudyOwnerName1;
	private String _804;
	private Float _817;
	private String rentalForStudyOwnerName2;
	private String _805;
	private Float _819;
	private String rentalForStudyOwnerName3;
	private String _806;
	private Float _821;
	private String rentalForStudyOwnerName4;
	private String _807;
	private Float _823;
	private Float _073;
	private Float _074;
	private Float _089;
	private Float _090;
	private Float _087;
	private Float _088;
	private Float _079;
	private Float _080;
	private Float _084;
	private Float _085;
	private Float _077;
	private Float _078;
	private Float _663;
	private Float _664;
	private Integer _033;
	private Integer _034;
	private Integer _035;
	private Integer _036;
	// table 8
	private Float _601;
	private Float _602;
	private Float _603;
	private Float _604;
	private Float _605;
	private Float _606;
	private Float _607;
	private Float _608;
	private Float _609;
	private Float _610;
	private Float _651;
	private Float _652;
	private Float _293;
	private Float _294;
	private Float _313;
	private Float _314;
	private Float _315;
	private Float _316;
	private Float _297;
	private Float _298;
	private Float _127;
	private String _128;
	// table 9
	private String name1;
	private Integer birthYear1;
	private String schoolName1;
	private String _831;
	private String name2;
	private Integer birthYear2;
	private String schoolName2;
	private String _832;
	private String name3;
	private Integer birthYear3;
	private String schoolName3;
	private String _833;
	private String name4;
	private Integer birthYear4;
	private String schoolName4;
	private String _834;
	private String fullName1;
	private String _835;
	private String relationshipWithPrincipal1;
	private String relationShipWithWife1;
	private String fullName2;
	private String _836;
	private String relationshipWithPrincipal2;
	private String relationShipWithWife2;
	private String fullName3;
	private String _837;
	private String relationshipWithPrincipal3;
	private String relationShipWithWife3;
	private String fullName4;
	private String _838;
	private String relationshipWithPrincipal4;
	private String relationShipWithWife4;
	// table 10
	private Float _901;
	private Float _902;
	private Float _903;
	private Float _904;
	private Float _341;
	private Float _342;
	private Float _745;
	private Float _746;
	private Float _995;
	private Float _996;
	private Float _997;
	private Float _998;
	private Float _959;
	private Float _960;
	private Float _743;
	private Float _744;
	private Float _323;
	private Float _324;
	private Float _399;
	private Float _400;
	private Float _907;
	private Float _908;
	private Float _985;
	private Float _986;
	private Float _987;
	private Float _988;
	private Float _989;
	private Float _990;
	// table 11
	private String bic;
	private String iban;

	// table 12

	public int getTaxPayerId() {
		return taxPayerId;
	}

	public void setTaxPayerId(int taxPayerId) {
		this.taxPayerId = taxPayerId;
	}

	public void setLogin(LoginBean login) {
		this.login = login;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getWifeFName() {
		return wifeFName;
	}

	public void setWifeFName(String wifeFName) {
		this.wifeFName = wifeFName;
	}

	public String getWifeLName() {
		return wifeLName;
	}

	public void setWifeLName(String wifeLName) {
		this.wifeLName = wifeLName;
	}

	public String getWifeFaName() {
		return wifeFaName;
	}

	public void setWifeFaName(String wifeFaName) {
		this.wifeFaName = wifeFaName;
	}

	public String getWifeAT() {
		return wifeAT;
	}

	public void setWifeAT(String wifeAT) {
		this.wifeAT = wifeAT;
	}

	public String getWifeAFM() {
		return wifeAFM;
	}

	public void setWifeAFM(String wifeAFM) {
		this.wifeAFM = wifeAFM;
	}

	public String getWifeAddress() {
		return wifeAddress;
	}

	public void setWifeAddress(String wifeAddress) {
		this.wifeAddress = wifeAddress;
	}

	public String getWifePhone() {
		return wifePhone;
	}

	public void setWifePhone(String wifePhone) {
		this.wifePhone = wifePhone;
	}

	public String getWifeCell() {
		return wifeCell;
	}

	public void setWifeCell(String wifeCell) {
		this.wifeCell = wifeCell;
	}

	public String getDelegateFName() {
		return delegateFName;
	}

	public void setDelegateFName(String delegateFName) {
		this.delegateFName = delegateFName;
	}

	public String getDelegateLName() {
		return delegateLName;
	}

	public void setDelegateLName(String delegateLName) {
		this.delegateLName = delegateLName;
	}

	public String getDelegateFaName() {
		return delegateFaName;
	}

	public void setDelegateFaName(String delegateFaName) {
		this.delegateFaName = delegateFaName;
	}

	public String getDelegateAFM() {
		return delegateAFM;
	}

	public void setDelegateAFM(String delegateAFM) {
		this.delegateAFM = delegateAFM;
	}

	public String getDelegateAddress() {
		return delegateAddress;
	}

	public void setDelegateAddress(String delegateAddress) {
		this.delegateAddress = delegateAddress;
	}

	public String getDelegatePhone() {
		return delegatePhone;
	}

	public void setDelegatePhone(String delegatePhone) {
		this.delegatePhone = delegatePhone;
	}

	public Boolean get_327() {
		return _327;
	}

	public void set_327(Boolean _327) {
		this._327 = _327;
	}

	public Boolean get_328() {
		return _328;
	}

	public void set_328(Boolean _328) {
		this._328 = _328;
	}

	public Boolean get_319() {
		return _319;
	}

	public void set_319(Boolean _319) {
		this._319 = _319;
	}

	public Boolean get_320() {
		return _320;
	}

	public void set_320(Boolean _320) {
		this._320 = _320;
	}

	public Boolean get_023() {
		return _023;
	}

	public void set_023(Boolean _023) {
		this._023 = _023;
	}

	public Boolean get_024() {
		return _024;
	}

	public void set_024(Boolean _024) {
		this._024 = _024;
	}

	public Boolean get_329() {
		return _329;
	}

	public void set_329(Boolean _329) {
		this._329 = _329;
	}

	public Boolean get_330() {
		return _330;
	}

	public void set_330(Boolean _330) {
		this._330 = _330;
	}

	public Boolean get_331() {
		return _331;
	}

	public void set_331(Boolean _331) {
		this._331 = _331;
	}

	public Boolean get_011() {
		return _011;
	}

	public void set_011(Boolean _011) {
		this._011 = _011;
	}

	public Boolean get_012() {
		return _012;
	}

	public void set_012(Boolean _012) {
		this._012 = _012;
	}

	public Boolean get_013() {
		return _013;
	}

	public void set_013(Boolean _013) {
		this._013 = _013;
	}

	public Boolean get_014() {
		return _014;
	}

	public void set_014(Boolean _014) {
		this._014 = _014;
	}

	public Boolean get_015() {
		return _015;
	}

	public void set_015(Boolean _015) {
		this._015 = _015;
	}

	public Boolean get_016() {
		return _016;
	}

	public void set_016(Boolean _016) {
		this._016 = _016;
	}

	public Boolean get_017() {
		return _017;
	}

	public void set_017(Boolean _017) {
		this._017 = _017;
	}

	public Boolean get_018() {
		return _018;
	}

	public void set_018(Boolean _018) {
		this._018 = _018;
	}

	public Boolean get_021() {
		return _021;
	}

	public void set_021(Boolean _021) {
		this._021 = _021;
	}

	public Boolean get_022() {
		return _022;
	}

	public void set_022(Boolean _022) {
		this._022 = _022;
	}

	public Boolean get_025() {
		return _025;
	}

	public void set_025(Boolean _025) {
		this._025 = _025;
	}

	public Boolean get_026() {
		return _026;
	}

	public void set_026(Boolean _026) {
		this._026 = _026;
	}

	public Boolean get_007() {
		return _007;
	}

	public void set_007(Boolean _007) {
		this._007 = _007;
	}

	public Boolean get_008() {
		return _008;
	}

	public void set_008(Boolean _008) {
		this._008 = _008;
	}

	public Boolean get_617() {
		return _617;
	}

	public void set_617(Boolean _617) {
		this._617 = _617;
	}

	public Boolean get_385() {
		return _385;
	}

	public void set_385(Boolean _385) {
		this._385 = _385;
	}

	public Boolean get_386() {
		return _386;
	}

	public void set_386(Boolean _386) {
		this._386 = _386;
	}

	public Boolean get_029() {
		return _029;
	}

	public void set_029(Boolean _029) {
		this._029 = _029;
	}

	public Boolean get_030() {
		return _030;
	}

	public void set_030(Boolean _030) {
		this._030 = _030;
	}

	public Boolean get_905() {
		return _905;
	}

	public void set_905(Boolean _905) {
		this._905 = _905;
	}

	public Boolean get_906() {
		return _906;
	}

	public void set_906(Boolean _906) {
		this._906 = _906;
	}

	public Boolean get_911() {
		return _911;
	}

	public void set_911(Boolean _911) {
		this._911 = _911;
	}

	public Boolean get_912() {
		return _912;
	}

	public void set_912(Boolean _912) {
		this._912 = _912;
	}

	public Boolean get_010() {
		return _010;
	}

	public void set_010(Boolean _010) {
		this._010 = _010;
	}

	public Boolean get_001() {
		return _001;
	}

	public void set_001(Boolean _001) {
		this._001 = _001;
	}

	public Boolean get_002() {
		return _002;
	}

	public void set_002(Boolean _002) {
		this._002 = _002;
	}

	public Integer get_003() {
		return _003;
	}

	public void set_003(Integer _003) {
		this._003 = _003;
	}

	public Integer get_004() {
		return _004;
	}

	public void set_004(Integer _004) {
		this._004 = _004;
	}

	public Integer get_005() {
		return _005;
	}

	public void set_005(Integer _005) {
		this._005 = _005;
	}

	public Integer get_006() {
		return _006;
	}

	public void set_006(Integer _006) {
		this._006 = _006;
	}

	public Float get_301() {
		return _301;
	}

	public void set_301(Float _301) {
		this._301 = _301;
	}

	public Float get_302() {
		return _302;
	}

	public void set_302(Float _302) {
		this._302 = _302;
	}

	public Float get_303() {
		return _303;
	}

	public void set_303(Float _303) {
		this._303 = _303;
	}

	public Float get_304() {
		return _304;
	}

	public void set_304(Float _304) {
		this._304 = _304;
	}

	public Float get_321() {
		return _321;
	}

	public void set_321(Float _321) {
		this._321 = _321;
	}

	public Float get_322() {
		return _322;
	}

	public void set_322(Float _322) {
		this._322 = _322;
	}

	public Float get_317() {
		return _317;
	}

	public void set_317(Float _317) {
		this._317 = _317;
	}

	public Float get_318() {
		return _318;
	}

	public void set_318(Float _318) {
		this._318 = _318;
	}

	public Float get_461() {
		return _461;
	}

	public void set_461(Float _461) {
		this._461 = _461;
	}

	public Float get_462() {
		return _462;
	}

	public void set_462(Float _462) {
		this._462 = _462;
	}

	public Float get_921() {
		return _921;
	}

	public void set_921(Float _921) {
		this._921 = _921;
	}

	public Float get_922() {
		return _922;
	}

	public void set_922(Float _922) {
		this._922 = _922;
	}

	public Float get_919() {
		return _919;
	}

	public void set_919(Float _919) {
		this._919 = _919;
	}

	public Float get_920() {
		return _920;
	}

	public void set_920(Float _920) {
		this._920 = _920;
	}

	public Float get_915() {
		return _915;
	}

	public void set_915(Float _915) {
		this._915 = _915;
	}

	public Float get_916() {
		return _916;
	}

	public void set_916(Float _916) {
		this._916 = _916;
	}

	public Float get_923() {
		return _923;
	}

	public void set_923(Float _923) {
		this._923 = _923;
	}

	public Float get_924() {
		return _924;
	}

	public void set_924(Float _924) {
		this._924 = _924;
	}

	public Float get_335() {
		return _335;
	}

	public void set_335(Float _335) {
		this._335 = _335;
	}

	public Float get_336() {
		return _336;
	}

	public void set_336(Float _336) {
		this._336 = _336;
	}

	public Float get_326() {
		return _326;
	}

	public void set_326(Float _326) {
		this._326 = _326;
	}

	public Float get_337() {
		return _337;
	}

	public void set_337(Float _337) {
		this._337 = _337;
	}

	public Float get_338() {
		return _338;
	}

	public void set_338(Float _338) {
		this._338 = _338;
	}

	public Float get_339() {
		return _339;
	}

	public void set_339(Float _339) {
		this._339 = _339;
	}

	public Float get_340() {
		return _340;
	}

	public void set_340(Float _340) {
		this._340 = _340;
	}

	public Float get_465() {
		return _465;
	}

	public void set_465(Float _465) {
		this._465 = _465;
	}

	public Float get_466() {
		return _466;
	}

	public void set_466(Float _466) {
		this._466 = _466;
	}

	public Float get_467() {
		return _467;
	}

	public void set_467(Float _467) {
		this._467 = _467;
	}

	public Float get_468() {
		return _468;
	}

	public void set_468(Float _468) {
		this._468 = _468;
	}

	public Float get_475() {
		return _475;
	}

	public void set_475(Float _475) {
		this._475 = _475;
	}

	public Float get_476() {
		return _476;
	}

	public void set_476(Float _476) {
		this._476 = _476;
	}

	public Float get_479() {
		return _479;
	}

	public void set_479(Float _479) {
		this._479 = _479;
	}

	public Float get_480() {
		return _480;
	}

	public void set_480(Float _480) {
		this._480 = _480;
	}

	public Float get_481() {
		return _481;
	}

	public void set_481(Float _481) {
		this._481 = _481;
	}

	public Float get_482() {
		return _482;
	}

	public void set_482(Float _482) {
		this._482 = _482;
	}

	public Float get_401() {
		return _401;
	}

	public void set_401(Float _401) {
		this._401 = _401;
	}

	public Float get_402() {
		return _402;
	}

	public void set_402(Float _402) {
		this._402 = _402;
	}

	public Float get_403() {
		return _403;
	}

	public void set_403(Float _403) {
		this._403 = _403;
	}

	public Float get_404() {
		return _404;
	}

	public void set_404(Float _404) {
		this._404 = _404;
	}

	public Float get_405() {
		return _405;
	}

	public void set_405(Float _405) {
		this._405 = _405;
	}

	public Float get_406() {
		return _406;
	}

	public void set_406(Float _406) {
		this._406 = _406;
	}

	public Float get_407() {
		return _407;
	}

	public void set_407(Float _407) {
		this._407 = _407;
	}

	public Float get_408() {
		return _408;
	}

	public void set_408(Float _408) {
		this._408 = _408;
	}

	public Float get_413() {
		return _413;
	}

	public void set_413(Float _413) {
		this._413 = _413;
	}

	public Float get_414() {
		return _414;
	}

	public void set_414(Float _414) {
		this._414 = _414;
	}

	public Float get_415() {
		return _415;
	}

	public void set_415(Float _415) {
		this._415 = _415;
	}

	public Float get_416() {
		return _416;
	}

	public void set_416(Float _416) {
		this._416 = _416;
	}

	public Float get_425() {
		return _425;
	}

	public void set_425(Float _425) {
		this._425 = _425;
	}

	public Float get_426() {
		return _426;
	}

	public void set_426(Float _426) {
		this._426 = _426;
	}

	public Float get_501() {
		return _501;
	}

	public void set_501(Float _501) {
		this._501 = _501;
	}

	public Float get_502() {
		return _502;
	}

	public void set_502(Float _502) {
		this._502 = _502;
	}

	public Float get_503() {
		return _503;
	}

	public void set_503(Float _503) {
		this._503 = _503;
	}

	public Float get_504() {
		return _504;
	}

	public void set_504(Float _504) {
		this._504 = _504;
	}

	public Float get_505() {
		return _505;
	}

	public void set_505(Float _505) {
		this._505 = _505;
	}

	public Float get_506() {
		return _506;
	}

	public void set_506(Float _506) {
		this._506 = _506;
	}

	public Float get_507() {
		return _507;
	}

	public void set_507(Float _507) {
		this._507 = _507;
	}

	public Float get_508() {
		return _508;
	}

	public void set_508(Float _508) {
		this._508 = _508;
	}

	public Float get_511() {
		return _511;
	}

	public void set_511(Float _511) {
		this._511 = _511;
	}

	public Float get_512() {
		return _512;
	}

	public void set_512(Float _512) {
		this._512 = _512;
	}

	public Float get_515() {
		return _515;
	}

	public void set_515(Float _515) {
		this._515 = _515;
	}

	public Float get_516() {
		return _516;
	}

	public void set_516(Float _516) {
		this._516 = _516;
	}

	public Float get_517() {
		return _517;
	}

	public void set_517(Float _517) {
		this._517 = _517;
	}

	public Float get_518() {
		return _518;
	}

	public void set_518(Float _518) {
		this._518 = _518;
	}

	public Float get_103() {
		return _103;
	}

	public void set_103(Float _103) {
		this._103 = _103;
	}

	public Float get_104() {
		return _104;
	}

	public void set_104(Float _104) {
		this._104 = _104;
	}

	public Float get_121() {
		return _121;
	}

	public void set_121(Float _121) {
		this._121 = _121;
	}

	public Float get_122() {
		return _122;
	}

	public void set_122(Float _122) {
		this._122 = _122;
	}

	public Float get_105() {
		return _105;
	}

	public void set_105(Float _105) {
		this._105 = _105;
	}

	public Float get_106() {
		return _106;
	}

	public void set_106(Float _106) {
		this._106 = _106;
	}

	public Float get_107() {
		return _107;
	}

	public void set_107(Float _107) {
		this._107 = _107;
	}

	public Float get_108() {
		return _108;
	}

	public void set_108(Float _108) {
		this._108 = _108;
	}

	public Float get_109() {
		return _109;
	}

	public void set_109(Float _109) {
		this._109 = _109;
	}

	public Float get_110() {
		return _110;
	}

	public void set_110(Float _110) {
		this._110 = _110;
	}

	public Float get_101() {
		return _101;
	}

	public void set_101(Float _101) {
		this._101 = _101;
	}

	public Float get_102() {
		return _102;
	}

	public void set_102(Float _102) {
		this._102 = _102;
	}

	public Float get_909() {
		return _909;
	}

	public void set_909(Float _909) {
		this._909 = _909;
	}

	public Float get_910() {
		return _910;
	}

	public void set_910(Float _910) {
		this._910 = _910;
	}

	public Float get_111() {
		return _111;
	}

	public void set_111(Float _111) {
		this._111 = _111;
	}

	public Float get_112() {
		return _112;
	}

	public void set_112(Float _112) {
		this._112 = _112;
	}

	public Float get_113() {
		return _113;
	}

	public void set_113(Float _113) {
		this._113 = _113;
	}

	public Float get_114() {
		return _114;
	}

	public void set_114(Float _114) {
		this._114 = _114;
	}

	public Float get_129() {
		return _129;
	}

	public void set_129(Float _129) {
		this._129 = _129;
	}

	public Float get_130() {
		return _130;
	}

	public void set_130(Float _130) {
		this._130 = _130;
	}

	public Float get_143() {
		return _143;
	}

	public void set_143(Float _143) {
		this._143 = _143;
	}

	public Float get_144() {
		return _144;
	}

	public void set_144(Float _144) {
		this._144 = _144;
	}

	public Float get_145() {
		return _145;
	}

	public void set_145(Float _145) {
		this._145 = _145;
	}

	public Float get_146() {
		return _146;
	}

	public void set_146(Float _146) {
		this._146 = _146;
	}

	public Float get_147() {
		return _147;
	}

	public void set_147(Float _147) {
		this._147 = _147;
	}

	public Float get_148() {
		return _148;
	}

	public void set_148(Float _148) {
		this._148 = _148;
	}

	public Float get_141() {
		return _141;
	}

	public void set_141(Float _141) {
		this._141 = _141;
	}

	public Float get_142() {
		return _142;
	}

	public void set_142(Float _142) {
		this._142 = _142;
	}

	public Float get_701() {
		return _701;
	}

	public void set_701(Float _701) {
		this._701 = _701;
	}

	public Float get_702() {
		return _702;
	}

	public void set_702(Float _702) {
		this._702 = _702;
	}

	public Float get_123() {
		return _123;
	}

	public void set_123(Float _123) {
		this._123 = _123;
	}

	public Float get_124() {
		return _124;
	}

	public void set_124(Float _124) {
		this._124 = _124;
	}

	public Float get_125() {
		return _125;
	}

	public void set_125(Float _125) {
		this._125 = _125;
	}

	public Float get_126() {
		return _126;
	}

	public void set_126(Float _126) {
		this._126 = _126;
	}

	public Float get_151() {
		return _151;
	}

	public void set_151(Float _151) {
		this._151 = _151;
	}

	public Float get_152() {
		return _152;
	}

	public void set_152(Float _152) {
		this._152 = _152;
	}

	public Float get_163() {
		return _163;
	}

	public void set_163(Float _163) {
		this._163 = _163;
	}

	public Float get_164() {
		return _164;
	}

	public void set_164(Float _164) {
		this._164 = _164;
	}

	public Float get_165() {
		return _165;
	}

	public void set_165(Float _165) {
		this._165 = _165;
	}

	public Float get_166() {
		return _166;
	}

	public void set_166(Float _166) {
		this._166 = _166;
	}

	public Float get_159() {
		return _159;
	}

	public void set_159(Float _159) {
		this._159 = _159;
	}

	public Float get_160() {
		return _160;
	}

	public void set_160(Float _160) {
		this._160 = _160;
	}

	public Float get_175() {
		return _175;
	}

	public void set_175(Float _175) {
		this._175 = _175;
	}

	public Float get_176() {
		return _176;
	}

	public void set_176(Float _176) {
		this._176 = _176;
	}

	public Float get_131() {
		return _131;
	}

	public void set_131(Float _131) {
		this._131 = _131;
	}

	public Float get_132() {
		return _132;
	}

	public void set_132(Float _132) {
		this._132 = _132;
	}

	public Float get_133() {
		return _133;
	}

	public void set_133(Float _133) {
		this._133 = _133;
	}

	public Float get_134() {
		return _134;
	}

	public void set_134(Float _134) {
		this._134 = _134;
	}

	public Float get_741() {
		return _741;
	}

	public void set_741(Float _741) {
		this._741 = _741;
	}

	public Float get_742() {
		return _742;
	}

	public void set_742(Float _742) {
		this._742 = _742;
	}

	public Float get_291() {
		return _291;
	}

	public void set_291(Float _291) {
		this._291 = _291;
	}

	public Float get_292() {
		return _292;
	}

	public void set_292(Float _292) {
		this._292 = _292;
	}

	public Float get_389() {
		return _389;
	}

	public void set_389(Float _389) {
		this._389 = _389;
	}

	public Float get_390() {
		return _390;
	}

	public void set_390(Float _390) {
		this._390 = _390;
	}

	public Float get_391() {
		return _391;
	}

	public void set_391(Float _391) {
		this._391 = _391;
	}

	public Float get_392() {
		return _392;
	}

	public void set_392(Float _392) {
		this._392 = _392;
	}

	public Float get_463() {
		return _463;
	}

	public void set_463(Float _463) {
		this._463 = _463;
	}

	public Float get_464() {
		return _464;
	}

	public void set_464(Float _464) {
		this._464 = _464;
	}

	public Float get_471() {
		return _471;
	}

	public void set_471(Float _471) {
		this._471 = _471;
	}

	public Float get_472() {
		return _472;
	}

	public void set_472(Float _472) {
		this._472 = _472;
	}

	public Float get_411() {
		return _411;
	}

	public void set_411(Float _411) {
		this._411 = _411;
	}

	public Float get_412() {
		return _412;
	}

	public void set_412(Float _412) {
		this._412 = _412;
	}

	public Float get_421() {
		return _421;
	}

	public void set_421(Float _421) {
		this._421 = _421;
	}

	public Float get_422() {
		return _422;
	}

	public void set_422(Float _422) {
		this._422 = _422;
	}

	public Float get_509() {
		return _509;
	}

	public void set_509(Float _509) {
		this._509 = _509;
	}

	public Float get_510() {
		return _510;
	}

	public void set_510(Float _510) {
		this._510 = _510;
	}

	public Float get_513() {
		return _513;
	}

	public void set_513(Float _513) {
		this._513 = _513;
	}

	public Float get_514() {
		return _514;
	}

	public void set_514(Float _514) {
		this._514 = _514;
	}

	public Float get_295() {
		return _295;
	}

	public void set_295(Float _295) {
		this._295 = _295;
	}

	public Float get_296() {
		return _296;
	}

	public void set_296(Float _296) {
		this._296 = _296;
	}

	public Float get_171() {
		return _171;
	}

	public void set_171(Float _171) {
		this._171 = _171;
	}

	public Float get_172() {
		return _172;
	}

	public void set_172(Float _172) {
		this._172 = _172;
	}

	public Float get_173() {
		return _173;
	}

	public void set_173(Float _173) {
		this._173 = _173;
	}

	public Float get_174() {
		return _174;
	}

	public void set_174(Float _174) {
		this._174 = _174;
	}

	public Float get_395() {
		return _395;
	}

	public void set_395(Float _395) {
		this._395 = _395;
	}

	public Float get_396() {
		return _396;
	}

	public void set_396(Float _396) {
		this._396 = _396;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getProdKind() {
		return prodKind;
	}

	public void setProdKind(Integer prodKind) {
		this.prodKind = prodKind;
	}

	public Float getPopulation() {
		return population;
	}

	public void setPopulation(Float population) {
		this.population = population;
	}

	public Integer getLocationType() {
		return locationType;
	}

	public void setLocationType(Integer locationType) {
		this.locationType = locationType;
	}

	public Integer getHasWater() {
		return hasWater;
	}

	public void setHasWater(Integer hasWater) {
		this.hasWater = hasWater;
	}

	public Float getNetIncome() {
		return netIncome;
	}

	public void setNetIncome(Float netIncome) {
		this.netIncome = netIncome;
	}

	public String get_205() {
		return _205;
	}

	public void set_205(String _205) {
		this._205 = _205;
	}

	public String getHouseAddr1() {
		return houseAddr1;
	}

	public void setHouseAddr1(String houseAddr1) {
		this.houseAddr1 = houseAddr1;
	}

	public Boolean get_203() {
		return _203;
	}

	public void set_203(Boolean _203) {
		this._203 = _203;
	}

	public Boolean get_240() {
		return _240;
	}

	public void set_240(Boolean _240) {
		this._240 = _240;
	}

	public Float get_211() {
		return _211;
	}

	public void set_211(Float _211) {
		this._211 = _211;
	}

	public Float get_212() {
		return _212;
	}

	public void set_212(Float _212) {
		this._212 = _212;
	}

	public Float get_213() {
		return _213;
	}

	public void set_213(Float _213) {
		this._213 = _213;
	}

	public Float get_214() {
		return _214;
	}

	public void set_214(Float _214) {
		this._214 = _214;
	}

	public Integer get_215() {
		return _215;
	}

	public void set_215(Integer _215) {
		this._215 = _215;
	}

	public Float get_216() {
		return _216;
	}

	public void set_216(Float _216) {
		this._216 = _216;
	}

	public String getHouseAddr2() {
		return houseAddr2;
	}

	public void setHouseAddr2(String houseAddr2) {
		this.houseAddr2 = houseAddr2;
	}

	public Boolean get_207() {
		return _207;
	}

	public void set_207(Boolean _207) {
		this._207 = _207;
	}

	public Boolean get_241() {
		return _241;
	}

	public void set_241(Boolean _241) {
		this._241 = _241;
	}

	public Float get_218() {
		return _218;
	}

	public void set_218(Float _218) {
		this._218 = _218;
	}

	public Float get_219() {
		return _219;
	}

	public void set_219(Float _219) {
		this._219 = _219;
	}

	public Float get_220() {
		return _220;
	}

	public void set_220(Float _220) {
		this._220 = _220;
	}

	public Float get_221() {
		return _221;
	}

	public void set_221(Float _221) {
		this._221 = _221;
	}

	public Integer get_222() {
		return _222;
	}

	public void set_222(Integer _222) {
		this._222 = _222;
	}

	public Float get_223() {
		return _223;
	}

	public void set_223(Float _223) {
		this._223 = _223;
	}

	public String getHouseAddr3() {
		return houseAddr3;
	}

	public void setHouseAddr3(String houseAddr3) {
		this.houseAddr3 = houseAddr3;
	}

	public Boolean get_209() {
		return _209;
	}

	public void set_209(Boolean _209) {
		this._209 = _209;
	}

	public Boolean get_242() {
		return _242;
	}

	public void set_242(Boolean _242) {
		this._242 = _242;
	}

	public Float get_225() {
		return _225;
	}

	public void set_225(Float _225) {
		this._225 = _225;
	}

	public Float get_226() {
		return _226;
	}

	public void set_226(Float _226) {
		this._226 = _226;
	}

	public Float get_227() {
		return _227;
	}

	public void set_227(Float _227) {
		this._227 = _227;
	}

	public Float get_228() {
		return _228;
	}

	public void set_228(Float _228) {
		this._228 = _228;
	}

	public Integer get_229() {
		return _229;
	}

	public void set_229(Integer _229) {
		this._229 = _229;
	}

	public Float get_230() {
		return _230;
	}

	public void set_230(Float _230) {
		this._230 = _230;
	}

	public Float get_707() {
		return _707;
	}

	public void set_707(Float _707) {
		this._707 = _707;
	}

	public Float get_708() {
		return _708;
	}

	public void set_708(Float _708) {
		this._708 = _708;
	}

	public String getAfm1() {
		return afm1;
	}

	public void setAfm1(String afm1) {
		this.afm1 = afm1;
	}

	public String get_750() {
		return _750;
	}

	public void set_750(String _750) {
		this._750 = _750;
	}

	public Integer get_703() {
		return _703;
	}

	public void set_703(Integer _703) {
		this._703 = _703;
	}

	public Integer get_761() {
		return _761;
	}

	public void set_761(Integer _761) {
		this._761 = _761;
	}

	public Float get_771() {
		return _771;
	}

	public void set_771(Float _771) {
		this._771 = _771;
	}

	public Integer get_775() {
		return _775;
	}

	public void set_775(Integer _775) {
		this._775 = _775;
	}

	public String getAfm2() {
		return afm2;
	}

	public void setAfm2(String afm2) {
		this.afm2 = afm2;
	}

	public String get_751() {
		return _751;
	}

	public void set_751(String _751) {
		this._751 = _751;
	}

	public Integer get_704() {
		return _704;
	}

	public void set_704(Integer _704) {
		this._704 = _704;
	}

	public Integer get_762() {
		return _762;
	}

	public void set_762(Integer _762) {
		this._762 = _762;
	}

	public Float get_772() {
		return _772;
	}

	public void set_772(Float _772) {
		this._772 = _772;
	}

	public Integer get_776() {
		return _776;
	}

	public void set_776(Integer _776) {
		this._776 = _776;
	}

	public String getAfm3() {
		return afm3;
	}

	public void setAfm3(String afm3) {
		this.afm3 = afm3;
	}

	public String get_752() {
		return _752;
	}

	public void set_752(String _752) {
		this._752 = _752;
	}

	public Integer get_705() {
		return _705;
	}

	public void set_705(Integer _705) {
		this._705 = _705;
	}

	public Integer get_763() {
		return _763;
	}

	public void set_763(Integer _763) {
		this._763 = _763;
	}

	public Float get_773() {
		return _773;
	}

	public void set_773(Float _773) {
		this._773 = _773;
	}

	public Integer get_777() {
		return _777;
	}

	public void set_777(Integer _777) {
		this._777 = _777;
	}

	public String getAfm4() {
		return afm4;
	}

	public void setAfm4(String afm4) {
		this.afm4 = afm4;
	}

	public String get_753() {
		return _753;
	}

	public void set_753(String _753) {
		this._753 = _753;
	}

	public Integer get_706() {
		return _706;
	}

	public void set_706(Integer _706) {
		this._706 = _706;
	}

	public Integer get_764() {
		return _764;
	}

	public void set_764(Integer _764) {
		this._764 = _764;
	}

	public Float get_774() {
		return _774;
	}

	public void set_774(Float _774) {
		this._774 = _774;
	}

	public Integer get_778() {
		return _778;
	}

	public void set_778(Integer _778) {
		this._778 = _778;
	}

	public Float get_851() {
		return _851;
	}

	public void set_851(Float _851) {
		this._851 = _851;
	}

	public Float get_852() {
		return _852;
	}

	public void set_852(Float _852) {
		this._852 = _852;
	}

	public Float get_853() {
		return _853;
	}

	public void set_853(Float _853) {
		this._853 = _853;
	}

	public Float get_854() {
		return _854;
	}

	public void set_854(Float _854) {
		this._854 = _854;
	}

	public Float get_855() {
		return _855;
	}

	public void set_855(Float _855) {
		this._855 = _855;
	}

	public Float get_856() {
		return _856;
	}

	public void set_856(Float _856) {
		this._856 = _856;
	}

	public Float get_857() {
		return _857;
	}

	public void set_857(Float _857) {
		this._857 = _857;
	}

	public Float get_858() {
		return _858;
	}

	public void set_858(Float _858) {
		this._858 = _858;
	}

	public String getShippingName1() {
		return shippingName1;
	}

	public void setShippingName1(String shippingName1) {
		this.shippingName1 = shippingName1;
	}

	public String getShippingRegister1() {
		return shippingRegister1;
	}

	public void setShippingRegister1(String shippingRegister1) {
		this.shippingRegister1 = shippingRegister1;
	}

	public String getShippingCountry1() {
		return shippingCountry1;
	}

	public void setShippingCountry1(String shippingCountry1) {
		this.shippingCountry1 = shippingCountry1;
	}

	public Integer getSailShip1() {
		return sailShip1;
	}

	public void setSailShip1(Integer sailShip1) {
		this.sailShip1 = sailShip1;
	}

	public Integer getAccommodationSpace1() {
		return accommodationSpace1;
	}

	public void setAccommodationSpace1(Integer accommodationSpace1) {
		this.accommodationSpace1 = accommodationSpace1;
	}

	public Float getPercentPrincipalCoOwner1() {
		return percentPrincipalCoOwner1;
	}

	public void setPercentPrincipalCoOwner1(Float percentPrincipalCoOwner1) {
		this.percentPrincipalCoOwner1 = percentPrincipalCoOwner1;
	}

	public Float getPercentWifeCoOwner1() {
		return percentWifeCoOwner1;
	}

	public void setPercentWifeCoOwner1(Float percentWifeCoOwner1) {
		this.percentWifeCoOwner1 = percentWifeCoOwner1;
	}

	public Integer getFirstRegister1() {
		return firstRegister1;
	}

	public void setFirstRegister1(Integer firstRegister1) {
		this.firstRegister1 = firstRegister1;
	}

	public Integer getOwnershipMonths1() {
		return ownershipMonths1;
	}

	public void setOwnershipMonths1(Integer ownershipMonths1) {
		this.ownershipMonths1 = ownershipMonths1;
	}

	public Float get_747() {
		return _747;
	}

	public void set_747(Float _747) {
		this._747 = _747;
	}

	public String getShippingName2() {
		return shippingName2;
	}

	public void setShippingName2(String shippingName2) {
		this.shippingName2 = shippingName2;
	}

	public String getShippingRegister2() {
		return shippingRegister2;
	}

	public void setShippingRegister2(String shippingRegister2) {
		this.shippingRegister2 = shippingRegister2;
	}

	public String getShippingCountry2() {
		return shippingCountry2;
	}

	public void setShippingCountry2(String shippingCountry2) {
		this.shippingCountry2 = shippingCountry2;
	}

	public Integer getSailShip2() {
		return sailShip2;
	}

	public void setSailShip2(Integer sailShip2) {
		this.sailShip2 = sailShip2;
	}

	public Integer getAccommodationSpace2() {
		return accommodationSpace2;
	}

	public void setAccommodationSpace2(Integer accommodationSpace2) {
		this.accommodationSpace2 = accommodationSpace2;
	}

	public Float getPercentPrincipalCoOwner2() {
		return percentPrincipalCoOwner2;
	}

	public void setPercentPrincipalCoOwner2(Float percentPrincipalCoOwner2) {
		this.percentPrincipalCoOwner2 = percentPrincipalCoOwner2;
	}

	public Float getPercentWifeCoOwner2() {
		return percentWifeCoOwner2;
	}

	public void setPercentWifeCoOwner2(Float percentWifeCoOwner2) {
		this.percentWifeCoOwner2 = percentWifeCoOwner2;
	}

	public Integer getFirstRegister2() {
		return firstRegister2;
	}

	public void setFirstRegister2(Integer firstRegister2) {
		this.firstRegister2 = firstRegister2;
	}

	public Integer getOwnershipMonths2() {
		return ownershipMonths2;
	}

	public void setOwnershipMonths2(Integer ownershipMonths2) {
		this.ownershipMonths2 = ownershipMonths2;
	}

	public Float get_748() {
		return _748;
	}

	public void set_748(Float _748) {
		this._748 = _748;
	}

	public Float get_711() {
		return _711;
	}

	public void set_711(Float _711) {
		this._711 = _711;
	}

	public Float get_712() {
		return _712;
	}

	public void set_712(Float _712) {
		this._712 = _712;
	}

	public Float get_713() {
		return _713;
	}

	public void set_713(Float _713) {
		this._713 = _713;
	}

	public Float get_714() {
		return _714;
	}

	public void set_714(Float _714) {
		this._714 = _714;
	}

	public Float get_731() {
		return _731;
	}

	public void set_731(Float _731) {
		this._731 = _731;
	}

	public Float get_732() {
		return _732;
	}

	public void set_732(Float _732) {
		this._732 = _732;
	}

	public String getAircraftRegisterData() {
		return aircraftRegisterData;
	}

	public void setAircraftRegisterData(String aircraftRegisterData) {
		this.aircraftRegisterData = aircraftRegisterData;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public String getAircraftSn() {
		return aircraftSn;
	}

	public void setAircraftSn(String aircraftSn) {
		this.aircraftSn = aircraftSn;
	}

	public String getAirportBase() {
		return airportBase;
	}

	public void setAirportBase(String airportBase) {
		this.airportBase = airportBase;
	}

	public Integer getAircraftOwnerShip() {
		return aircraftOwnerShip;
	}

	public void setAircraftOwnerShip(Integer aircraftOwnerShip) {
		this.aircraftOwnerShip = aircraftOwnerShip;
	}

	public Integer getAircraftPowerLibres() {
		return aircraftPowerLibres;
	}

	public void setAircraftPowerLibres(Integer aircraftPowerLibres) {
		this.aircraftPowerLibres = aircraftPowerLibres;
	}

	public Integer getAircraftFirstRegister() {
		return aircraftFirstRegister;
	}

	public void setAircraftFirstRegister(Integer aircraftFirstRegister) {
		this.aircraftFirstRegister = aircraftFirstRegister;
	}

	public Float get_715() {
		return _715;
	}

	public void set_715(Float _715) {
		this._715 = _715;
	}

	public Float get_716() {
		return _716;
	}

	public void set_716(Float _716) {
		this._716 = _716;
	}

	public Float get_767() {
		return _767;
	}

	public void set_767(Float _767) {
		this._767 = _767;
	}

	public Float getPoolPrincipalCoOwnerOutdoor() {
		return poolPrincipalCoOwnerOutdoor;
	}

	public void setPoolPrincipalCoOwnerOutdoor(Float poolPrincipalCoOwnerOutdoor) {
		this.poolPrincipalCoOwnerOutdoor = poolPrincipalCoOwnerOutdoor;
	}

	public Float getPoolWifeCoOwnerOutdoor() {
		return poolWifeCoOwnerOutdoor;
	}

	public void setPoolWifeCoOwnerOutdoor(Float poolWifeCoOwnerOutdoor) {
		this.poolWifeCoOwnerOutdoor = poolWifeCoOwnerOutdoor;
	}

	public Float get_768() {
		return _768;
	}

	public void set_768(Float _768) {
		this._768 = _768;
	}

	public Float getPoolPrincipalCoOwnerIndoor() {
		return poolPrincipalCoOwnerIndoor;
	}

	public void setPoolPrincipalCoOwnerIndoor(Float poolPrincipalCoOwnerIndoor) {
		this.poolPrincipalCoOwnerIndoor = poolPrincipalCoOwnerIndoor;
	}

	public Float getPoolWifeCoOwnerIndoor() {
		return poolWifeCoOwnerIndoor;
	}

	public void setPoolWifeCoOwnerIndoor(Float poolWifeCoOwnerIndoor) {
		this.poolWifeCoOwnerIndoor = poolWifeCoOwnerIndoor;
	}

	public Float get_765() {
		return _765;
	}

	public void set_765(Float _765) {
		this._765 = _765;
	}

	public Float get_766() {
		return _766;
	}

	public void set_766(Float _766) {
		this._766 = _766;
	}

	public Float get_769() {
		return _769;
	}

	public void set_769(Float _769) {
		this._769 = _769;
	}

	public Float get_770() {
		return _770;
	}

	public void set_770(Float _770) {
		this._770 = _770;
	}

	public Float get_719() {
		return _719;
	}

	public void set_719(Float _719) {
		this._719 = _719;
	}

	public Float get_720() {
		return _720;
	}

	public void set_720(Float _720) {
		this._720 = _720;
	}

	public Float get_721() {
		return _721;
	}

	public void set_721(Float _721) {
		this._721 = _721;
	}

	public Float get_722() {
		return _722;
	}

	public void set_722(Float _722) {
		this._722 = _722;
	}

	public Float get_723() {
		return _723;
	}

	public void set_723(Float _723) {
		this._723 = _723;
	}

	public Float get_724() {
		return _724;
	}

	public void set_724(Float _724) {
		this._724 = _724;
	}

	public Float get_725() {
		return _725;
	}

	public void set_725(Float _725) {
		this._725 = _725;
	}

	public Float get_726() {
		return _726;
	}

	public void set_726(Float _726) {
		this._726 = _726;
	}

	public Float get_727() {
		return _727;
	}

	public void set_727(Float _727) {
		this._727 = _727;
	}

	public Float get_728() {
		return _728;
	}

	public void set_728(Float _728) {
		this._728 = _728;
	}

	public Float get_655() {
		return _655;
	}

	public void set_655(Float _655) {
		this._655 = _655;
	}

	public Float get_656() {
		return _656;
	}

	public void set_656(Float _656) {
		this._656 = _656;
	}

	public Float get_693() {
		return _693;
	}

	public void set_693(Float _693) {
		this._693 = _693;
	}

	public Float get_694() {
		return _694;
	}

	public void set_694(Float _694) {
		this._694 = _694;
	}

	public Float get_659() {
		return _659;
	}

	public void set_659(Float _659) {
		this._659 = _659;
	}

	public Float get_660() {
		return _660;
	}

	public void set_660(Float _660) {
		this._660 = _660;
	}

	public Float get_657() {
		return _657;
	}

	public void set_657(Float _657) {
		this._657 = _657;
	}

	public Float get_658() {
		return _658;
	}

	public void set_658(Float _658) {
		this._658 = _658;
	}

	public Float get_661() {
		return _661;
	}

	public void set_661(Float _661) {
		this._661 = _661;
	}

	public Float get_662() {
		return _662;
	}

	public void set_662(Float _662) {
		this._662 = _662;
	}

	public Float get_431() {
		return _431;
	}

	public void set_431(Float _431) {
		this._431 = _431;
	}

	public Float get_432() {
		return _432;
	}

	public void set_432(Float _432) {
		this._432 = _432;
	}

	public Float get_433() {
		return _433;
	}

	public void set_433(Float _433) {
		this._433 = _433;
	}

	public Float get_434() {
		return _434;
	}

	public void set_434(Float _434) {
		this._434 = _434;
	}

	public Float get_305() {
		return _305;
	}

	public void set_305(Float _305) {
		this._305 = _305;
	}

	public Float get_306() {
		return _306;
	}

	public void set_306(Float _306) {
		this._306 = _306;
	}

	public Float get_477() {
		return _477;
	}

	public void set_477(Float _477) {
		this._477 = _477;
	}

	public Float get_478() {
		return _478;
	}

	public void set_478(Float _478) {
		this._478 = _478;
	}

	public String getLessorName1() {
		return lessorName1;
	}

	public void setLessorName1(String lessorName1) {
		this.lessorName1 = lessorName1;
	}

	public String get_790() {
		return _790;
	}

	public void set_790(String _790) {
		this._790 = _790;
	}

	public Float get_795() {
		return _795;
	}

	public void set_795(Float _795) {
		this._795 = _795;
	}

	public String getLassorName2() {
		return lassorName2;
	}

	public void setLassorName2(String lassorName2) {
		this.lassorName2 = lassorName2;
	}

	public String get_791() {
		return _791;
	}

	public void set_791(String _791) {
		this._791 = _791;
	}

	public Float get_796() {
		return _796;
	}

	public void set_796(Float _796) {
		this._796 = _796;
	}

	public Float get_793() {
		return _793;
	}

	public void set_793(Float _793) {
		this._793 = _793;
	}

	public Float get_794() {
		return _794;
	}

	public void set_794(Float _794) {
		this._794 = _794;
	}

	public Float get_615() {
		return _615;
	}

	public void set_615(Float _615) {
		this._615 = _615;
	}

	public String get_616() {
		return _616;
	}

	public void set_616(String _616) {
		this._616 = _616;
	}

	public String getLassorNameForStudent() {
		return lassorNameForStudent;
	}

	public void setLassorNameForStudent(String lassorNameForStudent) {
		this.lassorNameForStudent = lassorNameForStudent;
	}

	public String get_417() {
		return _417;
	}

	public void set_417(String _417) {
		this._417 = _417;
	}

	public Float getAreaStudentHouse() {
		return areaStudentHouse;
	}

	public void setAreaStudentHouse(Float areaStudentHouse) {
		this.areaStudentHouse = areaStudentHouse;
	}

	public Float get_419() {
		return _419;
	}

	public void set_419(Float _419) {
		this._419 = _419;
	}

	public Float get_420() {
		return _420;
	}

	public void set_420(Float _420) {
		this._420 = _420;
	}

	public Float get_735() {
		return _735;
	}

	public void set_735(Float _735) {
		this._735 = _735;
	}

	public Float get_736() {
		return _736;
	}

	public void set_736(Float _736) {
		this._736 = _736;
	}

	public Float get_781() {
		return _781;
	}

	public void set_781(Float _781) {
		this._781 = _781;
	}

	public Float get_782() {
		return _782;
	}

	public void set_782(Float _782) {
		this._782 = _782;
	}

	public Float get_783() {
		return _783;
	}

	public void set_783(Float _783) {
		this._783 = _783;
	}

	public Float get_784() {
		return _784;
	}

	public void set_784(Float _784) {
		this._784 = _784;
	}

	public Float get_787() {
		return _787;
	}

	public void set_787(Float _787) {
		this._787 = _787;
	}

	public Float get_788() {
		return _788;
	}

	public void set_788(Float _788) {
		this._788 = _788;
	}

	public Float get_049() {
		return _049;
	}

	public void set_049(Float _049) {
		this._049 = _049;
	}

	public Float get_051() {
		return _051;
	}

	public void set_051(Float _051) {
		this._051 = _051;
	}

	public Float get_052() {
		return _052;
	}

	public void set_052(Float _052) {
		this._052 = _052;
	}

	public Float get_053() {
		return _053;
	}

	public void set_053(Float _053) {
		this._053 = _053;
	}

	public Float get_054() {
		return _054;
	}

	public void set_054(Float _054) {
		this._054 = _054;
	}

	public Float get_057() {
		return _057;
	}

	public void set_057(Float _057) {
		this._057 = _057;
	}

	public Float get_058() {
		return _058;
	}

	public void set_058(Float _058) {
		this._058 = _058;
	}

	public Float get_031() {
		return _031;
	}

	public void set_031(Float _031) {
		this._031 = _031;
	}

	public Float get_032() {
		return _032;
	}

	public void set_032(Float _032) {
		this._032 = _032;
	}

	public Float get_059() {
		return _059;
	}

	public void set_059(Float _059) {
		this._059 = _059;
	}

	public Float get_060() {
		return _060;
	}

	public void set_060(Float _060) {
		this._060 = _060;
	}

	public Float get_075() {
		return _075;
	}

	public void set_075(Float _075) {
		this._075 = _075;
	}

	public Float get_076() {
		return _076;
	}

	public void set_076(Float _076) {
		this._076 = _076;
	}

	public Float get_061() {
		return _061;
	}

	public void set_061(Float _061) {
		this._061 = _061;
	}

	public Float get_062() {
		return _062;
	}

	public void set_062(Float _062) {
		this._062 = _062;
	}

	public Float get_071() {
		return _071;
	}

	public void set_071(Float _071) {
		this._071 = _071;
	}

	public Float get_063() {
		return _063;
	}

	public void set_063(Float _063) {
		this._063 = _063;
	}

	public Float get_064() {
		return _064;
	}

	public void set_064(Float _064) {
		this._064 = _064;
	}

	public Float get_069() {
		return _069;
	}

	public void set_069(Float _069) {
		this._069 = _069;
	}

	public Float get_070() {
		return _070;
	}

	public void set_070(Float _070) {
		this._070 = _070;
	}

	public String getRentalForFamilyOwnerName1() {
		return rentalForFamilyOwnerName1;
	}

	public void setRentalForFamilyOwnerName1(String rentalForFamilyOwnerName1) {
		this.rentalForFamilyOwnerName1 = rentalForFamilyOwnerName1;
	}

	public String get_801() {
		return _801;
	}

	public void set_801(String _801) {
		this._801 = _801;
	}

	public Boolean get_092() {
		return _092;
	}

	public void set_092(Boolean _092) {
		this._092 = _092;
	}

	public Float get_091() {
		return _091;
	}

	public void set_091(Float _091) {
		this._091 = _091;
	}

	public Integer get_097() {
		return _097;
	}

	public void set_097(Integer _097) {
		this._097 = _097;
	}

	public Float get_811() {
		return _811;
	}

	public void set_811(Float _811) {
		this._811 = _811;
	}

	public Float get_812() {
		return _812;
	}

	public void set_812(Float _812) {
		this._812 = _812;
	}

	public String getRentalForFamilyOwnerName2() {
		return rentalForFamilyOwnerName2;
	}

	public void setRentalForFamilyOwnerName2(String rentalForFamilyOwnerName2) {
		this.rentalForFamilyOwnerName2 = rentalForFamilyOwnerName2;
	}

	public String get_802() {
		return _802;
	}

	public void set_802(String _802) {
		this._802 = _802;
	}

	public Boolean get_094() {
		return _094;
	}

	public void set_094(Boolean _094) {
		this._094 = _094;
	}

	public Float get_093() {
		return _093;
	}

	public void set_093(Float _093) {
		this._093 = _093;
	}

	public Integer get_098() {
		return _098;
	}

	public void set_098(Integer _098) {
		this._098 = _098;
	}

	public Float get_813() {
		return _813;
	}

	public void set_813(Float _813) {
		this._813 = _813;
	}

	public Float get_814() {
		return _814;
	}

	public void set_814(Float _814) {
		this._814 = _814;
	}

	public String getRentalForFamilyOwnerName3() {
		return rentalForFamilyOwnerName3;
	}

	public void setRentalForFamilyOwnerName3(String rentalForFamilyOwnerName3) {
		this.rentalForFamilyOwnerName3 = rentalForFamilyOwnerName3;
	}

	public String get_803() {
		return _803;
	}

	public void set_803(String _803) {
		this._803 = _803;
	}

	public Boolean get_096() {
		return _096;
	}

	public void set_096(Boolean _096) {
		this._096 = _096;
	}

	public Float get_095() {
		return _095;
	}

	public void set_095(Float _095) {
		this._095 = _095;
	}

	public Float get_099() {
		return _099;
	}

	public void set_099(Float _099) {
		this._099 = _099;
	}

	public Float get_815() {
		return _815;
	}

	public void set_815(Float _815) {
		this._815 = _815;
	}

	public Float get_816() {
		return _816;
	}

	public void set_816(Float _816) {
		this._816 = _816;
	}

	public String getRentalForStudyOwnerName1() {
		return rentalForStudyOwnerName1;
	}

	public void setRentalForStudyOwnerName1(String rentalForStudyOwnerName1) {
		this.rentalForStudyOwnerName1 = rentalForStudyOwnerName1;
	}

	public String get_804() {
		return _804;
	}

	public void set_804(String _804) {
		this._804 = _804;
	}

	public Float get_817() {
		return _817;
	}

	public void set_817(Float _817) {
		this._817 = _817;
	}

	public String getRentalForStudyOwnerName2() {
		return rentalForStudyOwnerName2;
	}

	public void setRentalForStudyOwnerName2(String rentalForStudyOwnerName2) {
		this.rentalForStudyOwnerName2 = rentalForStudyOwnerName2;
	}

	public String get_805() {
		return _805;
	}

	public void set_805(String _805) {
		this._805 = _805;
	}

	public Float get_819() {
		return _819;
	}

	public void set_819(Float _819) {
		this._819 = _819;
	}

	public String getRentalForStudyOwnerName3() {
		return rentalForStudyOwnerName3;
	}

	public void setRentalForStudyOwnerName3(String rentalForStudyOwnerName3) {
		this.rentalForStudyOwnerName3 = rentalForStudyOwnerName3;
	}

	public String get_806() {
		return _806;
	}

	public void set_806(String _806) {
		this._806 = _806;
	}

	public Float get_821() {
		return _821;
	}

	public void set_821(Float _821) {
		this._821 = _821;
	}

	public String getRentalForStudyOwnerName4() {
		return rentalForStudyOwnerName4;
	}

	public void setRentalForStudyOwnerName4(String rentalForStudyOwnerName4) {
		this.rentalForStudyOwnerName4 = rentalForStudyOwnerName4;
	}

	public String get_807() {
		return _807;
	}

	public void set_807(String _807) {
		this._807 = _807;
	}

	public Float get_823() {
		return _823;
	}

	public void set_823(Float _823) {
		this._823 = _823;
	}

	public Float get_073() {
		return _073;
	}

	public void set_073(Float _073) {
		this._073 = _073;
	}

	public Float get_074() {
		return _074;
	}

	public void set_074(Float _074) {
		this._074 = _074;
	}

	public Float get_089() {
		return _089;
	}

	public void set_089(Float _089) {
		this._089 = _089;
	}

	public Float get_090() {
		return _090;
	}

	public void set_090(Float _090) {
		this._090 = _090;
	}

	public Float get_087() {
		return _087;
	}

	public void set_087(Float _087) {
		this._087 = _087;
	}

	public Float get_088() {
		return _088;
	}

	public void set_088(Float _088) {
		this._088 = _088;
	}

	public Float get_079() {
		return _079;
	}

	public void set_079(Float _079) {
		this._079 = _079;
	}

	public Float get_080() {
		return _080;
	}

	public void set_080(Float _080) {
		this._080 = _080;
	}

	public Float get_084() {
		return _084;
	}

	public void set_084(Float _084) {
		this._084 = _084;
	}

	public Float get_085() {
		return _085;
	}

	public void set_085(Float _085) {
		this._085 = _085;
	}

	public Float get_077() {
		return _077;
	}

	public void set_077(Float _077) {
		this._077 = _077;
	}

	public Float get_078() {
		return _078;
	}

	public void set_078(Float _078) {
		this._078 = _078;
	}

	public Float get_663() {
		return _663;
	}

	public void set_663(Float _663) {
		this._663 = _663;
	}

	public Float get_664() {
		return _664;
	}

	public void set_664(Float _664) {
		this._664 = _664;
	}

	public Integer get_033() {
		return _033;
	}

	public void set_033(Integer _033) {
		this._033 = _033;
	}

	public Integer get_034() {
		return _034;
	}

	public void set_034(Integer _034) {
		this._034 = _034;
	}

	public Integer get_035() {
		return _035;
	}

	public void set_035(Integer _035) {
		this._035 = _035;
	}

	public Integer get_036() {
		return _036;
	}

	public void set_036(Integer _036) {
		this._036 = _036;
	}

	public Float get_601() {
		return _601;
	}

	public void set_601(Float _601) {
		this._601 = _601;
	}

	public Float get_602() {
		return _602;
	}

	public void set_602(Float _602) {
		this._602 = _602;
	}

	public Float get_603() {
		return _603;
	}

	public void set_603(Float _603) {
		this._603 = _603;
	}

	public Float get_604() {
		return _604;
	}

	public void set_604(Float _604) {
		this._604 = _604;
	}

	public Float get_605() {
		return _605;
	}

	public void set_605(Float _605) {
		this._605 = _605;
	}

	public Float get_606() {
		return _606;
	}

	public void set_606(Float _606) {
		this._606 = _606;
	}

	public Float get_607() {
		return _607;
	}

	public void set_607(Float _607) {
		this._607 = _607;
	}

	public Float get_608() {
		return _608;
	}

	public void set_608(Float _608) {
		this._608 = _608;
	}

	public Float get_609() {
		return _609;
	}

	public void set_609(Float _609) {
		this._609 = _609;
	}

	public Float get_610() {
		return _610;
	}

	public void set_610(Float _610) {
		this._610 = _610;
	}

	public Float get_651() {
		return _651;
	}

	public void set_651(Float _651) {
		this._651 = _651;
	}

	public Float get_652() {
		return _652;
	}

	public void set_652(Float _652) {
		this._652 = _652;
	}

	public Float get_293() {
		return _293;
	}

	public void set_293(Float _293) {
		this._293 = _293;
	}

	public Float get_294() {
		return _294;
	}

	public void set_294(Float _294) {
		this._294 = _294;
	}

	public Float get_313() {
		return _313;
	}

	public void set_313(Float _313) {
		this._313 = _313;
	}

	public Float get_314() {
		return _314;
	}

	public void set_314(Float _314) {
		this._314 = _314;
	}

	public Float get_315() {
		return _315;
	}

	public void set_315(Float _315) {
		this._315 = _315;
	}

	public Float get_316() {
		return _316;
	}

	public void set_316(Float _316) {
		this._316 = _316;
	}

	public Float get_297() {
		return _297;
	}

	public void set_297(Float _297) {
		this._297 = _297;
	}

	public Float get_298() {
		return _298;
	}

	public void set_298(Float _298) {
		this._298 = _298;
	}

	public Float get_127() {
		return _127;
	}

	public void set_127(Float _127) {
		this._127 = _127;
	}

	public String get_128() {
		return _128;
	}

	public void set_128(String _128) {
		this._128 = _128;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public Integer getBirthYear1() {
		return birthYear1;
	}

	public void setBirthYear1(Integer birthYear1) {
		this.birthYear1 = birthYear1;
	}

	public String getSchoolName1() {
		return schoolName1;
	}

	public void setSchoolName1(String schoolName1) {
		this.schoolName1 = schoolName1;
	}

	public String get_831() {
		return _831;
	}

	public void set_831(String _831) {
		this._831 = _831;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public Integer getBirthYear2() {
		return birthYear2;
	}

	public void setBirthYear2(Integer birthYear2) {
		this.birthYear2 = birthYear2;
	}

	public String getSchoolName2() {
		return schoolName2;
	}

	public void setSchoolName2(String schoolName2) {
		this.schoolName2 = schoolName2;
	}

	public String get_832() {
		return _832;
	}

	public void set_832(String _832) {
		this._832 = _832;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public Integer getBirthYear3() {
		return birthYear3;
	}

	public void setBirthYear3(Integer birthYear3) {
		this.birthYear3 = birthYear3;
	}

	public String getSchoolName3() {
		return schoolName3;
	}

	public void setSchoolName3(String schoolName3) {
		this.schoolName3 = schoolName3;
	}

	public String get_833() {
		return _833;
	}

	public void set_833(String _833) {
		this._833 = _833;
	}

	public String getName4() {
		return name4;
	}

	public void setName4(String name4) {
		this.name4 = name4;
	}

	public Integer getBirthYear4() {
		return birthYear4;
	}

	public void setBirthYear4(Integer birthYear4) {
		this.birthYear4 = birthYear4;
	}

	public String getSchoolName4() {
		return schoolName4;
	}

	public void setSchoolName4(String schoolName4) {
		this.schoolName4 = schoolName4;
	}

	public String get_834() {
		return _834;
	}

	public void set_834(String _834) {
		this._834 = _834;
	}

	public String getFullName1() {
		return fullName1;
	}

	public void setFullName1(String fullName1) {
		this.fullName1 = fullName1;
	}

	public String get_835() {
		return _835;
	}

	public void set_835(String _835) {
		this._835 = _835;
	}

	public String getRelationshipWithPrincipal1() {
		return relationshipWithPrincipal1;
	}

	public void setRelationshipWithPrincipal1(String relationshipWithPrincipal1) {
		this.relationshipWithPrincipal1 = relationshipWithPrincipal1;
	}

	public String getRelationShipWithWife1() {
		return relationShipWithWife1;
	}

	public void setRelationShipWithWife1(String relationShipWithWife1) {
		this.relationShipWithWife1 = relationShipWithWife1;
	}

	public String getFullName2() {
		return fullName2;
	}

	public void setFullName2(String fullName2) {
		this.fullName2 = fullName2;
	}

	public String get_836() {
		return _836;
	}

	public void set_836(String _836) {
		this._836 = _836;
	}

	public String getRelationshipWithPrincipal2() {
		return relationshipWithPrincipal2;
	}

	public void setRelationshipWithPrincipal2(String relationshipWithPrincipal2) {
		this.relationshipWithPrincipal2 = relationshipWithPrincipal2;
	}

	public String getRelationShipWithWife2() {
		return relationShipWithWife2;
	}

	public void setRelationShipWithWife2(String relationShipWithWife2) {
		this.relationShipWithWife2 = relationShipWithWife2;
	}

	public String getFullName3() {
		return fullName3;
	}

	public void setFullName3(String fullName3) {
		this.fullName3 = fullName3;
	}

	public String get_837() {
		return _837;
	}

	public void set_837(String _837) {
		this._837 = _837;
	}

	public String getRelationshipWithPrincipal3() {
		return relationshipWithPrincipal3;
	}

	public void setRelationshipWithPrincipal3(String relationshipWithPrincipal3) {
		this.relationshipWithPrincipal3 = relationshipWithPrincipal3;
	}

	public String getRelationShipWithWife3() {
		return relationShipWithWife3;
	}

	public void setRelationShipWithWife3(String relationShipWithWife3) {
		this.relationShipWithWife3 = relationShipWithWife3;
	}

	public String getFullName4() {
		return fullName4;
	}

	public void setFullName4(String fullName4) {
		this.fullName4 = fullName4;
	}

	public String get_838() {
		return _838;
	}

	public void set_838(String _838) {
		this._838 = _838;
	}

	public String getRelationshipWithPrincipal4() {
		return relationshipWithPrincipal4;
	}

	public void setRelationshipWithPrincipal4(String relationshipWithPrincipal4) {
		this.relationshipWithPrincipal4 = relationshipWithPrincipal4;
	}

	public String getRelationShipWithWife4() {
		return relationShipWithWife4;
	}

	public void setRelationShipWithWife4(String relationShipWithWife4) {
		this.relationShipWithWife4 = relationShipWithWife4;
	}

	public Float get_901() {
		return _901;
	}

	public void set_901(Float _901) {
		this._901 = _901;
	}

	public Float get_902() {
		return _902;
	}

	public void set_902(Float _902) {
		this._902 = _902;
	}

	public Float get_903() {
		return _903;
	}

	public void set_903(Float _903) {
		this._903 = _903;
	}

	public Float get_904() {
		return _904;
	}

	public void set_904(Float _904) {
		this._904 = _904;
	}

	public Float get_341() {
		return _341;
	}

	public void set_341(Float _341) {
		this._341 = _341;
	}

	public Float get_342() {
		return _342;
	}

	public void set_342(Float _342) {
		this._342 = _342;
	}

	public Float get_745() {
		return _745;
	}

	public void set_745(Float _745) {
		this._745 = _745;
	}

	public Float get_746() {
		return _746;
	}

	public void set_746(Float _746) {
		this._746 = _746;
	}

	public Float get_995() {
		return _995;
	}

	public void set_995(Float _995) {
		this._995 = _995;
	}

	public Float get_996() {
		return _996;
	}

	public void set_996(Float _996) {
		this._996 = _996;
	}

	public Float get_997() {
		return _997;
	}

	public void set_997(Float _997) {
		this._997 = _997;
	}

	public Float get_998() {
		return _998;
	}

	public void set_998(Float _998) {
		this._998 = _998;
	}

	public Float get_959() {
		return _959;
	}

	public void set_959(Float _959) {
		this._959 = _959;
	}

	public Float get_960() {
		return _960;
	}

	public void set_960(Float _960) {
		this._960 = _960;
	}

	public Float get_743() {
		return _743;
	}

	public void set_743(Float _743) {
		this._743 = _743;
	}

	public Float get_744() {
		return _744;
	}

	public void set_744(Float _744) {
		this._744 = _744;
	}

	public Float get_323() {
		return _323;
	}

	public void set_323(Float _323) {
		this._323 = _323;
	}

	public Float get_324() {
		return _324;
	}

	public void set_324(Float _324) {
		this._324 = _324;
	}

	public Float get_399() {
		return _399;
	}

	public void set_399(Float _399) {
		this._399 = _399;
	}

	public Float get_400() {
		return _400;
	}

	public void set_400(Float _400) {
		this._400 = _400;
	}

	public Float get_907() {
		return _907;
	}

	public void set_907(Float _907) {
		this._907 = _907;
	}

	public Float get_908() {
		return _908;
	}

	public void set_908(Float _908) {
		this._908 = _908;
	}

	public Float get_985() {
		return _985;
	}

	public void set_985(Float _985) {
		this._985 = _985;
	}

	public Float get_986() {
		return _986;
	}

	public void set_986(Float _986) {
		this._986 = _986;
	}

	public Float get_987() {
		return _987;
	}

	public void set_987(Float _987) {
		this._987 = _987;
	}

	public Float get_988() {
		return _988;
	}

	public void set_988(Float _988) {
		this._988 = _988;
	}

	public Float get_989() {
		return _989;
	}

	public void set_989(Float _989) {
		this._989 = _989;
	}

	public Float get_990() {
		return _990;
	}

	public void set_990(Float _990) {
		this._990 = _990;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public E1Bean() {

	}

	@PostConstruct
	public void init() throws IOException {

		// this.error = "Welcome: " + login.getLoggedInUsername();

		Taxpayer taxpayer = null;
		ClientConfig conf = new DefaultClientConfig();
		try {

			Client client = Client.create(conf);
			WebResource restSrv = client.resource(new URI(
					"http://localhost:8098/TaxisNet/rest/"));
			taxpayer = (Taxpayer) restSrv
					.path("UserService/getTaxPayerByUserName/")
					.path(login.getLoggedInUsername())
					.accept(MediaType.APPLICATION_JSON).get(Taxpayer.class);

			// this.rentierAFM = taxpayer.getAfm();
			// this.setRentierFatherName(taxpayer.getFatherName());
			// this.setRentierFullName(taxpayer.getFname() + " "
			// + taxpayer.getLname());

			this.setTaxPayerId(taxpayer.getId());
		} catch (Exception ex) {
			this.error = "Exeption: " + ex.toString() + "<br /> Stack Trace "
					+ ex.getStackTrace() + "<br /> Caouse " + ex.getCause();

		}
	}

	public String submitE1() {
		// TODO: if is valid...
		E1Id key = new E1Id(getTaxPayerId(), Calendar.getInstance().get(
				Calendar.YEAR));

		// TODO: How to save Many to Many ?
		// Table 1
		E1relatePersons e1Wife = new E1relatePersons();
		E1relatePersons e1Delegate = new E1relatePersons();
		
		Set<E1relatePersons> rlPersonsList = new HashSet<E1relatePersons>();

		Contact wifeContact = new Contact(this.getWifePhone(),
				this.getWifeCell(), "");
		Contact delegateContact = new Contact(this.getDelegatePhone(), "", "");

		RelatePerson wife = new RelatePerson();
		wife.setAddress(getWifeAddress());
		wife.setAfm(getWifeAFM());
		wife.setAtid(getWifeAT());
		wife.setContact(wifeContact);
		// wife.setE1relatePersonses(e1relatePersonses)
		wife.setFatherName(getWifeFaName());
		wife.setFname(getWifeFName());
		wife.setLname(getWifeLName());
		// wife.setIdRelatePerson(idRelatePerson)
		wife.setType(1);

		RelatePerson delegate = new RelatePerson();
		delegate.setAddress(getDelegateAddress());
		delegate.setAfm(getDelegateAFM());
		delegate.setFatherName(getDelegateFaName());
		delegate.setFname(getDelegateFName());
		delegate.setLname(getDelegateLName());
		delegate.setType(2);

		rlPersonsList.add(e1Wife);
		rlPersonsList.add(e1Delegate);
		// Table 2
		E1infoData infoDataObj = new E1infoData(BooleanToInt(get_327()),
				BooleanToInt(get_328()), BooleanToInt(get_319()),
				BooleanToInt(get_320()), BooleanToInt(get_023()),
				BooleanToInt(get_024()), BooleanToInt(get_329()),
				BooleanToInt(get_330()), BooleanToInt(get_331()),
				BooleanToInt(get_011()), BooleanToInt(get_012()),
				BooleanToInt(get_013()), BooleanToInt(get_014()),
				BooleanToInt(get_015()), BooleanToInt(get_016()),
				BooleanToInt(get_017()), BooleanToInt(get_018()),
				BooleanToInt(get_021()), BooleanToInt(get_022()),
				BooleanToInt(get_025()), BooleanToInt(get_026()),
				BooleanToInt(get_007()), BooleanToInt(get_008()),
				BooleanToInt(get_617()), BooleanToInt(get_385()),
				BooleanToInt(get_386()), BooleanToInt(get_029()),
				BooleanToInt(get_030()), BooleanToInt(get_905()),
				BooleanToInt(get_906()), BooleanToInt(get_911()),
				BooleanToInt(get_912()), BooleanToInt(get_010()), null);
		// table 3
		E1reduceTax reduceTaxObj = new E1reduceTax(BooleanToInt(get_001()),
				BooleanToInt(get_002()), _003, _004, _005, _006, null);
		// table 4
		E1taxableIncomes taxableIncomeObj = new E1taxableIncomes(_301, _302,
				_303, _304, _321, _322, _317, _318, _461, _462, _921, _922,
				_919, _920, _915, _916, _923, _924, _335, _336, _326, _337,
				_338, _339, _340, _465, _466, _467, _468, _475, _476, _479,
				_480, _481, _482, _401, _402, _403, _404, _405, _406, _407,
				_408, _413, _414, _415, _416, _425, _426, _501, _502, _503,
				_504, _505, _506, _507, _508, _511, _512, _515, _516, _517,
				_518, _103, _104, _121, _122, _105, _106, _107, _108, _109,
				_110, _101, _102, _909, _910, _111, _112, _113, _114, _129,
				_130, _143, _144, _145, _146, _147, _148, _141, _142, _701,
				_702, _123, _124, _125, _126, _151, _152, _163, _164, _165,
				_166, _159, _160, _175, _176, _131, _132, _133, _134, _741,
				_742, _291, _292, _389, _390, _391, _392, _463, _464, _471,
				_472, _411, _412, _421, _422, _509, _510, _513, _514, _295,
				_296, _171, _172, _173, _174, _395, _396, null, null);
		// TODO: Is Set<E1incomeFromAgricularCompanyData> 0 to 4 of --> new
		// Set<E1incomeFromAgricularCompanyData>
		E1incomeFromAgricularCompanyData incomeFromAgricularCompanyDataObj = new E1incomeFromAgricularCompanyData(
				null, location, prodKind, population, locationType, hasWater,
				netIncome);
		// table 5
		E1objectiveSpending objectiveSpendingObj = new E1objectiveSpending(
				_205, houseAddr1, BooleanToInt(_203), BooleanToInt(_240), _211,
				_212, _213, _214, _215, _216, houseAddr2, BooleanToInt(_207),
				BooleanToInt(_241), _218, _219, _220, _221, _222, _223,
				houseAddr3, BooleanToInt(_209), BooleanToInt(_242), _225, _226,
				_227, _228, _229, _230, _707, _708, afm1, _750, _703, _761,
				_771, _775, afm2, _751, _704, _762, _772, _776, afm3, _752,
				_705, _763, _773, _777, afm4, _753, _706, _764, _774, _778,
				_851, _852, _853, _854, _855, _856, _857, _858, shippingName1,
				shippingRegister1, shippingCountry1, sailShip1,
				accommodationSpace1, percentPrincipalCoOwner1,
				percentWifeCoOwner1, firstRegister1, ownershipMonths1, _747,
				shippingName2, shippingRegister2, shippingCountry2, sailShip2,
				accommodationSpace2, percentPrincipalCoOwner2,
				percentWifeCoOwner2, firstRegister2, ownershipMonths2, _748,
				_711, _712, _713, _714, _731, _732, aircraftRegisterData,
				aircraftType, aircraftSn, airportBase, aircraftOwnerShip,
				aircraftPowerLibres, aircraftFirstRegister, _715, _716, _767,
				poolPrincipalCoOwnerOutdoor, poolWifeCoOwnerOutdoor, _768,
				poolPrincipalCoOwnerIndoor, poolWifeCoOwnerIndoor, _765, _766,
				_769, _770, _719, _720, _721, _722, _723, _724, _725, _726,
				_727, _728, null);
		// table 6
		E1incomesReduceTaxes incomesReduceTaxesObj = new E1incomesReduceTaxes(
				_655, _656, _693, _694, _659, _660, _657, _658, _661, _662,
				_431, _432, _433, _434, _305, _306, _477, _478, lessorName1,
				_790, _795, lassorName2, _791, _796, _793, _794, _615, _616,
				lassorNameForStudent, _417, areaStudentHouse, _419, _420, _735,
				_736, _781, _782, _783, _784, _787, _788, null);
		// table 7
		E1expensesRemovedFromTotalIncome expensesRemovedFromTotalIncomeObj = new E1expensesRemovedFromTotalIncome(
				_049, _051, _052, _053, _054, _057, _058, _031, _032, _059,
				_060, _075, _076, _061, _062, _071, _063, _064, _069, _070,
				rentalForFamilyOwnerName1, _801, BooleanToInt(_092), _091,
				_097, _811, _812, rentalForFamilyOwnerName2, _802,
				BooleanToInt(_094), _093, _098, _813, _814,
				rentalForFamilyOwnerName3, _803, BooleanToInt(_096), _095,
				_099, _815, _816, rentalForStudyOwnerName1, _804, _817,
				rentalForStudyOwnerName2, _805, _819, rentalForStudyOwnerName3,
				_806, _821, rentalForStudyOwnerName4, _807, _823, _073, _074,
				_089, _090, _087, _088, _079, _080, _084, _085, _077, _078,
				_663, _664, _033, _034, _035, _036, null);

		// table 8
		E1prepaidTaxes prepaidTaxesObj = new E1prepaidTaxes(_601, _602, _603,
				_604, _605, _606, _607, _608, _609, _610, _651, _652, _293,
				_294, _313, _314, _315, _316, _297, _298, _127, _128, null);
		// table 9
		E1personDataBorneTaxpayer personDataBorneTaxpayerObj = new E1personDataBorneTaxpayer(
				lessorName1, birthYear1, schoolName1, _831, lassorName2,
				birthYear2, schoolName2, _832, name3, birthYear3, schoolName3,
				_833, name4, birthYear4, schoolName4, _834, fullName1, _835,
				relationshipWithPrincipal1, relationShipWithWife1, fullName2,
				_836, relationshipWithPrincipal2, relationShipWithWife2,
				fullName3, _837, relationshipWithPrincipal3,
				relationShipWithWife3, fullName4, _838,
				relationshipWithPrincipal4, relationShipWithWife4, null);
		// table 10
		E1dataFromTaxPayerFolder dataFromTaxPayerFolderObj = new E1dataFromTaxPayerFolder(
				_901, _902, _903, _904, _341, _342, _745, _746, _995, _996,
				_997, _998, _959, _960, _743, _744, _323, _324, _399, _400,
				_907, _908, _985, _986, _987, _988, _989, _990, null);

		// table 11
		E1taxPayerBankAccount taxPayerBankAccountObj = new E1taxPayerBankAccount(
				bic, iban, null);

		E1 e1 = new E1();
		e1.setId(key);
		e1.setIsComplete(0);
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
		e1.setE1relatePersonses(rlPersonsList);
		e1.setE1taxableIncomes(taxableIncomeObj);
		e1.setE1taxPayerBankAccount(taxPayerBankAccountObj);

		return "";
	}

	private int BooleanToInt(Boolean value) {
		return value ? 1 : 0;
	}
}
