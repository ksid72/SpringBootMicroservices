package com.example.demo.dto;

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
"tag",
"occurence"
})
public class TagOccuranceJson {

@JsonProperty("tag")
private String tag;
@JsonProperty("occurence")
private int occurence;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("tag")
public String getTag() {
return tag;
}

@JsonProperty("tag")
public void setTag(String tag) {
this.tag = tag;
}

@JsonProperty("occurence")
public int getOccurence() {
return occurence;
}

@JsonProperty("occurence")
public void setOccurence(int occurence) {
this.occurence = occurence;
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