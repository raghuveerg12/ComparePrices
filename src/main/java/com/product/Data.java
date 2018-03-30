
package com.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "channels",
    "active",
    "bookTypeID",
    "Border_ID",
    "corpListPrice",
    "deweyDecimal",
    "Editorial_Book_Trim_Size",
    "English_Guided_Reading_Level",
    "epicBindingTypeDesc",
    "epicMajorProductClass",
    "epicProductSpecType",
    "epicProductTypeCode",
    "epicProductTypeDesc",
    "fictionNonfiction",
    "Golden_Record_Source",
    "id",
    "imageLinks",
    "link",
    "Page_Count",
    "Playing_Time_Min",
    "Product_Channels",
    "Owner",
    "productStatus",
    "Title",
    "Trade_Onix_Binding",
    "Trade_Onix_Imprint",
    "Trade_Onix_Publisher",
    "Trim_Size_Height",
    "Trim_Size_Length",
    "Trim_Size_Width",
    "weightPounds",
    "Word_Count",
    "Work_Channel",
    "workGenre",
    "workID",
    "workInterestAge",
    "workInterestGrades",
    "workSubject",
    "writingStyle",
    "publisher",
    "language",
    "guidedReadingLevelLow",
    "countryOfOriginCode",
    "countryOfOrigin",
    "epic30CharTitle",
    "harmonizedTariffSystemCode",
    "inkPaperIndicator",
    "safetyTestingRequired",
    "customerOrdersEnabled",
    "defaultBuyerNonCommandPlanner",
    "expenseItemIndicator",
    "inventoryAssetValue",
    "isProductPurchasable",
    "locationIdPrimaryVendor",
    "makeOrBuyProduct",
    "manufacturingBookTrimSize",
    "opusID",
    "cartonQuantity",
    "majorProductClassCode",
    "majorProductClassDesc",
    "epicTitle",
    "canadaMakeOrBuyProduct",
    "insideOutsideFlag",
    "majorProductClass",
    "oracleItemType",
    "isProductInventoriable",
    "ecmsPrimaryCoverImageFlag",
    "Planning_ISBN",
    "UPN",
    "ISBN_13",
    "GR_WEP_Series",
    "DRALevelLow",
    "SRCQuizzes",
    "ARQuizFlag",
    "GR_WEP_SubSeries",
    "ISBN_10",
    "LOCNumber",
    "PCD_Product_ID",
    "WEP_Property",
    "DRA_Level",
    "EBook_Enriched",
    "EPIC_Title_Grouping",
    "EPICTitleGroupEditionCode",
    "DRALevelRange",
    "GR_WE_Contributor_Text"
})
public class Data {

    @JsonProperty("channels")
    private Channels channels;
    @JsonProperty("active")
    private String active;
    @JsonProperty("bookTypeID")
    private String bookTypeID;
    @JsonProperty("Border_ID")
    private String borderID;
    @JsonProperty("corpListPrice")
    private String corpListPrice;
    @JsonProperty("deweyDecimal")
    private String deweyDecimal;
    @JsonProperty("Editorial_Book_Trim_Size")
    private String editorialBookTrimSize;
    @JsonProperty("English_Guided_Reading_Level")
    private String englishGuidedReadingLevel;
    @JsonProperty("epicBindingTypeDesc")
    private String epicBindingTypeDesc;
    @JsonProperty("epicMajorProductClass")
    private String epicMajorProductClass;
    @JsonProperty("epicProductSpecType")
    private String epicProductSpecType;
    @JsonProperty("epicProductTypeCode")
    private String epicProductTypeCode;
    @JsonProperty("epicProductTypeDesc")
    private String epicProductTypeDesc;
    @JsonProperty("fictionNonfiction")
    private String fictionNonfiction;
    @JsonProperty("Golden_Record_Source")
    private List<GoldenRecordSource> goldenRecordSource = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("imageLinks")
    private List<String> imageLinks = null;
    @JsonProperty("link")
    private String link;
    @JsonProperty("Page_Count")
    private String pageCount;
    @JsonProperty("Playing_Time_Min")
    private String playingTimeMin;
    @JsonProperty("Product_Channels")
    private List<String> productChannels = null;
    @JsonProperty("Owner")
    private String owner;
    @JsonProperty("productStatus")
    private String productStatus;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Trade_Onix_Binding")
    private String tradeOnixBinding;
    @JsonProperty("Trade_Onix_Imprint")
    private String tradeOnixImprint;
    @JsonProperty("Trade_Onix_Publisher")
    private String tradeOnixPublisher;
    @JsonProperty("Trim_Size_Height")
    private String trimSizeHeight;
    @JsonProperty("Trim_Size_Length")
    private String trimSizeLength;
    @JsonProperty("Trim_Size_Width")
    private String trimSizeWidth;
    @JsonProperty("weightPounds")
    private String weightPounds;
    @JsonProperty("Word_Count")
    private String wordCount;
    @JsonProperty("Work_Channel")
    private List<String> workChannel = null;
    @JsonProperty("workGenre")
    private List<WorkGenre> workGenre = null;
    @JsonProperty("workID")
    private String workID;
    @JsonProperty("workInterestAge")
    private List<String> workInterestAge = null;
    @JsonProperty("workInterestGrades")
    private List<String> workInterestGrades = null;
    @JsonProperty("workSubject")
    private List<WorkSubject> workSubject = null;
    @JsonProperty("writingStyle")
    private List<WritingStyle> writingStyle = null;
    @JsonProperty("publisher")
    private String publisher;
    @JsonProperty("language")
    private String language;
    @JsonProperty("guidedReadingLevelLow")
    private String guidedReadingLevelLow;
    @JsonProperty("countryOfOriginCode")
    private String countryOfOriginCode;
    @JsonProperty("countryOfOrigin")
    private String countryOfOrigin;
    @JsonProperty("epic30CharTitle")
    private String epic30CharTitle;
    @JsonProperty("harmonizedTariffSystemCode")
    private String harmonizedTariffSystemCode;
    @JsonProperty("inkPaperIndicator")
    private String inkPaperIndicator;
    @JsonProperty("safetyTestingRequired")
    private String safetyTestingRequired;
    @JsonProperty("customerOrdersEnabled")
    private String customerOrdersEnabled;
    @JsonProperty("defaultBuyerNonCommandPlanner")
    private String defaultBuyerNonCommandPlanner;
    @JsonProperty("expenseItemIndicator")
    private String expenseItemIndicator;
    @JsonProperty("inventoryAssetValue")
    private String inventoryAssetValue;
    @JsonProperty("isProductPurchasable")
    private String isProductPurchasable;
    @JsonProperty("locationIdPrimaryVendor")
    private String locationIdPrimaryVendor;
    @JsonProperty("makeOrBuyProduct")
    private String makeOrBuyProduct;
    @JsonProperty("manufacturingBookTrimSize")
    private String manufacturingBookTrimSize;
    @JsonProperty("opusID")
    private String opusID;
    @JsonProperty("cartonQuantity")
    private String cartonQuantity;
    @JsonProperty("majorProductClassCode")
    private String majorProductClassCode;
    @JsonProperty("majorProductClassDesc")
    private String majorProductClassDesc;
    @JsonProperty("epicTitle")
    private String epicTitle;
    @JsonProperty("canadaMakeOrBuyProduct")
    private String canadaMakeOrBuyProduct;
    @JsonProperty("insideOutsideFlag")
    private String insideOutsideFlag;
    @JsonProperty("majorProductClass")
    private String majorProductClass;
    @JsonProperty("oracleItemType")
    private String oracleItemType;
    @JsonProperty("isProductInventoriable")
    private String isProductInventoriable;
    @JsonProperty("ecmsPrimaryCoverImageFlag")
    private String ecmsPrimaryCoverImageFlag;
    @JsonProperty("Planning_ISBN")
    private String planningISBN;
    @JsonProperty("UPN")
    private String uPN;
    @JsonProperty("ISBN_13")
    private String iSBN13;
    @JsonProperty("GR_WEP_Series")
    private List<GRWEPSeries> gRWEPSeries = null;
    @JsonProperty("DRALevelLow")
    private String dRALevelLow;
    @JsonProperty("SRCQuizzes")
    private String sRCQuizzes;
    @JsonProperty("ARQuizFlag")
    private String aRQuizFlag;
    @JsonProperty("GR_WEP_SubSeries")
    private GRWEPSubSeries gRWEPSubSeries;
    @JsonProperty("ISBN_10")
    private String iSBN10;
    @JsonProperty("LOCNumber")
    private String lOCNumber;
    @JsonProperty("PCD_Product_ID")
    private String pCDProductID;
    @JsonProperty("WEP_Property")
    private List<WEPProperty> wEPProperty = null;
    @JsonProperty("DRA_Level")
    private String dRALevel;
    @JsonProperty("EBook_Enriched")
    private String eBookEnriched;
    @JsonProperty("EPIC_Title_Grouping")
    private String ePICTitleGrouping;
    @JsonProperty("EPICTitleGroupEditionCode")
    private String ePICTitleGroupEditionCode;
    @JsonProperty("DRALevelRange")
    private String dRALevelRange;
    @JsonProperty("GR_WE_Contributor_Text")
    private List<GRWEContributorText> gRWEContributorText = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("channels")
    public Channels getChannels() {
        return channels;
    }

    @JsonProperty("channels")
    public void setChannels(Channels channels) {
        this.channels = channels;
    }

    @JsonProperty("active")
    public String getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(String active) {
        this.active = active;
    }

    @JsonProperty("bookTypeID")
    public String getBookTypeID() {
        return bookTypeID;
    }

    @JsonProperty("bookTypeID")
    public void setBookTypeID(String bookTypeID) {
        this.bookTypeID = bookTypeID;
    }

    @JsonProperty("Border_ID")
    public String getBorderID() {
        return borderID;
    }

    @JsonProperty("Border_ID")
    public void setBorderID(String borderID) {
        this.borderID = borderID;
    }

    @JsonProperty("corpListPrice")
    public String getCorpListPrice() {
        return corpListPrice;
    }

    @JsonProperty("corpListPrice")
    public void setCorpListPrice(String corpListPrice) {
        this.corpListPrice = corpListPrice;
    }

    @JsonProperty("deweyDecimal")
    public String getDeweyDecimal() {
        return deweyDecimal;
    }

    @JsonProperty("deweyDecimal")
    public void setDeweyDecimal(String deweyDecimal) {
        this.deweyDecimal = deweyDecimal;
    }

    @JsonProperty("Editorial_Book_Trim_Size")
    public String getEditorialBookTrimSize() {
        return editorialBookTrimSize;
    }

    @JsonProperty("Editorial_Book_Trim_Size")
    public void setEditorialBookTrimSize(String editorialBookTrimSize) {
        this.editorialBookTrimSize = editorialBookTrimSize;
    }

    @JsonProperty("English_Guided_Reading_Level")
    public String getEnglishGuidedReadingLevel() {
        return englishGuidedReadingLevel;
    }

    @JsonProperty("English_Guided_Reading_Level")
    public void setEnglishGuidedReadingLevel(String englishGuidedReadingLevel) {
        this.englishGuidedReadingLevel = englishGuidedReadingLevel;
    }

    @JsonProperty("epicBindingTypeDesc")
    public String getEpicBindingTypeDesc() {
        return epicBindingTypeDesc;
    }

    @JsonProperty("epicBindingTypeDesc")
    public void setEpicBindingTypeDesc(String epicBindingTypeDesc) {
        this.epicBindingTypeDesc = epicBindingTypeDesc;
    }

    @JsonProperty("epicMajorProductClass")
    public String getEpicMajorProductClass() {
        return epicMajorProductClass;
    }

    @JsonProperty("epicMajorProductClass")
    public void setEpicMajorProductClass(String epicMajorProductClass) {
        this.epicMajorProductClass = epicMajorProductClass;
    }

    @JsonProperty("epicProductSpecType")
    public String getEpicProductSpecType() {
        return epicProductSpecType;
    }

    @JsonProperty("epicProductSpecType")
    public void setEpicProductSpecType(String epicProductSpecType) {
        this.epicProductSpecType = epicProductSpecType;
    }

    @JsonProperty("epicProductTypeCode")
    public String getEpicProductTypeCode() {
        return epicProductTypeCode;
    }

    @JsonProperty("epicProductTypeCode")
    public void setEpicProductTypeCode(String epicProductTypeCode) {
        this.epicProductTypeCode = epicProductTypeCode;
    }

    @JsonProperty("epicProductTypeDesc")
    public String getEpicProductTypeDesc() {
        return epicProductTypeDesc;
    }

    @JsonProperty("epicProductTypeDesc")
    public void setEpicProductTypeDesc(String epicProductTypeDesc) {
        this.epicProductTypeDesc = epicProductTypeDesc;
    }

    @JsonProperty("fictionNonfiction")
    public String getFictionNonfiction() {
        return fictionNonfiction;
    }

    @JsonProperty("fictionNonfiction")
    public void setFictionNonfiction(String fictionNonfiction) {
        this.fictionNonfiction = fictionNonfiction;
    }

    @JsonProperty("Golden_Record_Source")
    public List<GoldenRecordSource> getGoldenRecordSource() {
        return goldenRecordSource;
    }

    @JsonProperty("Golden_Record_Source")
    public void setGoldenRecordSource(List<GoldenRecordSource> goldenRecordSource) {
        this.goldenRecordSource = goldenRecordSource;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("imageLinks")
    public List<String> getImageLinks() {
        return imageLinks;
    }

    @JsonProperty("imageLinks")
    public void setImageLinks(List<String> imageLinks) {
        this.imageLinks = imageLinks;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("Page_Count")
    public String getPageCount() {
        return pageCount;
    }

    @JsonProperty("Page_Count")
    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    @JsonProperty("Playing_Time_Min")
    public String getPlayingTimeMin() {
        return playingTimeMin;
    }

    @JsonProperty("Playing_Time_Min")
    public void setPlayingTimeMin(String playingTimeMin) {
        this.playingTimeMin = playingTimeMin;
    }

    @JsonProperty("Product_Channels")
    public List<String> getProductChannels() {
        return productChannels;
    }

    @JsonProperty("Product_Channels")
    public void setProductChannels(List<String> productChannels) {
        this.productChannels = productChannels;
    }

    @JsonProperty("Owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("Owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("productStatus")
    public String getProductStatus() {
        return productStatus;
    }

    @JsonProperty("productStatus")
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("Trade_Onix_Binding")
    public String getTradeOnixBinding() {
        return tradeOnixBinding;
    }

    @JsonProperty("Trade_Onix_Binding")
    public void setTradeOnixBinding(String tradeOnixBinding) {
        this.tradeOnixBinding = tradeOnixBinding;
    }

    @JsonProperty("Trade_Onix_Imprint")
    public String getTradeOnixImprint() {
        return tradeOnixImprint;
    }

    @JsonProperty("Trade_Onix_Imprint")
    public void setTradeOnixImprint(String tradeOnixImprint) {
        this.tradeOnixImprint = tradeOnixImprint;
    }

    @JsonProperty("Trade_Onix_Publisher")
    public String getTradeOnixPublisher() {
        return tradeOnixPublisher;
    }

    @JsonProperty("Trade_Onix_Publisher")
    public void setTradeOnixPublisher(String tradeOnixPublisher) {
        this.tradeOnixPublisher = tradeOnixPublisher;
    }

    @JsonProperty("Trim_Size_Height")
    public String getTrimSizeHeight() {
        return trimSizeHeight;
    }

    @JsonProperty("Trim_Size_Height")
    public void setTrimSizeHeight(String trimSizeHeight) {
        this.trimSizeHeight = trimSizeHeight;
    }

    @JsonProperty("Trim_Size_Length")
    public String getTrimSizeLength() {
        return trimSizeLength;
    }

    @JsonProperty("Trim_Size_Length")
    public void setTrimSizeLength(String trimSizeLength) {
        this.trimSizeLength = trimSizeLength;
    }

    @JsonProperty("Trim_Size_Width")
    public String getTrimSizeWidth() {
        return trimSizeWidth;
    }

    @JsonProperty("Trim_Size_Width")
    public void setTrimSizeWidth(String trimSizeWidth) {
        this.trimSizeWidth = trimSizeWidth;
    }

    @JsonProperty("weightPounds")
    public String getWeightPounds() {
        return weightPounds;
    }

    @JsonProperty("weightPounds")
    public void setWeightPounds(String weightPounds) {
        this.weightPounds = weightPounds;
    }

    @JsonProperty("Word_Count")
    public String getWordCount() {
        return wordCount;
    }

    @JsonProperty("Word_Count")
    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }

    @JsonProperty("Work_Channel")
    public List<String> getWorkChannel() {
        return workChannel;
    }

    @JsonProperty("Work_Channel")
    public void setWorkChannel(List<String> workChannel) {
        this.workChannel = workChannel;
    }

    @JsonProperty("workGenre")
    public List<WorkGenre> getWorkGenre() {
        return workGenre;
    }

    @JsonProperty("workGenre")
    public void setWorkGenre(List<WorkGenre> workGenre) {
        this.workGenre = workGenre;
    }

    @JsonProperty("workID")
    public String getWorkID() {
        return workID;
    }

    @JsonProperty("workID")
    public void setWorkID(String workID) {
        this.workID = workID;
    }

    @JsonProperty("workInterestAge")
    public List<String> getWorkInterestAge() {
        return workInterestAge;
    }

    @JsonProperty("workInterestAge")
    public void setWorkInterestAge(List<String> workInterestAge) {
        this.workInterestAge = workInterestAge;
    }

    @JsonProperty("workInterestGrades")
    public List<String> getWorkInterestGrades() {
        return workInterestGrades;
    }

    @JsonProperty("workInterestGrades")
    public void setWorkInterestGrades(List<String> workInterestGrades) {
        this.workInterestGrades = workInterestGrades;
    }

    @JsonProperty("workSubject")
    public List<WorkSubject> getWorkSubject() {
        return workSubject;
    }

    @JsonProperty("workSubject")
    public void setWorkSubject(List<WorkSubject> workSubject) {
        this.workSubject = workSubject;
    }

    @JsonProperty("writingStyle")
    public List<WritingStyle> getWritingStyle() {
        return writingStyle;
    }

    @JsonProperty("writingStyle")
    public void setWritingStyle(List<WritingStyle> writingStyle) {
        this.writingStyle = writingStyle;
    }

    @JsonProperty("publisher")
    public String getPublisher() {
        return publisher;
    }

    @JsonProperty("publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("guidedReadingLevelLow")
    public String getGuidedReadingLevelLow() {
        return guidedReadingLevelLow;
    }

    @JsonProperty("guidedReadingLevelLow")
    public void setGuidedReadingLevelLow(String guidedReadingLevelLow) {
        this.guidedReadingLevelLow = guidedReadingLevelLow;
    }

    @JsonProperty("countryOfOriginCode")
    public String getCountryOfOriginCode() {
        return countryOfOriginCode;
    }

    @JsonProperty("countryOfOriginCode")
    public void setCountryOfOriginCode(String countryOfOriginCode) {
        this.countryOfOriginCode = countryOfOriginCode;
    }

    @JsonProperty("countryOfOrigin")
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @JsonProperty("countryOfOrigin")
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @JsonProperty("epic30CharTitle")
    public String getEpic30CharTitle() {
        return epic30CharTitle;
    }

    @JsonProperty("epic30CharTitle")
    public void setEpic30CharTitle(String epic30CharTitle) {
        this.epic30CharTitle = epic30CharTitle;
    }

    @JsonProperty("harmonizedTariffSystemCode")
    public String getHarmonizedTariffSystemCode() {
        return harmonizedTariffSystemCode;
    }

    @JsonProperty("harmonizedTariffSystemCode")
    public void setHarmonizedTariffSystemCode(String harmonizedTariffSystemCode) {
        this.harmonizedTariffSystemCode = harmonizedTariffSystemCode;
    }

    @JsonProperty("inkPaperIndicator")
    public String getInkPaperIndicator() {
        return inkPaperIndicator;
    }

    @JsonProperty("inkPaperIndicator")
    public void setInkPaperIndicator(String inkPaperIndicator) {
        this.inkPaperIndicator = inkPaperIndicator;
    }

    @JsonProperty("safetyTestingRequired")
    public String getSafetyTestingRequired() {
        return safetyTestingRequired;
    }

    @JsonProperty("safetyTestingRequired")
    public void setSafetyTestingRequired(String safetyTestingRequired) {
        this.safetyTestingRequired = safetyTestingRequired;
    }

    @JsonProperty("customerOrdersEnabled")
    public String getCustomerOrdersEnabled() {
        return customerOrdersEnabled;
    }

    @JsonProperty("customerOrdersEnabled")
    public void setCustomerOrdersEnabled(String customerOrdersEnabled) {
        this.customerOrdersEnabled = customerOrdersEnabled;
    }

    @JsonProperty("defaultBuyerNonCommandPlanner")
    public String getDefaultBuyerNonCommandPlanner() {
        return defaultBuyerNonCommandPlanner;
    }

    @JsonProperty("defaultBuyerNonCommandPlanner")
    public void setDefaultBuyerNonCommandPlanner(String defaultBuyerNonCommandPlanner) {
        this.defaultBuyerNonCommandPlanner = defaultBuyerNonCommandPlanner;
    }

    @JsonProperty("expenseItemIndicator")
    public String getExpenseItemIndicator() {
        return expenseItemIndicator;
    }

    @JsonProperty("expenseItemIndicator")
    public void setExpenseItemIndicator(String expenseItemIndicator) {
        this.expenseItemIndicator = expenseItemIndicator;
    }

    @JsonProperty("inventoryAssetValue")
    public String getInventoryAssetValue() {
        return inventoryAssetValue;
    }

    @JsonProperty("inventoryAssetValue")
    public void setInventoryAssetValue(String inventoryAssetValue) {
        this.inventoryAssetValue = inventoryAssetValue;
    }

    @JsonProperty("isProductPurchasable")
    public String getIsProductPurchasable() {
        return isProductPurchasable;
    }

    @JsonProperty("isProductPurchasable")
    public void setIsProductPurchasable(String isProductPurchasable) {
        this.isProductPurchasable = isProductPurchasable;
    }

    @JsonProperty("locationIdPrimaryVendor")
    public String getLocationIdPrimaryVendor() {
        return locationIdPrimaryVendor;
    }

    @JsonProperty("locationIdPrimaryVendor")
    public void setLocationIdPrimaryVendor(String locationIdPrimaryVendor) {
        this.locationIdPrimaryVendor = locationIdPrimaryVendor;
    }

    @JsonProperty("makeOrBuyProduct")
    public String getMakeOrBuyProduct() {
        return makeOrBuyProduct;
    }

    @JsonProperty("makeOrBuyProduct")
    public void setMakeOrBuyProduct(String makeOrBuyProduct) {
        this.makeOrBuyProduct = makeOrBuyProduct;
    }

    @JsonProperty("manufacturingBookTrimSize")
    public String getManufacturingBookTrimSize() {
        return manufacturingBookTrimSize;
    }

    @JsonProperty("manufacturingBookTrimSize")
    public void setManufacturingBookTrimSize(String manufacturingBookTrimSize) {
        this.manufacturingBookTrimSize = manufacturingBookTrimSize;
    }

    @JsonProperty("opusID")
    public String getOpusID() {
        return opusID;
    }

    @JsonProperty("opusID")
    public void setOpusID(String opusID) {
        this.opusID = opusID;
    }

    @JsonProperty("cartonQuantity")
    public String getCartonQuantity() {
        return cartonQuantity;
    }

    @JsonProperty("cartonQuantity")
    public void setCartonQuantity(String cartonQuantity) {
        this.cartonQuantity = cartonQuantity;
    }

    @JsonProperty("majorProductClassCode")
    public String getMajorProductClassCode() {
        return majorProductClassCode;
    }

    @JsonProperty("majorProductClassCode")
    public void setMajorProductClassCode(String majorProductClassCode) {
        this.majorProductClassCode = majorProductClassCode;
    }

    @JsonProperty("majorProductClassDesc")
    public String getMajorProductClassDesc() {
        return majorProductClassDesc;
    }

    @JsonProperty("majorProductClassDesc")
    public void setMajorProductClassDesc(String majorProductClassDesc) {
        this.majorProductClassDesc = majorProductClassDesc;
    }

    @JsonProperty("epicTitle")
    public String getEpicTitle() {
        return epicTitle;
    }

    @JsonProperty("epicTitle")
    public void setEpicTitle(String epicTitle) {
        this.epicTitle = epicTitle;
    }

    @JsonProperty("canadaMakeOrBuyProduct")
    public String getCanadaMakeOrBuyProduct() {
        return canadaMakeOrBuyProduct;
    }

    @JsonProperty("canadaMakeOrBuyProduct")
    public void setCanadaMakeOrBuyProduct(String canadaMakeOrBuyProduct) {
        this.canadaMakeOrBuyProduct = canadaMakeOrBuyProduct;
    }

    @JsonProperty("insideOutsideFlag")
    public String getInsideOutsideFlag() {
        return insideOutsideFlag;
    }

    @JsonProperty("insideOutsideFlag")
    public void setInsideOutsideFlag(String insideOutsideFlag) {
        this.insideOutsideFlag = insideOutsideFlag;
    }

    @JsonProperty("majorProductClass")
    public String getMajorProductClass() {
        return majorProductClass;
    }

    @JsonProperty("majorProductClass")
    public void setMajorProductClass(String majorProductClass) {
        this.majorProductClass = majorProductClass;
    }

    @JsonProperty("oracleItemType")
    public String getOracleItemType() {
        return oracleItemType;
    }

    @JsonProperty("oracleItemType")
    public void setOracleItemType(String oracleItemType) {
        this.oracleItemType = oracleItemType;
    }

    @JsonProperty("isProductInventoriable")
    public String getIsProductInventoriable() {
        return isProductInventoriable;
    }

    @JsonProperty("isProductInventoriable")
    public void setIsProductInventoriable(String isProductInventoriable) {
        this.isProductInventoriable = isProductInventoriable;
    }

    @JsonProperty("ecmsPrimaryCoverImageFlag")
    public String getEcmsPrimaryCoverImageFlag() {
        return ecmsPrimaryCoverImageFlag;
    }

    @JsonProperty("ecmsPrimaryCoverImageFlag")
    public void setEcmsPrimaryCoverImageFlag(String ecmsPrimaryCoverImageFlag) {
        this.ecmsPrimaryCoverImageFlag = ecmsPrimaryCoverImageFlag;
    }

    @JsonProperty("Planning_ISBN")
    public String getPlanningISBN() {
        return planningISBN;
    }

    @JsonProperty("Planning_ISBN")
    public void setPlanningISBN(String planningISBN) {
        this.planningISBN = planningISBN;
    }

    @JsonProperty("UPN")
    public String getUPN() {
        return uPN;
    }

    @JsonProperty("UPN")
    public void setUPN(String uPN) {
        this.uPN = uPN;
    }

    @JsonProperty("ISBN_13")
    public String getISBN13() {
        return iSBN13;
    }

    @JsonProperty("ISBN_13")
    public void setISBN13(String iSBN13) {
        this.iSBN13 = iSBN13;
    }

    @JsonProperty("GR_WEP_Series")
    public List<GRWEPSeries> getGRWEPSeries() {
        return gRWEPSeries;
    }

    @JsonProperty("GR_WEP_Series")
    public void setGRWEPSeries(List<GRWEPSeries> gRWEPSeries) {
        this.gRWEPSeries = gRWEPSeries;
    }

    @JsonProperty("DRALevelLow")
    public String getDRALevelLow() {
        return dRALevelLow;
    }

    @JsonProperty("DRALevelLow")
    public void setDRALevelLow(String dRALevelLow) {
        this.dRALevelLow = dRALevelLow;
    }

    @JsonProperty("SRCQuizzes")
    public String getSRCQuizzes() {
        return sRCQuizzes;
    }

    @JsonProperty("SRCQuizzes")
    public void setSRCQuizzes(String sRCQuizzes) {
        this.sRCQuizzes = sRCQuizzes;
    }

    @JsonProperty("ARQuizFlag")
    public String getARQuizFlag() {
        return aRQuizFlag;
    }

    @JsonProperty("ARQuizFlag")
    public void setARQuizFlag(String aRQuizFlag) {
        this.aRQuizFlag = aRQuizFlag;
    }

    @JsonProperty("GR_WEP_SubSeries")
    public GRWEPSubSeries getGRWEPSubSeries() {
        return gRWEPSubSeries;
    }

    @JsonProperty("GR_WEP_SubSeries")
    public void setGRWEPSubSeries(GRWEPSubSeries gRWEPSubSeries) {
        this.gRWEPSubSeries = gRWEPSubSeries;
    }

    @JsonProperty("ISBN_10")
    public String getISBN10() {
        return iSBN10;
    }

    @JsonProperty("ISBN_10")
    public void setISBN10(String iSBN10) {
        this.iSBN10 = iSBN10;
    }

    @JsonProperty("LOCNumber")
    public String getLOCNumber() {
        return lOCNumber;
    }

    @JsonProperty("LOCNumber")
    public void setLOCNumber(String lOCNumber) {
        this.lOCNumber = lOCNumber;
    }

    @JsonProperty("PCD_Product_ID")
    public String getPCDProductID() {
        return pCDProductID;
    }

    @JsonProperty("PCD_Product_ID")
    public void setPCDProductID(String pCDProductID) {
        this.pCDProductID = pCDProductID;
    }

    @JsonProperty("WEP_Property")
    public List<WEPProperty> getWEPProperty() {
        return wEPProperty;
    }

    @JsonProperty("WEP_Property")
    public void setWEPProperty(List<WEPProperty> wEPProperty) {
        this.wEPProperty = wEPProperty;
    }

    @JsonProperty("DRA_Level")
    public String getDRALevel() {
        return dRALevel;
    }

    @JsonProperty("DRA_Level")
    public void setDRALevel(String dRALevel) {
        this.dRALevel = dRALevel;
    }

    @JsonProperty("EBook_Enriched")
    public String getEBookEnriched() {
        return eBookEnriched;
    }

    @JsonProperty("EBook_Enriched")
    public void setEBookEnriched(String eBookEnriched) {
        this.eBookEnriched = eBookEnriched;
    }

    @JsonProperty("EPIC_Title_Grouping")
    public String getEPICTitleGrouping() {
        return ePICTitleGrouping;
    }

    @JsonProperty("EPIC_Title_Grouping")
    public void setEPICTitleGrouping(String ePICTitleGrouping) {
        this.ePICTitleGrouping = ePICTitleGrouping;
    }

    @JsonProperty("EPICTitleGroupEditionCode")
    public String getEPICTitleGroupEditionCode() {
        return ePICTitleGroupEditionCode;
    }

    @JsonProperty("EPICTitleGroupEditionCode")
    public void setEPICTitleGroupEditionCode(String ePICTitleGroupEditionCode) {
        this.ePICTitleGroupEditionCode = ePICTitleGroupEditionCode;
    }

    @JsonProperty("DRALevelRange")
    public String getDRALevelRange() {
        return dRALevelRange;
    }

    @JsonProperty("DRALevelRange")
    public void setDRALevelRange(String dRALevelRange) {
        this.dRALevelRange = dRALevelRange;
    }

    @JsonProperty("GR_WE_Contributor_Text")
    public List<GRWEContributorText> getGRWEContributorText() {
        return gRWEContributorText;
    }

    @JsonProperty("GR_WE_Contributor_Text")
    public void setGRWEContributorText(List<GRWEContributorText> gRWEContributorText) {
        this.gRWEContributorText = gRWEContributorText;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
