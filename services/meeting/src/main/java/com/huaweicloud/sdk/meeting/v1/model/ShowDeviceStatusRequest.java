package com.huaweicloud.sdk.meeting.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowDeviceStatusRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-ID")
    
    private String xRequestID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Accept-Language")
    
    private String acceptLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private List<String> body = null;
    
    public ShowDeviceStatusRequest withXRequestID(String xRequestID) {
        this.xRequestID = xRequestID;
        return this;
    }

    


    /**
     * Get xRequestID
     * @return xRequestID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXRequestID() {
        return xRequestID;
    }

    public void setXRequestID(String xRequestID) {
        this.xRequestID = xRequestID;
    }

    public ShowDeviceStatusRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    


    /**
     * Get acceptLanguage
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public ShowDeviceStatusRequest withBody(List<String> body) {
        this.body = body;
        return this;
    }

    
    public ShowDeviceStatusRequest addBodyItem(String bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ShowDeviceStatusRequest withBody(Consumer<List<String>> bodySetter) {
        if(this.body == null ){
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * 所请求查询的终端的号码。
     * @return body
     */
    public List<String> getBody() {
        return body;
    }

    public void setBody(List<String> body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDeviceStatusRequest showDeviceStatusRequest = (ShowDeviceStatusRequest) o;
        return Objects.equals(this.xRequestID, showDeviceStatusRequest.xRequestID) &&
            Objects.equals(this.acceptLanguage, showDeviceStatusRequest.acceptLanguage) &&
            Objects.equals(this.body, showDeviceStatusRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xRequestID, acceptLanguage, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeviceStatusRequest {\n");
        sb.append("    xRequestID: ").append(toIndentedString(xRequestID)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
