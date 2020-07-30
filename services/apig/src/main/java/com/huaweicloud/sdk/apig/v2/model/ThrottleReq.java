package com.huaweicloud.sdk.apig.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ThrottleReq
 */
public class ThrottleReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_call_limits")
    
    private Integer appCallLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 流控的时间单位
     */
    public static class TimeUnitEnum {

        
        /**
         * Enum SECOND for value: "SECOND"
         */
        public static final TimeUnitEnum SECOND = new TimeUnitEnum("SECOND");
        
        /**
         * Enum MINUTE for value: "MINUTE"
         */
        public static final TimeUnitEnum MINUTE = new TimeUnitEnum("MINUTE");
        
        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final TimeUnitEnum HOUR = new TimeUnitEnum("HOUR");
        
        /**
         * Enum DAY for value: "DAY"
         */
        public static final TimeUnitEnum DAY = new TimeUnitEnum("DAY");
        

        public static final Map<String, TimeUnitEnum> staticFields = new HashMap<String, TimeUnitEnum>() {
            { 
                put("SECOND", SECOND);
                put("MINUTE", MINUTE);
                put("HOUR", HOUR);
                put("DAY", DAY);
            }
        };

        private String value;

        TimeUnitEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TimeUnitEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TimeUnitEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TimeUnitEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TimeUnitEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TimeUnitEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TimeUnitEnum) {
                return this.value.equals(((TimeUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_unit")
    
    private TimeUnitEnum timeUnit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_call_limits")
    
    private Integer apiCallLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private Integer type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_adaptive_control")
    
    private String enableAdaptiveControl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_call_limits")
    
    private Integer userCallLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_interval")
    
    private Integer timeInterval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_call_limits")
    
    private Integer ipCallLimits;

    public ThrottleReq withAppCallLimits(Integer appCallLimits) {
        this.appCallLimits = appCallLimits;
        return this;
    }

    


    /**
     * APP流量限制是指一个API在时长之内被每个APP访问的次数上限，该数值不超过用户流量限制值。输入的值不超过2147483647。正整数。 
     * @return appCallLimits
     */
    public Integer getAppCallLimits() {
        return appCallLimits;
    }

    public void setAppCallLimits(Integer appCallLimits) {
        this.appCallLimits = appCallLimits;
    }

    public ThrottleReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 流控策略名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头，3 ~ 64字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ThrottleReq withTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    


    /**
     * 流控的时间单位
     * @return timeUnit
     */
    public TimeUnitEnum getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
    }

    public ThrottleReq withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 流控策略描述字符长度不超过255。 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ThrottleReq withApiCallLimits(Integer apiCallLimits) {
        this.apiCallLimits = apiCallLimits;
        return this;
    }

    


    /**
     * API流量限制是指时长内一个API能够被访问的次数上限。该值不超过系统默认配额限制，系统默认配额为200tps，用户可根据实际情况修改该系统默认配额。输入的值不超过2147483647。正整数。 
     * @return apiCallLimits
     */
    public Integer getApiCallLimits() {
        return apiCallLimits;
    }

    public void setApiCallLimits(Integer apiCallLimits) {
        this.apiCallLimits = apiCallLimits;
    }

    public ThrottleReq withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 流控策略的类型 - 1：独享，表示绑定到流控策略的单个API流控时间内能够被调用多少次。 - 2：共享，表示绑定到流控策略的所有API流控时间内能够被调用多少次。
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ThrottleReq withEnableAdaptiveControl(String enableAdaptiveControl) {
        this.enableAdaptiveControl = enableAdaptiveControl;
        return this;
    }

    


    /**
     * 是否开启动态流控： - TRUE - FALSE  暂不支持
     * @return enableAdaptiveControl
     */
    public String getEnableAdaptiveControl() {
        return enableAdaptiveControl;
    }

    public void setEnableAdaptiveControl(String enableAdaptiveControl) {
        this.enableAdaptiveControl = enableAdaptiveControl;
    }

    public ThrottleReq withUserCallLimits(Integer userCallLimits) {
        this.userCallLimits = userCallLimits;
        return this;
    }

    


    /**
     * 用户流量限制是指一个API在时长之内每一个用户能访问的次数上限，该数值不超过API流量限制值。输入的值不超过2147483647。正整数。
     * @return userCallLimits
     */
    public Integer getUserCallLimits() {
        return userCallLimits;
    }

    public void setUserCallLimits(Integer userCallLimits) {
        this.userCallLimits = userCallLimits;
    }

    public ThrottleReq withTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    


    /**
     * 流量控制的时长单位。与“流量限制次数”配合使用，表示单位时间内的API请求次数上限。输入的值不超过2147483647。正整数。
     * @return timeInterval
     */
    public Integer getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    public ThrottleReq withIpCallLimits(Integer ipCallLimits) {
        this.ipCallLimits = ipCallLimits;
        return this;
    }

    


    /**
     * 源IP流量限制是指一个API在时长之内被每个IP访问的次数上限，该数值不超过API流量限制值。输入的值不超过2147483647。正整数。
     * @return ipCallLimits
     */
    public Integer getIpCallLimits() {
        return ipCallLimits;
    }

    public void setIpCallLimits(Integer ipCallLimits) {
        this.ipCallLimits = ipCallLimits;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThrottleReq throttleReq = (ThrottleReq) o;
        return Objects.equals(this.appCallLimits, throttleReq.appCallLimits) &&
            Objects.equals(this.name, throttleReq.name) &&
            Objects.equals(this.timeUnit, throttleReq.timeUnit) &&
            Objects.equals(this.remark, throttleReq.remark) &&
            Objects.equals(this.apiCallLimits, throttleReq.apiCallLimits) &&
            Objects.equals(this.type, throttleReq.type) &&
            Objects.equals(this.enableAdaptiveControl, throttleReq.enableAdaptiveControl) &&
            Objects.equals(this.userCallLimits, throttleReq.userCallLimits) &&
            Objects.equals(this.timeInterval, throttleReq.timeInterval) &&
            Objects.equals(this.ipCallLimits, throttleReq.ipCallLimits);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appCallLimits, name, timeUnit, remark, apiCallLimits, type, enableAdaptiveControl, userCallLimits, timeInterval, ipCallLimits);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleReq {\n");
        sb.append("    appCallLimits: ").append(toIndentedString(appCallLimits)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    apiCallLimits: ").append(toIndentedString(apiCallLimits)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enableAdaptiveControl: ").append(toIndentedString(enableAdaptiveControl)).append("\n");
        sb.append("    userCallLimits: ").append(toIndentedString(userCallLimits)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
        sb.append("    ipCallLimits: ").append(toIndentedString(ipCallLimits)).append("\n");
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
