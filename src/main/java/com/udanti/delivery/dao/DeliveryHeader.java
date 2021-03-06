// default package
// Generated 12 Jul, 2015 1:05:27 PM by Hibernate Tools 3.4.0.CR1

package com.udanti.delivery.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DeliveryHeader generated by hbm2java
 */
@Entity
@Table(name = "delivery_header", catalog = "udnati")
public class DeliveryHeader implements java.io.Serializable {

	private int deliveryNumber;
	private String createdBy;
	private Date time;
	private Date createdOn;
	private String salesDistrict;
	private String shippingPoint;
	private String salesOrg;
	private String deliveryType;
	private String completeDelivery;
	private Date plannedGdsMvntDate;
	private Date deliverDate;
	private String salesDocCategory;
	private String transportType;
	private String priority;
	private String shippingCond;
	private String shipToParty;
	private String soldToParty;
	private String customerGrp;
	private String totalWeight;
	private String netWeight;
	private String weightUnit;
	private String volume;
	private String volumeUnit;
	private String numberPackages;
	private Date billingDate;
	private String salesOffice;
	private String salesOrder;
	private String changedBy;
	private Date changedOn;
	private String warehouse;
	private String distrChannel;
	private String riskCategory;
	private Date releaseDate;
	private Date goodsReceipt;
	private Date actGdsMvntDt;
	private Date netValue;
	private String confirmationStatus;
	private String returnCancelled;
	private String invoiceBeforeGi;
	private String qulaityCheck;
	private String qualityCheckedBy;
	private String handoverLocation;
	private String handoverDate;
	private String packedBy;
	private Set<DeliveryItem> deliveryItems = new HashSet<DeliveryItem>(0);

	public DeliveryHeader() {
	}

	public DeliveryHeader(int deliveryNumber, String createdBy, Date time,
			Date createdOn, String salesDistrict, String shippingPoint,
			String salesOrg, String deliveryType, String completeDelivery,
			Date plannedGdsMvntDate, Date deliverDate, String salesDocCategory,
			String transportType, String priority, String shippingCond,
			String shipToParty, String soldToParty, String customerGrp,
			String totalWeight, String netWeight, String weightUnit,
			String volume, String volumeUnit, String numberPackages,
			Date billingDate, String salesOffice, String salesOrder,
			String changedBy, Date changedOn, String warehouse,
			String distrChannel, String riskCategory, Date releaseDate,
			Date goodsReceipt, Date actGdsMvntDt, Date netValue,
			String confirmationStatus, String returnCancelled,
			String invoiceBeforeGi, String qulaityCheck,
			String qualityCheckedBy, String handoverLocation,
			String handoverDate, String packedBy) {
		this.deliveryNumber = deliveryNumber;
		this.createdBy = createdBy;
		this.time = time;
		this.createdOn = createdOn;
		this.salesDistrict = salesDistrict;
		this.shippingPoint = shippingPoint;
		this.salesOrg = salesOrg;
		this.deliveryType = deliveryType;
		this.completeDelivery = completeDelivery;
		this.plannedGdsMvntDate = plannedGdsMvntDate;
		this.deliverDate = deliverDate;
		this.salesDocCategory = salesDocCategory;
		this.transportType = transportType;
		this.priority = priority;
		this.shippingCond = shippingCond;
		this.shipToParty = shipToParty;
		this.soldToParty = soldToParty;
		this.customerGrp = customerGrp;
		this.totalWeight = totalWeight;
		this.netWeight = netWeight;
		this.weightUnit = weightUnit;
		this.volume = volume;
		this.volumeUnit = volumeUnit;
		this.numberPackages = numberPackages;
		this.billingDate = billingDate;
		this.salesOffice = salesOffice;
		this.salesOrder = salesOrder;
		this.changedBy = changedBy;
		this.changedOn = changedOn;
		this.warehouse = warehouse;
		this.distrChannel = distrChannel;
		this.riskCategory = riskCategory;
		this.releaseDate = releaseDate;
		this.goodsReceipt = goodsReceipt;
		this.actGdsMvntDt = actGdsMvntDt;
		this.netValue = netValue;
		this.confirmationStatus = confirmationStatus;
		this.returnCancelled = returnCancelled;
		this.invoiceBeforeGi = invoiceBeforeGi;
		this.qulaityCheck = qulaityCheck;
		this.qualityCheckedBy = qualityCheckedBy;
		this.handoverLocation = handoverLocation;
		this.handoverDate = handoverDate;
		this.packedBy = packedBy;
	}

	public DeliveryHeader(int deliveryNumber, String createdBy, Date time,
			Date createdOn, String salesDistrict, String shippingPoint,
			String salesOrg, String deliveryType, String completeDelivery,
			Date plannedGdsMvntDate, Date deliverDate, String salesDocCategory,
			String transportType, String priority, String shippingCond,
			String shipToParty, String soldToParty, String customerGrp,
			String totalWeight, String netWeight, String weightUnit,
			String volume, String volumeUnit, String numberPackages,
			Date billingDate, String salesOffice, String salesOrder,
			String changedBy, Date changedOn, String warehouse,
			String distrChannel, String riskCategory, Date releaseDate,
			Date goodsReceipt, Date actGdsMvntDt, Date netValue,
			String confirmationStatus, String returnCancelled,
			String invoiceBeforeGi, String qulaityCheck,
			String qualityCheckedBy, String handoverLocation,
			String handoverDate, String packedBy, Set<DeliveryItem> deliveryItems) {
		this.deliveryNumber = deliveryNumber;
		this.createdBy = createdBy;
		this.time = time;
		this.createdOn = createdOn;
		this.salesDistrict = salesDistrict;
		this.shippingPoint = shippingPoint;
		this.salesOrg = salesOrg;
		this.deliveryType = deliveryType;
		this.completeDelivery = completeDelivery;
		this.plannedGdsMvntDate = plannedGdsMvntDate;
		this.deliverDate = deliverDate;
		this.salesDocCategory = salesDocCategory;
		this.transportType = transportType;
		this.priority = priority;
		this.shippingCond = shippingCond;
		this.shipToParty = shipToParty;
		this.soldToParty = soldToParty;
		this.customerGrp = customerGrp;
		this.totalWeight = totalWeight;
		this.netWeight = netWeight;
		this.weightUnit = weightUnit;
		this.volume = volume;
		this.volumeUnit = volumeUnit;
		this.numberPackages = numberPackages;
		this.billingDate = billingDate;
		this.salesOffice = salesOffice;
		this.salesOrder = salesOrder;
		this.changedBy = changedBy;
		this.changedOn = changedOn;
		this.warehouse = warehouse;
		this.distrChannel = distrChannel;
		this.riskCategory = riskCategory;
		this.releaseDate = releaseDate;
		this.goodsReceipt = goodsReceipt;
		this.actGdsMvntDt = actGdsMvntDt;
		this.netValue = netValue;
		this.confirmationStatus = confirmationStatus;
		this.returnCancelled = returnCancelled;
		this.invoiceBeforeGi = invoiceBeforeGi;
		this.qulaityCheck = qulaityCheck;
		this.qualityCheckedBy = qualityCheckedBy;
		this.handoverLocation = handoverLocation;
		this.handoverDate = handoverDate;
		this.packedBy = packedBy;
		this.deliveryItems = deliveryItems;
	}

	@Id
	@Column(name = "delivery_number", unique = true, nullable = false)
	public int getDeliveryNumber() {
		return this.deliveryNumber;
	}

	public void setDeliveryNumber(int deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}

	@Column(name = "created_by", nullable = false, length = 50)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time", nullable = false, length = 0)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_on", nullable = false, length = 0)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "sales_district", nullable = false, length = 50)
	public String getSalesDistrict() {
		return this.salesDistrict;
	}

	public void setSalesDistrict(String salesDistrict) {
		this.salesDistrict = salesDistrict;
	}

	@Column(name = "shipping_point", nullable = false, length = 50)
	public String getShippingPoint() {
		return this.shippingPoint;
	}

	public void setShippingPoint(String shippingPoint) {
		this.shippingPoint = shippingPoint;
	}

	@Column(name = "sales_org", nullable = false, length = 50)
	public String getSalesOrg() {
		return this.salesOrg;
	}

	public void setSalesOrg(String salesOrg) {
		this.salesOrg = salesOrg;
	}

	@Column(name = "delivery_type", nullable = false, length = 50)
	public String getDeliveryType() {
		return this.deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	@Column(name = "complete_delivery", nullable = false, length = 50)
	public String getCompleteDelivery() {
		return this.completeDelivery;
	}

	public void setCompleteDelivery(String completeDelivery) {
		this.completeDelivery = completeDelivery;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "planned_gds_mvnt_date", nullable = false, length = 0)
	public Date getPlannedGdsMvntDate() {
		return this.plannedGdsMvntDate;
	}

	public void setPlannedGdsMvntDate(Date plannedGdsMvntDate) {
		this.plannedGdsMvntDate = plannedGdsMvntDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "deliver_date", nullable = false, length = 0)
	public Date getDeliverDate() {
		return this.deliverDate;
	}

	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}

	@Column(name = "sales_doc_category", nullable = false, length = 50)
	public String getSalesDocCategory() {
		return this.salesDocCategory;
	}

	public void setSalesDocCategory(String salesDocCategory) {
		this.salesDocCategory = salesDocCategory;
	}

	@Column(name = "transport_type", nullable = false, length = 50)
	public String getTransportType() {
		return this.transportType;
	}

	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}

	@Column(name = "priority", nullable = false, length = 50)
	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Column(name = "shipping_cond", nullable = false, length = 50)
	public String getShippingCond() {
		return this.shippingCond;
	}

	public void setShippingCond(String shippingCond) {
		this.shippingCond = shippingCond;
	}

	@Column(name = "ship_to_party", nullable = false, length = 50)
	public String getShipToParty() {
		return this.shipToParty;
	}

	public void setShipToParty(String shipToParty) {
		this.shipToParty = shipToParty;
	}

	@Column(name = "sold_to_party", nullable = false, length = 50)
	public String getSoldToParty() {
		return this.soldToParty;
	}

	public void setSoldToParty(String soldToParty) {
		this.soldToParty = soldToParty;
	}

	@Column(name = "customer_grp", nullable = false, length = 50)
	public String getCustomerGrp() {
		return this.customerGrp;
	}

	public void setCustomerGrp(String customerGrp) {
		this.customerGrp = customerGrp;
	}

	@Column(name = "total_weight", nullable = false, length = 50)
	public String getTotalWeight() {
		return this.totalWeight;
	}

	public void setTotalWeight(String totalWeight) {
		this.totalWeight = totalWeight;
	}

	@Column(name = "net_weight", nullable = false, length = 50)
	public String getNetWeight() {
		return this.netWeight;
	}

	public void setNetWeight(String netWeight) {
		this.netWeight = netWeight;
	}

	@Column(name = "weight_unit", nullable = false, length = 50)
	public String getWeightUnit() {
		return this.weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	@Column(name = "volume", nullable = false, length = 50)
	public String getVolume() {
		return this.volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	@Column(name = "volume_unit", nullable = false, length = 50)
	public String getVolumeUnit() {
		return this.volumeUnit;
	}

	public void setVolumeUnit(String volumeUnit) {
		this.volumeUnit = volumeUnit;
	}

	@Column(name = "number_packages", nullable = false, length = 50)
	public String getNumberPackages() {
		return this.numberPackages;
	}

	public void setNumberPackages(String numberPackages) {
		this.numberPackages = numberPackages;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "billing_date", nullable = false, length = 0)
	public Date getBillingDate() {
		return this.billingDate;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	@Column(name = "sales_office", nullable = false, length = 50)
	public String getSalesOffice() {
		return this.salesOffice;
	}

	public void setSalesOffice(String salesOffice) {
		this.salesOffice = salesOffice;
	}

	@Column(name = "sales_order", nullable = false, length = 50)
	public String getSalesOrder() {
		return this.salesOrder;
	}

	public void setSalesOrder(String salesOrder) {
		this.salesOrder = salesOrder;
	}

	@Column(name = "changed_by", nullable = false, length = 50)
	public String getChangedBy() {
		return this.changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "changed_on", nullable = false, length = 0)
	public Date getChangedOn() {
		return this.changedOn;
	}

	public void setChangedOn(Date changedOn) {
		this.changedOn = changedOn;
	}

	@Column(name = "warehouse", nullable = false, length = 50)
	public String getWarehouse() {
		return this.warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	@Column(name = "distr_channel", nullable = false, length = 50)
	public String getDistrChannel() {
		return this.distrChannel;
	}

	public void setDistrChannel(String distrChannel) {
		this.distrChannel = distrChannel;
	}

	@Column(name = "risk_category", nullable = false, length = 50)
	public String getRiskCategory() {
		return this.riskCategory;
	}

	public void setRiskCategory(String riskCategory) {
		this.riskCategory = riskCategory;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "release_date", nullable = false, length = 0)
	public Date getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "goods_receipt", nullable = false, length = 0)
	public Date getGoodsReceipt() {
		return this.goodsReceipt;
	}

	public void setGoodsReceipt(Date goodsReceipt) {
		this.goodsReceipt = goodsReceipt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "act_gds_mvnt_dt", nullable = false, length = 0)
	public Date getActGdsMvntDt() {
		return this.actGdsMvntDt;
	}

	public void setActGdsMvntDt(Date actGdsMvntDt) {
		this.actGdsMvntDt = actGdsMvntDt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "net_value", nullable = false, length = 0)
	public Date getNetValue() {
		return this.netValue;
	}

	public void setNetValue(Date netValue) {
		this.netValue = netValue;
	}

	@Column(name = "confirmation_status", nullable = false, length = 50)
	public String getConfirmationStatus() {
		return this.confirmationStatus;
	}

	public void setConfirmationStatus(String confirmationStatus) {
		this.confirmationStatus = confirmationStatus;
	}

	@Column(name = "return_cancelled", nullable = false, length = 50)
	public String getReturnCancelled() {
		return this.returnCancelled;
	}

	public void setReturnCancelled(String returnCancelled) {
		this.returnCancelled = returnCancelled;
	}

	@Column(name = "invoice_before_gi", nullable = false, length = 50)
	public String getInvoiceBeforeGi() {
		return this.invoiceBeforeGi;
	}

	public void setInvoiceBeforeGi(String invoiceBeforeGi) {
		this.invoiceBeforeGi = invoiceBeforeGi;
	}

	@Column(name = "qulaity_check", nullable = false, length = 50)
	public String getQulaityCheck() {
		return this.qulaityCheck;
	}

	public void setQulaityCheck(String qulaityCheck) {
		this.qulaityCheck = qulaityCheck;
	}

	@Column(name = "quality_checked_by", nullable = false, length = 50)
	public String getQualityCheckedBy() {
		return this.qualityCheckedBy;
	}

	public void setQualityCheckedBy(String qualityCheckedBy) {
		this.qualityCheckedBy = qualityCheckedBy;
	}

	@Column(name = "handover_location", nullable = false, length = 50)
	public String getHandoverLocation() {
		return this.handoverLocation;
	}

	public void setHandoverLocation(String handoverLocation) {
		this.handoverLocation = handoverLocation;
	}

	@Column(name = "handover_date", nullable = false, length = 50)
	public String getHandoverDate() {
		return this.handoverDate;
	}

	public void setHandoverDate(String handoverDate) {
		this.handoverDate = handoverDate;
	}

	@Column(name = "packed_by", nullable = false, length = 50)
	public String getPackedBy() {
		return this.packedBy;
	}

	public void setPackedBy(String packedBy) {
		this.packedBy = packedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deliveryHeader")
	public Set<DeliveryItem> getDeliveryItems() {
		return this.deliveryItems;
	}

	public void setDeliveryItems(Set<DeliveryItem> deliveryItems) {
		this.deliveryItems = deliveryItems;
	}

}
