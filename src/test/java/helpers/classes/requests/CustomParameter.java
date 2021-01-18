package helpers.classes.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class CustomParameter {

	@SerializedName("Value")
	@Expose
	private String value;
	@SerializedName("Key")
	@Expose
	private String key;

	/**
	 * No args constructor for use in serialization
	 */
	public CustomParameter() {
	}

	/**
	 * @param value
	 * @param key
	 */
	public CustomParameter(String value, String key) {
		super();
		this.value = value;
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("value", value).append("key", key).toString();
	}

}
