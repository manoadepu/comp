
package models.viewPotentialSources;

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
    "locus",
    "antigen1",
    "typingMethod1",
    "antigen2",
    "typingMethod2",
    "genotypeList"
})
public class TypingResult {

    @JsonProperty("locus")
    private String locus;
    @JsonProperty("antigen1")
    private String antigen1;
    @JsonProperty("typingMethod1")
    private String typingMethod1;
    @JsonProperty("antigen2")
    private String antigen2;
    @JsonProperty("typingMethod2")
    private String typingMethod2;
    @JsonProperty("genotypeList")
    private Integer genotypeList;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("locus")
    public String getLocus() {
        return locus;
    }

    @JsonProperty("locus")
    public void setLocus(String locus) {
        this.locus = locus;
    }

    @JsonProperty("antigen1")
    public String getAntigen1() {
        return antigen1;
    }

    @JsonProperty("antigen1")
    public void setAntigen1(String antigen1) {
        this.antigen1 = antigen1;
    }

    @JsonProperty("typingMethod1")
    public String getTypingMethod1() {
        return typingMethod1;
    }

    @JsonProperty("typingMethod1")
    public void setTypingMethod1(String typingMethod1) {
        this.typingMethod1 = typingMethod1;
    }

    @JsonProperty("antigen2")
    public String getAntigen2() {
        return antigen2;
    }

    @JsonProperty("antigen2")
    public void setAntigen2(String antigen2) {
        this.antigen2 = antigen2;
    }

    @JsonProperty("typingMethod2")
    public String getTypingMethod2() {
        return typingMethod2;
    }

    @JsonProperty("typingMethod2")
    public void setTypingMethod2(String typingMethod2) {
        this.typingMethod2 = typingMethod2;
    }

    @JsonProperty("genotypeList")
    public Integer getGenotypeList() {
        return genotypeList;
    }

    @JsonProperty("genotypeList")
    public void setGenotypeList(Integer genotypeList) {
        this.genotypeList = genotypeList;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "TypingResult{" +
                "locus='" + locus + '\'' +
                ", antigen1='" + antigen1 + '\'' +
                ", typingMethod1='" + typingMethod1 + '\'' +
                ", antigen2='" + antigen2 + '\'' +
                ", typingMethod2='" + typingMethod2 + '\'' +
                ", genotypeList=" + genotypeList +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
