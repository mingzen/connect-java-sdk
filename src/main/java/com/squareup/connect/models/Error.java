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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents an error encountered during a request to the Connect API.  See [Handling errors](#handlingerrors) for more information.
 */
@ApiModel(description = "Represents an error encountered during a request to the Connect API.  See [Handling errors](#handlingerrors) for more information.")

public class Error {
  /**
   * The error's high-level category. See [ErrorCategory](#type-errorcategory) for possible values.
   */
  public enum CategoryEnum {
    API_ERROR("API_ERROR"),
    
    AUTHENTICATION_ERROR("AUTHENTICATION_ERROR"),
    
    INVALID_REQUEST_ERROR("INVALID_REQUEST_ERROR"),
    
    RATE_LIMIT_ERROR("RATE_LIMIT_ERROR"),
    
    PAYMENT_METHOD_ERROR("PAYMENT_METHOD_ERROR"),
    
    REFUND_ERROR("REFUND_ERROR");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("category")
  private CategoryEnum category = null;

  /**
   * The error's specific code. See [ErrorCode](#type-errorcode) for possible values
   */
  public enum CodeEnum {
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR"),
    
    UNAUTHORIZED("UNAUTHORIZED"),
    
    ACCESS_TOKEN_EXPIRED("ACCESS_TOKEN_EXPIRED"),
    
    ACCESS_TOKEN_REVOKED("ACCESS_TOKEN_REVOKED"),
    
    FORBIDDEN("FORBIDDEN"),
    
    INSUFFICIENT_SCOPES("INSUFFICIENT_SCOPES"),
    
    APPLICATION_DISABLED("APPLICATION_DISABLED"),
    
    V1_APPLICATION("V1_APPLICATION"),
    
    V1_ACCESS_TOKEN("V1_ACCESS_TOKEN"),
    
    CARD_PROCESSING_NOT_ENABLED("CARD_PROCESSING_NOT_ENABLED"),
    
    BAD_REQUEST("BAD_REQUEST"),
    
    MISSING_REQUIRED_PARAMETER("MISSING_REQUIRED_PARAMETER"),
    
    INCORRECT_TYPE("INCORRECT_TYPE"),
    
    INVALID_TIME("INVALID_TIME"),
    
    INVALID_TIME_RANGE("INVALID_TIME_RANGE"),
    
    INVALID_VALUE("INVALID_VALUE"),
    
    INVALID_CURSOR("INVALID_CURSOR"),
    
    UNKNOWN_QUERY_PARAMETER("UNKNOWN_QUERY_PARAMETER"),
    
    CONFLICTING_PARAMETERS("CONFLICTING_PARAMETERS"),
    
    EXPECTED_JSON_BODY("EXPECTED_JSON_BODY"),
    
    INVALID_SORT_ORDER("INVALID_SORT_ORDER"),
    
    VALUE_REGEX_MISMATCH("VALUE_REGEX_MISMATCH"),
    
    VALUE_TOO_SHORT("VALUE_TOO_SHORT"),
    
    VALUE_TOO_LONG("VALUE_TOO_LONG"),
    
    VALUE_TOO_LOW("VALUE_TOO_LOW"),
    
    VALUE_TOO_HIGH("VALUE_TOO_HIGH"),
    
    VALUE_EMPTY("VALUE_EMPTY"),
    
    ARRAY_LENGTH_TOO_LONG("ARRAY_LENGTH_TOO_LONG"),
    
    ARRAY_LENGTH_TOO_SHORT("ARRAY_LENGTH_TOO_SHORT"),
    
    ARRAY_EMPTY("ARRAY_EMPTY"),
    
    EXPECTED_BOOLEAN("EXPECTED_BOOLEAN"),
    
    EXPECTED_INTEGER("EXPECTED_INTEGER"),
    
    EXPECTED_FLOAT("EXPECTED_FLOAT"),
    
    EXPECTED_STRING("EXPECTED_STRING"),
    
    EXPECTED_OBJECT("EXPECTED_OBJECT"),
    
    EXPECTED_ARRAY("EXPECTED_ARRAY"),
    
    EXPECTED_BASE64_ENCODED_BYTE_ARRAY("EXPECTED_BASE64_ENCODED_BYTE_ARRAY"),
    
    INVALID_ARRAY_VALUE("INVALID_ARRAY_VALUE"),
    
    INVALID_ENUM_VALUE("INVALID_ENUM_VALUE"),
    
    INVALID_CONTENT_TYPE("INVALID_CONTENT_TYPE"),
    
    INVALID_FORM_VALUE("INVALID_FORM_VALUE"),
    
    ONE_INSTRUMENT_EXPECTED("ONE_INSTRUMENT_EXPECTED"),
    
    NO_FIELDS_SET("NO_FIELDS_SET"),
    
    CARD_EXPIRED("CARD_EXPIRED"),
    
    INVALID_EXPIRATION("INVALID_EXPIRATION"),
    
    INVALID_EXPIRATION_YEAR("INVALID_EXPIRATION_YEAR"),
    
    INVALID_EXPIRATION_DATE("INVALID_EXPIRATION_DATE"),
    
    UNSUPPORTED_CARD_BRAND("UNSUPPORTED_CARD_BRAND"),
    
    UNSUPPORTED_ENTRY_METHOD("UNSUPPORTED_ENTRY_METHOD"),
    
    INVALID_CARD("INVALID_CARD"),
    
    DELAYED_TRANSACTION_EXPIRED("DELAYED_TRANSACTION_EXPIRED"),
    
    DELAYED_TRANSACTION_CANCELED("DELAYED_TRANSACTION_CANCELED"),
    
    DELAYED_TRANSACTION_CAPTURED("DELAYED_TRANSACTION_CAPTURED"),
    
    DELAYED_TRANSACTION_FAILED("DELAYED_TRANSACTION_FAILED"),
    
    CARD_TOKEN_EXPIRED("CARD_TOKEN_EXPIRED"),
    
    CARD_TOKEN_USED("CARD_TOKEN_USED"),
    
    AMOUNT_TOO_HIGH("AMOUNT_TOO_HIGH"),
    
    UNSUPPORTED_INSTRUMENT_TYPE("UNSUPPORTED_INSTRUMENT_TYPE"),
    
    REFUND_AMOUNT_INVALID("REFUND_AMOUNT_INVALID"),
    
    REFUND_ALREADY_PENDING("REFUND_ALREADY_PENDING"),
    
    PAYMENT_NOT_REFUNDABLE("PAYMENT_NOT_REFUNDABLE"),
    
    INVALID_CARD_DATA("INVALID_CARD_DATA"),
    
    IDEMPOTENCY_KEY_REUSED("IDEMPOTENCY_KEY_REUSED"),
    
    UNEXPECTED_VALUE("UNEXPECTED_VALUE"),
    
    SANDBOX_NOT_SUPPORTED("SANDBOX_NOT_SUPPORTED"),
    
    INVALID_EMAIL_ADDRESS("INVALID_EMAIL_ADDRESS"),
    
    INVALID_PHONE_NUMBER("INVALID_PHONE_NUMBER"),
    
    CHECKOUT_EXPIRED("CHECKOUT_EXPIRED"),
    
    CARD_DECLINED("CARD_DECLINED"),
    
    VERIFY_CVV_FAILURE("VERIFY_CVV_FAILURE"),
    
    VERIFY_AVS_FAILURE("VERIFY_AVS_FAILURE"),
    
    CARD_DECLINED_CALL_ISSUER("CARD_DECLINED_CALL_ISSUER"),
    
    NOT_FOUND("NOT_FOUND"),
    
    REQUEST_TIMEOUT("REQUEST_TIMEOUT"),
    
    CONFLICT("CONFLICT"),
    
    REQUEST_ENTITY_TOO_LARGE("REQUEST_ENTITY_TOO_LARGE"),
    
    UNSUPPORTED_MEDIA_TYPE("UNSUPPORTED_MEDIA_TYPE"),
    
    RATE_LIMITED("RATE_LIMITED"),
    
    NOT_IMPLEMENTED("NOT_IMPLEMENTED"),
    
    SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("code")
  private CodeEnum code = null;

  @JsonProperty("detail")
  private String detail = null;

  @JsonProperty("field")
  private String field = null;

  public Error category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * The error's high-level category. See [ErrorCategory](#type-errorcategory) for possible values.
   * @return category
  **/
  @ApiModelProperty(required = true, value = "The error's high-level category. See [ErrorCategory](#type-errorcategory) for possible values.")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public Error code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * The error's specific code. See [ErrorCode](#type-errorcode) for possible values
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The error's specific code. See [ErrorCode](#type-errorcode) for possible values")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public Error detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable description of the error for debugging purposes.
   * @return detail
  **/
  @ApiModelProperty(value = "A human-readable description of the error for debugging purposes.")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public Error field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The name of the field provided in the original request that the error pertains to, if any.
   * @return field
  **/
  @ApiModelProperty(value = "The name of the field provided in the original request that the error pertains to, if any.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.category, error.category) &&
        Objects.equals(this.code, error.code) &&
        Objects.equals(this.detail, error.detail) &&
        Objects.equals(this.field, error.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, code, detail, field);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

