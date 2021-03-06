package com.huaweicloud.sdk.dcs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListNumberOfInstancesInDifferentStatusRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="include_failure")
    
    private Boolean includeFailure;

    public ListNumberOfInstancesInDifferentStatusRequest withIncludeFailure(Boolean includeFailure) {
        this.includeFailure = includeFailure;
        return this;
    }

    


    /**
     * Get includeFailure
     * @return includeFailure
     */
    public Boolean getIncludeFailure() {
        return includeFailure;
    }

    public void setIncludeFailure(Boolean includeFailure) {
        this.includeFailure = includeFailure;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNumberOfInstancesInDifferentStatusRequest listNumberOfInstancesInDifferentStatusRequest = (ListNumberOfInstancesInDifferentStatusRequest) o;
        return Objects.equals(this.includeFailure, listNumberOfInstancesInDifferentStatusRequest.includeFailure);
    }
    @Override
    public int hashCode() {
        return Objects.hash(includeFailure);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNumberOfInstancesInDifferentStatusRequest {\n");
        sb.append("    includeFailure: ").append(toIndentedString(includeFailure)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

