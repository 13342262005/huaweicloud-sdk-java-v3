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
 *  
 */
public class NovaLink  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="href")
    
    private String href;
    /**
     * 有三种取值。self：自助链接包含版本链接的资源。立即链接后使用这些链接。bookmark：书签链接提供了一个永久资源的永久链接，该链接适合于长期存储。alternate：备用链接可以包含资源的替换表示形式。例如，OpenStack计算映像可能在OpenStack映像服务中有一个替代表示。
     */
    public static class RelEnum {

        
        /**
         * Enum SELF for value: "self"
         */
        public static final RelEnum SELF = new RelEnum("self");
        
        /**
         * Enum BOOKMARK for value: "bookmark"
         */
        public static final RelEnum BOOKMARK = new RelEnum("bookmark");
        
        /**
         * Enum ALTERNATE for value: "alternate"
         */
        public static final RelEnum ALTERNATE = new RelEnum("alternate");
        
        /**
         * Enum DESCRIBEDBY for value: "describedby"
         */
        public static final RelEnum DESCRIBEDBY = new RelEnum("describedby");
        

        public static final Map<String, RelEnum> staticFields = new HashMap<String, RelEnum>() {
            { 
                put("self", SELF);
                put("bookmark", BOOKMARK);
                put("alternate", ALTERNATE);
                put("describedby", DESCRIBEDBY);
            }
        };

        private String value;

        RelEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RelEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RelEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new RelEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static RelEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RelEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RelEnum) {
                return this.value.equals(((RelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rel")
    
    private RelEnum rel;

    public NovaLink withHref(String href) {
        this.href = href;
        return this;
    }

    


    /**
     * 相应资源的链接。
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public NovaLink withRel(RelEnum rel) {
        this.rel = rel;
        return this;
    }

    


    /**
     * 有三种取值。self：自助链接包含版本链接的资源。立即链接后使用这些链接。bookmark：书签链接提供了一个永久资源的永久链接，该链接适合于长期存储。alternate：备用链接可以包含资源的替换表示形式。例如，OpenStack计算映像可能在OpenStack映像服务中有一个替代表示。
     * @return rel
     */
    public RelEnum getRel() {
        return rel;
    }

    public void setRel(RelEnum rel) {
        this.rel = rel;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaLink novaLink = (NovaLink) o;
        return Objects.equals(this.href, novaLink.href) &&
            Objects.equals(this.rel, novaLink.rel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(href, rel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaLink {\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
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

