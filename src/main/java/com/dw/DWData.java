
package com.dw;

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
    "_v",
    "id",
    "long_description",
    "min_order_quantity",
    "name",
    "step_quantity",
    "type",
    "c_author",
    "c_borderId",
    "c_characterAndSeries",
    "c_classValue",
    "c_customGrade",
    "c_depth",
    "c_fictionType",
    "c_format",
    "c_genre",
    "c_height",
    "c_highGradeTSOonly",
    "c_isbn",
    "c_isbn13",
    "c_language",
    "c_listPrice",
    "c_lowGradeTSOonly",
    "c_mdmProductId",
    "c_pages",
    "c_productType",
    "c_searchable",
    "c_shops",
    "c_showACR",
    "c_showDRALevel",
    "c_showDewey",
    "c_showGuidedReadingLevel",
    "c_showLanguage",
    "c_showLexile",
    "c_showSpanishGuidedReadingLevel",
    "c_showSpanishLexile",
    "c_soldInTBW",
    "c_unitCost",
    "c_weight",
    "c_width"
})
public class DWData {

    @JsonProperty("_v")
    private String v;
    @JsonProperty("id")
    private String id;
    @JsonProperty("long_description")
    private String longDescription;
    @JsonProperty("min_order_quantity")
    private Integer minOrderQuantity;
    @JsonProperty("name")
    private String name;
    @JsonProperty("step_quantity")
    private Integer stepQuantity;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("c_author")
    private String cAuthor;
    @JsonProperty("c_borderId")
    private String cBorderId;
    @JsonProperty("c_characterAndSeries")
    private String cCharacterAndSeries;
    @JsonProperty("c_classValue")
    private String cClassValue;
    @JsonProperty("c_customGrade")
    private String cCustomGrade;
    @JsonProperty("c_depth")
    private String cDepth;
    @JsonProperty("c_fictionType")
    private String cFictionType;
    @JsonProperty("c_format")
    private String cFormat;
    @JsonProperty("c_genre")
    private String cGenre;
    @JsonProperty("c_height")
    private String cHeight;
    @JsonProperty("c_highGradeTSOonly")
    private Integer cHighGradeTSOonly;
    @JsonProperty("c_isbn")
    private String cIsbn;
    @JsonProperty("c_isbn13")
    private String cIsbn13;
    @JsonProperty("c_language")
    private String cLanguage;
    @JsonProperty("c_listPrice")
    private Double cListPrice;
    @JsonProperty("c_lowGradeTSOonly")
    private Integer cLowGradeTSOonly;
    @JsonProperty("c_mdmProductId")
    private String cMdmProductId;
    @JsonProperty("c_pages")
    private String cPages;
    @JsonProperty("c_productType")
    private String cProductType;
    @JsonProperty("c_searchable")
    private Boolean cSearchable;
    @JsonProperty("c_shops")
    private List<String> cShops = null;
    @JsonProperty("c_showACR")
    private Boolean cShowACR;
    @JsonProperty("c_showDRALevel")
    private Boolean cShowDRALevel;
    @JsonProperty("c_showDewey")
    private Boolean cShowDewey;
    @JsonProperty("c_showGuidedReadingLevel")
    private Boolean cShowGuidedReadingLevel;
    @JsonProperty("c_showLanguage")
    private Boolean cShowLanguage;
    @JsonProperty("c_showLexile")
    private Boolean cShowLexile;
    @JsonProperty("c_showSpanishGuidedReadingLevel")
    private Boolean cShowSpanishGuidedReadingLevel;
    @JsonProperty("c_showSpanishLexile")
    private Boolean cShowSpanishLexile;
    @JsonProperty("c_soldInTBW")
    private String cSoldInTBW;
    @JsonProperty("c_unitCost")
    private Integer cUnitCost;
    @JsonProperty("c_weight")
    private String cWeight;
    @JsonProperty("c_width")
    private String cWidth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_v")
    public String getV() {
        return v;
    }

    @JsonProperty("_v")
    public void setV(String v) {
        this.v = v;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("long_description")
    public String getLongDescription() {
        return longDescription;
    }

    @JsonProperty("long_description")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @JsonProperty("min_order_quantity")
    public Integer getMinOrderQuantity() {
        return minOrderQuantity;
    }

    @JsonProperty("min_order_quantity")
    public void setMinOrderQuantity(Integer minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("step_quantity")
    public Integer getStepQuantity() {
        return stepQuantity;
    }

    @JsonProperty("step_quantity")
    public void setStepQuantity(Integer stepQuantity) {
        this.stepQuantity = stepQuantity;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    @JsonProperty("c_author")
    public String getCAuthor() {
        return cAuthor;
    }

    @JsonProperty("c_author")
    public void setCAuthor(String cAuthor) {
        this.cAuthor = cAuthor;
    }

    @JsonProperty("c_borderId")
    public String getCBorderId() {
        return cBorderId;
    }

    @JsonProperty("c_borderId")
    public void setCBorderId(String cBorderId) {
        this.cBorderId = cBorderId;
    }

    @JsonProperty("c_characterAndSeries")
    public String getCCharacterAndSeries() {
        return cCharacterAndSeries;
    }

    @JsonProperty("c_characterAndSeries")
    public void setCCharacterAndSeries(String cCharacterAndSeries) {
        this.cCharacterAndSeries = cCharacterAndSeries;
    }

    @JsonProperty("c_classValue")
    public String getCClassValue() {
        return cClassValue;
    }

    @JsonProperty("c_classValue")
    public void setCClassValue(String cClassValue) {
        this.cClassValue = cClassValue;
    }

    @JsonProperty("c_customGrade")
    public String getCCustomGrade() {
        return cCustomGrade;
    }

    @JsonProperty("c_customGrade")
    public void setCCustomGrade(String cCustomGrade) {
        this.cCustomGrade = cCustomGrade;
    }

    @JsonProperty("c_depth")
    public String getCDepth() {
        return cDepth;
    }

    @JsonProperty("c_depth")
    public void setCDepth(String cDepth) {
        this.cDepth = cDepth;
    }

    @JsonProperty("c_fictionType")
    public String getCFictionType() {
        return cFictionType;
    }

    @JsonProperty("c_fictionType")
    public void setCFictionType(String cFictionType) {
        this.cFictionType = cFictionType;
    }

    @JsonProperty("c_format")
    public String getCFormat() {
        return cFormat;
    }

    @JsonProperty("c_format")
    public void setCFormat(String cFormat) {
        this.cFormat = cFormat;
    }

    @JsonProperty("c_genre")
    public String getCGenre() {
        return cGenre;
    }

    @JsonProperty("c_genre")
    public void setCGenre(String cGenre) {
        this.cGenre = cGenre;
    }

    @JsonProperty("c_height")
    public String getCHeight() {
        return cHeight;
    }

    @JsonProperty("c_height")
    public void setCHeight(String cHeight) {
        this.cHeight = cHeight;
    }

    @JsonProperty("c_highGradeTSOonly")
    public Integer getCHighGradeTSOonly() {
        return cHighGradeTSOonly;
    }

    @JsonProperty("c_highGradeTSOonly")
    public void setCHighGradeTSOonly(Integer cHighGradeTSOonly) {
        this.cHighGradeTSOonly = cHighGradeTSOonly;
    }

    @JsonProperty("c_isbn")
    public String getCIsbn() {
        return cIsbn;
    }

    @JsonProperty("c_isbn")
    public void setCIsbn(String cIsbn) {
        this.cIsbn = cIsbn;
    }

    @JsonProperty("c_isbn13")
    public String getCIsbn13() {
        return cIsbn13;
    }

    @JsonProperty("c_isbn13")
    public void setCIsbn13(String cIsbn13) {
        this.cIsbn13 = cIsbn13;
    }

    @JsonProperty("c_language")
    public String getCLanguage() {
        return cLanguage;
    }

    @JsonProperty("c_language")
    public void setCLanguage(String cLanguage) {
        this.cLanguage = cLanguage;
    }

    @JsonProperty("c_listPrice")
    public Double getCListPrice() {
        return cListPrice;
    }

    @JsonProperty("c_listPrice")
    public void setCListPrice(Double cListPrice) {
        this.cListPrice = cListPrice;
    }

    @JsonProperty("c_lowGradeTSOonly")
    public Integer getCLowGradeTSOonly() {
        return cLowGradeTSOonly;
    }

    @JsonProperty("c_lowGradeTSOonly")
    public void setCLowGradeTSOonly(Integer cLowGradeTSOonly) {
        this.cLowGradeTSOonly = cLowGradeTSOonly;
    }

    @JsonProperty("c_mdmProductId")
    public String getCMdmProductId() {
        return cMdmProductId;
    }

    @JsonProperty("c_mdmProductId")
    public void setCMdmProductId(String cMdmProductId) {
        this.cMdmProductId = cMdmProductId;
    }

    @JsonProperty("c_pages")
    public String getCPages() {
        return cPages;
    }

    @JsonProperty("c_pages")
    public void setCPages(String cPages) {
        this.cPages = cPages;
    }

    @JsonProperty("c_productType")
    public String getCProductType() {
        return cProductType;
    }

    @JsonProperty("c_productType")
    public void setCProductType(String cProductType) {
        this.cProductType = cProductType;
    }

    @JsonProperty("c_searchable")
    public Boolean getCSearchable() {
        return cSearchable;
    }

    @JsonProperty("c_searchable")
    public void setCSearchable(Boolean cSearchable) {
        this.cSearchable = cSearchable;
    }

    @JsonProperty("c_shops")
    public List<String> getCShops() {
        return cShops;
    }

    @JsonProperty("c_shops")
    public void setCShops(List<String> cShops) {
        this.cShops = cShops;
    }

    @JsonProperty("c_showACR")
    public Boolean getCShowACR() {
        return cShowACR;
    }

    @JsonProperty("c_showACR")
    public void setCShowACR(Boolean cShowACR) {
        this.cShowACR = cShowACR;
    }

    @JsonProperty("c_showDRALevel")
    public Boolean getCShowDRALevel() {
        return cShowDRALevel;
    }

    @JsonProperty("c_showDRALevel")
    public void setCShowDRALevel(Boolean cShowDRALevel) {
        this.cShowDRALevel = cShowDRALevel;
    }

    @JsonProperty("c_showDewey")
    public Boolean getCShowDewey() {
        return cShowDewey;
    }

    @JsonProperty("c_showDewey")
    public void setCShowDewey(Boolean cShowDewey) {
        this.cShowDewey = cShowDewey;
    }

    @JsonProperty("c_showGuidedReadingLevel")
    public Boolean getCShowGuidedReadingLevel() {
        return cShowGuidedReadingLevel;
    }

    @JsonProperty("c_showGuidedReadingLevel")
    public void setCShowGuidedReadingLevel(Boolean cShowGuidedReadingLevel) {
        this.cShowGuidedReadingLevel = cShowGuidedReadingLevel;
    }

    @JsonProperty("c_showLanguage")
    public Boolean getCShowLanguage() {
        return cShowLanguage;
    }

    @JsonProperty("c_showLanguage")
    public void setCShowLanguage(Boolean cShowLanguage) {
        this.cShowLanguage = cShowLanguage;
    }

    @JsonProperty("c_showLexile")
    public Boolean getCShowLexile() {
        return cShowLexile;
    }

    @JsonProperty("c_showLexile")
    public void setCShowLexile(Boolean cShowLexile) {
        this.cShowLexile = cShowLexile;
    }

    @JsonProperty("c_showSpanishGuidedReadingLevel")
    public Boolean getCShowSpanishGuidedReadingLevel() {
        return cShowSpanishGuidedReadingLevel;
    }

    @JsonProperty("c_showSpanishGuidedReadingLevel")
    public void setCShowSpanishGuidedReadingLevel(Boolean cShowSpanishGuidedReadingLevel) {
        this.cShowSpanishGuidedReadingLevel = cShowSpanishGuidedReadingLevel;
    }

    @JsonProperty("c_showSpanishLexile")
    public Boolean getCShowSpanishLexile() {
        return cShowSpanishLexile;
    }

    @JsonProperty("c_showSpanishLexile")
    public void setCShowSpanishLexile(Boolean cShowSpanishLexile) {
        this.cShowSpanishLexile = cShowSpanishLexile;
    }

    @JsonProperty("c_soldInTBW")
    public String getCSoldInTBW() {
        return cSoldInTBW;
    }

    @JsonProperty("c_soldInTBW")
    public void setCSoldInTBW(String cSoldInTBW) {
        this.cSoldInTBW = cSoldInTBW;
    }

    @JsonProperty("c_unitCost")
    public Integer getCUnitCost() {
        return cUnitCost;
    }

    @JsonProperty("c_unitCost")
    public void setCUnitCost(Integer cUnitCost) {
        this.cUnitCost = cUnitCost;
    }

    @JsonProperty("c_weight")
    public String getCWeight() {
        return cWeight;
    }

    @JsonProperty("c_weight")
    public void setCWeight(String cWeight) {
        this.cWeight = cWeight;
    }

    @JsonProperty("c_width")
    public String getCWidth() {
        return cWidth;
    }

    @JsonProperty("c_width")
    public void setCWidth(String cWidth) {
        this.cWidth = cWidth;
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
