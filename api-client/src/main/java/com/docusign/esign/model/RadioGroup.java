package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class RadioGroup implements Serializable {

    @SerializedName("conditionalParentLabel")
    private String conditionalParentLabel = null;

    @SerializedName("conditionalParentValue")
    private String conditionalParentValue = null;

    @SerializedName("documentId")
    private String documentId = null;

    @SerializedName("groupName")
    private String groupName = null;

    @SerializedName("radios")
    private java.util.List<Radio> radios = new java.util.ArrayList<Radio>();

    @SerializedName("recipientId")
    private String recipientId = null;

    @SerializedName("requireAll")
    private String requireAll = null;

    @SerializedName("requireInitialOnSharedChange")
    private String requireInitialOnSharedChange = null;

    @SerializedName("shared")
    private String shared = null;


    /**
     * For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.
     **/
    @ApiModelProperty(value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
    public String getConditionalParentLabel() {
        return conditionalParentLabel;
    }

    public void setConditionalParentLabel(String conditionalParentLabel) {
        this.conditionalParentLabel = conditionalParentLabel;
    }


    /**
     * For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.\n
     **/
    @ApiModelProperty(value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.\n\nIf the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active.\n")
    public String getConditionalParentValue() {
        return conditionalParentValue;
    }

    public void setConditionalParentValue(String conditionalParentValue) {
        this.conditionalParentValue = conditionalParentValue;
    }


    /**
     * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
     **/
    @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }


    /**
     * The name of the group.
     **/
    @ApiModelProperty(value = "The name of the group.")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    /**
     * Specifies the locations and status for radio buttons that are grouped together.
     **/
    @ApiModelProperty(value = "Specifies the locations and status for radio buttons that are grouped together.")
    public java.util.List<Radio> getRadios() {
        return radios;
    }

    public void setRadios(java.util.List<Radio> radios) {
        this.radios = radios;
    }


    /**
     * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
     **/
    @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }


    /**
     * When set to **true** and shared is true, information must be entered in this field to complete the envelope.
     **/
    @ApiModelProperty(value = "When set to **true** and shared is true, information must be entered in this field to complete the envelope. ")
    public String getRequireAll() {
        return requireAll;
    }

    public void setRequireAll(String requireAll) {
        this.requireAll = requireAll;
    }


    /**
     * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.
     **/
    @ApiModelProperty(value = "Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.")
    public String getRequireInitialOnSharedChange() {
        return requireInitialOnSharedChange;
    }

    public void setRequireInitialOnSharedChange(String requireInitialOnSharedChange) {
        this.requireInitialOnSharedChange = requireInitialOnSharedChange;
    }


    /**
     * When set to **true**, this custom tab is shared.
     **/
    @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
    public String getShared() {
        return shared;
    }

    public void setShared(String shared) {
        this.shared = shared;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RadioGroup radioGroup = (RadioGroup) o;
        return Objects.equals(conditionalParentLabel, radioGroup.conditionalParentLabel) &&
                Objects.equals(conditionalParentValue, radioGroup.conditionalParentValue) &&
                Objects.equals(documentId, radioGroup.documentId) &&
                Objects.equals(groupName, radioGroup.groupName) &&
                Objects.equals(radios, radioGroup.radios) &&
                Objects.equals(recipientId, radioGroup.recipientId) &&
                Objects.equals(requireAll, radioGroup.requireAll) &&
                Objects.equals(requireInitialOnSharedChange, radioGroup.requireInitialOnSharedChange) &&
                Objects.equals(shared, radioGroup.shared);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionalParentLabel, conditionalParentValue, documentId, groupName, radios, recipientId, requireAll, requireInitialOnSharedChange, shared);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RadioGroup {\n");

        sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
        sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    radios: ").append(toIndentedString(radios)).append("\n");
        sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
        sb.append("    requireAll: ").append(toIndentedString(requireAll)).append("\n");
        sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
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
