package com.docusign.esign.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;


public class EnvelopeDefinition implements Serializable {

    @SerializedName("accessibility")
    private String accessibility = null;

    @SerializedName("allowMarkup")
    private String allowMarkup = null;

    @SerializedName("allowReassign")
    private String allowReassign = null;

    @SerializedName("allowRecipientRecursion")
    private String allowRecipientRecursion = null;

    @SerializedName("asynchronous")
    private String asynchronous = null;

    @SerializedName("attachments")
    private java.util.List<Attachment> attachments = new java.util.ArrayList<Attachment>();

    @SerializedName("attachmentsUri")
    private String attachmentsUri = null;

    @SerializedName("authoritativeCopy")
    private String authoritativeCopy = null;

    @SerializedName("autoNavigation")
    private String autoNavigation = null;

    @SerializedName("brandId")
    private String brandId = null;

    @SerializedName("brandLock")
    private String brandLock = null;

    @SerializedName("certificateUri")
    private String certificateUri = null;

    @SerializedName("completedDateTime")
    private String completedDateTime = null;

    @SerializedName("compositeTemplates")
    private java.util.List<CompositeTemplate> compositeTemplates = new java.util.ArrayList<CompositeTemplate>();

    @SerializedName("createdDateTime")
    private String createdDateTime = null;

    @SerializedName("customFields")
    private CustomFields customFields = null;

    @SerializedName("customFieldsUri")
    private String customFieldsUri = null;

    @SerializedName("declinedDateTime")
    private String declinedDateTime = null;

    @SerializedName("deletedDateTime")
    private String deletedDateTime = null;

    @SerializedName("deliveredDateTime")
    private String deliveredDateTime = null;

    @SerializedName("documents")
    private java.util.List<Document> documents = new java.util.ArrayList<Document>();

    @SerializedName("documentsCombinedUri")
    private String documentsCombinedUri = null;

    @SerializedName("documentsUri")
    private String documentsUri = null;

    @SerializedName("emailBlurb")
    private String emailBlurb = null;

    @SerializedName("emailSettings")
    private EmailSettings emailSettings = null;

    @SerializedName("emailSubject")
    private String emailSubject = null;

    @SerializedName("enableWetSign")
    private String enableWetSign = null;

    @SerializedName("enforceSignerVisibility")
    private String enforceSignerVisibility = null;

    @SerializedName("envelopeId")
    private String envelopeId = null;

    @SerializedName("envelopeIdStamping")
    private String envelopeIdStamping = null;

    @SerializedName("envelopeUri")
    private String envelopeUri = null;

    @SerializedName("eventNotification")
    private EventNotification eventNotification = null;

    @SerializedName("initialSentDateTime")
    private String initialSentDateTime = null;

    @SerializedName("is21CFRPart11")
    private String is21CFRPart11 = null;

    @SerializedName("isSignatureProviderEnvelope")
    private String isSignatureProviderEnvelope = null;

    @SerializedName("lastModifiedDateTime")
    private String lastModifiedDateTime = null;

    @SerializedName("lockInformation")
    private LockInformation lockInformation = null;

    @SerializedName("messageLock")
    private String messageLock = null;

    @SerializedName("notification")
    private Notification notification = null;

    @SerializedName("notificationUri")
    private String notificationUri = null;

    @SerializedName("password")
    private String password = null;

    @SerializedName("purgeState")
    private String purgeState = null;

    @SerializedName("recipients")
    private Recipients recipients = null;

    @SerializedName("recipientsLock")
    private String recipientsLock = null;

    @SerializedName("recipientsUri")
    private String recipientsUri = null;

    @SerializedName("sentDateTime")
    private String sentDateTime = null;

    @SerializedName("signingLocation")
    private String signingLocation = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("statusChangedDateTime")
    private String statusChangedDateTime = null;

    @SerializedName("templateId")
    private String templateId = null;

    @SerializedName("templateRoles")
    private java.util.List<TemplateRole> templateRoles = new java.util.ArrayList<TemplateRole>();

    @SerializedName("templatesUri")
    private String templatesUri = null;

    @SerializedName("transactionId")
    private String transactionId = null;

    @SerializedName("useDisclosure")
    private String useDisclosure = null;

    @SerializedName("voidedDateTime")
    private String voidedDateTime = null;

    @SerializedName("voidedReason")
    private String voidedReason = null;


    /**
     * Sets the document reading zones for screen reader applications.  This element can only be used if Document Accessibility is enabled for the account. \n\n###### Note: This information is currently generated from the DocuSign web console by setting the reading zones when creating a template, exporting the reading zone string information, and adding it here.
     **/
    @ApiModelProperty(value = "Sets the document reading zones for screen reader applications.  This element can only be used if Document Accessibility is enabled for the account. \n\n###### Note: This information is currently generated from the DocuSign web console by setting the reading zones when creating a template, exporting the reading zone string information, and adding it here.")
    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String accessibility) {
        this.accessibility = accessibility;
    }


    /**
     * When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this
     **/
    @ApiModelProperty(value = "When set to **true**, Document Markup is enabled for envelope. Account must have Document Markup enabled to use this")
    public String getAllowMarkup() {
        return allowMarkup;
    }

    public void setAllowMarkup(String allowMarkup) {
        this.allowMarkup = allowMarkup;
    }


    /**
     * When set to **true**, the recipient can redirect an envelope to a more appropriate recipient.
     **/
    @ApiModelProperty(value = "When set to **true**, the recipient can redirect an envelope to a more appropriate recipient.")
    public String getAllowReassign() {
        return allowReassign;
    }

    public void setAllowReassign(String allowReassign) {
        this.allowReassign = allowReassign;
    }


    /**
     * When set to **true**, this enables the Recursive Recipients feature and allows a recipient to appear more than once in the routing order.
     **/
    @ApiModelProperty(value = "When set to **true**, this enables the Recursive Recipients feature and allows a recipient to appear more than once in the routing order.")
    public String getAllowRecipientRecursion() {
        return allowRecipientRecursion;
    }

    public void setAllowRecipientRecursion(String allowRecipientRecursion) {
        this.allowRecipientRecursion = allowRecipientRecursion;
    }


    /**
     * When set to **true**, the envelope is queued for processing and the value of the `status` property is set to 'Processing'. Additionally, get status calls return 'Processing' until completed.
     **/
    @ApiModelProperty(value = "When set to **true**, the envelope is queued for processing and the value of the `status` property is set to 'Processing'. Additionally, get status calls return 'Processing' until completed.")
    public String getAsynchronous() {
        return asynchronous;
    }

    public void setAsynchronous(String asynchronous) {
        this.asynchronous = asynchronous;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public java.util.List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(java.util.List<Attachment> attachments) {
        this.attachments = attachments;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAttachmentsUri() {
        return attachmentsUri;
    }

    public void setAttachmentsUri(String attachmentsUri) {
        this.attachmentsUri = attachmentsUri;
    }


    /**
     * Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.
     **/
    @ApiModelProperty(value = "Specifies the Authoritative copy feature. If set to true the Authoritative copy feature is enabled.")
    public String getAuthoritativeCopy() {
        return authoritativeCopy;
    }

    public void setAuthoritativeCopy(String authoritativeCopy) {
        this.authoritativeCopy = authoritativeCopy;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getAutoNavigation() {
        return autoNavigation;
    }

    public void setAutoNavigation(String autoNavigation) {
        this.autoNavigation = autoNavigation;
    }


    /**
     * This sets the brand profile format used for the envelope. The value in the string is the brandId associated with the profile. Account branding must be enabled for the account to use this option.
     **/
    @ApiModelProperty(value = "This sets the brand profile format used for the envelope. The value in the string is the brandId associated with the profile. Account branding must be enabled for the account to use this option.")
    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getBrandLock() {
        return brandLock;
    }

    public void setBrandLock(String brandLock) {
        this.brandLock = brandLock;
    }


    /**
     * Retrieves a URI for an endpoint that allows you to easily retrieve certificate information.
     **/
    @ApiModelProperty(value = "Retrieves a URI for an endpoint that allows you to easily retrieve certificate information.")
    public String getCertificateUri() {
        return certificateUri;
    }

    public void setCertificateUri(String certificateUri) {
        this.certificateUri = certificateUri;
    }


    /**
     * Specifies the date and time this item was completed.
     **/
    @ApiModelProperty(value = "Specifies the date and time this item was completed.")
    public String getCompletedDateTime() {
        return completedDateTime;
    }

    public void setCompletedDateTime(String completedDateTime) {
        this.completedDateTime = completedDateTime;
    }


    /**
     * A complex type that can be added to create envelopes from a combination of DocuSign templates and PDF forms. The basic envelope remains the same, while the Composite Template adds new document and template overlays into the envelope. There can be any number of Composite Template structures in the envelope.
     **/
    @ApiModelProperty(value = "A complex type that can be added to create envelopes from a combination of DocuSign templates and PDF forms. The basic envelope remains the same, while the Composite Template adds new document and template overlays into the envelope. There can be any number of Composite Template structures in the envelope.")
    public java.util.List<CompositeTemplate> getCompositeTemplates() {
        return compositeTemplates;
    }

    public void setCompositeTemplates(java.util.List<CompositeTemplate> compositeTemplates) {
        this.compositeTemplates = compositeTemplates;
    }


    /**
     * Indicates the date and time the item was created.
     **/
    @ApiModelProperty(value = "Indicates the date and time the item was created.")
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public CustomFields getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve the custom fields.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the custom fields.")
    public String getCustomFieldsUri() {
        return customFieldsUri;
    }

    public void setCustomFieldsUri(String customFieldsUri) {
        this.customFieldsUri = customFieldsUri;
    }


    /**
     * The date and time the recipient declined the document.
     **/
    @ApiModelProperty(value = "The date and time the recipient declined the document.")
    public String getDeclinedDateTime() {
        return declinedDateTime;
    }

    public void setDeclinedDateTime(String declinedDateTime) {
        this.declinedDateTime = declinedDateTime;
    }


    /**
     * Specifies the data and time the item was deleted.
     **/
    @ApiModelProperty(value = "Specifies the data and time the item was deleted.")
    public String getDeletedDateTime() {
        return deletedDateTime;
    }

    public void setDeletedDateTime(String deletedDateTime) {
        this.deletedDateTime = deletedDateTime;
    }


    /**
     * Reserved: For DocuSign use only.
     **/
    @ApiModelProperty(value = "Reserved: For DocuSign use only.")
    public String getDeliveredDateTime() {
        return deliveredDateTime;
    }

    public void setDeliveredDateTime(String deliveredDateTime) {
        this.deliveredDateTime = deliveredDateTime;
    }


    /**
     * Complex element contains the details on the documents in the envelope.
     **/
    @ApiModelProperty(value = "Complex element contains the details on the documents in the envelope.")
    public java.util.List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(java.util.List<Document> documents) {
        this.documents = documents;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getDocumentsCombinedUri() {
        return documentsCombinedUri;
    }

    public void setDocumentsCombinedUri(String documentsCombinedUri) {
        this.documentsCombinedUri = documentsCombinedUri;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve the documents.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the documents.")
    public String getDocumentsUri() {
        return documentsUri;
    }

    public void setDocumentsUri(String documentsUri) {
        this.documentsUri = documentsUri;
    }


    /**
     * Optional element. This is the same as the email body. If specified it is included in email body for all envelope recipients. This can be a maximum of 10000 characters
     **/
    @ApiModelProperty(value = "Optional element. This is the same as the email body. If specified it is included in email body for all envelope recipients. This can be a maximum of 10000 characters")
    public String getEmailBlurb() {
        return emailBlurb;
    }

    public void setEmailBlurb(String emailBlurb) {
        this.emailBlurb = emailBlurb;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public EmailSettings getEmailSettings() {
        return emailSettings;
    }

    public void setEmailSettings(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }


    /**
     * Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.
     **/
    @ApiModelProperty(value = "Specifies the subject of the email that is sent to all recipients.\n\nSee [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }


    /**
     * When set to **true**, the signer is allowed to print the document and sign it on paper.
     **/
    @ApiModelProperty(value = "When set to **true**, the signer is allowed to print the document and sign it on paper.")
    public String getEnableWetSign() {
        return enableWetSign;
    }

    public void setEnableWetSign(String enableWetSign) {
        this.enableWetSign = enableWetSign;
    }


    /**
     * When set to **true**, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.\n\nYour account must have Document Visibility enabled to use this.
     **/
    @ApiModelProperty(value = "When set to **true**, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.\n\nYour account must have Document Visibility enabled to use this.")
    public String getEnforceSignerVisibility() {
        return enforceSignerVisibility;
    }

    public void setEnforceSignerVisibility(String enforceSignerVisibility) {
        this.enforceSignerVisibility = enforceSignerVisibility;
    }


    /**
     * The envelope ID of the envelope status that failed to post.
     **/
    @ApiModelProperty(value = "The envelope ID of the envelope status that failed to post.")
    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }


    /**
     * When set to **true**, Envelope ID Stamping is enabled.
     **/
    @ApiModelProperty(value = "When set to **true**, Envelope ID Stamping is enabled.")
    public String getEnvelopeIdStamping() {
        return envelopeIdStamping;
    }

    public void setEnvelopeIdStamping(String envelopeIdStamping) {
        this.envelopeIdStamping = envelopeIdStamping;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the envelope or envelopes.")
    public String getEnvelopeUri() {
        return envelopeUri;
    }

    public void setEnvelopeUri(String envelopeUri) {
        this.envelopeUri = envelopeUri;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public EventNotification getEventNotification() {
        return eventNotification;
    }

    public void setEventNotification(EventNotification eventNotification) {
        this.eventNotification = eventNotification;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getInitialSentDateTime() {
        return initialSentDateTime;
    }

    public void setInitialSentDateTime(String initialSentDateTime) {
        this.initialSentDateTime = initialSentDateTime;
    }


    /**
     * When set to **true**, indicates that this module is enabled on the account.
     **/
    @ApiModelProperty(value = "When set to **true**, indicates that this module is enabled on the account.")
    public String getIs21CFRPart11() {
        return is21CFRPart11;
    }

    public void setIs21CFRPart11(String is21CFRPart11) {
        this.is21CFRPart11 = is21CFRPart11;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getIsSignatureProviderEnvelope() {
        return isSignatureProviderEnvelope;
    }

    public void setIsSignatureProviderEnvelope(String isSignatureProviderEnvelope) {
        this.isSignatureProviderEnvelope = isSignatureProviderEnvelope;
    }


    /**
     * The date and time the item was last modified.
     **/
    @ApiModelProperty(value = "The date and time the item was last modified.")
    public String getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(String lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public LockInformation getLockInformation() {
        return lockInformation;
    }

    public void setLockInformation(LockInformation lockInformation) {
        this.lockInformation = lockInformation;
    }


    /**
     * When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope. \n\nAdditionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes. \n\nHowever, if the `messageLock` node is set to true**** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope.
     **/
    @ApiModelProperty(value = "When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope. \n\nAdditionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes. \n\nHowever, if the `messageLock` node is set to true**** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope.")
    public String getMessageLock() {
        return messageLock;
    }

    public void setMessageLock(String messageLock) {
        this.messageLock = messageLock;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve the notifications.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the notifications.")
    public String getNotificationUri() {
        return notificationUri;
    }

    public void setNotificationUri(String notificationUri) {
        this.notificationUri = notificationUri;
    }


    /**
     *
     **/
    @ApiModelProperty(value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Initiates a purge request. Valid values are:\n* documents_queued: Places envelope documents in the purge queue.\n* documents_and_metadata_queued: Places envelope documents and metadata in the purge queue.\n
     **/
    @ApiModelProperty(value = "Initiates a purge request. Valid values are:\n* documents_queued: Places envelope documents in the purge queue.\n* documents_and_metadata_queued: Places envelope documents and metadata in the purge queue.\n")
    public String getPurgeState() {
        return purgeState;
    }

    public void setPurgeState(String purgeState) {
        this.purgeState = purgeState;
    }


    /**
     **/
    @ApiModelProperty(value = "")
    public Recipients getRecipients() {
        return recipients;
    }

    public void setRecipients(Recipients recipients) {
        this.recipients = recipients;
    }


    /**
     * When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope.
     **/
    @ApiModelProperty(value = "When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope.")
    public String getRecipientsLock() {
        return recipientsLock;
    }

    public void setRecipientsLock(String recipientsLock) {
        this.recipientsLock = recipientsLock;
    }


    /**
     * Contains a URI for an endpoint that you can use to retrieve the recipients.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint that you can use to retrieve the recipients.")
    public String getRecipientsUri() {
        return recipientsUri;
    }

    public void setRecipientsUri(String recipientsUri) {
        this.recipientsUri = recipientsUri;
    }


    /**
     * The date and time the envelope was sent.
     **/
    @ApiModelProperty(value = "The date and time the envelope was sent.")
    public String getSentDateTime() {
        return sentDateTime;
    }

    public void setSentDateTime(String sentDateTime) {
        this.sentDateTime = sentDateTime;
    }


    /**
     * Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.
     **/
    @ApiModelProperty(value = "Specifies the physical location where the signing takes place. It can have two enumeration values; InPerson and Online. The default value is Online.")
    public String getSigningLocation() {
        return signingLocation;
    }

    public void setSigningLocation(String signingLocation) {
        this.signingLocation = signingLocation;
    }


    /**
     * Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.
     **/
    @ApiModelProperty(value = "Indicates the envelope status. Valid values are:\n\n* sent - The envelope is sent to the recipients. \n* created - The envelope is saved as a draft and can be modified and sent later.")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * The data and time the status changed.
     **/
    @ApiModelProperty(value = "The data and time the status changed.")
    public String getStatusChangedDateTime() {
        return statusChangedDateTime;
    }

    public void setStatusChangedDateTime(String statusChangedDateTime) {
        this.statusChangedDateTime = statusChangedDateTime;
    }


    /**
     * The unique identifier of the template. If this is not provided, DocuSign will generate a value.
     **/
    @ApiModelProperty(value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }


    /**
     * Specifies the template recipients. Each roleName in the template must have a recipient assigned to it. This is made up elements:\n\n* email - The recipient\u2019s email address.\n* name - The recipient\u2019s name.\n* roleName - The template roleName associated with the recipient.\n* clientUserId - Optional, this sets if the signer is This specifies if the recipient is embedded or remote. If the clientUserId is not null then the recipient is embedded. Note that if a ClientUserId is used and the account settings SignerMustHaveAccount or SignerMustLoginToSign are true, an error is generated on sending.\n* defaultRecipient - Optional, When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient.\n* routingOrder - This specifies the routing order of the recipient in the envelope.\n* accessCode - This optional element specifies the access code a recipient has to enter to validate the identity. This can be a maximum of 50 characters.\n* inPersonSignerName - Optional, if the template role is an in person signer, this is the full legal name of the signer. This can be a maximum of 100 characters.\n* emailNotification - This is an optional complex element that has a role specific emailSubject, emailBody, and language. It follows the same format as the emailNotification node for Recipients.\n* tabs - This allows the tab values to be specified for matching to tabs in the template.\n
     **/
    @ApiModelProperty(value = "Specifies the template recipients. Each roleName in the template must have a recipient assigned to it. This is made up elements:\n\n* email - The recipient\u2019s email address.\n* name - The recipient\u2019s name.\n* roleName - The template roleName associated with the recipient.\n* clientUserId - Optional, this sets if the signer is This specifies if the recipient is embedded or remote. If the clientUserId is not null then the recipient is embedded. Note that if a ClientUserId is used and the account settings SignerMustHaveAccount or SignerMustLoginToSign are true, an error is generated on sending.\n* defaultRecipient - Optional, When set to **true**, this recipient is the default recipient and any tabs generated by the transformPdfFields option are mapped to this recipient.\n* routingOrder - This specifies the routing order of the recipient in the envelope.\n* accessCode - This optional element specifies the access code a recipient has to enter to validate the identity. This can be a maximum of 50 characters.\n* inPersonSignerName - Optional, if the template role is an in person signer, this is the full legal name of the signer. This can be a maximum of 100 characters.\n* emailNotification - This is an optional complex element that has a role specific emailSubject, emailBody, and language. It follows the same format as the emailNotification node for Recipients.\n* tabs - This allows the tab values to be specified for matching to tabs in the template.\n")
    public java.util.List<TemplateRole> getTemplateRoles() {
        return templateRoles;
    }

    public void setTemplateRoles(java.util.List<TemplateRole> templateRoles) {
        this.templateRoles = templateRoles;
    }


    /**
     * Contains a URI for an endpoint which you can use to retrieve the templates.
     **/
    @ApiModelProperty(value = "Contains a URI for an endpoint which you can use to retrieve the templates.")
    public String getTemplatesUri() {
        return templatesUri;
    }

    public void setTemplatesUri(String templatesUri) {
        this.templatesUri = templatesUri;
    }


    /**
     * Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.
     **/
    @ApiModelProperty(value = " Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. It is recommended that a transaction ID is used for offline signing to ensure that an envelope is not sent multiple times. The `transactionId` property can be used determine an envelope's status (i.e. was it created or not) in cases where the internet connection was lost before the envelope status was returned.")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * When set to **true**, the disclosure is shown to recipients in accordance with the account\u2019s Electronic Record and Signature Disclosure frequency setting. When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients. \n\nIf the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in responses when getting envelope information.
     **/
    @ApiModelProperty(value = "When set to **true**, the disclosure is shown to recipients in accordance with the account\u2019s Electronic Record and Signature Disclosure frequency setting. When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients. \n\nIf the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in responses when getting envelope information.")
    public String getUseDisclosure() {
        return useDisclosure;
    }

    public void setUseDisclosure(String useDisclosure) {
        this.useDisclosure = useDisclosure;
    }


    /**
     * The date and time the envelope or template was voided.
     **/
    @ApiModelProperty(value = "The date and time the envelope or template was voided.")
    public String getVoidedDateTime() {
        return voidedDateTime;
    }

    public void setVoidedDateTime(String voidedDateTime) {
        this.voidedDateTime = voidedDateTime;
    }


    /**
     * The reason the envelope or template was voided.
     **/
    @ApiModelProperty(value = "The reason the envelope or template was voided.")
    public String getVoidedReason() {
        return voidedReason;
    }

    public void setVoidedReason(String voidedReason) {
        this.voidedReason = voidedReason;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvelopeDefinition envelopeDefinition = (EnvelopeDefinition) o;
        return Objects.equals(accessibility, envelopeDefinition.accessibility) &&
                Objects.equals(allowMarkup, envelopeDefinition.allowMarkup) &&
                Objects.equals(allowReassign, envelopeDefinition.allowReassign) &&
                Objects.equals(allowRecipientRecursion, envelopeDefinition.allowRecipientRecursion) &&
                Objects.equals(asynchronous, envelopeDefinition.asynchronous) &&
                Objects.equals(attachments, envelopeDefinition.attachments) &&
                Objects.equals(attachmentsUri, envelopeDefinition.attachmentsUri) &&
                Objects.equals(authoritativeCopy, envelopeDefinition.authoritativeCopy) &&
                Objects.equals(autoNavigation, envelopeDefinition.autoNavigation) &&
                Objects.equals(brandId, envelopeDefinition.brandId) &&
                Objects.equals(brandLock, envelopeDefinition.brandLock) &&
                Objects.equals(certificateUri, envelopeDefinition.certificateUri) &&
                Objects.equals(completedDateTime, envelopeDefinition.completedDateTime) &&
                Objects.equals(compositeTemplates, envelopeDefinition.compositeTemplates) &&
                Objects.equals(createdDateTime, envelopeDefinition.createdDateTime) &&
                Objects.equals(customFields, envelopeDefinition.customFields) &&
                Objects.equals(customFieldsUri, envelopeDefinition.customFieldsUri) &&
                Objects.equals(declinedDateTime, envelopeDefinition.declinedDateTime) &&
                Objects.equals(deletedDateTime, envelopeDefinition.deletedDateTime) &&
                Objects.equals(deliveredDateTime, envelopeDefinition.deliveredDateTime) &&
                Objects.equals(documents, envelopeDefinition.documents) &&
                Objects.equals(documentsCombinedUri, envelopeDefinition.documentsCombinedUri) &&
                Objects.equals(documentsUri, envelopeDefinition.documentsUri) &&
                Objects.equals(emailBlurb, envelopeDefinition.emailBlurb) &&
                Objects.equals(emailSettings, envelopeDefinition.emailSettings) &&
                Objects.equals(emailSubject, envelopeDefinition.emailSubject) &&
                Objects.equals(enableWetSign, envelopeDefinition.enableWetSign) &&
                Objects.equals(enforceSignerVisibility, envelopeDefinition.enforceSignerVisibility) &&
                Objects.equals(envelopeId, envelopeDefinition.envelopeId) &&
                Objects.equals(envelopeIdStamping, envelopeDefinition.envelopeIdStamping) &&
                Objects.equals(envelopeUri, envelopeDefinition.envelopeUri) &&
                Objects.equals(eventNotification, envelopeDefinition.eventNotification) &&
                Objects.equals(initialSentDateTime, envelopeDefinition.initialSentDateTime) &&
                Objects.equals(is21CFRPart11, envelopeDefinition.is21CFRPart11) &&
                Objects.equals(isSignatureProviderEnvelope, envelopeDefinition.isSignatureProviderEnvelope) &&
                Objects.equals(lastModifiedDateTime, envelopeDefinition.lastModifiedDateTime) &&
                Objects.equals(lockInformation, envelopeDefinition.lockInformation) &&
                Objects.equals(messageLock, envelopeDefinition.messageLock) &&
                Objects.equals(notification, envelopeDefinition.notification) &&
                Objects.equals(notificationUri, envelopeDefinition.notificationUri) &&
                Objects.equals(password, envelopeDefinition.password) &&
                Objects.equals(purgeState, envelopeDefinition.purgeState) &&
                Objects.equals(recipients, envelopeDefinition.recipients) &&
                Objects.equals(recipientsLock, envelopeDefinition.recipientsLock) &&
                Objects.equals(recipientsUri, envelopeDefinition.recipientsUri) &&
                Objects.equals(sentDateTime, envelopeDefinition.sentDateTime) &&
                Objects.equals(signingLocation, envelopeDefinition.signingLocation) &&
                Objects.equals(status, envelopeDefinition.status) &&
                Objects.equals(statusChangedDateTime, envelopeDefinition.statusChangedDateTime) &&
                Objects.equals(templateId, envelopeDefinition.templateId) &&
                Objects.equals(templateRoles, envelopeDefinition.templateRoles) &&
                Objects.equals(templatesUri, envelopeDefinition.templatesUri) &&
                Objects.equals(transactionId, envelopeDefinition.transactionId) &&
                Objects.equals(useDisclosure, envelopeDefinition.useDisclosure) &&
                Objects.equals(voidedDateTime, envelopeDefinition.voidedDateTime) &&
                Objects.equals(voidedReason, envelopeDefinition.voidedReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessibility, allowMarkup, allowReassign, allowRecipientRecursion, asynchronous, attachments, attachmentsUri, authoritativeCopy, autoNavigation, brandId, brandLock, certificateUri, completedDateTime, compositeTemplates, createdDateTime, customFields, customFieldsUri, declinedDateTime, deletedDateTime, deliveredDateTime, documents, documentsCombinedUri, documentsUri, emailBlurb, emailSettings, emailSubject, enableWetSign, enforceSignerVisibility, envelopeId, envelopeIdStamping, envelopeUri, eventNotification, initialSentDateTime, is21CFRPart11, isSignatureProviderEnvelope, lastModifiedDateTime, lockInformation, messageLock, notification, notificationUri, password, purgeState, recipients, recipientsLock, recipientsUri, sentDateTime, signingLocation, status, statusChangedDateTime, templateId, templateRoles, templatesUri, transactionId, useDisclosure, voidedDateTime, voidedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvelopeDefinition {\n");

        sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
        sb.append("    allowMarkup: ").append(toIndentedString(allowMarkup)).append("\n");
        sb.append("    allowReassign: ").append(toIndentedString(allowReassign)).append("\n");
        sb.append("    allowRecipientRecursion: ").append(toIndentedString(allowRecipientRecursion)).append("\n");
        sb.append("    asynchronous: ").append(toIndentedString(asynchronous)).append("\n");
        sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
        sb.append("    attachmentsUri: ").append(toIndentedString(attachmentsUri)).append("\n");
        sb.append("    authoritativeCopy: ").append(toIndentedString(authoritativeCopy)).append("\n");
        sb.append("    autoNavigation: ").append(toIndentedString(autoNavigation)).append("\n");
        sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
        sb.append("    brandLock: ").append(toIndentedString(brandLock)).append("\n");
        sb.append("    certificateUri: ").append(toIndentedString(certificateUri)).append("\n");
        sb.append("    completedDateTime: ").append(toIndentedString(completedDateTime)).append("\n");
        sb.append("    compositeTemplates: ").append(toIndentedString(compositeTemplates)).append("\n");
        sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
        sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
        sb.append("    customFieldsUri: ").append(toIndentedString(customFieldsUri)).append("\n");
        sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
        sb.append("    deletedDateTime: ").append(toIndentedString(deletedDateTime)).append("\n");
        sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
        sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
        sb.append("    documentsCombinedUri: ").append(toIndentedString(documentsCombinedUri)).append("\n");
        sb.append("    documentsUri: ").append(toIndentedString(documentsUri)).append("\n");
        sb.append("    emailBlurb: ").append(toIndentedString(emailBlurb)).append("\n");
        sb.append("    emailSettings: ").append(toIndentedString(emailSettings)).append("\n");
        sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
        sb.append("    enableWetSign: ").append(toIndentedString(enableWetSign)).append("\n");
        sb.append("    enforceSignerVisibility: ").append(toIndentedString(enforceSignerVisibility)).append("\n");
        sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
        sb.append("    envelopeIdStamping: ").append(toIndentedString(envelopeIdStamping)).append("\n");
        sb.append("    envelopeUri: ").append(toIndentedString(envelopeUri)).append("\n");
        sb.append("    eventNotification: ").append(toIndentedString(eventNotification)).append("\n");
        sb.append("    initialSentDateTime: ").append(toIndentedString(initialSentDateTime)).append("\n");
        sb.append("    is21CFRPart11: ").append(toIndentedString(is21CFRPart11)).append("\n");
        sb.append("    isSignatureProviderEnvelope: ").append(toIndentedString(isSignatureProviderEnvelope)).append("\n");
        sb.append("    lastModifiedDateTime: ").append(toIndentedString(lastModifiedDateTime)).append("\n");
        sb.append("    lockInformation: ").append(toIndentedString(lockInformation)).append("\n");
        sb.append("    messageLock: ").append(toIndentedString(messageLock)).append("\n");
        sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
        sb.append("    notificationUri: ").append(toIndentedString(notificationUri)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    purgeState: ").append(toIndentedString(purgeState)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    recipientsLock: ").append(toIndentedString(recipientsLock)).append("\n");
        sb.append("    recipientsUri: ").append(toIndentedString(recipientsUri)).append("\n");
        sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
        sb.append("    signingLocation: ").append(toIndentedString(signingLocation)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusChangedDateTime: ").append(toIndentedString(statusChangedDateTime)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateRoles: ").append(toIndentedString(templateRoles)).append("\n");
        sb.append("    templatesUri: ").append(toIndentedString(templatesUri)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    useDisclosure: ").append(toIndentedString(useDisclosure)).append("\n");
        sb.append("    voidedDateTime: ").append(toIndentedString(voidedDateTime)).append("\n");
        sb.append("    voidedReason: ").append(toIndentedString(voidedReason)).append("\n");
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
