
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
    "totalNumberOfResults",
    "pageNumber",
    "pageSize",
    "firstPage",
    "lastPage",
    "totalPages",
    "sources"
})
public class ViewPotentailSourcesResponse {

    @JsonProperty("totalNumberOfResults")
    private Integer totalNumberOfResults;
    @JsonProperty("pageNumber")
    private Integer pageNumber;
    @JsonProperty("pageSize")
    private Integer pageSize;
    @JsonProperty("firstPage")
    private Boolean firstPage;
    @JsonProperty("lastPage")
    private Boolean lastPage;
    @JsonProperty("totalPages")
    private Integer totalPages;
    @JsonProperty("sources")
    private List<Source> sources = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("totalNumberOfResults")
    public Integer getTotalNumberOfResults() {
        return totalNumberOfResults;
    }

    @JsonProperty("totalNumberOfResults")
    public void setTotalNumberOfResults(Integer totalNumberOfResults) {
        this.totalNumberOfResults = totalNumberOfResults;
    }

    @JsonProperty("pageNumber")
    public Integer getPageNumber() {
        return pageNumber;
    }

    @JsonProperty("pageNumber")
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    @JsonProperty("pageSize")
    public Integer getPageSize() {
        return pageSize;
    }

    @JsonProperty("pageSize")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @JsonProperty("firstPage")
    public Boolean getFirstPage() {
        return firstPage;
    }

    @JsonProperty("firstPage")
    public void setFirstPage(Boolean firstPage) {
        this.firstPage = firstPage;
    }

    @JsonProperty("lastPage")
    public Boolean getLastPage() {
        return lastPage;
    }

    @JsonProperty("lastPage")
    public void setLastPage(Boolean lastPage) {
        this.lastPage = lastPage;
    }

    @JsonProperty("totalPages")
    public Integer getTotalPages() {
        return totalPages;
    }

    @JsonProperty("totalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @JsonProperty("sources")
    public List<Source> getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(List<Source> sources) {
        this.sources = sources;
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
        return "ViewPotentailSourcesResponse{" +
                "totalNumberOfResults=" + totalNumberOfResults +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", firstPage=" + firstPage +
                ", lastPage=" + lastPage +
                ", totalPages=" + totalPages +
                ", sources=" + sources +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
