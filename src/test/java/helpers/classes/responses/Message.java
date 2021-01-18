package helpers.classes.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

public class Message {

	@SerializedName("Actions")
	@Expose
	private List<Action> actions = null;
	@SerializedName("Contents")
	@Expose
	private String contents;
	@SerializedName("CreatedDate")
	@Expose
	private String createdDate;
	@SerializedName("Id")
	@Expose
	private Integer id;
	@SerializedName("MessageType")
	@Expose
	private Integer messageType;
	@SerializedName("Title")
	@Expose
	private String title;

	/**
	 * No args constructor for use in serialization
	 */
	public Message() {
	}

	/**
	 * @param createdDate
	 * @param messageType
	 * @param contents
	 * @param id
	 * @param title
	 * @param actions
	 */
	public Message(List<Action> actions, String contents, String createdDate, Integer id, Integer messageType, String title) {
		super();
		this.actions = actions;
		this.contents = contents;
		this.createdDate = createdDate;
		this.id = id;
		this.messageType = messageType;
		this.title = title;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMessageType() {
		return messageType;
	}

	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("actions", actions).append("contents", contents).append("createdDate", createdDate).append("id", id).append("messageType", messageType).append("title", title).toString();
	}

}
