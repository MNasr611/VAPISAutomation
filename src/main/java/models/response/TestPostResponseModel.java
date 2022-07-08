package models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class TestPostResponseModel {
    public Args args;
    public String data;
    public Files files;
    public Form form;
    public Headers headers;
    public Object json;
    public String origin;
    public String url;


    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Args{
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Files{
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Form{
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Headers{
        @JsonProperty("Accept")
        public String accept;
        @JsonProperty("Accept-Encoding")
        public String acceptEncoding;
        @JsonProperty("Content-Length")
        public String contentLength;
        @JsonProperty("Host")
        public String host;
        @JsonProperty("Postman-Token")
        public String postmanToken;
        @JsonProperty("User-Agent")
        public String userAgent;
        @JsonProperty("X-Amzn-Trace-Id")
        public String xAmznTraceId;
    }


}


