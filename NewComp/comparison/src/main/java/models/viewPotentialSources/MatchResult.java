
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
    "matCatg10",
    "matCatg8",
    "matCatg6",
    "dqb1MatchGrd",
    "drb1MatchGrd",
    "dqb1Pct",
    "drb1Pct",
    "dpb1TCEMatch",
    "amatchGrd",
    "bmatchGrd",
    "cmatchGrd",
    "apct",
    "bpct",
    "cpct",
    "5of8Pct",
    "4of8Pct",
    "6of6Pct",
    "5of6Pct",
    "4of6Pct",
    "10of10Pct",
    "9of10Pct",
    "8of10Pct",
    "8of8Pct",
    "7of8Pct",
    "6of8Pct"
})
public class MatchResult {

    @JsonProperty("matCatg10")
    private Integer matCatg10;
    @JsonProperty("matCatg8")
    private Integer matCatg8;
    @JsonProperty("matCatg6")
    private Integer matCatg6;
    @JsonProperty("dqb1MatchGrd")
    private Integer dqb1MatchGrd;
    @JsonProperty("drb1MatchGrd")
    private Integer drb1MatchGrd;
    @JsonProperty("dqb1Pct")
    private Integer dqb1Pct;
    @JsonProperty("drb1Pct")
    private Integer drb1Pct;
    @JsonProperty("dpb1TCEMatch")
    private String dpb1TCEMatch;
    @JsonProperty("amatchGrd")
    private Integer amatchGrd;
    @JsonProperty("bmatchGrd")
    private Integer bmatchGrd;
    @JsonProperty("cmatchGrd")
    private Integer cmatchGrd;
    @JsonProperty("apct")
    private Integer apct;
    @JsonProperty("bpct")
    private Integer bpct;
    @JsonProperty("cpct")
    private Integer cpct;
    @JsonProperty("5of8Pct")
    private Integer _5of8Pct;
    @JsonProperty("4of8Pct")
    private Integer _4of8Pct;
    @JsonProperty("6of6Pct")
    private Integer _6of6Pct;
    @JsonProperty("5of6Pct")
    private Integer _5of6Pct;
    @JsonProperty("4of6Pct")
    private Integer _4of6Pct;
    @JsonProperty("10of10Pct")
    private Integer _10of10Pct;
    @JsonProperty("9of10Pct")
    private Integer _9of10Pct;
    @JsonProperty("8of10Pct")
    private Integer _8of10Pct;
    @JsonProperty("8of8Pct")
    private Integer _8of8Pct;
    @JsonProperty("7of8Pct")
    private Integer _7of8Pct;
    @JsonProperty("6of8Pct")
    private Integer _6of8Pct;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("matCatg10")
    public Integer getMatCatg10() {
        return matCatg10;
    }

    @JsonProperty("matCatg10")
    public void setMatCatg10(Integer matCatg10) {
        this.matCatg10 = matCatg10;
    }

    @JsonProperty("matCatg8")
    public Integer getMatCatg8() {
        return matCatg8;
    }

    @JsonProperty("matCatg8")
    public void setMatCatg8(Integer matCatg8) {
        this.matCatg8 = matCatg8;
    }

    @JsonProperty("matCatg6")
    public Integer getMatCatg6() {
        return matCatg6;
    }

    @JsonProperty("matCatg6")
    public void setMatCatg6(Integer matCatg6) {
        this.matCatg6 = matCatg6;
    }

    @JsonProperty("dqb1MatchGrd")
    public Integer getDqb1MatchGrd() {
        return dqb1MatchGrd;
    }

    @JsonProperty("dqb1MatchGrd")
    public void setDqb1MatchGrd(Integer dqb1MatchGrd) {
        this.dqb1MatchGrd = dqb1MatchGrd;
    }

    @JsonProperty("drb1MatchGrd")
    public Integer getDrb1MatchGrd() {
        return drb1MatchGrd;
    }

    @JsonProperty("drb1MatchGrd")
    public void setDrb1MatchGrd(Integer drb1MatchGrd) {
        this.drb1MatchGrd = drb1MatchGrd;
    }

    @JsonProperty("dqb1Pct")
    public Integer getDqb1Pct() {
        return dqb1Pct;
    }

    @JsonProperty("dqb1Pct")
    public void setDqb1Pct(Integer dqb1Pct) {
        this.dqb1Pct = dqb1Pct;
    }

    @JsonProperty("drb1Pct")
    public Integer getDrb1Pct() {
        return drb1Pct;
    }

    @JsonProperty("drb1Pct")
    public void setDrb1Pct(Integer drb1Pct) {
        this.drb1Pct = drb1Pct;
    }

    @JsonProperty("dpb1TCEMatch")
    public String getDpb1TCEMatch() {
        return dpb1TCEMatch;
    }

    @JsonProperty("dpb1TCEMatch")
    public void setDpb1TCEMatch(String dpb1TCEMatch) {
        this.dpb1TCEMatch = dpb1TCEMatch;
    }

    @JsonProperty("amatchGrd")
    public Integer getAmatchGrd() {
        return amatchGrd;
    }

    @JsonProperty("amatchGrd")
    public void setAmatchGrd(Integer amatchGrd) {
        this.amatchGrd = amatchGrd;
    }

    @JsonProperty("bmatchGrd")
    public Integer getBmatchGrd() {
        return bmatchGrd;
    }

    @JsonProperty("bmatchGrd")
    public void setBmatchGrd(Integer bmatchGrd) {
        this.bmatchGrd = bmatchGrd;
    }

    @JsonProperty("cmatchGrd")
    public Integer getCmatchGrd() {
        return cmatchGrd;
    }

    @JsonProperty("cmatchGrd")
    public void setCmatchGrd(Integer cmatchGrd) {
        this.cmatchGrd = cmatchGrd;
    }

    @JsonProperty("apct")
    public Integer getApct() {
        return apct;
    }

    @JsonProperty("apct")
    public void setApct(Integer apct) {
        this.apct = apct;
    }

    @JsonProperty("bpct")
    public Integer getBpct() {
        return bpct;
    }

    @JsonProperty("bpct")
    public void setBpct(Integer bpct) {
        this.bpct = bpct;
    }

    @JsonProperty("cpct")
    public Integer getCpct() {
        return cpct;
    }

    @JsonProperty("cpct")
    public void setCpct(Integer cpct) {
        this.cpct = cpct;
    }

    @JsonProperty("5of8Pct")
    public Integer get5of8Pct() {
        return _5of8Pct;
    }

    @JsonProperty("5of8Pct")
    public void set5of8Pct(Integer _5of8Pct) {
        this._5of8Pct = _5of8Pct;
    }

    @JsonProperty("4of8Pct")
    public Integer get4of8Pct() {
        return _4of8Pct;
    }

    @JsonProperty("4of8Pct")
    public void set4of8Pct(Integer _4of8Pct) {
        this._4of8Pct = _4of8Pct;
    }

    @JsonProperty("6of6Pct")
    public Integer get6of6Pct() {
        return _6of6Pct;
    }

    @JsonProperty("6of6Pct")
    public void set6of6Pct(Integer _6of6Pct) {
        this._6of6Pct = _6of6Pct;
    }

    @JsonProperty("5of6Pct")
    public Integer get5of6Pct() {
        return _5of6Pct;
    }

    @JsonProperty("5of6Pct")
    public void set5of6Pct(Integer _5of6Pct) {
        this._5of6Pct = _5of6Pct;
    }

    @JsonProperty("4of6Pct")
    public Integer get4of6Pct() {
        return _4of6Pct;
    }

    @JsonProperty("4of6Pct")
    public void set4of6Pct(Integer _4of6Pct) {
        this._4of6Pct = _4of6Pct;
    }

    @JsonProperty("10of10Pct")
    public Integer get10of10Pct() {
        return _10of10Pct;
    }

    @JsonProperty("10of10Pct")
    public void set10of10Pct(Integer _10of10Pct) {
        this._10of10Pct = _10of10Pct;
    }

    @JsonProperty("9of10Pct")
    public Integer get9of10Pct() {
        return _9of10Pct;
    }

    @JsonProperty("9of10Pct")
    public void set9of10Pct(Integer _9of10Pct) {
        this._9of10Pct = _9of10Pct;
    }

    @JsonProperty("8of10Pct")
    public Integer get8of10Pct() {
        return _8of10Pct;
    }

    @JsonProperty("8of10Pct")
    public void set8of10Pct(Integer _8of10Pct) {
        this._8of10Pct = _8of10Pct;
    }

    @JsonProperty("8of8Pct")
    public Integer get8of8Pct() {
        return _8of8Pct;
    }

    @JsonProperty("8of8Pct")
    public void set8of8Pct(Integer _8of8Pct) {
        this._8of8Pct = _8of8Pct;
    }

    @JsonProperty("7of8Pct")
    public Integer get7of8Pct() {
        return _7of8Pct;
    }

    @JsonProperty("7of8Pct")
    public void set7of8Pct(Integer _7of8Pct) {
        this._7of8Pct = _7of8Pct;
    }

    @JsonProperty("6of8Pct")
    public Integer get6of8Pct() {
        return _6of8Pct;
    }

    @JsonProperty("6of8Pct")
    public void set6of8Pct(Integer _6of8Pct) {
        this._6of8Pct = _6of8Pct;
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
        return "MatchResult{" +
                "matCatg10=" + matCatg10 +
                ", matCatg8=" + matCatg8 +
                ", matCatg6=" + matCatg6 +
                ", dqb1MatchGrd=" + dqb1MatchGrd +
                ", drb1MatchGrd=" + drb1MatchGrd +
                ", dqb1Pct=" + dqb1Pct +
                ", drb1Pct=" + drb1Pct +
                ", dpb1TCEMatch='" + dpb1TCEMatch + '\'' +
                ", amatchGrd=" + amatchGrd +
                ", bmatchGrd=" + bmatchGrd +
                ", cmatchGrd=" + cmatchGrd +
                ", apct=" + apct +
                ", bpct=" + bpct +
                ", cpct=" + cpct +
                ", _5of8Pct=" + _5of8Pct +
                ", _4of8Pct=" + _4of8Pct +
                ", _6of6Pct=" + _6of6Pct +
                ", _5of6Pct=" + _5of6Pct +
                ", _4of6Pct=" + _4of6Pct +
                ", _10of10Pct=" + _10of10Pct +
                ", _9of10Pct=" + _9of10Pct +
                ", _8of10Pct=" + _8of10Pct +
                ", _8of8Pct=" + _8of8Pct +
                ", _7of8Pct=" + _7of8Pct +
                ", _6of8Pct=" + _6of8Pct +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
