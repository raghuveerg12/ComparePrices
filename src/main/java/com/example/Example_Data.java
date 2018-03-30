
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jcr:primaryType",
    "BorderID",
    "Height",
    "ISBN13",
    "LowAge",
    "Subtitle",
    "NumberofSeeInsidePages",
    "Themes",
    "LowGrade",
    "SpanishHighGuidedReadingLevel",
    "LegacyProductType",
    "ShowLexile",
    "HighAge",
    "Weight",
    "WorkID",
    "VendorItem",
    "Language",
    "Reviews",
    "DisplaySubtitleinDroplet",
    "HighAcceleratedReader",
    "ManufacturerPartNumber",
    "active",
    "HighLexileLevel",
    "HighDRALevel",
    "LowLexileLevel",
    "ShowSpanishGuidedReadingLevel",
    "SmallImage",
    "Multimedia",
    "HighGuidedReadingLevel",
    "ExtraSmallImage",
    "AwardList",
    "NumberofAlternateImages",
    "ShowCCSSLexile",
    "TeacherTips",
    "FictionType",
    "ShowGuidedReadingLevel",
    "SpanishLowGuidedReadingLevel",
    "BundleType",
    "LowGuidedReadingLevel",
    "FileFormat",
    "EndorsementReview",
    "Publisher",
    "ShowDRALevel",
    "LowAcceleratedReader",
    "Imprint",
    "UNITS_SOLD",
    "ShowACR",
    "Composer",
    "LegacyTESku",
    "FormatDescription",
    "SeeInsideDescription",
    "OnlineResources",
    "LargeImage",
    "UnitCost",
    "ExtraLargeImage",
    "StoreID",
    "Subject",
    "Taxonomy",
    "CustomGrade",
    "SaleMessage",
    "Fund",
    "ISBN",
    "Rank",
    "ECMSPrimaryCoverImageFlag",
    "Resources",
    "OurPrice",
    "Audio",
    "Brand",
    "Class",
    "Depth",
    "Dewey",
    "Genre",
    "ShowDewey",
    "Pages",
    "Shops",
    "Title",
    "Width",
    "ShowSpanishDRALevel",
    "LowDRALevel",
    "ProductType",
    "SpanishLowDRALevel",
    "ePageISBNs",
    "Translator",
    "CCSSLexile",
    "Illustrator",
    "PublicationDate",
    "Otherformat",
    "SpanishHighDRALevel",
    "Keywords",
    "TeachingFormat",
    "ListPrice",
    "LongDescription",
    "SpecialNote",
    "AuthorResearch",
    "InstructionalProgram",
    "ProductID",
    "Photographsby",
    "ContentUnits",
    "SystemRequirements",
    "Boutiques",
    "OtherLanguages",
    "Introductionby",
    "UserBenefits",
    "ProductEmail",
    "parentId",
    "CharactersandSeries",
    "Searchable",
    "HighGrade",
    "BudgetCode",
    "ViewableFlag",
    "Compiledby",
    "ShowSpanishLexile",
    "ProductEndDate",
    "ProductStartDate",
    "ShowBonusBook",
    "CollectionTitles",
    "SaleEndDate",
    "CrossSellISBNs",
    "SOLD_IN_TBW",
    "SaleStartDate",
    "DisplayTitle",
    "AvailabilityDate",
    "NumberinSeries",
    "ComponentListing",
    "NumberofIWBPreviewImages",
    "SalePrice",
    "REALISBNs",
    "Platform",
    "Author",
    "SpanishHighLexileLevel",
    "ShowLanguage",
    "Vendor1",
    "Vendor2",
    "InventoryThreshold",
    "SpanishLowLexileLevel",
    "Narrator",
    "Editor",
    "SkipInventory"
})
public class Example_Data {

    @JsonProperty("jcr:primaryType")
    private String jcrPrimaryType;
    @JsonProperty("BorderID")
    private String borderID;
    @JsonProperty("Height")
    private String height;
    @JsonProperty("ISBN13")
    private String iSBN13;
    @JsonProperty("LowAge")
    private String lowAge;
    @JsonProperty("Subtitle")
    private String subtitle;
    @JsonProperty("NumberofSeeInsidePages")
    private String numberofSeeInsidePages;
    @JsonProperty("Themes")
    private String themes;
    @JsonProperty("LowGrade")
    private String lowGrade;
    @JsonProperty("SpanishHighGuidedReadingLevel")
    private String spanishHighGuidedReadingLevel;
    @JsonProperty("LegacyProductType")
    private String legacyProductType;
    @JsonProperty("ShowLexile")
    private String showLexile;
    @JsonProperty("HighAge")
    private String highAge;
    @JsonProperty("Weight")
    private String weight;
    @JsonProperty("WorkID")
    private String workID;
    @JsonProperty("VendorItem")
    private String vendorItem;
    @JsonProperty("Language")
    private String language;
    @JsonProperty("Reviews")
    private String reviews;
    @JsonProperty("DisplaySubtitleinDroplet")
    private String displaySubtitleinDroplet;
    @JsonProperty("HighAcceleratedReader")
    private String highAcceleratedReader;
    @JsonProperty("ManufacturerPartNumber")
    private String manufacturerPartNumber;
    @JsonProperty("active")
    private String active;
    @JsonProperty("HighLexileLevel")
    private String highLexileLevel;
    @JsonProperty("HighDRALevel")
    private String highDRALevel;
    @JsonProperty("LowLexileLevel")
    private String lowLexileLevel;
    @JsonProperty("ShowSpanishGuidedReadingLevel")
    private String showSpanishGuidedReadingLevel;
    @JsonProperty("SmallImage")
    private String smallImage;
    @JsonProperty("Multimedia")
    private String multimedia;
    @JsonProperty("HighGuidedReadingLevel")
    private String highGuidedReadingLevel;
    @JsonProperty("ExtraSmallImage")
    private String extraSmallImage;
    @JsonProperty("AwardList")
    private String awardList;
    @JsonProperty("NumberofAlternateImages")
    private String numberofAlternateImages;
    @JsonProperty("ShowCCSSLexile")
    private String showCCSSLexile;
    @JsonProperty("TeacherTips")
    private String teacherTips;
    @JsonProperty("FictionType")
    private String fictionType;
    @JsonProperty("ShowGuidedReadingLevel")
    private String showGuidedReadingLevel;
    @JsonProperty("SpanishLowGuidedReadingLevel")
    private String spanishLowGuidedReadingLevel;
    @JsonProperty("BundleType")
    private String bundleType;
    @JsonProperty("LowGuidedReadingLevel")
    private String lowGuidedReadingLevel;
    @JsonProperty("FileFormat")
    private String fileFormat;
    @JsonProperty("EndorsementReview")
    private String endorsementReview;
    @JsonProperty("Publisher")
    private String publisher;
    @JsonProperty("ShowDRALevel")
    private String showDRALevel;
    @JsonProperty("LowAcceleratedReader")
    private String lowAcceleratedReader;
    @JsonProperty("Imprint")
    private String imprint;
    @JsonProperty("UNITS_SOLD")
    private String uNITSSOLD;
    @JsonProperty("ShowACR")
    private String showACR;
    @JsonProperty("Composer")
    private String composer;
    @JsonProperty("LegacyTESku")
    private String legacyTESku;
    @JsonProperty("FormatDescription")
    private String formatDescription;
    @JsonProperty("SeeInsideDescription")
    private String seeInsideDescription;
    @JsonProperty("OnlineResources")
    private String onlineResources;
    @JsonProperty("LargeImage")
    private String largeImage;
    @JsonProperty("UnitCost")
    private String unitCost;
    @JsonProperty("ExtraLargeImage")
    private String extraLargeImage;
    @JsonProperty("StoreID")
    private String storeID;
    @JsonProperty("Subject")
    private String subject;
    @JsonProperty("Taxonomy")
    private String taxonomy;
    @JsonProperty("CustomGrade")
    private String customGrade;
    @JsonProperty("SaleMessage")
    private String saleMessage;
    @JsonProperty("Fund")
    private String fund;
    @JsonProperty("ISBN")
    private String iSBN;
    @JsonProperty("Rank")
    private String rank;
    @JsonProperty("ECMSPrimaryCoverImageFlag")
    private String eCMSPrimaryCoverImageFlag;
    @JsonProperty("Resources")
    private String resources;
    @JsonProperty("OurPrice")
    private String ourPrice;
    @JsonProperty("Audio")
    private String audio;
    @JsonProperty("Brand")
    private String brand;
    @JsonProperty("Class")
    private String _class;
    @JsonProperty("Depth")
    private String depth;
    @JsonProperty("Dewey")
    private String dewey;
    @JsonProperty("Genre")
    private String genre;
    @JsonProperty("ShowDewey")
    private String showDewey;
    @JsonProperty("Pages")
    private String pages;
    @JsonProperty("Shops")
    private String shops;
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Width")
    private String width;
    @JsonProperty("ShowSpanishDRALevel")
    private String showSpanishDRALevel;
    @JsonProperty("LowDRALevel")
    private String lowDRALevel;
    @JsonProperty("ProductType")
    private String productType;
    @JsonProperty("SpanishLowDRALevel")
    private String spanishLowDRALevel;
    @JsonProperty("ePageISBNs")
    private String ePageISBNs;
    @JsonProperty("Translator")
    private String translator;
    @JsonProperty("CCSSLexile")
    private String cCSSLexile;
    @JsonProperty("Illustrator")
    private String illustrator;
    @JsonProperty("PublicationDate")
    private String publicationDate;
    @JsonProperty("Otherformat")
    private String otherformat;
    @JsonProperty("SpanishHighDRALevel")
    private String spanishHighDRALevel;
    @JsonProperty("Keywords")
    private String keywords;
    @JsonProperty("TeachingFormat")
    private String teachingFormat;
    @JsonProperty("ListPrice")
    private String listPrice;
    @JsonProperty("LongDescription")
    private String longDescription;
    @JsonProperty("SpecialNote")
    private String specialNote;
    @JsonProperty("AuthorResearch")
    private String authorResearch;
    @JsonProperty("InstructionalProgram")
    private String instructionalProgram;
    @JsonProperty("ProductID")
    private String productID;
    @JsonProperty("Photographsby")
    private String photographsby;
    @JsonProperty("ContentUnits")
    private String contentUnits;
    @JsonProperty("SystemRequirements")
    private String systemRequirements;
    @JsonProperty("Boutiques")
    private String boutiques;
    @JsonProperty("OtherLanguages")
    private String otherLanguages;
    @JsonProperty("Introductionby")
    private String introductionby;
    @JsonProperty("UserBenefits")
    private String userBenefits;
    @JsonProperty("ProductEmail")
    private String productEmail;
    @JsonProperty("parentId")
    private String parentId;
    @JsonProperty("CharactersandSeries")
    private String charactersandSeries;
    @JsonProperty("Searchable")
    private String searchable;
    @JsonProperty("HighGrade")
    private String highGrade;
    @JsonProperty("BudgetCode")
    private String budgetCode;
    @JsonProperty("ViewableFlag")
    private String viewableFlag;
    @JsonProperty("Compiledby")
    private String compiledby;
    @JsonProperty("ShowSpanishLexile")
    private String showSpanishLexile;
    @JsonProperty("ProductEndDate")
    private String productEndDate;
    @JsonProperty("ProductStartDate")
    private String productStartDate;
    @JsonProperty("ShowBonusBook")
    private String showBonusBook;
    @JsonProperty("CollectionTitles")
    private String collectionTitles;
    @JsonProperty("SaleEndDate")
    private String saleEndDate;
    @JsonProperty("CrossSellISBNs")
    private String crossSellISBNs;
    @JsonProperty("SOLD_IN_TBW")
    private String sOLDINTBW;
    @JsonProperty("SaleStartDate")
    private String saleStartDate;
    @JsonProperty("DisplayTitle")
    private String displayTitle;
    @JsonProperty("AvailabilityDate")
    private String availabilityDate;
    @JsonProperty("NumberinSeries")
    private String numberinSeries;
    @JsonProperty("ComponentListing")
    private String componentListing;
    @JsonProperty("NumberofIWBPreviewImages")
    private String numberofIWBPreviewImages;
    @JsonProperty("SalePrice")
    private String salePrice;
    @JsonProperty("REALISBNs")
    private String rEALISBNs;
    @JsonProperty("Platform")
    private String platform;
    @JsonProperty("Author")
    private String author;
    @JsonProperty("SpanishHighLexileLevel")
    private String spanishHighLexileLevel;
    @JsonProperty("ShowLanguage")
    private String showLanguage;
    @JsonProperty("Vendor1")
    private String vendor1;
    @JsonProperty("Vendor2")
    private String vendor2;
    @JsonProperty("InventoryThreshold")
    private String inventoryThreshold;
    @JsonProperty("SpanishLowLexileLevel")
    private String spanishLowLexileLevel;
    @JsonProperty("Narrator")
    private String narrator;
    @JsonProperty("Editor")
    private String editor;
    @JsonProperty("SkipInventory")
    private String skipInventory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("jcr:primaryType")
    public String getJcrPrimaryType() {
        return jcrPrimaryType;
    }

    @JsonProperty("jcr:primaryType")
    public void setJcrPrimaryType(String jcrPrimaryType) {
        this.jcrPrimaryType = jcrPrimaryType;
    }

    @JsonProperty("BorderID")
    public String getBorderID() {
        return borderID;
    }

    @JsonProperty("BorderID")
    public void setBorderID(String borderID) {
        this.borderID = borderID;
    }

    @JsonProperty("Height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("Height")
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty("ISBN13")
    public String getISBN13() {
        return iSBN13;
    }

    @JsonProperty("ISBN13")
    public void setISBN13(String iSBN13) {
        this.iSBN13 = iSBN13;
    }

    @JsonProperty("LowAge")
    public String getLowAge() {
        return lowAge;
    }

    @JsonProperty("LowAge")
    public void setLowAge(String lowAge) {
        this.lowAge = lowAge;
    }

    @JsonProperty("Subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("Subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("NumberofSeeInsidePages")
    public String getNumberofSeeInsidePages() {
        return numberofSeeInsidePages;
    }

    @JsonProperty("NumberofSeeInsidePages")
    public void setNumberofSeeInsidePages(String numberofSeeInsidePages) {
        this.numberofSeeInsidePages = numberofSeeInsidePages;
    }

    @JsonProperty("Themes")
    public String getThemes() {
        return themes;
    }

    @JsonProperty("Themes")
    public void setThemes(String themes) {
        this.themes = themes;
    }

    @JsonProperty("LowGrade")
    public String getLowGrade() {
        return lowGrade;
    }

    @JsonProperty("LowGrade")
    public void setLowGrade(String lowGrade) {
        this.lowGrade = lowGrade;
    }

    @JsonProperty("SpanishHighGuidedReadingLevel")
    public String getSpanishHighGuidedReadingLevel() {
        return spanishHighGuidedReadingLevel;
    }

    @JsonProperty("SpanishHighGuidedReadingLevel")
    public void setSpanishHighGuidedReadingLevel(String spanishHighGuidedReadingLevel) {
        this.spanishHighGuidedReadingLevel = spanishHighGuidedReadingLevel;
    }

    @JsonProperty("LegacyProductType")
    public String getLegacyProductType() {
        return legacyProductType;
    }

    @JsonProperty("LegacyProductType")
    public void setLegacyProductType(String legacyProductType) {
        this.legacyProductType = legacyProductType;
    }

    @JsonProperty("ShowLexile")
    public String getShowLexile() {
        return showLexile;
    }

    @JsonProperty("ShowLexile")
    public void setShowLexile(String showLexile) {
        this.showLexile = showLexile;
    }

    @JsonProperty("HighAge")
    public String getHighAge() {
        return highAge;
    }

    @JsonProperty("HighAge")
    public void setHighAge(String highAge) {
        this.highAge = highAge;
    }

    @JsonProperty("Weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("Weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @JsonProperty("WorkID")
    public String getWorkID() {
        return workID;
    }

    @JsonProperty("WorkID")
    public void setWorkID(String workID) {
        this.workID = workID;
    }

    @JsonProperty("VendorItem")
    public String getVendorItem() {
        return vendorItem;
    }

    @JsonProperty("VendorItem")
    public void setVendorItem(String vendorItem) {
        this.vendorItem = vendorItem;
    }

    @JsonProperty("Language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("Language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("Reviews")
    public String getReviews() {
        return reviews;
    }

    @JsonProperty("Reviews")
    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    @JsonProperty("DisplaySubtitleinDroplet")
    public String getDisplaySubtitleinDroplet() {
        return displaySubtitleinDroplet;
    }

    @JsonProperty("DisplaySubtitleinDroplet")
    public void setDisplaySubtitleinDroplet(String displaySubtitleinDroplet) {
        this.displaySubtitleinDroplet = displaySubtitleinDroplet;
    }

    @JsonProperty("HighAcceleratedReader")
    public String getHighAcceleratedReader() {
        return highAcceleratedReader;
    }

    @JsonProperty("HighAcceleratedReader")
    public void setHighAcceleratedReader(String highAcceleratedReader) {
        this.highAcceleratedReader = highAcceleratedReader;
    }

    @JsonProperty("ManufacturerPartNumber")
    public String getManufacturerPartNumber() {
        return manufacturerPartNumber;
    }

    @JsonProperty("ManufacturerPartNumber")
    public void setManufacturerPartNumber(String manufacturerPartNumber) {
        this.manufacturerPartNumber = manufacturerPartNumber;
    }

    @JsonProperty("active")
    public String getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(String active) {
        this.active = active;
    }

    @JsonProperty("HighLexileLevel")
    public String getHighLexileLevel() {
        return highLexileLevel;
    }

    @JsonProperty("HighLexileLevel")
    public void setHighLexileLevel(String highLexileLevel) {
        this.highLexileLevel = highLexileLevel;
    }

    @JsonProperty("HighDRALevel")
    public String getHighDRALevel() {
        return highDRALevel;
    }

    @JsonProperty("HighDRALevel")
    public void setHighDRALevel(String highDRALevel) {
        this.highDRALevel = highDRALevel;
    }

    @JsonProperty("LowLexileLevel")
    public String getLowLexileLevel() {
        return lowLexileLevel;
    }

    @JsonProperty("LowLexileLevel")
    public void setLowLexileLevel(String lowLexileLevel) {
        this.lowLexileLevel = lowLexileLevel;
    }

    @JsonProperty("ShowSpanishGuidedReadingLevel")
    public String getShowSpanishGuidedReadingLevel() {
        return showSpanishGuidedReadingLevel;
    }

    @JsonProperty("ShowSpanishGuidedReadingLevel")
    public void setShowSpanishGuidedReadingLevel(String showSpanishGuidedReadingLevel) {
        this.showSpanishGuidedReadingLevel = showSpanishGuidedReadingLevel;
    }

    @JsonProperty("SmallImage")
    public String getSmallImage() {
        return smallImage;
    }

    @JsonProperty("SmallImage")
    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    @JsonProperty("Multimedia")
    public String getMultimedia() {
        return multimedia;
    }

    @JsonProperty("Multimedia")
    public void setMultimedia(String multimedia) {
        this.multimedia = multimedia;
    }

    @JsonProperty("HighGuidedReadingLevel")
    public String getHighGuidedReadingLevel() {
        return highGuidedReadingLevel;
    }

    @JsonProperty("HighGuidedReadingLevel")
    public void setHighGuidedReadingLevel(String highGuidedReadingLevel) {
        this.highGuidedReadingLevel = highGuidedReadingLevel;
    }

    @JsonProperty("ExtraSmallImage")
    public String getExtraSmallImage() {
        return extraSmallImage;
    }

    @JsonProperty("ExtraSmallImage")
    public void setExtraSmallImage(String extraSmallImage) {
        this.extraSmallImage = extraSmallImage;
    }

    @JsonProperty("AwardList")
    public String getAwardList() {
        return awardList;
    }

    @JsonProperty("AwardList")
    public void setAwardList(String awardList) {
        this.awardList = awardList;
    }

    @JsonProperty("NumberofAlternateImages")
    public String getNumberofAlternateImages() {
        return numberofAlternateImages;
    }

    @JsonProperty("NumberofAlternateImages")
    public void setNumberofAlternateImages(String numberofAlternateImages) {
        this.numberofAlternateImages = numberofAlternateImages;
    }

    @JsonProperty("ShowCCSSLexile")
    public String getShowCCSSLexile() {
        return showCCSSLexile;
    }

    @JsonProperty("ShowCCSSLexile")
    public void setShowCCSSLexile(String showCCSSLexile) {
        this.showCCSSLexile = showCCSSLexile;
    }

    @JsonProperty("TeacherTips")
    public String getTeacherTips() {
        return teacherTips;
    }

    @JsonProperty("TeacherTips")
    public void setTeacherTips(String teacherTips) {
        this.teacherTips = teacherTips;
    }

    @JsonProperty("FictionType")
    public String getFictionType() {
        return fictionType;
    }

    @JsonProperty("FictionType")
    public void setFictionType(String fictionType) {
        this.fictionType = fictionType;
    }

    @JsonProperty("ShowGuidedReadingLevel")
    public String getShowGuidedReadingLevel() {
        return showGuidedReadingLevel;
    }

    @JsonProperty("ShowGuidedReadingLevel")
    public void setShowGuidedReadingLevel(String showGuidedReadingLevel) {
        this.showGuidedReadingLevel = showGuidedReadingLevel;
    }

    @JsonProperty("SpanishLowGuidedReadingLevel")
    public String getSpanishLowGuidedReadingLevel() {
        return spanishLowGuidedReadingLevel;
    }

    @JsonProperty("SpanishLowGuidedReadingLevel")
    public void setSpanishLowGuidedReadingLevel(String spanishLowGuidedReadingLevel) {
        this.spanishLowGuidedReadingLevel = spanishLowGuidedReadingLevel;
    }

    @JsonProperty("BundleType")
    public String getBundleType() {
        return bundleType;
    }

    @JsonProperty("BundleType")
    public void setBundleType(String bundleType) {
        this.bundleType = bundleType;
    }

    @JsonProperty("LowGuidedReadingLevel")
    public String getLowGuidedReadingLevel() {
        return lowGuidedReadingLevel;
    }

    @JsonProperty("LowGuidedReadingLevel")
    public void setLowGuidedReadingLevel(String lowGuidedReadingLevel) {
        this.lowGuidedReadingLevel = lowGuidedReadingLevel;
    }

    @JsonProperty("FileFormat")
    public String getFileFormat() {
        return fileFormat;
    }

    @JsonProperty("FileFormat")
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @JsonProperty("EndorsementReview")
    public String getEndorsementReview() {
        return endorsementReview;
    }

    @JsonProperty("EndorsementReview")
    public void setEndorsementReview(String endorsementReview) {
        this.endorsementReview = endorsementReview;
    }

    @JsonProperty("Publisher")
    public String getPublisher() {
        return publisher;
    }

    @JsonProperty("Publisher")
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("ShowDRALevel")
    public String getShowDRALevel() {
        return showDRALevel;
    }

    @JsonProperty("ShowDRALevel")
    public void setShowDRALevel(String showDRALevel) {
        this.showDRALevel = showDRALevel;
    }

    @JsonProperty("LowAcceleratedReader")
    public String getLowAcceleratedReader() {
        return lowAcceleratedReader;
    }

    @JsonProperty("LowAcceleratedReader")
    public void setLowAcceleratedReader(String lowAcceleratedReader) {
        this.lowAcceleratedReader = lowAcceleratedReader;
    }

    @JsonProperty("Imprint")
    public String getImprint() {
        return imprint;
    }

    @JsonProperty("Imprint")
    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    @JsonProperty("UNITS_SOLD")
    public String getUNITSSOLD() {
        return uNITSSOLD;
    }

    @JsonProperty("UNITS_SOLD")
    public void setUNITSSOLD(String uNITSSOLD) {
        this.uNITSSOLD = uNITSSOLD;
    }

    @JsonProperty("ShowACR")
    public String getShowACR() {
        return showACR;
    }

    @JsonProperty("ShowACR")
    public void setShowACR(String showACR) {
        this.showACR = showACR;
    }

    @JsonProperty("Composer")
    public String getComposer() {
        return composer;
    }

    @JsonProperty("Composer")
    public void setComposer(String composer) {
        this.composer = composer;
    }

    @JsonProperty("LegacyTESku")
    public String getLegacyTESku() {
        return legacyTESku;
    }

    @JsonProperty("LegacyTESku")
    public void setLegacyTESku(String legacyTESku) {
        this.legacyTESku = legacyTESku;
    }

    @JsonProperty("FormatDescription")
    public String getFormatDescription() {
        return formatDescription;
    }

    @JsonProperty("FormatDescription")
    public void setFormatDescription(String formatDescription) {
        this.formatDescription = formatDescription;
    }

    @JsonProperty("SeeInsideDescription")
    public String getSeeInsideDescription() {
        return seeInsideDescription;
    }

    @JsonProperty("SeeInsideDescription")
    public void setSeeInsideDescription(String seeInsideDescription) {
        this.seeInsideDescription = seeInsideDescription;
    }

    @JsonProperty("OnlineResources")
    public String getOnlineResources() {
        return onlineResources;
    }

    @JsonProperty("OnlineResources")
    public void setOnlineResources(String onlineResources) {
        this.onlineResources = onlineResources;
    }

    @JsonProperty("LargeImage")
    public String getLargeImage() {
        return largeImage;
    }

    @JsonProperty("LargeImage")
    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    @JsonProperty("UnitCost")
    public String getUnitCost() {
        return unitCost;
    }

    @JsonProperty("UnitCost")
    public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
    }

    @JsonProperty("ExtraLargeImage")
    public String getExtraLargeImage() {
        return extraLargeImage;
    }

    @JsonProperty("ExtraLargeImage")
    public void setExtraLargeImage(String extraLargeImage) {
        this.extraLargeImage = extraLargeImage;
    }

    @JsonProperty("StoreID")
    public String getStoreID() {
        return storeID;
    }

    @JsonProperty("StoreID")
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    @JsonProperty("Subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("Subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("Taxonomy")
    public String getTaxonomy() {
        return taxonomy;
    }

    @JsonProperty("Taxonomy")
    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
    }

    @JsonProperty("CustomGrade")
    public String getCustomGrade() {
        return customGrade;
    }

    @JsonProperty("CustomGrade")
    public void setCustomGrade(String customGrade) {
        this.customGrade = customGrade;
    }

    @JsonProperty("SaleMessage")
    public String getSaleMessage() {
        return saleMessage;
    }

    @JsonProperty("SaleMessage")
    public void setSaleMessage(String saleMessage) {
        this.saleMessage = saleMessage;
    }

    @JsonProperty("Fund")
    public String getFund() {
        return fund;
    }

    @JsonProperty("Fund")
    public void setFund(String fund) {
        this.fund = fund;
    }

    @JsonProperty("ISBN")
    public String getISBN() {
        return iSBN;
    }

    @JsonProperty("ISBN")
    public void setISBN(String iSBN) {
        this.iSBN = iSBN;
    }

    @JsonProperty("Rank")
    public String getRank() {
        return rank;
    }

    @JsonProperty("Rank")
    public void setRank(String rank) {
        this.rank = rank;
    }

    @JsonProperty("ECMSPrimaryCoverImageFlag")
    public String getECMSPrimaryCoverImageFlag() {
        return eCMSPrimaryCoverImageFlag;
    }

    @JsonProperty("ECMSPrimaryCoverImageFlag")
    public void setECMSPrimaryCoverImageFlag(String eCMSPrimaryCoverImageFlag) {
        this.eCMSPrimaryCoverImageFlag = eCMSPrimaryCoverImageFlag;
    }

    @JsonProperty("Resources")
    public String getResources() {
        return resources;
    }

    @JsonProperty("Resources")
    public void setResources(String resources) {
        this.resources = resources;
    }

    @JsonProperty("OurPrice")
    public String getOurPrice() {
        return ourPrice;
    }

    @JsonProperty("OurPrice")
    public void setOurPrice(String ourPrice) {
        this.ourPrice = ourPrice;
    }

    @JsonProperty("Audio")
    public String getAudio() {
        return audio;
    }

    @JsonProperty("Audio")
    public void setAudio(String audio) {
        this.audio = audio;
    }

    @JsonProperty("Brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("Brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("Class")
    public String getClass_() {
        return _class;
    }

    @JsonProperty("Class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    @JsonProperty("Depth")
    public String getDepth() {
        return depth;
    }

    @JsonProperty("Depth")
    public void setDepth(String depth) {
        this.depth = depth;
    }

    @JsonProperty("Dewey")
    public String getDewey() {
        return dewey;
    }

    @JsonProperty("Dewey")
    public void setDewey(String dewey) {
        this.dewey = dewey;
    }

    @JsonProperty("Genre")
    public String getGenre() {
        return genre;
    }

    @JsonProperty("Genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @JsonProperty("ShowDewey")
    public String getShowDewey() {
        return showDewey;
    }

    @JsonProperty("ShowDewey")
    public void setShowDewey(String showDewey) {
        this.showDewey = showDewey;
    }

    @JsonProperty("Pages")
    public String getPages() {
        return pages;
    }

    @JsonProperty("Pages")
    public void setPages(String pages) {
        this.pages = pages;
    }

    @JsonProperty("Shops")
    public String getShops() {
        return shops;
    }

    @JsonProperty("Shops")
    public void setShops(String shops) {
        this.shops = shops;
    }

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("Width")
    public String getWidth() {
        return width;
    }

    @JsonProperty("Width")
    public void setWidth(String width) {
        this.width = width;
    }

    @JsonProperty("ShowSpanishDRALevel")
    public String getShowSpanishDRALevel() {
        return showSpanishDRALevel;
    }

    @JsonProperty("ShowSpanishDRALevel")
    public void setShowSpanishDRALevel(String showSpanishDRALevel) {
        this.showSpanishDRALevel = showSpanishDRALevel;
    }

    @JsonProperty("LowDRALevel")
    public String getLowDRALevel() {
        return lowDRALevel;
    }

    @JsonProperty("LowDRALevel")
    public void setLowDRALevel(String lowDRALevel) {
        this.lowDRALevel = lowDRALevel;
    }

    @JsonProperty("ProductType")
    public String getProductType() {
        return productType;
    }

    @JsonProperty("ProductType")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @JsonProperty("SpanishLowDRALevel")
    public String getSpanishLowDRALevel() {
        return spanishLowDRALevel;
    }

    @JsonProperty("SpanishLowDRALevel")
    public void setSpanishLowDRALevel(String spanishLowDRALevel) {
        this.spanishLowDRALevel = spanishLowDRALevel;
    }

    @JsonProperty("ePageISBNs")
    public String getEPageISBNs() {
        return ePageISBNs;
    }

    @JsonProperty("ePageISBNs")
    public void setEPageISBNs(String ePageISBNs) {
        this.ePageISBNs = ePageISBNs;
    }

    @JsonProperty("Translator")
    public String getTranslator() {
        return translator;
    }

    @JsonProperty("Translator")
    public void setTranslator(String translator) {
        this.translator = translator;
    }

    @JsonProperty("CCSSLexile")
    public String getCCSSLexile() {
        return cCSSLexile;
    }

    @JsonProperty("CCSSLexile")
    public void setCCSSLexile(String cCSSLexile) {
        this.cCSSLexile = cCSSLexile;
    }

    @JsonProperty("Illustrator")
    public String getIllustrator() {
        return illustrator;
    }

    @JsonProperty("Illustrator")
    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    @JsonProperty("PublicationDate")
    public String getPublicationDate() {
        return publicationDate;
    }

    @JsonProperty("PublicationDate")
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    @JsonProperty("Otherformat")
    public String getOtherformat() {
        return otherformat;
    }

    @JsonProperty("Otherformat")
    public void setOtherformat(String otherformat) {
        this.otherformat = otherformat;
    }

    @JsonProperty("SpanishHighDRALevel")
    public String getSpanishHighDRALevel() {
        return spanishHighDRALevel;
    }

    @JsonProperty("SpanishHighDRALevel")
    public void setSpanishHighDRALevel(String spanishHighDRALevel) {
        this.spanishHighDRALevel = spanishHighDRALevel;
    }

    @JsonProperty("Keywords")
    public String getKeywords() {
        return keywords;
    }

    @JsonProperty("Keywords")
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("TeachingFormat")
    public String getTeachingFormat() {
        return teachingFormat;
    }

    @JsonProperty("TeachingFormat")
    public void setTeachingFormat(String teachingFormat) {
        this.teachingFormat = teachingFormat;
    }

    @JsonProperty("ListPrice")
    public String getListPrice() {
        return listPrice;
    }

    @JsonProperty("ListPrice")
    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    @JsonProperty("LongDescription")
    public String getLongDescription() {
        return longDescription;
    }

    @JsonProperty("LongDescription")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @JsonProperty("SpecialNote")
    public String getSpecialNote() {
        return specialNote;
    }

    @JsonProperty("SpecialNote")
    public void setSpecialNote(String specialNote) {
        this.specialNote = specialNote;
    }

    @JsonProperty("AuthorResearch")
    public String getAuthorResearch() {
        return authorResearch;
    }

    @JsonProperty("AuthorResearch")
    public void setAuthorResearch(String authorResearch) {
        this.authorResearch = authorResearch;
    }

    @JsonProperty("InstructionalProgram")
    public String getInstructionalProgram() {
        return instructionalProgram;
    }

    @JsonProperty("InstructionalProgram")
    public void setInstructionalProgram(String instructionalProgram) {
        this.instructionalProgram = instructionalProgram;
    }

    @JsonProperty("ProductID")
    public String getProductID() {
        return productID;
    }

    @JsonProperty("ProductID")
    public void setProductID(String productID) {
        this.productID = productID;
    }

    @JsonProperty("Photographsby")
    public String getPhotographsby() {
        return photographsby;
    }

    @JsonProperty("Photographsby")
    public void setPhotographsby(String photographsby) {
        this.photographsby = photographsby;
    }

    @JsonProperty("ContentUnits")
    public String getContentUnits() {
        return contentUnits;
    }

    @JsonProperty("ContentUnits")
    public void setContentUnits(String contentUnits) {
        this.contentUnits = contentUnits;
    }

    @JsonProperty("SystemRequirements")
    public String getSystemRequirements() {
        return systemRequirements;
    }

    @JsonProperty("SystemRequirements")
    public void setSystemRequirements(String systemRequirements) {
        this.systemRequirements = systemRequirements;
    }

    @JsonProperty("Boutiques")
    public String getBoutiques() {
        return boutiques;
    }

    @JsonProperty("Boutiques")
    public void setBoutiques(String boutiques) {
        this.boutiques = boutiques;
    }

    @JsonProperty("OtherLanguages")
    public String getOtherLanguages() {
        return otherLanguages;
    }

    @JsonProperty("OtherLanguages")
    public void setOtherLanguages(String otherLanguages) {
        this.otherLanguages = otherLanguages;
    }

    @JsonProperty("Introductionby")
    public String getIntroductionby() {
        return introductionby;
    }

    @JsonProperty("Introductionby")
    public void setIntroductionby(String introductionby) {
        this.introductionby = introductionby;
    }

    @JsonProperty("UserBenefits")
    public String getUserBenefits() {
        return userBenefits;
    }

    @JsonProperty("UserBenefits")
    public void setUserBenefits(String userBenefits) {
        this.userBenefits = userBenefits;
    }

    @JsonProperty("ProductEmail")
    public String getProductEmail() {
        return productEmail;
    }

    @JsonProperty("ProductEmail")
    public void setProductEmail(String productEmail) {
        this.productEmail = productEmail;
    }

    @JsonProperty("parentId")
    public String getParentId() {
        return parentId;
    }

    @JsonProperty("parentId")
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @JsonProperty("CharactersandSeries")
    public String getCharactersandSeries() {
        return charactersandSeries;
    }

    @JsonProperty("CharactersandSeries")
    public void setCharactersandSeries(String charactersandSeries) {
        this.charactersandSeries = charactersandSeries;
    }

    @JsonProperty("Searchable")
    public String getSearchable() {
        return searchable;
    }

    @JsonProperty("Searchable")
    public void setSearchable(String searchable) {
        this.searchable = searchable;
    }

    @JsonProperty("HighGrade")
    public String getHighGrade() {
        return highGrade;
    }

    @JsonProperty("HighGrade")
    public void setHighGrade(String highGrade) {
        this.highGrade = highGrade;
    }

    @JsonProperty("BudgetCode")
    public String getBudgetCode() {
        return budgetCode;
    }

    @JsonProperty("BudgetCode")
    public void setBudgetCode(String budgetCode) {
        this.budgetCode = budgetCode;
    }

    @JsonProperty("ViewableFlag")
    public String getViewableFlag() {
        return viewableFlag;
    }

    @JsonProperty("ViewableFlag")
    public void setViewableFlag(String viewableFlag) {
        this.viewableFlag = viewableFlag;
    }

    @JsonProperty("Compiledby")
    public String getCompiledby() {
        return compiledby;
    }

    @JsonProperty("Compiledby")
    public void setCompiledby(String compiledby) {
        this.compiledby = compiledby;
    }

    @JsonProperty("ShowSpanishLexile")
    public String getShowSpanishLexile() {
        return showSpanishLexile;
    }

    @JsonProperty("ShowSpanishLexile")
    public void setShowSpanishLexile(String showSpanishLexile) {
        this.showSpanishLexile = showSpanishLexile;
    }

    @JsonProperty("ProductEndDate")
    public String getProductEndDate() {
        return productEndDate;
    }

    @JsonProperty("ProductEndDate")
    public void setProductEndDate(String productEndDate) {
        this.productEndDate = productEndDate;
    }

    @JsonProperty("ProductStartDate")
    public String getProductStartDate() {
        return productStartDate;
    }

    @JsonProperty("ProductStartDate")
    public void setProductStartDate(String productStartDate) {
        this.productStartDate = productStartDate;
    }

    @JsonProperty("ShowBonusBook")
    public String getShowBonusBook() {
        return showBonusBook;
    }

    @JsonProperty("ShowBonusBook")
    public void setShowBonusBook(String showBonusBook) {
        this.showBonusBook = showBonusBook;
    }

    @JsonProperty("CollectionTitles")
    public String getCollectionTitles() {
        return collectionTitles;
    }

    @JsonProperty("CollectionTitles")
    public void setCollectionTitles(String collectionTitles) {
        this.collectionTitles = collectionTitles;
    }

    @JsonProperty("SaleEndDate")
    public String getSaleEndDate() {
        return saleEndDate;
    }

    @JsonProperty("SaleEndDate")
    public void setSaleEndDate(String saleEndDate) {
        this.saleEndDate = saleEndDate;
    }

    @JsonProperty("CrossSellISBNs")
    public String getCrossSellISBNs() {
        return crossSellISBNs;
    }

    @JsonProperty("CrossSellISBNs")
    public void setCrossSellISBNs(String crossSellISBNs) {
        this.crossSellISBNs = crossSellISBNs;
    }

    @JsonProperty("SOLD_IN_TBW")
    public String getSOLDINTBW() {
        return sOLDINTBW;
    }

    @JsonProperty("SOLD_IN_TBW")
    public void setSOLDINTBW(String sOLDINTBW) {
        this.sOLDINTBW = sOLDINTBW;
    }

    @JsonProperty("SaleStartDate")
    public String getSaleStartDate() {
        return saleStartDate;
    }

    @JsonProperty("SaleStartDate")
    public void setSaleStartDate(String saleStartDate) {
        this.saleStartDate = saleStartDate;
    }

    @JsonProperty("DisplayTitle")
    public String getDisplayTitle() {
        return displayTitle;
    }

    @JsonProperty("DisplayTitle")
    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
    }

    @JsonProperty("AvailabilityDate")
    public String getAvailabilityDate() {
        return availabilityDate;
    }

    @JsonProperty("AvailabilityDate")
    public void setAvailabilityDate(String availabilityDate) {
        this.availabilityDate = availabilityDate;
    }

    @JsonProperty("NumberinSeries")
    public String getNumberinSeries() {
        return numberinSeries;
    }

    @JsonProperty("NumberinSeries")
    public void setNumberinSeries(String numberinSeries) {
        this.numberinSeries = numberinSeries;
    }

    @JsonProperty("ComponentListing")
    public String getComponentListing() {
        return componentListing;
    }

    @JsonProperty("ComponentListing")
    public void setComponentListing(String componentListing) {
        this.componentListing = componentListing;
    }

    @JsonProperty("NumberofIWBPreviewImages")
    public String getNumberofIWBPreviewImages() {
        return numberofIWBPreviewImages;
    }

    @JsonProperty("NumberofIWBPreviewImages")
    public void setNumberofIWBPreviewImages(String numberofIWBPreviewImages) {
        this.numberofIWBPreviewImages = numberofIWBPreviewImages;
    }

    @JsonProperty("SalePrice")
    public String getSalePrice() {
        return salePrice;
    }

    @JsonProperty("SalePrice")
    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    @JsonProperty("REALISBNs")
    public String getREALISBNs() {
        return rEALISBNs;
    }

    @JsonProperty("REALISBNs")
    public void setREALISBNs(String rEALISBNs) {
        this.rEALISBNs = rEALISBNs;
    }

    @JsonProperty("Platform")
    public String getPlatform() {
        return platform;
    }

    @JsonProperty("Platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("Author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("Author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("SpanishHighLexileLevel")
    public String getSpanishHighLexileLevel() {
        return spanishHighLexileLevel;
    }

    @JsonProperty("SpanishHighLexileLevel")
    public void setSpanishHighLexileLevel(String spanishHighLexileLevel) {
        this.spanishHighLexileLevel = spanishHighLexileLevel;
    }

    @JsonProperty("ShowLanguage")
    public String getShowLanguage() {
        return showLanguage;
    }

    @JsonProperty("ShowLanguage")
    public void setShowLanguage(String showLanguage) {
        this.showLanguage = showLanguage;
    }

    @JsonProperty("Vendor1")
    public String getVendor1() {
        return vendor1;
    }

    @JsonProperty("Vendor1")
    public void setVendor1(String vendor1) {
        this.vendor1 = vendor1;
    }

    @JsonProperty("Vendor2")
    public String getVendor2() {
        return vendor2;
    }

    @JsonProperty("Vendor2")
    public void setVendor2(String vendor2) {
        this.vendor2 = vendor2;
    }

    @JsonProperty("InventoryThreshold")
    public String getInventoryThreshold() {
        return inventoryThreshold;
    }

    @JsonProperty("InventoryThreshold")
    public void setInventoryThreshold(String inventoryThreshold) {
        this.inventoryThreshold = inventoryThreshold;
    }

    @JsonProperty("SpanishLowLexileLevel")
    public String getSpanishLowLexileLevel() {
        return spanishLowLexileLevel;
    }

    @JsonProperty("SpanishLowLexileLevel")
    public void setSpanishLowLexileLevel(String spanishLowLexileLevel) {
        this.spanishLowLexileLevel = spanishLowLexileLevel;
    }

    @JsonProperty("Narrator")
    public String getNarrator() {
        return narrator;
    }

    @JsonProperty("Narrator")
    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @JsonProperty("Editor")
    public String getEditor() {
        return editor;
    }

    @JsonProperty("Editor")
    public void setEditor(String editor) {
        this.editor = editor;
    }

    @JsonProperty("SkipInventory")
    public String getSkipInventory() {
        return skipInventory;
    }

    @JsonProperty("SkipInventory")
    public void setSkipInventory(String skipInventory) {
        this.skipInventory = skipInventory;
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
