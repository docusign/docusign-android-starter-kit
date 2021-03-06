package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class SenderEmailNotifications implements Serializable {

    @SerializedName("changedSigner")
    private String changedSigner = null;

    @SerializedName("deliveryFailed")
    private String deliveryFailed = null;

    @SerializedName("envelopeComplete")
    private String envelopeComplete = null;

    @SerializedName("offlineSigningFailed")
    private String offlineSigningFailed = null;

    @SerializedName("recipientViewed")
    private String recipientViewed = null;

    @SerializedName("senderEnvelopeDeclined")
    private String senderEnvelopeDeclined = null;

    @SerializedName("withdrawnConsent")
    private String withdrawnConsent = null;


    /**
     * When set to **true**, the sender receives notification if the signer changes.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender receives notification if the signer changes.")
    public String getChangedSigner() {
        return changedSigner;
    }

    public void setChangedSigner(String changedSigner) {
        this.changedSigner = changedSigner;
    }


    /**
     * When set to **true**, the sender receives notification if the delivery of the envelope fails.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender receives notification if the delivery of the envelope fails.")
    public String getDeliveryFailed() {
        return deliveryFailed;
    }

    public void setDeliveryFailed(String deliveryFailed) {
        this.deliveryFailed = deliveryFailed;
    }


    /**
     * When set to **true**, the user receives notification that the envelope has been completed.
     **/
    @ApiModelProperty(value = "When set to **true**, the user receives notification that the envelope has been completed.")
    public String getEnvelopeComplete() {
        return envelopeComplete;
    }

    public void setEnvelopeComplete(String envelopeComplete) {
        this.envelopeComplete = envelopeComplete;
    }


    /**
     * When set to **true**, the user receives notification if the offline signing failed.
     **/
    @ApiModelProperty(value = "When set to **true**, the user receives notification if the offline signing failed.")
    public String getOfflineSigningFailed() {
        return offlineSigningFailed;
    }

    public void setOfflineSigningFailed(String offlineSigningFailed) {
        this.offlineSigningFailed = offlineSigningFailed;
    }


    /**
     * When set to **true**, the sender receives notification that the recipient viewed the enveloper.
     **/
    @ApiModelProperty(value = "When set to **true**, the sender receives notification that the recipient viewed the enveloper.")
    public String getRecipientViewed() {
        return recipientViewed;
    }

    public void setRecipientViewed(String recipientViewed) {
        this.recipientViewed = recipientViewed;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getSenderEnvelopeDeclined() {
        return senderEnvelopeDeclined;
    }

    public void setSenderEnvelopeDeclined(String senderEnvelopeDeclined) {
        this.senderEnvelopeDeclined = senderEnvelopeDeclined;
    }


    /**
     * When set to **true**, the user receives notification if consent is withdrawn.
     **/
    @ApiModelProperty(value = "When set to **true**, the user receives notification if consent is withdrawn.")
    public String getWithdrawnConsent() {
        return withdrawnConsent;
    }

    public void setWithdrawnConsent(String withdrawnConsent) {
        this.withdrawnConsent = withdrawnConsent;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SenderEmailNotifications senderEmailNotifications = (SenderEmailNotifications) o;
        return Objects.equals(changedSigner, senderEmailNotifications.changedSigner) &&
                Objects.equals(deliveryFailed, senderEmailNotifications.deliveryFailed) &&
                Objects.equals(envelopeComplete, senderEmailNotifications.envelopeComplete) &&
                Objects.equals(offlineSigningFailed, senderEmailNotifications.offlineSigningFailed) &&
                Objects.equals(recipientViewed, senderEmailNotifications.recipientViewed) &&
                Objects.equals(senderEnvelopeDeclined, senderEmailNotifications.senderEnvelopeDeclined) &&
                Objects.equals(withdrawnConsent, senderEmailNotifications.withdrawnConsent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changedSigner, deliveryFailed, envelopeComplete, offlineSigningFailed, recipientViewed, senderEnvelopeDeclined, withdrawnConsent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SenderEmailNotifications {\n");

        sb.append("    changedSigner: ").append(toIndentedString(changedSigner)).append("\n");
        sb.append("    deliveryFailed: ").append(toIndentedString(deliveryFailed)).append("\n");
        sb.append("    envelopeComplete: ").append(toIndentedString(envelopeComplete)).append("\n");
        sb.append("    offlineSigningFailed: ").append(toIndentedString(offlineSigningFailed)).append("\n");
        sb.append("    recipientViewed: ").append(toIndentedString(recipientViewed)).append("\n");
        sb.append("    senderEnvelopeDeclined: ").append(toIndentedString(senderEnvelopeDeclined)).append("\n");
        sb.append("    withdrawnConsent: ").append(toIndentedString(withdrawnConsent)).append("\n");
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
