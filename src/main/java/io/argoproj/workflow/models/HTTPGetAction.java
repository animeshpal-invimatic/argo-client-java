/*
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: v2.10.0-rc3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.HTTPHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HTTPGetAction describes an action based on HTTP Get requests.
 */
@ApiModel(description = "HTTPGetAction describes an action based on HTTP Get requests.")

public class HTTPGetAction {
  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_HTTP_HEADERS = "httpHeaders";
  @SerializedName(SERIALIZED_NAME_HTTP_HEADERS)
  private List<HTTPHeader> httpHeaders = null;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private String port;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;


  public HTTPGetAction host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Host name to connect to, defaults to the pod IP. You probably want to set \&quot;Host\&quot; in httpHeaders instead.
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Host name to connect to, defaults to the pod IP. You probably want to set \"Host\" in httpHeaders instead.")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public HTTPGetAction httpHeaders(List<HTTPHeader> httpHeaders) {
    
    this.httpHeaders = httpHeaders;
    return this;
  }

  public HTTPGetAction addHttpHeadersItem(HTTPHeader httpHeadersItem) {
    if (this.httpHeaders == null) {
      this.httpHeaders = new ArrayList<HTTPHeader>();
    }
    this.httpHeaders.add(httpHeadersItem);
    return this;
  }

   /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   * @return httpHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom headers to set in the request. HTTP allows repeated headers.")

  public List<HTTPHeader> getHttpHeaders() {
    return httpHeaders;
  }


  public void setHttpHeaders(List<HTTPHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
  }


  public HTTPGetAction path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path to access on the HTTP server.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to access on the HTTP server.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public HTTPGetAction port(String port) {
    
    this.port = port;
    return this;
  }

   /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")

  public String getPort() {
    return port;
  }


  public void setPort(String port) {
    this.port = port;
  }


  public HTTPGetAction scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * Scheme to use for connecting to the host. Defaults to HTTP.
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scheme to use for connecting to the host. Defaults to HTTP.")

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPGetAction htTPGetAction = (HTTPGetAction) o;
    return Objects.equals(this.host, htTPGetAction.host) &&
        Objects.equals(this.httpHeaders, htTPGetAction.httpHeaders) &&
        Objects.equals(this.path, htTPGetAction.path) &&
        Objects.equals(this.port, htTPGetAction.port) &&
        Objects.equals(this.scheme, htTPGetAction.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, httpHeaders, path, port, scheme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPGetAction {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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

