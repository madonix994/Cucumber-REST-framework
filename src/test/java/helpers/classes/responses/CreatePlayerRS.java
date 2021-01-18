package helpers.classes.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CreatePlayerRS {

	@SerializedName("ErrorMessage")
	@Expose
	private Object errorMessage;
	@SerializedName("StatusCode")
	@Expose
	private String statusCode;
	@SerializedName("IsPlayerActivated")
	@Expose
	private Boolean isPlayerActivated;
	@SerializedName("PlayerId")
	@Expose
	private Integer playerId;

	/**
	 * No args constructor for use in serialization
	 */
	public CreatePlayerRS() {
	}

	/**
	 * @param isPlayerActivated
	 * @param errorMessage
	 * @param statusCode
	 * @param playerId
	 */
	public CreatePlayerRS(Object errorMessage, String statusCode, Boolean isPlayerActivated, Integer playerId) {
		super();
		this.errorMessage = errorMessage;
		this.statusCode = statusCode;
		this.isPlayerActivated = isPlayerActivated;
		this.playerId = playerId;
	}

	public Object getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(Object errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Boolean getIsPlayerActivated() {
		return isPlayerActivated;
	}

	public void setIsPlayerActivated(Boolean isPlayerActivated) {
		this.isPlayerActivated = isPlayerActivated;
	}

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("errorMessage", errorMessage).append("statusCode", statusCode).append("isPlayerActivated", isPlayerActivated).append("playerId", playerId).toString();
	}

}