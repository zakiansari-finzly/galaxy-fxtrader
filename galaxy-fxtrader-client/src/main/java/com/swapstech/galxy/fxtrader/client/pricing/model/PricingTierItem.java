/*
 *
 * Pricing service API
 *
 * OpenAPI spec version: 1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.swapstech.galxy.fxtrader.client.pricing.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
/**
 * PricingTierItem
 */

public class PricingTierItem {
	
	@JsonProperty("id")
	private String id;

	@JsonProperty("isDefault")
	private boolean isDefault = false;

	@JsonProperty("channels")
	private List<String> channels;

	@JsonProperty("isAllDay")
	private boolean isAllDay = true;

	@JsonProperty("fromTime")
	private Integer fromTime;

	@JsonProperty("toTime")
	private Integer toTime;

	@JsonProperty("noQuoteMsg")
	private String noQuoteMsg = null;

	@JsonProperty("rateSource")
	private String rateSource = null;

	@JsonProperty("createdBy")
	private String createdBy;

	@JsonProperty("creationTime")
	private LocalDateTime creationTime;

	@JsonProperty("lastUpdatedBy")
	private String lastUpdatedBy;

	@JsonProperty("lastUpdatedTime")
	private LocalDateTime lastUpdatedTime;

	@JsonProperty("pricingCcySet")
	private List<PricingCcySet> pricingCcySet = null;

	@SerializedName("tenors")
	private List<PricingTenor> tenors = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public List<String> getChannels() {
		return channels;
	}

	public void setChannels(List<String> channels) {
		this.channels = channels;
	}

	public boolean isAllDay() {
		return isAllDay;
	}

	public void setAllDay(boolean isAllDay) {
		this.isAllDay = isAllDay;
	}

	public Integer getFromTime() {
		return fromTime;
	}

	public void setFromTime(Integer fromTime) {
		this.fromTime = fromTime;
	}

	public Integer getToTime() {
		return toTime;
	}

	public void setToTime(Integer toTime) {
		this.toTime = toTime;
	}

	public String getNoQuoteMsg() {
		return noQuoteMsg;
	}

	public void setNoQuoteMsg(String noQuoteMsg) {
		this.noQuoteMsg = noQuoteMsg;
	}

	public String getRateSource() {
		return rateSource;
	}

	public void setRateSource(String rateSource) {
		this.rateSource = rateSource;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public LocalDateTime getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(LocalDateTime lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public List<PricingCcySet> getPricingCcySet() {
		return pricingCcySet;
	}

	public void setPricingCcySet(List<PricingCcySet> pricingCcySet) {
		this.pricingCcySet = pricingCcySet;
	}

	public List<PricingTenor> getTenors() {
		return tenors;
	}

	public void setTenors(List<PricingTenor> tenors) {
		this.tenors = tenors;
	}

	@Override
	public int hashCode() {
		return Objects.hash(channels, createdBy, creationTime, fromTime, id, isAllDay, isDefault, lastUpdatedBy,
				lastUpdatedTime, noQuoteMsg, rateSource, toTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PricingTierItem other = (PricingTierItem) obj;
		return Objects.equals(channels, other.channels) && Objects.equals(createdBy, other.createdBy)
				&& Objects.equals(creationTime, other.creationTime) && Objects.equals(fromTime, other.fromTime)
				&& Objects.equals(id, other.id) && isAllDay == other.isAllDay && isDefault == other.isDefault
				&& Objects.equals(lastUpdatedBy, other.lastUpdatedBy)
				&& Objects.equals(lastUpdatedTime, other.lastUpdatedTime)
				&& Objects.equals(noQuoteMsg, other.noQuoteMsg) && Objects.equals(rateSource, other.rateSource)
				&& Objects.equals(toTime, other.toTime);
	}

	PricingTierItem id(String id) {
		this.id = id;
		return this;
	}

	@Override
	public String toString() {
		return "PricingTierItem [id=" + id + ", isDefault=" + isDefault + ", channels=" + channels + ", isAllDay="
				+ isAllDay + ", fromTime=" + fromTime + ", toTime=" + toTime + ", noQuoteMsg=" + noQuoteMsg
				+ ", rateSource=" + rateSource + ", createdBy=" + createdBy + ", creationTime=" + creationTime
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedTime=" + lastUpdatedTime + "]";
	}

	
}
