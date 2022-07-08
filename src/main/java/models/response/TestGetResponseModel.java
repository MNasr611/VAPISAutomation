package models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestGetResponseModel {
    public Args args;
    public Headers headers;
    public String origin;
    public String url;


    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Args{
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Headers{
        @JsonProperty("Accept")
        public String accept;
        @JsonProperty("Accept-Encoding")
        public String acceptEncoding;
        @JsonProperty("Accept-Language")
        public String acceptLanguage;
        @JsonProperty("Host")
        public String host;
        @JsonProperty("Referer")
        public String referer;
        @JsonProperty("Sec-Ch-Ua")
        public String secChUa;
        @JsonProperty("Sec-Ch-Ua-Mobile")
        public String secChUaMobile;
        @JsonProperty("Sec-Ch-Ua-Platform")
        public String secChUaPlatform;
        @JsonProperty("Sec-Fetch-Dest")
        public String secFetchDest;
        @JsonProperty("Sec-Fetch-Mode")
        public String secFetchMode;
        @JsonProperty("Sec-Fetch-Site")
        public String secFetchSite;
        @JsonProperty("User-Agent")
        public String userAgent;
        @JsonProperty("Vfukmvax")
        public String vfukmvax;
        @JsonProperty("X-Amzn-Trace-Id")
        public String xAmznTraceId;
    }



}
