
package com.dw;

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
    "_type",
    "item",
    "option"
})
public class Type {

    @JsonProperty("_type")
    private String type;
    @JsonProperty("item")
    private Boolean item;
    @JsonProperty("option")
    private Boolean option;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    @JsonProperty("_type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("item")
    public Boolean getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(Boolean item) {
        this.item = item;
    }

    @JsonProperty("option")
    public Boolean getOption() {
        return option;
    }

    @JsonProperty("option")
    public void setOption(Boolean option) {
        this.option = option;
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
