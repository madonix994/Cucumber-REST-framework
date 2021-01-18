package helpers.classes.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class PlayerLoginRQ {

	@SerializedName("password")
	@Expose
	private String password;
	@SerializedName("GeoLocCountryCode")
	@Expose
	private String geoLocCountryCode = "en";
	@SerializedName("deviceFingerprint")
	@Expose
	private String deviceFingerprint = "iovation device fingerprint";
	@SerializedName("portalId")
	@Expose
	private Integer portalId = 1;
	@SerializedName("LoginType")
	@Expose
	private String loginType = "Username";
	@SerializedName("userName")
	@Expose
	private String userName;
	@SerializedName("MobileClient")
	@Expose
	private String mobileClient = "false";
	@SerializedName("clientIPAddress")
	@Expose
	private String clientIPAddress = "193.169.48.48";

	/**
	 * No args constructor for use in serialization
	 */
	public PlayerLoginRQ() {
	}

	/**
	 * @param userName
	 * @param password
	 */
	public PlayerLoginRQ(String userName, String password) {
		super();
		this.password = password;
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGeoLocCountryCode() {
		return geoLocCountryCode;
	}

	public void setGeoLocCountryCode(String geoLocCountryCode) {
		this.geoLocCountryCode = geoLocCountryCode;
	}

	public String getDeviceFingerprint() {
		return deviceFingerprint;
	}

	public void setDeviceFingerprint(String deviceFingerprint) {
		this.deviceFingerprint = deviceFingerprint;
	}

	public Integer getPortalId() {
		return portalId;
	}

	public void setPortalId(Integer portalId) {
		this.portalId = portalId;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileClient() {
		return mobileClient;
	}

	public void setMobileClient(String mobileClient) {
		this.mobileClient = mobileClient;
	}

	public String getClientIPAddress() {
		return clientIPAddress;
	}

	public void setClientIPAddress(String clientIPAddress) {
		this.clientIPAddress = clientIPAddress;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("password", password).append("geoLocCountryCode", geoLocCountryCode).append("deviceFingerprint", deviceFingerprint).append("portalId", portalId).append("loginType", loginType).append("userName", userName).append("mobileClient", mobileClient).append("clientIPAddress", clientIPAddress).toString();
	}

}