package helpers.classes;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.List;

public class Player {

	private String Locale;
	private Integer HouseNumber;
	private Integer InstantMessenger;
	private String SignupIp;
	private Integer PostalCode;
	private String Gender;
	private Integer PortalId;
	private Integer CurrencyId;
	private String MobilePhone;
	private String GeoLocCountryCode;
	private String Street;
	private String HearAboutUs;
	private List<CustomParameter> CustomParameters = null;
	private String Password;
	private String DateOfBirth;
	private Integer CountryId;
	private Integer InstantMessengerType;
	private String SecretAnswer;
	private String UserName;
	private String FirstName;
	private String StateProvince;
	private String Title;
	private String City;
	private String EMail;
	private String MiddleName;
	private String DocumentNumber;
	private Integer ProductTypeId;
	private String ReceiveNews;
	private String CouponCode;
	private Integer SecretQuestionId;
	private String PhoneNumber;
	private String LastName;
	private Boolean MobileClient;

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
		this.Locale = locale;
		this.HouseNumber = houseNumber;
		this.InstantMessenger = instantMessenger;
		this.SignupIp = signupIp;
		this.PostalCode = postalCode;
		this.Gender = gender;
		this.PortalId = portalId;
		this.CurrencyId = currencyId;
		this.MobilePhone = mobilePhone;
		this.GeoLocCountryCode = geoLocCountryCode;
		this.Street = street;
		this.HearAboutUs = hearAboutUs;
		this.CustomParameters = customParameters;
		this.Password = password;
		this.DateOfBirth = dateOfBirth;
		this.CountryId = countryId;
		this.InstantMessengerType = instantMessengerType;
		this.SecretAnswer = secretAnswer;
		this.UserName = userName;
		this.FirstName = firstName;
		this.StateProvince = stateProvince;
		this.Title = title;
		this.City = city;
		this.EMail = eMail;
		this.MiddleName = middleName;
		this.DocumentNumber = documentNumber;
		this.ProductTypeId = productTypeId;
		this.ReceiveNews = receiveNews;
		this.CouponCode = couponCode;
		this.SecretQuestionId = secretQuestionId;
		this.PhoneNumber = phoneNumber;
		this.LastName = lastName;
		this.MobileClient = mobileClient;
	}

	public String getLocale() {
		return Locale;
	}

	public void setLocale(String locale) {
		this.Locale = locale;
	}

	public Integer getHouseNumber() {
		return HouseNumber;
	}

	public void setHouseNumber(Integer houseNumber) {
		this.HouseNumber = houseNumber;
	}

	public Integer getInstantMessenger() {
		return InstantMessenger;
	}

	public void setInstantMessenger(Integer instantMessenger) {
		this.InstantMessenger = instantMessenger;
	}

	public String getSignupIp() {
		return SignupIp;
	}

	public void setSignupIp(String signupIp) {
		this.SignupIp = signupIp;
	}

	public Integer getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.PostalCode = postalCode;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		this.Gender = gender;
	}

	public Integer getPortalId() {
		return PortalId;
	}

	public void setPortalId(Integer portalId) {
		this.PortalId = portalId;
	}

	public Integer getCurrencyId() {
		return CurrencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.CurrencyId = currencyId;
	}

	public String getMobilePhone() {
		return MobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.MobilePhone = mobilePhone;
	}

	public String getGeoLocCountryCode() {
		return GeoLocCountryCode;
	}

	public void setGeoLocCountryCode(String geoLocCountryCode) {
		this.GeoLocCountryCode = geoLocCountryCode;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		this.Street = street;
	}

	public String getHearAboutUs() {
		return HearAboutUs;
	}

	public void setHearAboutUs(String hearAboutUs) {
		this.HearAboutUs = hearAboutUs;
	}

	public List<CustomParameter> getCustomParameters() {
		return CustomParameters;
	}

	public void setCustomParameters(List<CustomParameter> customParameters) {
		this.CustomParameters = customParameters;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.DateOfBirth = dateOfBirth;
	}

	public Integer getCountryId() {
		return CountryId;
	}

	public void setCountryId(Integer countryId) {
		this.CountryId = countryId;
	}

	public Integer getInstantMessengerType() {
		return InstantMessengerType;
	}

	public void setInstantMessengerType(Integer instantMessengerType) {
		this.InstantMessengerType = instantMessengerType;
	}

	public String getSecretAnswer() {
		return SecretAnswer;
	}

	public void setSecretAnswer(String secretAnswer) {
		this.SecretAnswer = secretAnswer;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getStateProvince() {
		return StateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.StateProvince = stateProvince;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

	public String getEMail() {
		return EMail;
	}

	public void setEMail(String eMail) {
		this.EMail = eMail;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		this.MiddleName = middleName;
	}

	public String getDocumentNumber() {
		return DocumentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.DocumentNumber = documentNumber;
	}

	public Integer getProductTypeId() {
		return ProductTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.ProductTypeId = productTypeId;
	}

	public String getReceiveNews() {
		return ReceiveNews;
	}

	public void setReceiveNews(String receiveNews) {
		this.ReceiveNews = receiveNews;
	}

	public String getCouponCode() {
		return CouponCode;
	}

	public void setCouponCode(String couponCode) {
		this.CouponCode = couponCode;
	}

	public Integer getSecretQuestionId() {
		return SecretQuestionId;
	}

	public void setSecretQuestionId(Integer secretQuestionId) {
		this.SecretQuestionId = secretQuestionId;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public Boolean getMobileClient() {
		return MobileClient;
	}

	public void setMobileClient(Boolean mobileClient) {
		this.MobileClient = mobileClient;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
				.append("Locale", Locale)
				.append("HouseNumber", HouseNumber)
				.append("InstantMessenger", InstantMessenger)
				.append("SignupIp", SignupIp)
				.append("PostalCode", PostalCode)
				.append("Gender", Gender)
				.append("PortalId", PortalId)
				.append("CurrencyId", CurrencyId)
				.append("MobilePhone", MobilePhone)
				.append("GeoLocCountryCode", GeoLocCountryCode)
				.append("Street", Street)
				.append("HearAboutUs", HearAboutUs)
				.append("CustomParameters", CustomParameters)
				.append("Password", Password)
				.append("DateOfBirth", DateOfBirth)
				.append("CountryId", CountryId)
				.append("InstantMessengerType", InstantMessengerType)
				.append("SecretAnswer", SecretAnswer)
				.append("UserName", UserName)
				.append("FirstName", FirstName)
				.append("StateProvince", StateProvince)
				.append("Title", Title)
				.append("City", City)
				.append("EMail", EMail)
				.append("MiddleName", MiddleName)
				.append("DocumentNumber", DocumentNumber)
				.append("ProductTypeId", ProductTypeId)
				.append("ReceiveNews", ReceiveNews)
				.append("CouponCode", CouponCode)
				.append("SecretQuestionId", SecretQuestionId)
				.append("PhoneNumber", PhoneNumber)
				.append("LastName", LastName)
				.append("MobileClient", MobileClient)
				.toString();
	}

}
