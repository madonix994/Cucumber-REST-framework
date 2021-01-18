package helpers.classes.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

public class Player {

	@SerializedName("Locale")
	@Expose
	private String locale;
	@SerializedName("HouseNumber")
	@Expose
	private Integer houseNumber;
	@SerializedName("InstantMessenger")
	@Expose
	private Integer instantMessenger;
	@SerializedName("SignupIp")
	@Expose
	private String signupIp;
	@SerializedName("PostalCode")
	@Expose
	private Integer postalCode;
	@SerializedName("Gender")
	@Expose
	private String gender;
	@SerializedName("PortalId")
	@Expose
	private Integer portalId;
	@SerializedName("CurrencyId")
	@Expose
	private Integer currencyId;
	@SerializedName("MobilePhone")
	@Expose
	private String mobilePhone;
	@SerializedName("GeoLocCountryCode")
	@Expose
	private String geoLocCountryCode;
	@SerializedName("Street")
	@Expose
	private String street;
	@SerializedName("HearAboutUs")
	@Expose
	private String hearAboutUs;
	@SerializedName("CustomParameters")
	@Expose
	private List<CustomParameter> customParameters = null;
	@SerializedName("Password")
	@Expose
	private String password;
	@SerializedName("DateOfBirth")
	@Expose
	private String dateOfBirth;
	@SerializedName("CountryId")
	@Expose
	private Integer countryId;
	@SerializedName("InstantMessengerType")
	@Expose
	private Integer instantMessengerType;
	@SerializedName("SecretAnswer")
	@Expose
	private String secretAnswer;
	@SerializedName("UserName")
	@Expose
	private String userName;
	@SerializedName("FirstName")
	@Expose
	private String firstName;
	@SerializedName("StateProvince")
	@Expose
	private String stateProvince;
	@SerializedName("Title")
	@Expose
	private String title;
	@SerializedName("City")
	@Expose
	private String city;
	@SerializedName("EMail")
	@Expose
	private String eMail;
	@SerializedName("MiddleName")
	@Expose
	private String middleName;
	@SerializedName("DocumentNumber")
	@Expose
	private String documentNumber;
	@SerializedName("ProductTypeId")
	@Expose
	private Integer productTypeId;
	@SerializedName("ReceiveNews")
	@Expose
	private String receiveNews;
	@SerializedName("CouponCode")
	@Expose
	private String couponCode;
	@SerializedName("SecretQuestionId")
	@Expose
	private Integer secretQuestionId;
	@SerializedName("PhoneNumber")
	@Expose
	private String phoneNumber;
	@SerializedName("LastName")
	@Expose
	private String lastName;
	@SerializedName("MobileClient")
	@Expose
	private Boolean mobileClient;

	/**
	 * No args constructor for use in serialization
	 */
	public Player() {
	}

	/**
	 * @param lastName
	 * @param signupIp
	 * @param gender
	 * @param instantMessengerType
	 * @param city
	 * @param documentNumber
	 * @param postalCode
	 * @param houseNumber
	 * @param mobileClient
	 * @param receiveNews
	 * @param locale
	 * @param title
	 * @param countryId
	 * @param secretAnswer
	 * @param eMail
	 * @param secretQuestionId
	 * @param password
	 * @param street
	 * @param portalId
	 * @param currencyId
	 * @param instantMessenger
	 * @param hearAboutUs
	 * @param stateProvince
	 * @param dateOfBirth
	 * @param userName
	 * @param productTypeId
	 * @param firstName
	 * @param phoneNumber
	 * @param mobilePhone
	 * @param geoLocCountryCode
	 * @param customParameters
	 * @param middleName
	 * @param couponCode
	 */
	public Player(String locale, Integer houseNumber, Integer instantMessenger, String signupIp, Integer postalCode, String gender, Integer portalId, Integer currencyId, String mobilePhone, String geoLocCountryCode, String street, String hearAboutUs, List<CustomParameter> customParameters, String password, String dateOfBirth, Integer countryId, Integer instantMessengerType, String secretAnswer, String userName, String firstName, String stateProvince, String title, String city, String eMail, String middleName, String documentNumber, Integer productTypeId, String receiveNews, String couponCode, Integer secretQuestionId, String phoneNumber, String lastName, Boolean mobileClient) {
		super();
		this.locale = locale;
		this.houseNumber = houseNumber;
		this.instantMessenger = instantMessenger;
		this.signupIp = signupIp;
		this.postalCode = postalCode;
		this.gender = gender;
		this.portalId = portalId;
		this.currencyId = currencyId;
		this.mobilePhone = mobilePhone;
		this.geoLocCountryCode = geoLocCountryCode;
		this.street = street;
		this.hearAboutUs = hearAboutUs;
		this.customParameters = customParameters;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.countryId = countryId;
		this.instantMessengerType = instantMessengerType;
		this.secretAnswer = secretAnswer;
		this.userName = userName;
		this.firstName = firstName;
		this.stateProvince = stateProvince;
		this.title = title;
		this.city = city;
		this.eMail = eMail;
		this.middleName = middleName;
		this.documentNumber = documentNumber;
		this.productTypeId = productTypeId;
		this.receiveNews = receiveNews;
		this.couponCode = couponCode;
		this.secretQuestionId = secretQuestionId;
		this.phoneNumber = phoneNumber;
		this.lastName = lastName;
		this.mobileClient = mobileClient;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Integer getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}

	public Integer getInstantMessenger() {
		return instantMessenger;
	}

	public void setInstantMessenger(Integer instantMessenger) {
		this.instantMessenger = instantMessenger;
	}

	public String getSignupIp() {
		return signupIp;
	}

	public void setSignupIp(String signupIp) {
		this.signupIp = signupIp;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getPortalId() {
		return portalId;
	}

	public void setPortalId(Integer portalId) {
		this.portalId = portalId;
	}

	public Integer getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getGeoLocCountryCode() {
		return geoLocCountryCode;
	}

	public void setGeoLocCountryCode(String geoLocCountryCode) {
		this.geoLocCountryCode = geoLocCountryCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHearAboutUs() {
		return hearAboutUs;
	}

	public void setHearAboutUs(String hearAboutUs) {
		this.hearAboutUs = hearAboutUs;
	}

	public List<CustomParameter> getCustomParameters() {
		return customParameters;
	}

	public void setCustomParameters(List<CustomParameter> customParameters) {
		this.customParameters = customParameters;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Integer getInstantMessengerType() {
		return instantMessengerType;
	}

	public void setInstantMessengerType(Integer instantMessengerType) {
		this.instantMessengerType = instantMessengerType;
	}

	public String getSecretAnswer() {
		return secretAnswer;
	}

	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEMail() {
		return eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Integer getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}

	public String getReceiveNews() {
		return receiveNews;
	}

	public void setReceiveNews(String receiveNews) {
		this.receiveNews = receiveNews;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public Integer getSecretQuestionId() {
		return secretQuestionId;
	}

	public void setSecretQuestionId(Integer secretQuestionId) {
		this.secretQuestionId = secretQuestionId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getMobileClient() {
		return mobileClient;
	}

	public void setMobileClient(Boolean mobileClient) {
		this.mobileClient = mobileClient;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("locale", locale).append("houseNumber", houseNumber).append("instantMessenger", instantMessenger).append("signupIp", signupIp).append("postalCode", postalCode).append("gender", gender).append("portalId", portalId).append("currencyId", currencyId).append("mobilePhone", mobilePhone).append("geoLocCountryCode", geoLocCountryCode).append("street", street).append("hearAboutUs", hearAboutUs).append("customParameters", customParameters).append("password", password).append("dateOfBirth", dateOfBirth).append("countryId", countryId).append("instantMessengerType", instantMessengerType).append("secretAnswer", secretAnswer).append("userName", userName).append("firstName", firstName).append("stateProvince", stateProvince).append("title", title).append("city", city).append("eMail", eMail).append("middleName", middleName).append("documentNumber", documentNumber).append("productTypeId", productTypeId).append("receiveNews", receiveNews).append("couponCode", couponCode).append("secretQuestionId", secretQuestionId).append("phoneNumber", phoneNumber).append("lastName", lastName).append("mobileClient", mobileClient).toString();
	}

}
