package helpers.classes.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class LogonSession {

	@SerializedName("LogonTime")
	@Expose
	private String logonTime;
	@SerializedName("PlayerId")
	@Expose
	private Integer playerId;
	@SerializedName("SessionToken")
	@Expose
	private String sessionToken;

	/**
	 * No args constructor for use in serialization
	 */
	public LogonSession() {
	}

	/**
	 * @param logonTime
	 * @param sessionToken
	 * @param playerId
	 */
	public LogonSession(String logonTime, Integer playerId, String sessionToken) {
		super();
		this.logonTime = logonTime;
		this.playerId = playerId;
		this.sessionToken = sessionToken;
	}

	public String getLogonTime() {
		return logonTime;
	}

	public void setLogonTime(String logonTime) {
		this.logonTime = logonTime;
	}

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("logonTime", logonTime).append("playerId", playerId).append("sessionToken", sessionToken).toString();
	}

}
