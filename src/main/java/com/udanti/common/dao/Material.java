// default package
// Generated 12 Jul, 2015 1:05:27 PM by Hibernate Tools 3.4.0.CR1

package com.udanti.common.dao;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Material generated by hbm2java
 */
@Entity
@Table(name = "material", catalog = "udnati")
public class Material implements java.io.Serializable {

	private int materialId;
	private Date createdOn;
	private String createdBy;
	private Date lastChange;
	private String changedBy;
	private String qualityIaaue;
	private String maintenanceStatus;
	private String materialType;
	private String industrySector;
	private String materialGroup;
	private String oldMaterialNumber;
	private Integer baseUnitOfMeasure;
	private Integer orderUnit;
	private String sizeDimensions;
	private String basicMaterial;
	private String purchasingValueKey;
	private Double grossWeight;
	private Double netWeight;
	private Integer weightUnit;
	private Double volume;
	private Integer volumeUnit;
	private String packingCondition;
	private String storageConditions;
	private String tempConditions;
	private String transportationCondition;
	private String hazMaterialNumber;
	private String division;
	private String eanNumberBarcode;
	private String procurementRule;
	private String sourceOfSupply;
	private String season;
	private String labelType;
	private String labelForm;
	private String length;
	private String width;
	private String height;
	private String unitOfDimension;
	private String productHierarchy;
	private String netChangeCosting;
	private String allowedPkgWeight;
	private String allowedPkgVolume;
	private String excessWtTolerance;
	private String excessVolumeTol;
	private String materiaIsConfigurable;
	private String batchManagement;
	private String validFrom;
	private String validTo;
	private String priceBandCategory;
	private String materialCategory;
	private String purchasingOrderStatus;
	private String outOfStock;
	private String taxClassification;
	private String catalogProfile;
	private String totalShelfLife;
	private String manufacturerPartNo;
	private String manufacturer;
	private String maximumCapacity;
	private String overcapacityToler;
	private String textileCompositionMaintenanceActive;
	private String seasonUsage;
	private String color;
	private String mainSize;
	private String secondSize;
	private String freeCharactValue;
	private String careCode;
	private String brand;
	private String materialName;
	private Double rate;

	public Material() {
	}

	public Material(int materialId) {
		this.materialId = materialId;
	}

	public Material(int materialId, Date createdOn, String createdBy,
			Date lastChange, String changedBy, String qualityIaaue,
			String maintenanceStatus, String materialType,
			String industrySector, String materialGroup,
			String oldMaterialNumber, Integer baseUnitOfMeasure,
			Integer orderUnit, String sizeDimensions, String basicMaterial,
			String purchasingValueKey, Double grossWeight, Double netWeight,
			Integer weightUnit, Double volume, Integer volumeUnit,
			String packingCondition, String storageConditions,
			String tempConditions, String transportationCondition,
			String hazMaterialNumber, String division, String eanNumberBarcode,
			String procurementRule, String sourceOfSupply, String season,
			String labelType, String labelForm, String length, String width,
			String height, String unitOfDimension, String productHierarchy,
			String netChangeCosting, String allowedPkgWeight,
			String allowedPkgVolume, String excessWtTolerance,
			String excessVolumeTol, String materiaIsConfigurable,
			String batchManagement, String validFrom, String validTo,
			String priceBandCategory, String materialCategory,
			String purchasingOrderStatus, String outOfStock,
			String taxClassification, String catalogProfile,
			String totalShelfLife, String manufacturerPartNo,
			String manufacturer, String maximumCapacity,
			String overcapacityToler,
			String textileCompositionMaintenanceActive, String seasonUsage,
			String color, String mainSize, String secondSize,
			String freeCharactValue, String careCode, String brand, String materialName, Double rate) {
		this.materialId = materialId;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.lastChange = lastChange;
		this.changedBy = changedBy;
		this.qualityIaaue = qualityIaaue;
		this.maintenanceStatus = maintenanceStatus;
		this.materialType = materialType;
		this.industrySector = industrySector;
		this.materialGroup = materialGroup;
		this.oldMaterialNumber = oldMaterialNumber;
		this.baseUnitOfMeasure = baseUnitOfMeasure;
		this.orderUnit = orderUnit;
		this.sizeDimensions = sizeDimensions;
		this.basicMaterial = basicMaterial;
		this.purchasingValueKey = purchasingValueKey;
		this.grossWeight = grossWeight;
		this.netWeight = netWeight;
		this.weightUnit = weightUnit;
		this.volume = volume;
		this.volumeUnit = volumeUnit;
		this.packingCondition = packingCondition;
		this.storageConditions = storageConditions;
		this.tempConditions = tempConditions;
		this.transportationCondition = transportationCondition;
		this.hazMaterialNumber = hazMaterialNumber;
		this.division = division;
		this.eanNumberBarcode = eanNumberBarcode;
		this.procurementRule = procurementRule;
		this.sourceOfSupply = sourceOfSupply;
		this.season = season;
		this.labelType = labelType;
		this.labelForm = labelForm;
		this.length = length;
		this.width = width;
		this.height = height;
		this.unitOfDimension = unitOfDimension;
		this.productHierarchy = productHierarchy;
		this.netChangeCosting = netChangeCosting;
		this.allowedPkgWeight = allowedPkgWeight;
		this.allowedPkgVolume = allowedPkgVolume;
		this.excessWtTolerance = excessWtTolerance;
		this.excessVolumeTol = excessVolumeTol;
		this.materiaIsConfigurable = materiaIsConfigurable;
		this.batchManagement = batchManagement;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.priceBandCategory = priceBandCategory;
		this.materialCategory = materialCategory;
		this.purchasingOrderStatus = purchasingOrderStatus;
		this.outOfStock = outOfStock;
		this.taxClassification = taxClassification;
		this.catalogProfile = catalogProfile;
		this.totalShelfLife = totalShelfLife;
		this.manufacturerPartNo = manufacturerPartNo;
		this.manufacturer = manufacturer;
		this.maximumCapacity = maximumCapacity;
		this.overcapacityToler = overcapacityToler;
		this.textileCompositionMaintenanceActive = textileCompositionMaintenanceActive;
		this.seasonUsage = seasonUsage;
		this.color = color;
		this.mainSize = mainSize;
		this.secondSize = secondSize;
		this.freeCharactValue = freeCharactValue;
		this.careCode = careCode;
		this.brand = brand;
		this.materialName = materialName;
		this.rate = rate;
	}

	@Id
	@Column(name = "material_id", unique = true, nullable = false)
	public int getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_on", length = 0)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "created_by", length = 12)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "last_change", length = 0)
	public Date getLastChange() {
		return this.lastChange;
	}

	public void setLastChange(Date lastChange) {
		this.lastChange = lastChange;
	}

	@Column(name = "changed_by", length = 12)
	public String getChangedBy() {
		return this.changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	@Column(name = "quality_iaaue", length = 15)
	public String getQualityIaaue() {
		return this.qualityIaaue;
	}

	public void setQualityIaaue(String qualityIaaue) {
		this.qualityIaaue = qualityIaaue;
	}

	@Column(name = "maintenance_status", length = 15)
	public String getMaintenanceStatus() {
		return this.maintenanceStatus;
	}

	public void setMaintenanceStatus(String maintenanceStatus) {
		this.maintenanceStatus = maintenanceStatus;
	}

	@Column(name = "material_type", length = 4)
	public String getMaterialType() {
		return this.materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	@Column(name = "industry_sector", length = 1)
	public String getIndustrySector() {
		return this.industrySector;
	}

	public void setIndustrySector(String industrySector) {
		this.industrySector = industrySector;
	}

	@Column(name = "material_group", length = 9)
	public String getMaterialGroup() {
		return this.materialGroup;
	}

	public void setMaterialGroup(String materialGroup) {
		this.materialGroup = materialGroup;
	}

	@Column(name = "old_material_number", length = 18)
	public String getOldMaterialNumber() {
		return this.oldMaterialNumber;
	}

	public void setOldMaterialNumber(String oldMaterialNumber) {
		this.oldMaterialNumber = oldMaterialNumber;
	}

	@Column(name = "base_unit_of_measure")
	public Integer getBaseUnitOfMeasure() {
		return this.baseUnitOfMeasure;
	}

	public void setBaseUnitOfMeasure(Integer baseUnitOfMeasure) {
		this.baseUnitOfMeasure = baseUnitOfMeasure;
	}

	@Column(name = "order_unit")
	public Integer getOrderUnit() {
		return this.orderUnit;
	}

	public void setOrderUnit(Integer orderUnit) {
		this.orderUnit = orderUnit;
	}

	@Column(name = "size_dimensions", length = 32)
	public String getSizeDimensions() {
		return this.sizeDimensions;
	}

	public void setSizeDimensions(String sizeDimensions) {
		this.sizeDimensions = sizeDimensions;
	}

	@Column(name = "basic_material", length = 48)
	public String getBasicMaterial() {
		return this.basicMaterial;
	}

	public void setBasicMaterial(String basicMaterial) {
		this.basicMaterial = basicMaterial;
	}

	@Column(name = "purchasing_value_key", length = 4)
	public String getPurchasingValueKey() {
		return this.purchasingValueKey;
	}

	public void setPurchasingValueKey(String purchasingValueKey) {
		this.purchasingValueKey = purchasingValueKey;
	}

	@Column(name = "gross_weight", precision = 13, scale = 3)
	public Double getGrossWeight() {
		return this.grossWeight;
	}

	public void setGrossWeight(Double grossWeight) {
		this.grossWeight = grossWeight;
	}

	@Column(name = "net_weight", precision = 13, scale = 3)
	public Double getNetWeight() {
		return this.netWeight;
	}

	public void setNetWeight(Double netWeight) {
		this.netWeight = netWeight;
	}

	@Column(name = "weight_unit")
	public Integer getWeightUnit() {
		return this.weightUnit;
	}

	public void setWeightUnit(Integer weightUnit) {
		this.weightUnit = weightUnit;
	}

	@Column(name = "volume", precision = 13, scale = 3)
	public Double getVolume() {
		return this.volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	@Column(name = "volume_unit")
	public Integer getVolumeUnit() {
		return this.volumeUnit;
	}

	public void setVolumeUnit(Integer volumeUnit) {
		this.volumeUnit = volumeUnit;
	}

	@Column(name = "packing_condition", length = 50)
	public String getPackingCondition() {
		return this.packingCondition;
	}

	public void setPackingCondition(String packingCondition) {
		this.packingCondition = packingCondition;
	}

	@Column(name = "storage_conditions", length = 50)
	public String getStorageConditions() {
		return this.storageConditions;
	}

	public void setStorageConditions(String storageConditions) {
		this.storageConditions = storageConditions;
	}

	@Column(name = "temp_conditions", length = 50)
	public String getTempConditions() {
		return this.tempConditions;
	}

	public void setTempConditions(String tempConditions) {
		this.tempConditions = tempConditions;
	}

	@Column(name = "transportation_condition", length = 50)
	public String getTransportationCondition() {
		return this.transportationCondition;
	}

	public void setTransportationCondition(String transportationCondition) {
		this.transportationCondition = transportationCondition;
	}

	@Column(name = "haz_material_number", length = 50)
	public String getHazMaterialNumber() {
		return this.hazMaterialNumber;
	}

	public void setHazMaterialNumber(String hazMaterialNumber) {
		this.hazMaterialNumber = hazMaterialNumber;
	}

	@Column(name = "division", length = 2)
	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	@Column(name = "ean_number_Barcode", length = 50)
	public String getEanNumberBarcode() {
		return this.eanNumberBarcode;
	}

	public void setEanNumberBarcode(String eanNumberBarcode) {
		this.eanNumberBarcode = eanNumberBarcode;
	}

	@Column(name = "procurement_rule", length = 50)
	public String getProcurementRule() {
		return this.procurementRule;
	}

	public void setProcurementRule(String procurementRule) {
		this.procurementRule = procurementRule;
	}

	@Column(name = "source_of_supply", length = 1)
	public String getSourceOfSupply() {
		return this.sourceOfSupply;
	}

	public void setSourceOfSupply(String sourceOfSupply) {
		this.sourceOfSupply = sourceOfSupply;
	}

	@Column(name = "season", length = 4)
	public String getSeason() {
		return this.season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Column(name = "label_type", length = 50)
	public String getLabelType() {
		return this.labelType;
	}

	public void setLabelType(String labelType) {
		this.labelType = labelType;
	}

	@Column(name = "label_form", length = 50)
	public String getLabelForm() {
		return this.labelForm;
	}

	public void setLabelForm(String labelForm) {
		this.labelForm = labelForm;
	}

	@Column(name = "length", length = 50)
	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	@Column(name = "width", length = 50)
	public String getWidth() {
		return this.width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	@Column(name = "height", length = 50)
	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	@Column(name = "unit_of_Dimension", length = 50)
	public String getUnitOfDimension() {
		return this.unitOfDimension;
	}

	public void setUnitOfDimension(String unitOfDimension) {
		this.unitOfDimension = unitOfDimension;
	}

	@Column(name = "product_hierarchy", length = 50)
	public String getProductHierarchy() {
		return this.productHierarchy;
	}

	public void setProductHierarchy(String productHierarchy) {
		this.productHierarchy = productHierarchy;
	}

	@Column(name = "net_change_costing", length = 50)
	public String getNetChangeCosting() {
		return this.netChangeCosting;
	}

	public void setNetChangeCosting(String netChangeCosting) {
		this.netChangeCosting = netChangeCosting;
	}

	@Column(name = "allowed_pkg_weight", length = 50)
	public String getAllowedPkgWeight() {
		return this.allowedPkgWeight;
	}

	public void setAllowedPkgWeight(String allowedPkgWeight) {
		this.allowedPkgWeight = allowedPkgWeight;
	}

	@Column(name = "allowed_pkg_volume", length = 50)
	public String getAllowedPkgVolume() {
		return this.allowedPkgVolume;
	}

	public void setAllowedPkgVolume(String allowedPkgVolume) {
		this.allowedPkgVolume = allowedPkgVolume;
	}

	@Column(name = "excess_wt_tolerance", length = 50)
	public String getExcessWtTolerance() {
		return this.excessWtTolerance;
	}

	public void setExcessWtTolerance(String excessWtTolerance) {
		this.excessWtTolerance = excessWtTolerance;
	}

	@Column(name = "excess_volume_tol", length = 50)
	public String getExcessVolumeTol() {
		return this.excessVolumeTol;
	}

	public void setExcessVolumeTol(String excessVolumeTol) {
		this.excessVolumeTol = excessVolumeTol;
	}

	@Column(name = "materia_is_configurable", length = 50)
	public String getMateriaIsConfigurable() {
		return this.materiaIsConfigurable;
	}

	public void setMateriaIsConfigurable(String materiaIsConfigurable) {
		this.materiaIsConfigurable = materiaIsConfigurable;
	}

	@Column(name = "batch_management", length = 50)
	public String getBatchManagement() {
		return this.batchManagement;
	}

	public void setBatchManagement(String batchManagement) {
		this.batchManagement = batchManagement;
	}

	@Column(name = "valid_from", length = 50)
	public String getValidFrom() {
		return this.validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	@Column(name = "valid_to", length = 50)
	public String getValidTo() {
		return this.validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	@Column(name = "price_band_category", length = 50)
	public String getPriceBandCategory() {
		return this.priceBandCategory;
	}

	public void setPriceBandCategory(String priceBandCategory) {
		this.priceBandCategory = priceBandCategory;
	}

	@Column(name = "material_category", length = 50)
	public String getMaterialCategory() {
		return this.materialCategory;
	}

	public void setMaterialCategory(String materialCategory) {
		this.materialCategory = materialCategory;
	}

	@Column(name = "purchasing_order_status", length = 50)
	public String getPurchasingOrderStatus() {
		return this.purchasingOrderStatus;
	}

	public void setPurchasingOrderStatus(String purchasingOrderStatus) {
		this.purchasingOrderStatus = purchasingOrderStatus;
	}

	@Column(name = "out_of_stock", length = 50)
	public String getOutOfStock() {
		return this.outOfStock;
	}

	public void setOutOfStock(String outOfStock) {
		this.outOfStock = outOfStock;
	}

	@Column(name = "tax_classification", length = 50)
	public String getTaxClassification() {
		return this.taxClassification;
	}

	public void setTaxClassification(String taxClassification) {
		this.taxClassification = taxClassification;
	}

	@Column(name = "catalog_profile", length = 50)
	public String getCatalogProfile() {
		return this.catalogProfile;
	}

	public void setCatalogProfile(String catalogProfile) {
		this.catalogProfile = catalogProfile;
	}

	@Column(name = "total_shelf_life", length = 50)
	public String getTotalShelfLife() {
		return this.totalShelfLife;
	}

	public void setTotalShelfLife(String totalShelfLife) {
		this.totalShelfLife = totalShelfLife;
	}

	@Column(name = "manufacturer_part_no", length = 50)
	public String getManufacturerPartNo() {
		return this.manufacturerPartNo;
	}

	public void setManufacturerPartNo(String manufacturerPartNo) {
		this.manufacturerPartNo = manufacturerPartNo;
	}

	@Column(name = "manufacturer", length = 50)
	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Column(name = "maximum_capacity", length = 50)
	public String getMaximumCapacity() {
		return this.maximumCapacity;
	}

	public void setMaximumCapacity(String maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
	}

	@Column(name = "overcapacity_toler", length = 50)
	public String getOvercapacityToler() {
		return this.overcapacityToler;
	}

	public void setOvercapacityToler(String overcapacityToler) {
		this.overcapacityToler = overcapacityToler;
	}

	@Column(name = "textile_composition_maintenance_active", length = 50)
	public String getTextileCompositionMaintenanceActive() {
		return this.textileCompositionMaintenanceActive;
	}

	public void setTextileCompositionMaintenanceActive(
			String textileCompositionMaintenanceActive) {
		this.textileCompositionMaintenanceActive = textileCompositionMaintenanceActive;
	}

	@Column(name = "season_usage", length = 50)
	public String getSeasonUsage() {
		return this.seasonUsage;
	}

	public void setSeasonUsage(String seasonUsage) {
		this.seasonUsage = seasonUsage;
	}

	@Column(name = "color", length = 50)
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Column(name = "main_size", length = 50)
	public String getMainSize() {
		return this.mainSize;
	}

	public void setMainSize(String mainSize) {
		this.mainSize = mainSize;
	}

	@Column(name = "second_size", length = 50)
	public String getSecondSize() {
		return this.secondSize;
	}

	public void setSecondSize(String secondSize) {
		this.secondSize = secondSize;
	}

	@Column(name = "free_charact_value", length = 50)
	public String getFreeCharactValue() {
		return this.freeCharactValue;
	}

	public void setFreeCharactValue(String freeCharactValue) {
		this.freeCharactValue = freeCharactValue;
	}

	@Column(name = "care_code", length = 50)
	public String getCareCode() {
		return this.careCode;
	}

	public void setCareCode(String careCode) {
		this.careCode = careCode;
	}

	@Column(name = "brand", length = 50)
	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Column(name = "material_name", length = 50)
	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	@Column(name = "rate", length = 50)
	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

}
