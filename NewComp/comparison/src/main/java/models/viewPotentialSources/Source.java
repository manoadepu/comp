
package models.viewPotentialSources;

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
    "patientGuid",
    "sequenceNumber",
    "sourceGuid",
    "dcGuid",
    "matchResult",
    "typingResult",
    "status",
    "age",
    "sex",
    "broadRace",
    "detailRace",
    "ethnicity",
    "bloodType",
    "rhType",
    "ct",
    "ctCompletedDate",
    "licenseStatus",
    "tncWeight",
    "cd34FCWeight",
    "tncFrozen",
    "vol",
    "thawCellFracn",
    "seg",
    "hgb",
    "rbcDepleted",
    "plasmaReduced",
    "ageMo",
    "numberOfMatches",
    "weight",
    "weightDate",
    "cmvStatus",
    "cmvStatusDate",
    "availableDate",
    "pastPreg",
    "repSample",
    "previousDonation",
    "lastContactDate",
    "regDate",
    "intlCode",
    "localId",
    "haplogic3SortOrder",
    "nmdpId",
    "cd34FrozenCell",
    "nrbc",
    "idmpositive"
})
public class Source {

    @JsonProperty("patientGuid")
    private String patientGuid;
    @JsonProperty("sequenceNumber")
    private Integer sequenceNumber;
    @JsonProperty("sourceGuid")
    private String sourceGuid;
    @JsonProperty("dcGuid")
    private String dcGuid;
    @JsonProperty("matchResult")
    private MatchResult matchResult;
    @JsonProperty("typingResult")
    private List<TypingResult> typingResult = null;
    @JsonProperty("status")
    private String status;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("sex")
    private String sex;
    @JsonProperty("broadRace")
    private String broadRace;
    @JsonProperty("detailRace")
    private String detailRace;
    @JsonProperty("ethnicity")
    private String ethnicity;
    @JsonProperty("bloodType")
    private String bloodType;
    @JsonProperty("rhType")
    private String rhType;
    @JsonProperty("ct")
    private Object ct;
    @JsonProperty("ctCompletedDate")
    private Object ctCompletedDate;
    @JsonProperty("licenseStatus")
    private Object licenseStatus;
    @JsonProperty("tncWeight")
    private Object tncWeight;
    @JsonProperty("cd34FCWeight")
    private Object cd34FCWeight;
    @JsonProperty("tncFrozen")
    private Object tncFrozen;
    @JsonProperty("vol")
    private Object vol;
    @JsonProperty("thawCellFracn")
    private Object thawCellFracn;
    @JsonProperty("seg")
    private Object seg;
    @JsonProperty("hgb")
    private Object hgb;
    @JsonProperty("rbcDepleted")
    private Object rbcDepleted;
    @JsonProperty("plasmaReduced")
    private Object plasmaReduced;
    @JsonProperty("ageMo")
    private Integer ageMo;
    @JsonProperty("numberOfMatches")
    private Integer numberOfMatches;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("weightDate")
    private Object weightDate;
    @JsonProperty("cmvStatus")
    private String cmvStatus;
    @JsonProperty("cmvStatusDate")
    private Object cmvStatusDate;
    @JsonProperty("availableDate")
    private Object availableDate;
    @JsonProperty("pastPreg")
    private String pastPreg;
    @JsonProperty("repSample")
    private Boolean repSample;
    @JsonProperty("previousDonation")
    private String previousDonation;
    @JsonProperty("lastContactDate")
    private Object lastContactDate;
    @JsonProperty("regDate")
    private String regDate;
    @JsonProperty("intlCode")
    private String intlCode;
    @JsonProperty("localId")
    private String localId;
    @JsonProperty("haplogic3SortOrder")
    private Integer haplogic3SortOrder;
    @JsonProperty("nmdpId")
    private String nmdpId;
    @JsonProperty("cd34FrozenCell")
    private Object cd34FrozenCell;
    @JsonProperty("nrbc")
    private Object nrbc;
    @JsonProperty("idmpositive")
    private Object idmpositive;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("patientGuid")
    public String getPatientGuid() {
        return patientGuid;
    }

    @JsonProperty("patientGuid")
    public void setPatientGuid(String patientGuid) {
        this.patientGuid = patientGuid;
    }

    @JsonProperty("sequenceNumber")
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    @JsonProperty("sequenceNumber")
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @JsonProperty("sourceGuid")
    public String getSourceGuid() {
        return sourceGuid;
    }

    @JsonProperty("sourceGuid")
    public void setSourceGuid(String sourceGuid) {
        this.sourceGuid = sourceGuid;
    }

    @JsonProperty("dcGuid")
    public String getDcGuid() {
        return dcGuid;
    }

    @JsonProperty("dcGuid")
    public void setDcGuid(String dcGuid) {
        this.dcGuid = dcGuid;
    }

    @JsonProperty("matchResult")
    public MatchResult getMatchResult() {
        return matchResult;
    }

    @JsonProperty("matchResult")
    public void setMatchResult(MatchResult matchResult) {
        this.matchResult = matchResult;
    }

    @JsonProperty("typingResult")
    public List<TypingResult> getTypingResult() {
        return typingResult;
    }

    @JsonProperty("typingResult")
    public void setTypingResult(List<TypingResult> typingResult) {
        this.typingResult = typingResult;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("broadRace")
    public String getBroadRace() {
        return broadRace;
    }

    @JsonProperty("broadRace")
    public void setBroadRace(String broadRace) {
        this.broadRace = broadRace;
    }

    @JsonProperty("detailRace")
    public String getDetailRace() {
        return detailRace;
    }

    @JsonProperty("detailRace")
    public void setDetailRace(String detailRace) {
        this.detailRace = detailRace;
    }

    @JsonProperty("ethnicity")
    public String getEthnicity() {
        return ethnicity;
    }

    @JsonProperty("ethnicity")
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    @JsonProperty("bloodType")
    public String getBloodType() {
        return bloodType;
    }

    @JsonProperty("bloodType")
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @JsonProperty("rhType")
    public String getRhType() {
        return rhType;
    }

    @JsonProperty("rhType")
    public void setRhType(String rhType) {
        this.rhType = rhType;
    }

    @JsonProperty("ct")
    public Object getCt() {
        return ct;
    }

    @JsonProperty("ct")
    public void setCt(Object ct) {
        this.ct = ct;
    }

    @JsonProperty("ctCompletedDate")
    public Object getCtCompletedDate() {
        return ctCompletedDate;
    }

    @JsonProperty("ctCompletedDate")
    public void setCtCompletedDate(Object ctCompletedDate) {
        this.ctCompletedDate = ctCompletedDate;
    }

    @JsonProperty("licenseStatus")
    public Object getLicenseStatus() {
        return licenseStatus;
    }

    @JsonProperty("licenseStatus")
    public void setLicenseStatus(Object licenseStatus) {
        this.licenseStatus = licenseStatus;
    }

    @JsonProperty("tncWeight")
    public Object getTncWeight() {
        return tncWeight;
    }

    @JsonProperty("tncWeight")
    public void setTncWeight(Object tncWeight) {
        this.tncWeight = tncWeight;
    }

    @JsonProperty("cd34FCWeight")
    public Object getCd34FCWeight() {
        return cd34FCWeight;
    }

    @JsonProperty("cd34FCWeight")
    public void setCd34FCWeight(Object cd34FCWeight) {
        this.cd34FCWeight = cd34FCWeight;
    }

    @JsonProperty("tncFrozen")
    public Object getTncFrozen() {
        return tncFrozen;
    }

    @JsonProperty("tncFrozen")
    public void setTncFrozen(Object tncFrozen) {
        this.tncFrozen = tncFrozen;
    }

    @JsonProperty("vol")
    public Object getVol() {
        return vol;
    }

    @JsonProperty("vol")
    public void setVol(Object vol) {
        this.vol = vol;
    }

    @JsonProperty("thawCellFracn")
    public Object getThawCellFracn() {
        return thawCellFracn;
    }

    @JsonProperty("thawCellFracn")
    public void setThawCellFracn(Object thawCellFracn) {
        this.thawCellFracn = thawCellFracn;
    }

    @JsonProperty("seg")
    public Object getSeg() {
        return seg;
    }

    @JsonProperty("seg")
    public void setSeg(Object seg) {
        this.seg = seg;
    }

    @JsonProperty("hgb")
    public Object getHgb() {
        return hgb;
    }

    @JsonProperty("hgb")
    public void setHgb(Object hgb) {
        this.hgb = hgb;
    }

    @JsonProperty("rbcDepleted")
    public Object getRbcDepleted() {
        return rbcDepleted;
    }

    @JsonProperty("rbcDepleted")
    public void setRbcDepleted(Object rbcDepleted) {
        this.rbcDepleted = rbcDepleted;
    }

    @JsonProperty("plasmaReduced")
    public Object getPlasmaReduced() {
        return plasmaReduced;
    }

    @JsonProperty("plasmaReduced")
    public void setPlasmaReduced(Object plasmaReduced) {
        this.plasmaReduced = plasmaReduced;
    }

    @JsonProperty("ageMo")
    public Integer getAgeMo() {
        return ageMo;
    }

    @JsonProperty("ageMo")
    public void setAgeMo(Integer ageMo) {
        this.ageMo = ageMo;
    }

    @JsonProperty("numberOfMatches")
    public Integer getNumberOfMatches() {
        return numberOfMatches;
    }

    @JsonProperty("numberOfMatches")
    public void setNumberOfMatches(Integer numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @JsonProperty("weightDate")
    public Object getWeightDate() {
        return weightDate;
    }

    @JsonProperty("weightDate")
    public void setWeightDate(Object weightDate) {
        this.weightDate = weightDate;
    }

    @JsonProperty("cmvStatus")
    public String getCmvStatus() {
        return cmvStatus;
    }

    @JsonProperty("cmvStatus")
    public void setCmvStatus(String cmvStatus) {
        this.cmvStatus = cmvStatus;
    }

    @JsonProperty("cmvStatusDate")
    public Object getCmvStatusDate() {
        return cmvStatusDate;
    }

    @JsonProperty("cmvStatusDate")
    public void setCmvStatusDate(Object cmvStatusDate) {
        this.cmvStatusDate = cmvStatusDate;
    }

    @JsonProperty("availableDate")
    public Object getAvailableDate() {
        return availableDate;
    }

    @JsonProperty("availableDate")
    public void setAvailableDate(Object availableDate) {
        this.availableDate = availableDate;
    }

    @JsonProperty("pastPreg")
    public String getPastPreg() {
        return pastPreg;
    }

    @JsonProperty("pastPreg")
    public void setPastPreg(String pastPreg) {
        this.pastPreg = pastPreg;
    }

    @JsonProperty("repSample")
    public Boolean getRepSample() {
        return repSample;
    }

    @JsonProperty("repSample")
    public void setRepSample(Boolean repSample) {
        this.repSample = repSample;
    }

    @JsonProperty("previousDonation")
    public String getPreviousDonation() {
        return previousDonation;
    }

    @JsonProperty("previousDonation")
    public void setPreviousDonation(String previousDonation) {
        this.previousDonation = previousDonation;
    }

    @JsonProperty("lastContactDate")
    public Object getLastContactDate() {
        return lastContactDate;
    }

    @JsonProperty("lastContactDate")
    public void setLastContactDate(Object lastContactDate) {
        this.lastContactDate = lastContactDate;
    }

    @JsonProperty("regDate")
    public String getRegDate() {
        return regDate;
    }

    @JsonProperty("regDate")
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    @JsonProperty("intlCode")
    public String getIntlCode() {
        return intlCode;
    }

    @JsonProperty("intlCode")
    public void setIntlCode(String intlCode) {
        this.intlCode = intlCode;
    }

    @JsonProperty("localId")
    public String getLocalId() {
        return localId;
    }

    @JsonProperty("localId")
    public void setLocalId(String localId) {
        this.localId = localId;
    }

    @JsonProperty("haplogic3SortOrder")
    public Integer getHaplogic3SortOrder() {
        return haplogic3SortOrder;
    }

    @JsonProperty("haplogic3SortOrder")
    public void setHaplogic3SortOrder(Integer haplogic3SortOrder) {
        this.haplogic3SortOrder = haplogic3SortOrder;
    }

    @JsonProperty("nmdpId")
    public String getNmdpId() {
        return nmdpId;
    }

    @JsonProperty("nmdpId")
    public void setNmdpId(String nmdpId) {
        this.nmdpId = nmdpId;
    }

    @JsonProperty("cd34FrozenCell")
    public Object getCd34FrozenCell() {
        return cd34FrozenCell;
    }

    @JsonProperty("cd34FrozenCell")
    public void setCd34FrozenCell(Object cd34FrozenCell) {
        this.cd34FrozenCell = cd34FrozenCell;
    }

    @JsonProperty("nrbc")
    public Object getNrbc() {
        return nrbc;
    }

    @JsonProperty("nrbc")
    public void setNrbc(Object nrbc) {
        this.nrbc = nrbc;
    }

    @JsonProperty("idmpositive")
    public Object getIdmpositive() {
        return idmpositive;
    }

    @JsonProperty("idmpositive")
    public void setIdmpositive(Object idmpositive) {
        this.idmpositive = idmpositive;
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
        return "Source{" +
                "patientGuid='" + patientGuid + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                ", sourceGuid='" + sourceGuid + '\'' +
                ", dcGuid='" + dcGuid + '\'' +
                ", matchResult=" + matchResult +
                ", typingResult=" + typingResult +
                ", status='" + status + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", broadRace='" + broadRace + '\'' +
                ", detailRace='" + detailRace + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", rhType='" + rhType + '\'' +
                ", ct=" + ct +
                ", ctCompletedDate=" + ctCompletedDate +
                ", licenseStatus=" + licenseStatus +
                ", tncWeight=" + tncWeight +
                ", cd34FCWeight=" + cd34FCWeight +
                ", tncFrozen=" + tncFrozen +
                ", vol=" + vol +
                ", thawCellFracn=" + thawCellFracn +
                ", seg=" + seg +
                ", hgb=" + hgb +
                ", rbcDepleted=" + rbcDepleted +
                ", plasmaReduced=" + plasmaReduced +
                ", ageMo=" + ageMo +
                ", numberOfMatches=" + numberOfMatches +
                ", weight=" + weight +
                ", weightDate=" + weightDate +
                ", cmvStatus='" + cmvStatus + '\'' +
                ", cmvStatusDate=" + cmvStatusDate +
                ", availableDate=" + availableDate +
                ", pastPreg='" + pastPreg + '\'' +
                ", repSample=" + repSample +
                ", previousDonation='" + previousDonation + '\'' +
                ", lastContactDate=" + lastContactDate +
                ", regDate='" + regDate + '\'' +
                ", intlCode='" + intlCode + '\'' +
                ", localId='" + localId + '\'' +
                ", haplogic3SortOrder=" + haplogic3SortOrder +
                ", nmdpId='" + nmdpId + '\'' +
                ", cd34FrozenCell=" + cd34FrozenCell +
                ", nrbc=" + nrbc +
                ", idmpositive=" + idmpositive +
                ", additionalProperties=" + additionalProperties +
                '}';
    }


}
