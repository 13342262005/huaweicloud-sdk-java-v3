package com.huaweicloud.sdk.ecs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListResizeFlavorsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_uuid")
    
    private String instanceUuid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 1000;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;
    /**
     * Gets or Sets sortDir
     */
    public static class SortDirEnum {

        
        /**
         * Enum ASC for value: "asc"
         */
        public static final SortDirEnum ASC = new SortDirEnum("asc");
        
        /**
         * Enum DESC for value: "desc"
         */
        public static final SortDirEnum DESC = new SortDirEnum("desc");
        

        public static final Map<String, SortDirEnum> staticFields = new HashMap<String, SortDirEnum>() {
            { 
                put("asc", ASC);
                put("desc", DESC);
            }
        };

        private String value;

        SortDirEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SortDirEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SortDirEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new SortDirEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static SortDirEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SortDirEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SortDirEnum) {
                return this.value.equals(((SortDirEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_dir")
    
    private SortDirEnum sortDir = SortDirEnum.ASC;
    /**
     * Gets or Sets sortKey
     */
    public static class SortKeyEnum {

        
        /**
         * Enum FLAVORID for value: "flavorid"
         */
        public static final SortKeyEnum FLAVORID = new SortKeyEnum("flavorid");
        
        /**
         * Enum SORT_KEY for value: "sort_key"
         */
        public static final SortKeyEnum SORT_KEY = new SortKeyEnum("sort_key");
        
        /**
         * Enum NAME for value: "name"
         */
        public static final SortKeyEnum NAME = new SortKeyEnum("name");
        
        /**
         * Enum MEMORY_MB for value: "memory_mb"
         */
        public static final SortKeyEnum MEMORY_MB = new SortKeyEnum("memory_mb");
        
        /**
         * Enum VCPUS for value: "vcpus"
         */
        public static final SortKeyEnum VCPUS = new SortKeyEnum("vcpus");
        
        /**
         * Enum ROOT_GB for value: "root_gb"
         */
        public static final SortKeyEnum ROOT_GB = new SortKeyEnum("root_gb");
        

        public static final Map<String, SortKeyEnum> staticFields = new HashMap<String, SortKeyEnum>() {
            { 
                put("flavorid", FLAVORID);
                put("sort_key", SORT_KEY);
                put("name", NAME);
                put("memory_mb", MEMORY_MB);
                put("vcpus", VCPUS);
                put("root_gb", ROOT_GB);
            }
        };

        private String value;

        SortKeyEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SortKeyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SortKeyEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new SortKeyEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static SortKeyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SortKeyEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_key")
    
    private SortKeyEnum sortKey = SortKeyEnum.FLAVORID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_flavor_id")
    
    private String sourceFlavorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_flavor_name")
    
    private String sourceFlavorName;

    public ListResizeFlavorsRequest withInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
        return this;
    }

    


    /**
     * Get instanceUuid
     * @return instanceUuid
     */
    public String getInstanceUuid() {
        return instanceUuid;
    }

    public void setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    public ListResizeFlavorsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListResizeFlavorsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListResizeFlavorsRequest withSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    


    /**
     * Get sortDir
     * @return sortDir
     */
    public SortDirEnum getSortDir() {
        return sortDir;
    }

    public void setSortDir(SortDirEnum sortDir) {
        this.sortDir = sortDir;
    }

    public ListResizeFlavorsRequest withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    


    /**
     * Get sortKey
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public ListResizeFlavorsRequest withSourceFlavorId(String sourceFlavorId) {
        this.sourceFlavorId = sourceFlavorId;
        return this;
    }

    


    /**
     * Get sourceFlavorId
     * @return sourceFlavorId
     */
    public String getSourceFlavorId() {
        return sourceFlavorId;
    }

    public void setSourceFlavorId(String sourceFlavorId) {
        this.sourceFlavorId = sourceFlavorId;
    }

    public ListResizeFlavorsRequest withSourceFlavorName(String sourceFlavorName) {
        this.sourceFlavorName = sourceFlavorName;
        return this;
    }

    


    /**
     * Get sourceFlavorName
     * @return sourceFlavorName
     */
    public String getSourceFlavorName() {
        return sourceFlavorName;
    }

    public void setSourceFlavorName(String sourceFlavorName) {
        this.sourceFlavorName = sourceFlavorName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResizeFlavorsRequest listResizeFlavorsRequest = (ListResizeFlavorsRequest) o;
        return Objects.equals(this.instanceUuid, listResizeFlavorsRequest.instanceUuid) &&
            Objects.equals(this.limit, listResizeFlavorsRequest.limit) &&
            Objects.equals(this.marker, listResizeFlavorsRequest.marker) &&
            Objects.equals(this.sortDir, listResizeFlavorsRequest.sortDir) &&
            Objects.equals(this.sortKey, listResizeFlavorsRequest.sortKey) &&
            Objects.equals(this.sourceFlavorId, listResizeFlavorsRequest.sourceFlavorId) &&
            Objects.equals(this.sourceFlavorName, listResizeFlavorsRequest.sourceFlavorName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceUuid, limit, marker, sortDir, sortKey, sourceFlavorId, sourceFlavorName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResizeFlavorsRequest {\n");
        sb.append("    instanceUuid: ").append(toIndentedString(instanceUuid)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sourceFlavorId: ").append(toIndentedString(sourceFlavorId)).append("\n");
        sb.append("    sourceFlavorName: ").append(toIndentedString(sourceFlavorName)).append("\n");
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

