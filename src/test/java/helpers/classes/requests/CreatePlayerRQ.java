package helpers.classes.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;


import java.util.Collections;

public class CreatePlayerRQ {

	@SerializedName("deviceFingerprint")
	@Expose
	private String deviceFingerprint = "iovation device fingerprint";
	@SerializedName("trackingSource")
	@Expose
	private TrackingSource trackingSource = new TrackingSource(Collections.singletonList(new CustomField()),
			"Advert", "Hulk slot", "btag value", "OOC", "Add group (slots)", "Google");
	@SerializedName("player")
	@Expose
	private Player player;

	/**
	 * No args constructor for use in serialization
	 */
	public CreatePlayerRQ() {
	}

	/**
	 * @param player
	 */
	public CreatePlayerRQ(Player player) {
		super();
		this.player = player;
	}

	public String getDeviceFingerprint() {
		return deviceFingerprint;
	}

	public void setDeviceFingerprint(String deviceFingerprint) {
		this.deviceFingerprint = deviceFingerprint;
	}

	public TrackingSource getTrackingSource() {
		return trackingSource;
	}

	public void setTrackingSource(TrackingSource trackingSource) {
		this.trackingSource = trackingSource;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("deviceFingerprint", deviceFingerprint).append("trackingSource", trackingSource).append("player", player).toString();
	}
}


