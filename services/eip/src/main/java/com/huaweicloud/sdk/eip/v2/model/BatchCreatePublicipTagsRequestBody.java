package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.ResourceTagOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 批量操作资源标签的请求体
 */
public class BatchCreatePublicipTagsRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<ResourceTagOption> tags = new ArrayList<>();
        /**
     * 操作标识  create：创建  action为create时，tag的value必选
     */
    public static class ActionEnum {

        
        /**
         * Enum CREATE for value: "create"
         */
        public static final ActionEnum CREATE = new ActionEnum("create");
        

        public static final Map<String, ActionEnum> staticFields = new HashMap<String, ActionEnum>() {
            { 
                put("create", CREATE);
            }
        };

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ActionEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private ActionEnum action;

    public BatchCreatePublicipTagsRequestBody withTags(List<ResourceTagOption> tags) {
        this.tags = tags;
        return this;
    }

    
    public BatchCreatePublicipTagsRequestBody addTagsItem(ResourceTagOption tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public BatchCreatePublicipTagsRequestBody withTags(Consumer<List<ResourceTagOption>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<ResourceTagOption> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTagOption> tags) {
        this.tags = tags;
    }

    public BatchCreatePublicipTagsRequestBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    


    /**
     * 操作标识  create：创建  action为create时，tag的value必选
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreatePublicipTagsRequestBody batchCreatePublicipTagsRequestBody = (BatchCreatePublicipTagsRequestBody) o;
        return Objects.equals(this.tags, batchCreatePublicipTagsRequestBody.tags) &&
            Objects.equals(this.action, batchCreatePublicipTagsRequestBody.action);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tags, action);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreatePublicipTagsRequestBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

