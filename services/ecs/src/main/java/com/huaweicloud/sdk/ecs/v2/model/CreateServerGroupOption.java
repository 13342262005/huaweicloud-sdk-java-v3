package com.huaweicloud.sdk.ecs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CreateServerGroupOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * Gets or Sets policies
     */
    public static class PoliciesEnum {

        
        /**
         * Enum ANTI_AFFINITY for value: "anti-affinity"
         */
        public static final PoliciesEnum ANTI_AFFINITY = new PoliciesEnum("anti-affinity");
        

        public static final Map<String, PoliciesEnum> staticFields = new HashMap<String, PoliciesEnum>() {
            { 
                put("anti-affinity", ANTI_AFFINITY);
            }
        };

        private String value;

        PoliciesEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PoliciesEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PoliciesEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new PoliciesEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static PoliciesEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PoliciesEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PoliciesEnum) {
                return this.value.equals(((PoliciesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policies")
    
    private List<PoliciesEnum> policies = new ArrayList<>();
    
    public CreateServerGroupOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 弹性云服务器组名称，长度大于0小于256字节。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateServerGroupOption withPolicies(List<PoliciesEnum> policies) {
        this.policies = policies;
        return this;
    }

    
    public CreateServerGroupOption addPoliciesItem(PoliciesEnum policiesItem) {
        this.policies.add(policiesItem);
        return this;
    }

    public CreateServerGroupOption withPolicies(Consumer<List<PoliciesEnum>> policiesSetter) {
        if(this.policies == null ){
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 与云服务器组关联的策略名称列表。包括：  - anti-affinity：此组中的弹性云服务器必须安排到不同的主机。  - affinity：此组中的弹性云服务器必须安排在同一主机上。  - soft-anti-affinity：如果可能，应将此组中的云服务器尽量安排到不同的主机上，但如果无法实现，则仍应安排它们，而不是导致生成失败。  - soft-affinity：如果可能，应将此组中的弹性云服务器尽量安排在同一主机上， 但如果无法实现，则仍应安排它们，而不是导致生成失败。    > 说明：  - 当前仅支持反亲和性anti-affinity策略。
     * @return policies
     */
    public List<PoliciesEnum> getPolicies() {
        return policies;
    }

    public void setPolicies(List<PoliciesEnum> policies) {
        this.policies = policies;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateServerGroupOption createServerGroupOption = (CreateServerGroupOption) o;
        return Objects.equals(this.name, createServerGroupOption.name) &&
            Objects.equals(this.policies, createServerGroupOption.policies);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, policies);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServerGroupOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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

