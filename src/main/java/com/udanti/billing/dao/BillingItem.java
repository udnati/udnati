// default package
// Generated 12 Jul, 2015 1:05:27 PM by Hibernate Tools 3.4.0.CR1
package com.udanti.billing.dao;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BillingItem generated by hbm2java
 */
@Entity
@Table(name = "billing_item", catalog = "udnati")
public class BillingItem implements java.io.Serializable {

	private int itemId;
	private BillingHeader billingHeader;
	private Double billedQuantity;
	private String salesUnit;
	private String baseUnitOfMeasure;
	private Double billingQtInSku;
	private Double requiredQuantity;
	private Double netWeight;
	private Double grossWeight;
	private String weightUnit;
	private Double volume;
	private String volumeUnit;
	private Double netValue;
	private String delievery;
	private Integer delieveryItem;
	private String salesDocument;
	private Integer salesDocumentItem;
	private String material;
	private String materialGroup;
	private String productHierarchy;
	private String plant;
	private String taxClassMaterial;
	private String pricing;
	private String cashDiscount;
	private Double cashDiscBasis;
	private String materialPricingGrp;
	private String costCenter;
	private String barcodeNumber;
	private String returns;
	private String createdBy;
	private Date createdOn;
	private Date time;
	private String storageLocation;
	private Double exchangeRateStats;
	private String profitCenter;
	private String materialEntered;
	private Double rebateBasis;
	private String controllingArea;
	private String order;
	private String taxJurisdiction;
	private Double creditPrice;
	private String promotion;
	private Double taxAmount;
	private String orderReason;
	private String reason0VAt;
	private String taxCode;
	private Double grossValue;

	public BillingItem() {
	}

	public BillingItem(int itemId) {
		this.itemId = itemId;
	}

	public BillingItem(int itemId, BillingHeader billingHeader,
			Double billedQuantity, String salesUnit, String baseUnitOfMeasure,
			Double billingQtInSku, Double requiredQuantity, Double netWeight,
			Double grossWeight, String weightUnit, Double volume,
			String volumeUnit, Double netValue, String delievery,
			Integer delieveryItem, String salesDocument,
			Integer salesDocumentItem, String material, String materialGroup,
			String productHierarchy, String plant, String taxClassMaterial,
			String pricing, String cashDiscount, Double cashDiscBasis,
			String materialPricingGrp, String costCenter, String barcodeNumber,
			String returns, String createdBy, Date createdOn, Date time,
			String storageLocation, Double exchangeRateStats,
			String profitCenter, String materialEntered, Double rebateBasis,
			String controllingArea, String order, String taxJurisdiction,
			Double creditPrice, String promotion, Double taxAmount,
			String orderReason, String reason0VAt, String taxCode,
			Double grossValue) {
		this.itemId = itemId;
		this.billingHeader = billingHeader;
		this.billedQuantity = billedQuantity;
		this.salesUnit = salesUnit;
		this.baseUnitOfMeasure = baseUnitOfMeasure;
		this.billingQtInSku = billingQtInSku;
		this.requiredQuantity = requiredQuantity;
		this.netWeight = netWeight;
		this.grossWeight = grossWeight;
		this.weightUnit = weightUnit;
		this.volume = volume;
		this.volumeUnit = volumeUnit;
		this.netValue = netValue;
		this.delievery = delievery;
		this.delieveryItem = delieveryItem;
		this.salesDocument = salesDocument;
		this.salesDocumentItem = salesDocumentItem;
		this.material = material;
		this.materialGroup = materialGroup;
		this.productHierarchy = productHierarchy;
		this.plant = plant;
		this.taxClassMaterial = taxClassMaterial;
		this.pricing = pricing;
		this.cashDiscount = cashDiscount;
		this.cashDiscBasis = cashDiscBasis;
		this.materialPricingGrp = materialPricingGrp;
		this.costCenter = costCenter;
		this.barcodeNumber = barcodeNumber;
		this.returns = returns;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.time = time;
		this.storageLocation = storageLocation;
		this.exchangeRateStats = exchangeRateStats;
		this.profitCenter = profitCenter;
		this.materialEntered = materialEntered;
		this.rebateBasis = rebateBasis;
		this.controllingArea = controllingArea;
		this.order = order;
		this.taxJurisdiction = taxJurisdiction;
		this.creditPrice = creditPrice;
		this.promotion = promotion;
		this.taxAmount = taxAmount;
		this.orderReason = orderReason;
		this.reason0VAt = reason0VAt;
		this.taxCode = taxCode;
		this.grossValue = grossValue;
	}

	@Id
	@Column(name = "item_id", unique = true, nullable = false)
	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "billing_document")
	public BillingHeader getBillingHeader() {
		return this.billingHeader;
	}

	public void setBillingHeader(BillingHeader billingHeader) {
		this.billingHeader = billingHeader;
	}

	@Column(name = "billed_quantity", precision = 13, scale = 3)
	public Double getBilledQuantity() {
		return this.billedQuantity;
	}

	public void setBilledQuantity(Double billedQuantity) {
		this.billedQuantity = billedQuantity;
	}

	@Column(name = "Sales_unit", length = 3)
	public String getSalesUnit() {
		return this.salesUnit;
	}

	public void setSalesUnit(String salesUnit) {
		this.salesUnit = salesUnit;
	}

	@Column(name = "base_unit_of_measure", length = 3)
	public String getBaseUnitOfMeasure() {
		return this.baseUnitOfMeasure;
	}

	public void setBaseUnitOfMeasure(String baseUnitOfMeasure) {
		this.baseUnitOfMeasure = baseUnitOfMeasure;
	}

	@Column(name = "billing_qt_in_sku", precision = 13, scale = 3)
	public Double getBillingQtInSku() {
		return this.billingQtInSku;
	}

	public void setBillingQtInSku(Double billingQtInSku) {
		this.billingQtInSku = billingQtInSku;
	}

	@Column(name = "required_quantity", precision = 13, scale = 3)
	public Double getRequiredQuantity() {
		return this.requiredQuantity;
	}

	public void setRequiredQuantity(Double requiredQuantity) {
		this.requiredQuantity = requiredQuantity;
	}

	@Column(name = "net_weight", precision = 15, scale = 3)
	public Double getNetWeight() {
		return this.netWeight;
	}

	public void setNetWeight(Double netWeight) {
		this.netWeight = netWeight;
	}

	@Column(name = "gross_weight", precision = 15, scale = 3)
	public Double getGrossWeight() {
		return this.grossWeight;
	}

	public void setGrossWeight(Double grossWeight) {
		this.grossWeight = grossWeight;
	}

	@Column(name = "weight_unit", length = 3)
	public String getWeightUnit() {
		return this.weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	@Column(name = "volume", precision = 15, scale = 3)
	public Double getVolume() {
		return this.volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	@Column(name = "volume_unit", length = 3)
	public String getVolumeUnit() {
		return this.volumeUnit;
	}

	public void setVolumeUnit(String volumeUnit) {
		this.volumeUnit = volumeUnit;
	}

	@Column(name = "net_value", precision = 15)
	public Double getNetValue() {
		return this.netValue;
	}

	public void setNetValue(Double netValue) {
		this.netValue = netValue;
	}

	@Column(name = "delievery", length = 10)
	public String getDelievery() {
		return this.delievery;
	}

	public void setDelievery(String delievery) {
		this.delievery = delievery;
	}

	@Column(name = "delievery_item")
	public Integer getDelieveryItem() {
		return this.delieveryItem;
	}

	public void setDelieveryItem(Integer delieveryItem) {
		this.delieveryItem = delieveryItem;
	}

	@Column(name = "sales_document", length = 10)
	public String getSalesDocument() {
		return this.salesDocument;
	}

	public void setSalesDocument(String salesDocument) {
		this.salesDocument = salesDocument;
	}

	@Column(name = "sales_document_item")
	public Integer getSalesDocumentItem() {
		return this.salesDocumentItem;
	}

	public void setSalesDocumentItem(Integer salesDocumentItem) {
		this.salesDocumentItem = salesDocumentItem;
	}

	@Column(name = "material", length = 18)
	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Column(name = "material_group", length = 9)
	public String getMaterialGroup() {
		return this.materialGroup;
	}

	public void setMaterialGroup(String materialGroup) {
		this.materialGroup = materialGroup;
	}

	@Column(name = "product_hierarchy", length = 18)
	public String getProductHierarchy() {
		return this.productHierarchy;
	}

	public void setProductHierarchy(String productHierarchy) {
		this.productHierarchy = productHierarchy;
	}

	@Column(name = "plant", length = 4)
	public String getPlant() {
		return this.plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	@Column(name = "tax_class_material", length = 1)
	public String getTaxClassMaterial() {
		return this.taxClassMaterial;
	}

	public void setTaxClassMaterial(String taxClassMaterial) {
		this.taxClassMaterial = taxClassMaterial;
	}

	@Column(name = "pricing", length = 1)
	public String getPricing() {
		return this.pricing;
	}

	public void setPricing(String pricing) {
		this.pricing = pricing;
	}

	@Column(name = "cash_discount", length = 1)
	public String getCashDiscount() {
		return this.cashDiscount;
	}

	public void setCashDiscount(String cashDiscount) {
		this.cashDiscount = cashDiscount;
	}

	@Column(name = "cash_disc_basis", precision = 13)
	public Double getCashDiscBasis() {
		return this.cashDiscBasis;
	}

	public void setCashDiscBasis(Double cashDiscBasis) {
		this.cashDiscBasis = cashDiscBasis;
	}

	@Column(name = "Material_pricing_grp", length = 2)
	public String getMaterialPricingGrp() {
		return this.materialPricingGrp;
	}

	public void setMaterialPricingGrp(String materialPricingGrp) {
		this.materialPricingGrp = materialPricingGrp;
	}

	@Column(name = "cost_center", length = 10)
	public String getCostCenter() {
		return this.costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	@Column(name = "barcode_number", length = 13)
	public String getBarcodeNumber() {
		return this.barcodeNumber;
	}

	public void setBarcodeNumber(String barcodeNumber) {
		this.barcodeNumber = barcodeNumber;
	}

	@Column(name = "returns", length = 1)
	public String getReturns() {
		return this.returns;
	}

	public void setReturns(String returns) {
		this.returns = returns;
	}

	@Column(name = "created_by", length = 12)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_on", length = 0)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "time", length = 0)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "storage_location", length = 4)
	public String getStorageLocation() {
		return this.storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	@Column(name = "exchange_rate_stats", precision = 9, scale = 5)
	public Double getExchangeRateStats() {
		return this.exchangeRateStats;
	}

	public void setExchangeRateStats(Double exchangeRateStats) {
		this.exchangeRateStats = exchangeRateStats;
	}

	@Column(name = "profit_center", length = 10)
	public String getProfitCenter() {
		return this.profitCenter;
	}

	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}

	@Column(name = "material_entered", length = 18)
	public String getMaterialEntered() {
		return this.materialEntered;
	}

	public void setMaterialEntered(String materialEntered) {
		this.materialEntered = materialEntered;
	}

	@Column(name = "rebate_basis", precision = 13)
	public Double getRebateBasis() {
		return this.rebateBasis;
	}

	public void setRebateBasis(Double rebateBasis) {
		this.rebateBasis = rebateBasis;
	}

	@Column(name = "controlling_area", length = 4)
	public String getControllingArea() {
		return this.controllingArea;
	}

	public void setControllingArea(String controllingArea) {
		this.controllingArea = controllingArea;
	}

	@Column(name = "order", length = 12)
	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	@Column(name = "tax_jurisdiction", length = 15)
	public String getTaxJurisdiction() {
		return this.taxJurisdiction;
	}

	public void setTaxJurisdiction(String taxJurisdiction) {
		this.taxJurisdiction = taxJurisdiction;
	}

	@Column(name = "credit_price", precision = 11)
	public Double getCreditPrice() {
		return this.creditPrice;
	}

	public void setCreditPrice(Double creditPrice) {
		this.creditPrice = creditPrice;
	}

	@Column(name = "promotion", length = 10)
	public String getPromotion() {
		return this.promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	@Column(name = "tax_amount", precision = 13)
	public Double getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	@Column(name = "order_reason", length = 3)
	public String getOrderReason() {
		return this.orderReason;
	}

	public void setOrderReason(String orderReason) {
		this.orderReason = orderReason;
	}

	@Column(name = "reason_0_vAT", length = 1)
	public String getReason0VAt() {
		return this.reason0VAt;
	}

	public void setReason0VAt(String reason0VAt) {
		this.reason0VAt = reason0VAt;
	}

	@Column(name = "tax_code", length = 2)
	public String getTaxCode() {
		return this.taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	@Column(name = "gross_value", precision = 15)
	public Double getGrossValue() {
		return this.grossValue;
	}

	public void setGrossValue(Double grossValue) {
		this.grossValue = grossValue;
	}

}
