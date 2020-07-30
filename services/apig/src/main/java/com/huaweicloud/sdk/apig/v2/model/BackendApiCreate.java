package com.huaweicloud.sdk.apig.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.ApiBackendVpcReq;
import com.huaweicloud.sdk.apig.v2.model.BackendApiBaseInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * web后端详情
 */
public class BackendApiCreate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorizer_id")
    
    private String authorizerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url_domain")
    
    private String urlDomain;
    /**
     * 请求协议
     */
    public static class ReqProtocolEnum {

        
        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ReqProtocolEnum HTTP = new ReqProtocolEnum("HTTP");
        
        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final ReqProtocolEnum HTTPS = new ReqProtocolEnum("HTTPS");
        

        public static final Map<String, ReqProtocolEnum> staticFields = new HashMap<String, ReqProtocolEnum>() {
            { 
                put("HTTP", HTTP);
                put("HTTPS", HTTPS);
            }
        };

        private String value;

        ReqProtocolEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReqProtocolEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ReqProtocolEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ReqProtocolEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ReqProtocolEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ReqProtocolEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ReqProtocolEnum) {
                return this.value.equals(((ReqProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_protocol")
    
    private ReqProtocolEnum reqProtocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;
    /**
     * 请求方式
     */
    public static class ReqMethodEnum {

        
        /**
         * Enum GET for value: "GET"
         */
        public static final ReqMethodEnum GET = new ReqMethodEnum("GET");
        
        /**
         * Enum POST for value: "POST"
         */
        public static final ReqMethodEnum POST = new ReqMethodEnum("POST");
        
        /**
         * Enum PUT for value: "PUT"
         */
        public static final ReqMethodEnum PUT = new ReqMethodEnum("PUT");
        
        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final ReqMethodEnum DELETE = new ReqMethodEnum("DELETE");
        
        /**
         * Enum HEAD for value: "HEAD"
         */
        public static final ReqMethodEnum HEAD = new ReqMethodEnum("HEAD");
        
        /**
         * Enum PATCH for value: "PATCH"
         */
        public static final ReqMethodEnum PATCH = new ReqMethodEnum("PATCH");
        
        /**
         * Enum OPTIONS for value: "OPTIONS"
         */
        public static final ReqMethodEnum OPTIONS = new ReqMethodEnum("OPTIONS");
        
        /**
         * Enum ANY for value: "ANY"
         */
        public static final ReqMethodEnum ANY = new ReqMethodEnum("ANY");
        

        public static final Map<String, ReqMethodEnum> staticFields = new HashMap<String, ReqMethodEnum>() {
            { 
                put("GET", GET);
                put("POST", POST);
                put("PUT", PUT);
                put("DELETE", DELETE);
                put("HEAD", HEAD);
                put("PATCH", PATCH);
                put("OPTIONS", OPTIONS);
                put("ANY", ANY);
            }
        };

        private String value;

        ReqMethodEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReqMethodEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ReqMethodEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ReqMethodEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ReqMethodEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ReqMethodEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ReqMethodEnum) {
                return this.value.equals(((ReqMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_method")
    
    private ReqMethodEnum reqMethod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_uri")
    
    private String reqUri;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeout")
    
    private Integer timeout;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_channel_info")
    
    private ApiBackendVpcReq vpcChannelInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_channel_status")
    
    private Integer vpcChannelStatus;

    public BackendApiCreate withAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    


    /**
     * 后端自定义认证对象的ID
     * @return authorizerId
     */
    public String getAuthorizerId() {
        return authorizerId;
    }

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    public BackendApiCreate withUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        return this;
    }

    


    /**
     * 后端服务的地址。  由主机（IP或域名）和端口号组成，总长度不超过255。格式为主机:端口（如：apig.example.com:7443）。如果不写端口，则HTTPS默认端口号为443，HTTP默认端口号为80。  支持环境变量，使用环境变量时，每个变量名的长度为3 ~ 32位的字符串，字符串由英文字母、数字、下划线、中划线组成，且只能以英文开头
     * @return urlDomain
     */
    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
    }

    public BackendApiCreate withReqProtocol(ReqProtocolEnum reqProtocol) {
        this.reqProtocol = reqProtocol;
        return this;
    }

    


    /**
     * 请求协议
     * @return reqProtocol
     */
    public ReqProtocolEnum getReqProtocol() {
        return reqProtocol;
    }

    public void setReqProtocol(ReqProtocolEnum reqProtocol) {
        this.reqProtocol = reqProtocol;
    }

    public BackendApiCreate withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 描述。字符长度不超过255 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BackendApiCreate withReqMethod(ReqMethodEnum reqMethod) {
        this.reqMethod = reqMethod;
        return this;
    }

    


    /**
     * 请求方式
     * @return reqMethod
     */
    public ReqMethodEnum getReqMethod() {
        return reqMethod;
    }

    public void setReqMethod(ReqMethodEnum reqMethod) {
        this.reqMethod = reqMethod;
    }

    public BackendApiCreate withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * web后端版本，字符长度不超过16
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public BackendApiCreate withReqUri(String reqUri) {
        this.reqUri = reqUri;
        return this;
    }

    


    /**
     * 请求地址。可以包含请求参数，用{}标识，比如/getUserInfo/{userId}，支持 * % - _ . 等特殊字符，总长度不超过512，且满足URI规范。  支持环境变量，使用环境变量时，每个变量名的长度为3 ~ 32位的字符串，字符串由英文字母、数字、中划线、下划线组成，且只能以英文开头。 > 需要服从URI规范。
     * @return reqUri
     */
    public String getReqUri() {
        return reqUri;
    }

    public void setReqUri(String reqUri) {
        this.reqUri = reqUri;
    }

    public BackendApiCreate withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    


    /**
     * API网关请求后端服务的超时时间。  单位：毫秒。请求参数值不在合法范围内时将使用默认值
     * minimum: 1
     * maximum: 60000
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public BackendApiCreate withVpcChannelInfo(ApiBackendVpcReq vpcChannelInfo) {
        this.vpcChannelInfo = vpcChannelInfo;
        return this;
    }

    public BackendApiCreate withVpcChannelInfo(Consumer<ApiBackendVpcReq> vpcChannelInfoSetter) {
        if(this.vpcChannelInfo == null ){
            this.vpcChannelInfo = new ApiBackendVpcReq();
            vpcChannelInfoSetter.accept(this.vpcChannelInfo);
        }
        
        return this;
    }


    /**
     * Get vpcChannelInfo
     * @return vpcChannelInfo
     */
    public ApiBackendVpcReq getVpcChannelInfo() {
        return vpcChannelInfo;
    }

    public void setVpcChannelInfo(ApiBackendVpcReq vpcChannelInfo) {
        this.vpcChannelInfo = vpcChannelInfo;
    }

    public BackendApiCreate withVpcChannelStatus(Integer vpcChannelStatus) {
        this.vpcChannelStatus = vpcChannelStatus;
        return this;
    }

    


    /**
     * 是否使用VPC通道 - 1 : 使用VPC通道 - 2 : 不使用VPC通道
     * @return vpcChannelStatus
     */
    public Integer getVpcChannelStatus() {
        return vpcChannelStatus;
    }

    public void setVpcChannelStatus(Integer vpcChannelStatus) {
        this.vpcChannelStatus = vpcChannelStatus;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackendApiCreate backendApiCreate = (BackendApiCreate) o;
        return Objects.equals(this.authorizerId, backendApiCreate.authorizerId) &&
            Objects.equals(this.urlDomain, backendApiCreate.urlDomain) &&
            Objects.equals(this.reqProtocol, backendApiCreate.reqProtocol) &&
            Objects.equals(this.remark, backendApiCreate.remark) &&
            Objects.equals(this.reqMethod, backendApiCreate.reqMethod) &&
            Objects.equals(this.version, backendApiCreate.version) &&
            Objects.equals(this.reqUri, backendApiCreate.reqUri) &&
            Objects.equals(this.timeout, backendApiCreate.timeout) &&
            Objects.equals(this.vpcChannelInfo, backendApiCreate.vpcChannelInfo) &&
            Objects.equals(this.vpcChannelStatus, backendApiCreate.vpcChannelStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorizerId, urlDomain, reqProtocol, remark, reqMethod, version, reqUri, timeout, vpcChannelInfo, vpcChannelStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackendApiCreate {\n");
        sb.append("    authorizerId: ").append(toIndentedString(authorizerId)).append("\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
        sb.append("    reqProtocol: ").append(toIndentedString(reqProtocol)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    reqMethod: ").append(toIndentedString(reqMethod)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    reqUri: ").append(toIndentedString(reqUri)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    vpcChannelInfo: ").append(toIndentedString(vpcChannelInfo)).append("\n");
        sb.append("    vpcChannelStatus: ").append(toIndentedString(vpcChannelStatus)).append("\n");
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
