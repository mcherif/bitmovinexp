package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Login
 */

public class Login {
  @JsonProperty("eMail")
  private String eMail;

  @JsonProperty("password")
  private String password;


  /**
   * Email address of the account. (required)
   * @return eMail
   */
  public String getEMail() {
    return eMail;
  }

  /**
   * Email address of the account. (required)
   *
   * @param eMail
   *        Email address of the account. (required)
   */
  public void setEMail(String eMail) {
    this.eMail = eMail;
  }


  /**
   * Password of the account. (required)
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Password of the account. (required)
   *
   * @param password
   *        Password of the account. (required)
   */
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Login login = (Login) o;
    return Objects.equals(this.eMail, login.eMail) &&
        Objects.equals(this.password, login.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eMail, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Login {\n");
    
    sb.append("    eMail: ").append(toIndentedString(eMail)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

