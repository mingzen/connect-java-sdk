/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class BatchDeleteCatalogObjectsResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("deleted_object_ids")
  private List<String> deletedObjectIds = new ArrayList<String>();

  @JsonProperty("deleted_at")
  private String deletedAt = null;

  public BatchDeleteCatalogObjectsResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public BatchDeleteCatalogObjectsResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * The set of [Error](#type-error)s encountered.
   * @return errors
  **/
  @ApiModelProperty(value = "The set of [Error](#type-error)s encountered.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public BatchDeleteCatalogObjectsResponse deletedObjectIds(List<String> deletedObjectIds) {
    this.deletedObjectIds = deletedObjectIds;
    return this;
  }

  public BatchDeleteCatalogObjectsResponse addDeletedObjectIdsItem(String deletedObjectIdsItem) {
    this.deletedObjectIds.add(deletedObjectIdsItem);
    return this;
  }

   /**
   * The IDs of all [CatalogObject](#type-catalogobject)s deleted by this request.
   * @return deletedObjectIds
  **/
  @ApiModelProperty(value = "The IDs of all [CatalogObject](#type-catalogobject)s deleted by this request.")
  public List<String> getDeletedObjectIds() {
    return deletedObjectIds;
  }

  public void setDeletedObjectIds(List<String> deletedObjectIds) {
    this.deletedObjectIds = deletedObjectIds;
  }

  public BatchDeleteCatalogObjectsResponse deletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * The database [timestamp](#workingwithdates) of this deletion in RFC 3339 format, e.g., \"2016-09-04T23:59:33.123Z\".
   * @return deletedAt
  **/
  @ApiModelProperty(value = "The database [timestamp](#workingwithdates) of this deletion in RFC 3339 format, e.g., \"2016-09-04T23:59:33.123Z\".")
  public String getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchDeleteCatalogObjectsResponse batchDeleteCatalogObjectsResponse = (BatchDeleteCatalogObjectsResponse) o;
    return Objects.equals(this.errors, batchDeleteCatalogObjectsResponse.errors) &&
        Objects.equals(this.deletedObjectIds, batchDeleteCatalogObjectsResponse.deletedObjectIds) &&
        Objects.equals(this.deletedAt, batchDeleteCatalogObjectsResponse.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, deletedObjectIds, deletedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDeleteCatalogObjectsResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    deletedObjectIds: ").append(toIndentedString(deletedObjectIds)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
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

