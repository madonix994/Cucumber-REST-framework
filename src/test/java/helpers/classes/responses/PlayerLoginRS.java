package helpers.classes.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;


public class PlayerLoginRS {

	@SerializedName("ErrorMessage")
	@Expose
	private Object errorMessage;
	@SerializedName("StatusCode")
	@Expose
	private String statusCode;
	@SerializedName("FailedLoginCount")
	@Expose
	private Object failedLoginCount;
	@SerializedName("LogonSession")
	@Expose
	private LogonSession logonSession;
	@SerializedName("Messages")
	@Expose
	private List<Message> messages = null;

	/**
	 * No args constructor for use in serialization
	 */
	public PlayerLoginRS() {
	}

	/**
	 * @param failedLoginCount
	 * @param errorMessage
	 * @param messages
	 * @param logonSession
	 * @param statusCode
	 */
	public PlayerLoginRS(Object errorMessage, String statusCode, Object failedLoginCount, LogonSession logonSession, List<Message> messages) {
		super();
		this.errorMessage = errorMessage;
		this.statusCode = statusCode;
		this.failedLoginCount = failedLoginCount;
		this.logonSession = logonSession;
		this.messages = messages;
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

	public Object getFailedLoginCount() {
		return failedLoginCount;
	}

	public void setFailedLoginCount(Object failedLoginCount) {
		this.failedLoginCount = failedLoginCount;
	}

	public LogonSession getLogonSession() {
		return logonSession;
	}

	public void setLogonSession(LogonSession logonSession) {
		this.logonSession = logonSession;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("errorMessage", errorMessage).append("statusCode", statusCode).append("failedLoginCount", failedLoginCount).append("logonSession", logonSession).append("messages", messages).toString();
	}

}