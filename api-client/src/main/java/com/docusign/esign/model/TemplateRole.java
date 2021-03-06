package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class TemplateRole implements Serializable {

    @SerializedName("accessCode")
    private String accessCode = null;

    @SerializedName("clientUserId")
    private String clientUserId = null;

    @SerializedName("defaultRecipient")
    private String defaultRecipient = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("emailNotification")
    private RecipientEmailNotification emailNotification = null;

    @SerializedName("embeddedRecipientStartURL")
    private String embeddedRecipientStartURL = null;

    @SerializedName("inPersonSignerName")
    private String inPersonSignerName = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("roleName")
    private String roleName = null;

    @SerializedName("routingOrder")
    private String routingOrder = null;

    @SerializedName("signingGroupId")
    private String signingGroupId = null;

    @SerializedName("tabs")
    private Tabs tabs = null;


    /**
     * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and it must conform to the account\u2019s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then the access code is not required.
     **/
    @ApiModelProperty(value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope. \n\nMaximum Length: 50 characters and it must conform to the account\u2019s access code format setting.\n\nIf blank, but the signer `accessCode` property is set in the envelope, then that value is used.\n\nIf blank and the signer `accessCode` property is not set, then the access code is not required.")
    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }


    /**
     * Specifies whether the recipient is embedded or remote. \n\nIf the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng. \n\nMaximum length: 100 characters.
     **/
    @ApiModelProperty(value = "Specifies whether the recipient is embedded or remote. \n\nIf the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng. \n\nMaximum length: 100 characters. ")
    public String getClientUserId() {
        return clientUserId;
    }

    public void setClientUserId(String clientUserId) {
        this.clientUserId = clientUserId;
    }


    /**
     * When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient.
     **/
    @ApiModelProperty(value = "When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient.")
    public String getDefaultRecipient() {
        return defaultRecipient;
    }

    public void setDefaultRecipient(String defaultRecipient) {
        this.defaultRecipient = defaultRecipient;
    }


    /**
     * Specifies the email associated with a role name.
     **/
    @ApiModelProperty(value = "Specifies the email associated with a role name.")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public RecipientEmailNotification getEmailNotification() {
        return emailNotification;
    }

    public void setEmailNotification(RecipientEmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }


    /**
     * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender\u2019s system (the server responding to the URL) must request a recipient token to launch a signing session. \n\nIf set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.\n\nIt is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient\u2019s identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.\n\nIf the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets. \n\n*Example*: \n\n`http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]`
     **/
    @ApiModelProperty(value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender\u2019s system (the server responding to the URL) must request a recipient token to launch a signing session. \n\nIf set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.\n\nIt is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient\u2019s identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.\n\nIf the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets. \n\n*Example*: \n\n`http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` ")
    public String getEmbeddedRecipientStartURL() {
        return embeddedRecipientStartURL;
    }

    public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
        this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    }


    /**
     * Specifies the full legal name of the signer in person signer template roles.\n\nMaximum Length: 100 characters.
     **/
    @ApiModelProperty(value = "Specifies the full legal name of the signer in person signer template roles.\n\nMaximum Length: 100 characters.")
    public String getInPersonSignerName() {
        return inPersonSignerName;
    }

    public void setInPersonSignerName(String inPersonSignerName) {
        this.inPersonSignerName = inPersonSignerName;
    }


    /**
     * Specifies the recipient's name.
     **/
    @ApiModelProperty(value = "Specifies the recipient's name.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
     **/
    @ApiModelProperty(value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    /**
     * Specifies the routing order of the recipient in the envelope.
     **/
    @ApiModelProperty(value = "Specifies the routing order of the recipient in the envelope. ")
    public String getRoutingOrder() {
        return routingOrder;
    }

    public void setRoutingOrder(String routingOrder) {
        this.routingOrder = routingOrder;
    }


    /**
     * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
     **/
    @ApiModelProperty(value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
    public String getSigningGroupId() {
        return signingGroupId;
    }

    public void setSigningGroupId(String signingGroupId) {
        this.signingGroupId = signingGroupId;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Tabs getTabs() {
        return tabs;
    }

    public void setTabs(Tabs tabs) {
        this.tabs = tabs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateRole templateRole = (TemplateRole) o;
        return Objects.equals(accessCode, templateRole.accessCode) &&
                Objects.equals(clientUserId, templateRole.clientUserId) &&
                Objects.equals(defaultRecipient, templateRole.defaultRecipient) &&
                Objects.equals(email, templateRole.email) &&
                Objects.equals(emailNotification, templateRole.emailNotification) &&
                Objects.equals(embeddedRecipientStartURL, templateRole.embeddedRecipientStartURL) &&
                Objects.equals(inPersonSignerName, templateRole.inPersonSignerName) &&
                Objects.equals(name, templateRole.name) &&
                Objects.equals(roleName, templateRole.roleName) &&
                Objects.equals(routingOrder, templateRole.routingOrder) &&
                Objects.equals(signingGroupId, templateRole.signingGroupId) &&
                Objects.equals(tabs, templateRole.tabs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessCode, clientUserId, defaultRecipient, email, emailNotification, embeddedRecipientStartURL, inPersonSignerName, name, roleName, routingOrder, signingGroupId, tabs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateRole {\n");

        sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
        sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
        sb.append("    defaultRecipient: ").append(toIndentedString(defaultRecipient)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
        sb.append("    embeddedRecipientStartURL: ").append(toIndentedString(embeddedRecipientStartURL)).append("\n");
        sb.append("    inPersonSignerName: ").append(toIndentedString(inPersonSignerName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
        sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
        sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
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
