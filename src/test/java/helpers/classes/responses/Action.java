package helpers.classes.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Action {

	@SerializedName("Id")
	@Expose
	private Integer id;
	@SerializedName("Name")
	@Expose
	private String name;

	/**
	 * No args constructor for use in serialization
	 */
	public Action() {
	}

	/**
	 * @param name
	 * @param id
	 */
	public Action(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("name", name).toString();
	}

}
