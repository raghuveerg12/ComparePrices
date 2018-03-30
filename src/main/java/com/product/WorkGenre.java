
package com.product;

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
    "id",
    "Taxonomy_Type",
    "Taxonomy_Version",
    "tag",
    "defaultVersion"
})
public class WorkGenre {

    @JsonProperty("id")
    private String id;
    @JsonProperty("Taxonomy_Type")
    private String taxonomyType;
    @JsonProperty("Taxonomy_Version")
    private String taxonomyVersion;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("defaultVersion")
    private String defaultVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("Taxonomy_Type")
    public String getTaxonomyType() {
        return taxonomyType;
    }

    @JsonProperty("Taxonomy_Type")
    public void setTaxonomyType(String taxonomyType) {
        this.taxonomyType = taxonomyType;
    }

    @JsonProperty("Taxonomy_Version")
    public String getTaxonomyVersion() {
        return taxonomyVersion;
    }

    @JsonProperty("Taxonomy_Version")
    public void setTaxonomyVersion(String taxonomyVersion) {
        this.taxonomyVersion = taxonomyVersion;
    }

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("defaultVersion")
    public String getDefaultVersion() {
        return defaultVersion;
    }

    @JsonProperty("defaultVersion")
    public void setDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
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
