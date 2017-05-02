package com.docusign.esign.api;

import com.docusign.esign.model.ConnectConfigResults;
import com.docusign.esign.model.ConnectCustomConfiguration;
import com.docusign.esign.model.ConnectFailureFilter;
import com.docusign.esign.model.ConnectFailureResults;
import com.docusign.esign.model.ConnectLog;
import com.docusign.esign.model.ConnectLogs;
import com.docusign.esign.model.IntegratedUserInfoList;
import com.docusign.esign.model.MobileNotifierConfigurationInformation;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ConnectApi {

    /**
     * Creates a connect configuration for the specified account.
     * Creates a DocuSign Custom Connect definition for your account. DocuSign Connect enables the sending of real-time data updates to external applications. These updates are generated by user transactions as the envelope progresses through actions to completion. The Connect Service provides updated information about the status of these transactions and returns updates that include the actual content of document form fields. Be aware that, these updates might or might not include the document itself. For more information about Connect, see the [ML:DocuSign Connect Service Guide].\n\n###### Note: Connect must be enabled for your account to use this function. This cannot be used to set up Connect configurations for Salesforce or eOriginal.
     *
     * @param accountId                  The external account number (int) or account ID Guid. (required)
     * @param connectCustomConfiguration (optional)
     * @return Call<ConnectCustomConfiguration>
     */

    @POST("v2/accounts/{accountId}/connect")
    Call<ConnectCustomConfiguration> createConfiguration(
            @Path("accountId") String accountId, @Body ConnectCustomConfiguration connectCustomConfiguration
    );


    /**
     * Deletes the specified connect configuration.
     * Deletes the specified DocuSign Connect configuration.\n\n###### Note: Connect must be enabled for your account to use this function.\n\n \n
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param connectId The ID of the custom Connect configuration being accessed. (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/connect/{connectId}")
    Call<Void> deleteConfiguration(
            @Path("accountId") String accountId, @Path("connectId") String connectId
    );


    /**
     * Deletes a Connect failure log entry.
     * Deletes the Connect failure log information for the specified entry.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param failureId The ID of the failed connect log entry. (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/connect/failures/{failureId}")
    Call<Void> deleteEventFailureLog(
            @Path("accountId") String accountId, @Path("failureId") String failureId
    );


    /**
     * Deletes a specified Connect log entry.
     * Deletes a specified entry from the Connect Log.\n
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param logId     The ID of the connect log entry (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/connect/logs/{logId}")
    Call<Void> deleteEventLog(
            @Path("accountId") String accountId, @Path("logId") String logId
    );


    /**
     * Gets a list of Connect log entries.
     * Retrieves a list of connect log entries for your account.\n\n###### Note: The `enableLog` property in the Connect configuration must be set to **true** to enable logging. If logging is not enabled, then no log entries are recorded.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<Void>
     */

    @DELETE("v2/accounts/{accountId}/connect/logs")
    Call<Void> deleteEventLogs(
            @Path("accountId") String accountId
    );


    /**
     * Reserved
     * Reserved:
     *
     * @param accountId                              The external account number (int) or account ID Guid. (required)
     * @param mobileNotifierConfigurationInformation (optional)
     * @return Call<MobileNotifierConfigurationInformation>
     */

    @DELETE("v2/accounts/{accountId}/connect/mobile_notifiers")
    Call<MobileNotifierConfigurationInformation> deleteMobileNotifiers(
            @Path("accountId") String accountId, @Body MobileNotifierConfigurationInformation mobileNotifierConfigurationInformation
    );


    /**
     * Get a Connect Configuration Information
     * Retrieves the information for the specified DocuSign Connect configuration.\n\n###### Note: Connect must be enabled for your account to use this function.\n
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param connectId The ID of the custom Connect configuration being accessed. (required)
     * @return Call<ConnectConfigResults>
     */

    @GET("v2/accounts/{accountId}/connect/{connectId}")
    Call<ConnectConfigResults> getConfiguration(
            @Path("accountId") String accountId, @Path("connectId") String connectId
    );


    /**
     * Get the specified Connect log entry.
     * Retrieves the specified Connect log entry for your account.\n\n###### Note: The `enableLog` setting in the Connect configuration must be set to true to enable logging. If logging is not enabled, then no log entries are recorded.
     *
     * @param accountId      The external account number (int) or account ID Guid. (required)
     * @param logId          The ID of the connect log entry (required)
     * @param additionalInfo When true, the connectDebugLog information is included in the response. (optional)
     * @return Call<ConnectLog>
     */

    @GET("v2/accounts/{accountId}/connect/logs/{logId}")
    Call<ConnectLog> getEventLog(
            @Path("accountId") String accountId, @Path("logId") String logId, @Query("additional_info") String additionalInfo
    );


    /**
     * Get Connect Configuration Information
     * Retrieves all the DocuSign Custom Connect definitions for the specified account.\n\n###### Note: Connect must be enabled for your account to use this function. This does not retrieve information for Connect configurations for Box, eOriginal, or Salesforce.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<ConnectConfigResults>
     */

    @GET("v2/accounts/{accountId}/connect")
    Call<ConnectConfigResults> listConfigurations(
            @Path("accountId") String accountId
    );


    /**
     * Gets the Connect failure log information.
     * Retrieves the Connect Failure Log information. It can be used to determine which envelopes failed to post, so a republish request can be created.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param fromDate  (optional)
     * @param toDate    (optional)
     * @return Call<ConnectLogs>
     */

    @GET("v2/accounts/{accountId}/connect/failures")
    Call<ConnectLogs> listEventFailureLogs(
            @Path("accountId") String accountId, @Query("from_date") String fromDate, @Query("to_date") String toDate
    );


    /**
     * Gets the Connect log.
     * Retrieves a list of connect log entries for your account.\n\n###### Note: The `enableLog` setting in the Connect configuration must be set to true to enable logging. If logging is not enabled, then no log entries are recorded.
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @param fromDate  (optional)
     * @param toDate    (optional)
     * @return Call<ConnectLogs>
     */

    @GET("v2/accounts/{accountId}/connect/logs")
    Call<ConnectLogs> listEventLogs(
            @Path("accountId") String accountId, @Query("from_date") String fromDate, @Query("to_date") String toDate
    );


    /**
     * Reserved
     * Reserved:
     *
     * @param accountId The external account number (int) or account ID Guid. (required)
     * @return Call<MobileNotifierConfigurationInformation>
     */

    @GET("v2/accounts/{accountId}/connect/mobile_notifiers")
    Call<MobileNotifierConfigurationInformation> listMobileNotifiers(
            @Path("accountId") String accountId
    );


    /**
     * Returns users from the configured Connect service.
     * Returns users from the configured Connect service.
     *
     * @param accountId         The external account number (int) or account ID Guid. (required)
     * @param connectId         The ID of the custom Connect configuration being accessed. (required)
     * @param count             (optional)
     * @param emailSubstring    (optional)
     * @param listIncludedUsers (optional)
     * @param startPosition     (optional)
     * @param status            (optional)
     * @param userNameSubstring (optional)
     * @return Call<IntegratedUserInfoList>
     */

    @GET("v2/accounts/{accountId}/connect/{connectId}/users")
    Call<IntegratedUserInfoList> listUsers(
            @Path("accountId") String accountId, @Path("connectId") String connectId, @Query("count") String count, @Query("email_substring") String emailSubstring, @Query("list_included_users") String listIncludedUsers, @Query("start_position") String startPosition, @Query("status") String status, @Query("user_name_substring") String userNameSubstring
    );


    /**
     * Republishes Connect information for the specified envelope.
     * Republishes Connect information for the specified envelope.
     *
     * @param accountId  The external account number (int) or account ID Guid. (required)
     * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
     * @return Call<ConnectFailureResults>
     */

    @PUT("v2/accounts/{accountId}/connect/envelopes/{envelopeId}/retry_queue")
    Call<ConnectFailureResults> retryEventForEnvelope(
            @Path("accountId") String accountId, @Path("envelopeId") String envelopeId
    );


    /**
     * Republishes Connect information for multiple envelopes.
     * Republishes Connect information for the  specified set of envelopes. The primary use is to republish Connect post failures by including envelope IDs for the envelopes that failed to post in the request. The list of envelope IDs that failed to post correctly can be retrieved by calling to [ML:GetConnectLog] retrieve the failure log.
     *
     * @param accountId            The external account number (int) or account ID Guid. (required)
     * @param connectFailureFilter (optional)
     * @return Call<ConnectFailureResults>
     */

    @PUT("v2/accounts/{accountId}/connect/envelopes/retry_queue")
    Call<ConnectFailureResults> retryEventForEnvelopes(
            @Path("accountId") String accountId, @Body ConnectFailureFilter connectFailureFilter
    );


    /**
     * Updates a specified Connect configuration.
     * Updates the specified DocuSign Connect configuration in your account.\n\n###### Note: Connect must be enabled for your account to use this function. This cannot be used to update Connect configurations for Box, eOriginal, or Salesforce.
     *
     * @param accountId                  The external account number (int) or account ID Guid. (required)
     * @param connectCustomConfiguration (optional)
     * @return Call<ConnectCustomConfiguration>
     */

    @PUT("v2/accounts/{accountId}/connect")
    Call<ConnectCustomConfiguration> updateConfiguration(
            @Path("accountId") String accountId, @Body ConnectCustomConfiguration connectCustomConfiguration
    );


    /**
     * Reserved
     * Reserved:
     *
     * @param accountId                              The external account number (int) or account ID Guid. (required)
     * @param mobileNotifierConfigurationInformation (optional)
     * @return Call<MobileNotifierConfigurationInformation>
     */

    @PUT("v2/accounts/{accountId}/connect/mobile_notifiers")
    Call<MobileNotifierConfigurationInformation> updateMobileNotifiers(
            @Path("accountId") String accountId, @Body MobileNotifierConfigurationInformation mobileNotifierConfigurationInformation
    );


}
