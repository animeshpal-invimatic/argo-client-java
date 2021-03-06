/*
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: v2.10.2
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ValueFrom describes a location in which to obtain the value to a parameter
 */
@ApiModel(description = "ValueFrom describes a location in which to obtain the value to a parameter")

public class ValueFrom {
  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private String _default;

  public static final String SERIALIZED_NAME_JQ_FILTER = "jqFilter";
  @SerializedName(SERIALIZED_NAME_JQ_FILTER)
  private String jqFilter;

  public static final String SERIALIZED_NAME_JSON_PATH = "jsonPath";
  @SerializedName(SERIALIZED_NAME_JSON_PATH)
  private String jsonPath;

  public static final String SERIALIZED_NAME_PARAMETER = "parameter";
  @SerializedName(SERIALIZED_NAME_PARAMETER)
  private String parameter;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;


  public ValueFrom _default(String _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IntOrString is a type that can hold an int32 or a string.  When used in JSON or YAML marshalling and unmarshalling, it produces or consumes the inner type.  This allows you to have, for example, a JSON field that can accept a name or number.")

  public String getDefault() {
    return _default;
  }


  public void setDefault(String _default) {
    this._default = _default;
  }


  public ValueFrom jqFilter(String jqFilter) {
    
    this.jqFilter = jqFilter;
    return this;
  }

   /**
   * JQFilter expression against the resource object in resource templates
   * @return jqFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JQFilter expression against the resource object in resource templates")

  public String getJqFilter() {
    return jqFilter;
  }


  public void setJqFilter(String jqFilter) {
    this.jqFilter = jqFilter;
  }


  public ValueFrom jsonPath(String jsonPath) {
    
    this.jsonPath = jsonPath;
    return this;
  }

   /**
   * JSONPath of a resource to retrieve an output parameter value from in resource templates
   * @return jsonPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSONPath of a resource to retrieve an output parameter value from in resource templates")

  public String getJsonPath() {
    return jsonPath;
  }


  public void setJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
  }


  public ValueFrom parameter(String parameter) {
    
    this.parameter = parameter;
    return this;
  }

   /**
   * Parameter reference to a step or dag task in which to retrieve an output parameter value from (e.g. &#39;{{steps.mystep.outputs.myparam}}&#39;)
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameter reference to a step or dag task in which to retrieve an output parameter value from (e.g. '{{steps.mystep.outputs.myparam}}')")

  public String getParameter() {
    return parameter;
  }


  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public ValueFrom path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path in the container to retrieve an output parameter value from in container templates
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path in the container to retrieve an output parameter value from in container templates")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueFrom valueFrom = (ValueFrom) o;
    return Objects.equals(this._default, valueFrom._default) &&
        Objects.equals(this.jqFilter, valueFrom.jqFilter) &&
        Objects.equals(this.jsonPath, valueFrom.jsonPath) &&
        Objects.equals(this.parameter, valueFrom.parameter) &&
        Objects.equals(this.path, valueFrom.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, jqFilter, jsonPath, parameter, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueFrom {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    jqFilter: ").append(toIndentedString(jqFilter)).append("\n");
    sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

