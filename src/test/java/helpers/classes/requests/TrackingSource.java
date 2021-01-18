package helpers.classes.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

public class TrackingSource {

	@SerializedName("CustomFields")
	@Expose
	private List<CustomField> customFields = null;
	@SerializedName("Creative")
	@Expose
	private String creative;
	@SerializedName("Content")
	@Expose
	private String content;
	@SerializedName("Btag")
	@Expose
	private String btag;
	@SerializedName("MarketingChannel")
	@Expose
	private String marketingChannel;
	@SerializedName("CampaignName")
	@Expose
	private String campaignName;
	@SerializedName("MarketingSource")
	@Expose
	private String marketingSource;

	/**
	 * No args constructor for use in serialization
	 */
	public TrackingSource() {
	}

	/**
	 * @param customFields
	 * @param btag
	 * @param marketingSource
	 * @param marketingChannel
	 * @param campaignName
	 * @param creative
	 * @param content
	 */
	public TrackingSource(List<CustomField> customFields, String creative, String content, String btag, String marketingChannel, String campaignName, String marketingSource) {
		super();
		this.customFields = customFields;
		this.creative = creative;
		this.content = content;
		this.btag = btag;
		this.marketingChannel = marketingChannel;
		this.campaignName = campaignName;
		this.marketingSource = marketingSource;
	}

	public List<CustomField> getCustomFields() {
		return customFields;
	}

	public void setCustomFields(List<CustomField> customFields) {
		this.customFields = customFields;
	}

	public String getCreative() {
		return creative;
	}

	public void setCreative(String creative) {
		this.creative = creative;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getBtag() {
		return btag;
	}

	public void setBtag(String btag) {
		this.btag = btag;
	}

	public String getMarketingChannel() {
		return marketingChannel;
	}

	public void setMarketingChannel(String marketingChannel) {
		this.marketingChannel = marketingChannel;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getMarketingSource() {
		return marketingSource;
	}

	public void setMarketingSource(String marketingSource) {
		this.marketingSource = marketingSource;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("customFields", customFields).append("creative", creative).append("content", content).append("btag", btag).append("marketingChannel", marketingChannel).append("campaignName", campaignName).append("marketingSource", marketingSource).toString();
	}

}
