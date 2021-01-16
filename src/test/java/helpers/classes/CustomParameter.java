package helpers.classes;

import org.apache.commons.lang.builder.ToStringBuilder;


public class CustomParameter {

	private String Value;
	private String Key;

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
		this.Value = value;
		this.Key = key;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		this.Value = value;
	}

	public String getKey() {
		return Key;
	}

	public void setKey(String key) {
		this.Key = key;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("value", Value).append("key", Key).toString();
	}

}