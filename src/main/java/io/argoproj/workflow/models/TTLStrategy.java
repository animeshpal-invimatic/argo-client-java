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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TTLStrategy is the strategy for the time to live depending on if the workflow succeeded or failed
 */
@ApiModel(description = "TTLStrategy is the strategy for the time to live depending on if the workflow succeeded or failed")

public class TTLStrategy {
  public static final String SERIALIZED_NAME_SECONDS_AFTER_COMPLETION = "secondsAfterCompletion";
  @SerializedName(SERIALIZED_NAME_SECONDS_AFTER_COMPLETION)
  private Integer secondsAfterCompletion;

  public static final String SERIALIZED_NAME_SECONDS_AFTER_FAILURE = "secondsAfterFailure";
  @SerializedName(SERIALIZED_NAME_SECONDS_AFTER_FAILURE)
  private Integer secondsAfterFailure;

  public static final String SERIALIZED_NAME_SECONDS_AFTER_SUCCESS = "secondsAfterSuccess";
  @SerializedName(SERIALIZED_NAME_SECONDS_AFTER_SUCCESS)
  private Integer secondsAfterSuccess;


  public TTLStrategy secondsAfterCompletion(Integer secondsAfterCompletion) {
    
    this.secondsAfterCompletion = secondsAfterCompletion;
    return this;
  }

   /**
   * SecondsAfterCompletion is the number of seconds to live after completion
   * @return secondsAfterCompletion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SecondsAfterCompletion is the number of seconds to live after completion")

  public Integer getSecondsAfterCompletion() {
    return secondsAfterCompletion;
  }


  public void setSecondsAfterCompletion(Integer secondsAfterCompletion) {
    this.secondsAfterCompletion = secondsAfterCompletion;
  }


  public TTLStrategy secondsAfterFailure(Integer secondsAfterFailure) {
    
    this.secondsAfterFailure = secondsAfterFailure;
    return this;
  }

   /**
   * SecondsAfterFailure is the number of seconds to live after failure
   * @return secondsAfterFailure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SecondsAfterFailure is the number of seconds to live after failure")

  public Integer getSecondsAfterFailure() {
    return secondsAfterFailure;
  }


  public void setSecondsAfterFailure(Integer secondsAfterFailure) {
    this.secondsAfterFailure = secondsAfterFailure;
  }


  public TTLStrategy secondsAfterSuccess(Integer secondsAfterSuccess) {
    
    this.secondsAfterSuccess = secondsAfterSuccess;
    return this;
  }

   /**
   * SecondsAfterSuccess is the number of seconds to live after success
   * @return secondsAfterSuccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SecondsAfterSuccess is the number of seconds to live after success")

  public Integer getSecondsAfterSuccess() {
    return secondsAfterSuccess;
  }


  public void setSecondsAfterSuccess(Integer secondsAfterSuccess) {
    this.secondsAfterSuccess = secondsAfterSuccess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TTLStrategy ttLStrategy = (TTLStrategy) o;
    return Objects.equals(this.secondsAfterCompletion, ttLStrategy.secondsAfterCompletion) &&
        Objects.equals(this.secondsAfterFailure, ttLStrategy.secondsAfterFailure) &&
        Objects.equals(this.secondsAfterSuccess, ttLStrategy.secondsAfterSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secondsAfterCompletion, secondsAfterFailure, secondsAfterSuccess);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TTLStrategy {\n");
    sb.append("    secondsAfterCompletion: ").append(toIndentedString(secondsAfterCompletion)).append("\n");
    sb.append("    secondsAfterFailure: ").append(toIndentedString(secondsAfterFailure)).append("\n");
    sb.append("    secondsAfterSuccess: ").append(toIndentedString(secondsAfterSuccess)).append("\n");
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

