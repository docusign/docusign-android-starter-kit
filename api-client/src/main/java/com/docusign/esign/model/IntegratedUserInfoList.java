package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class IntegratedUserInfoList implements Serializable {

    @SerializedName("allUsersSelected")
    private String allUsersSelected = null;

    @SerializedName("endPosition")
    private String endPosition = null;

    @SerializedName("nextUri")
    private String nextUri = null;

    @SerializedName("previousUri")
    private String previousUri = null;

    @SerializedName("resultSetSize")
    private String resultSetSize = null;

    @SerializedName("startPosition")
    private String startPosition = null;

    @SerializedName("totalSetSize")
    private String totalSetSize = null;

    @SerializedName("users")
    private java.util.List<UserInfo> users = new java.util.ArrayList<UserInfo>();


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAllUsersSelected() {
        return allUsersSelected;
    }

    public void setAllUsersSelected(String allUsersSelected) {
        this.allUsersSelected = allUsersSelected;
    }


    /**
     * The last position in the result set.
     **/
    @ApiModelProperty(value = "The last position in the result set. ")
    public String getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(String endPosition) {
        this.endPosition = endPosition;
    }


    /**
     * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null.
     **/
    @ApiModelProperty(value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
    public String getNextUri() {
        return nextUri;
    }

    public void setNextUri(String nextUri) {
        this.nextUri = nextUri;
    }


    /**
     * The postal code for the billing address.
     **/
    @ApiModelProperty(value = "The postal code for the billing address.")
    public String getPreviousUri() {
        return previousUri;
    }

    public void setPreviousUri(String previousUri) {
        this.previousUri = previousUri;
    }


    /**
     * The number of results returned in this response.
     **/
    @ApiModelProperty(value = "The number of results returned in this response. ")
    public String getResultSetSize() {
        return resultSetSize;
    }

    public void setResultSetSize(String resultSetSize) {
        this.resultSetSize = resultSetSize;
    }


    /**
     * Starting position of the current result set.
     **/
    @ApiModelProperty(value = "Starting position of the current result set.")
    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }


    /**
     * The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.
     **/
    @ApiModelProperty(value = "The total number of items available in the result set. This will always be greater than or equal to the value of the property returning the results in the in the response.")
    public String getTotalSetSize() {
        return totalSetSize;
    }

    public void setTotalSetSize(String totalSetSize) {
        this.totalSetSize = totalSetSize;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<UserInfo> getUsers() {
        return users;
    }

    public void setUsers(java.util.List<UserInfo> users) {
        this.users = users;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntegratedUserInfoList integratedUserInfoList = (IntegratedUserInfoList) o;
        return Objects.equals(allUsersSelected, integratedUserInfoList.allUsersSelected) &&
                Objects.equals(endPosition, integratedUserInfoList.endPosition) &&
                Objects.equals(nextUri, integratedUserInfoList.nextUri) &&
                Objects.equals(previousUri, integratedUserInfoList.previousUri) &&
                Objects.equals(resultSetSize, integratedUserInfoList.resultSetSize) &&
                Objects.equals(startPosition, integratedUserInfoList.startPosition) &&
                Objects.equals(totalSetSize, integratedUserInfoList.totalSetSize) &&
                Objects.equals(users, integratedUserInfoList.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allUsersSelected, endPosition, nextUri, previousUri, resultSetSize, startPosition, totalSetSize, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegratedUserInfoList {\n");

        sb.append("    allUsersSelected: ").append(toIndentedString(allUsersSelected)).append("\n");
        sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
        sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
        sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
        sb.append("    resultSetSize: ").append(toIndentedString(resultSetSize)).append("\n");
        sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
        sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
