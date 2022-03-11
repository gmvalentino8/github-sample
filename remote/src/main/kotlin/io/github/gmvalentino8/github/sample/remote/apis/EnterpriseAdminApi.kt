/**
 * GitHub v3 REST API
 *
 * GitHub's v3 REST API.
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.github.gmvalentino8.github.sample.remote.apis

import io.ktor.client.request.request
import io.github.gmvalentino8.github.sample.remote.models.*
import io.github.gmvalentino8.github.sample.remote.core.HttpClientProvider
import io.ktor.client.request.parameter
import io.ktor.http.HttpMethod

interface EnterpriseAdminApi {
    /**
    * Delete a SCIM group from an enterprise
    *
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.
    *
    * @return void
    */
    suspend fun enterpriseAdminDeleteScimGroupFromEnterprise(accessToken: String? = null, enterprise: kotlin.String, scimGroupId: kotlin.String)

    /**
    * Delete a SCIM user from an enterprise
    *
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.
    *
    * @return void
    */
    suspend fun enterpriseAdminDeleteUserFromEnterprise(accessToken: String? = null, enterprise: kotlin.String, scimUserId: kotlin.String)

    /**
    * Get SCIM provisioning information for an enterprise group
    *
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.
    *
    * @return ScimMinusEnterpriseMinusGroupApiModel
    */
    suspend fun enterpriseAdminGetProvisioningInformationForEnterpriseGroup(accessToken: String? = null, enterprise: kotlin.String, scimGroupId: kotlin.String, excludedAttributes: kotlin.String? = null): ScimMinusEnterpriseMinusGroupApiModel

    /**
    * Get SCIM provisioning information for an enterprise user
    *
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.
    *
    * @return ScimMinusEnterpriseMinusUserApiModel
    */
    suspend fun enterpriseAdminGetProvisioningInformationForEnterpriseUser(accessToken: String? = null, enterprise: kotlin.String, scimUserId: kotlin.String): ScimMinusEnterpriseMinusUserApiModel

    /**
    * List provisioned SCIM groups for an enterprise
    *
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.
    *
    * @return ScimMinusGroupMinusListMinusEnterpriseApiModel
    */
    suspend fun enterpriseAdminListProvisionedGroupsEnterprise(accessToken: String? = null, enterprise: kotlin.String, startIndex: kotlin.Int? = null, count: kotlin.Int? = null, filter: kotlin.String? = null, excludedAttributes: kotlin.String? = null): ScimMinusGroupMinusListMinusEnterpriseApiModel

    /**
    * List SCIM provisioned identities for an enterprise
    *
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.  Retrieves a paginated list of all provisioned enterprise members, including pending invitations.  When a user with a SAML-provisioned external identity leaves (or is removed from) an enterprise, the account&#39;s metadata is immediately removed. However, the returned list of user accounts might not always match the organization or enterprise member list you see on GitHub. This can happen in certain cases where an external identity associated with an organization will not match an organization member:   - When a user with a SCIM-provisioned external identity is removed from an enterprise, the account&#39;s metadata is preserved to allow the user to re-join the organization in the future.   - When inviting a user to join an organization, you can expect to see their external identity in the results before they accept the invitation, or if the invitation is cancelled (or never accepted).   - When a user is invited over SCIM, an external identity is created that matches with the invitee&#39;s email address. However, this identity is only linked to a user account when the user accepts the invitation by going through SAML SSO.  The returned list of external identities can include an entry for a &#x60;null&#x60; user. These are unlinked SAML identities that are created when a user goes through the following Single Sign-On (SSO) process but does not sign in to their GitHub account after completing SSO:  1. The user is granted access by the IdP and is not a member of the GitHub enterprise.  1. The user attempts to access the GitHub enterprise and initiates the SAML SSO process, and is not currently signed in to their GitHub account.  1. After successfully authenticating with the SAML SSO IdP, the &#x60;null&#x60; external identity entry is created and the user is prompted to sign in to their GitHub account:    - If the user signs in, their GitHub account is linked to this entry.    - If the user does not sign in (or does not create a new account when prompted), they are not added to the GitHub enterprise, and the external identity &#x60;null&#x60; entry remains in place.
    *
    * @return ScimMinusUserMinusListMinusEnterpriseApiModel
    */
    suspend fun enterpriseAdminListProvisionedIdentitiesEnterprise(accessToken: String? = null, enterprise: kotlin.String, startIndex: kotlin.Int? = null, count: kotlin.Int? = null, filter: kotlin.String? = null): ScimMinusUserMinusListMinusEnterpriseApiModel

    /**
    * Provision a SCIM enterprise group and invite users
    *
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.  Provision an enterprise group, and invite users to the group. This sends invitation emails to the email address of the invited users to join the GitHub organization that the SCIM group corresponds to.
    *
    * @param request 
    * @return ScimMinusEnterpriseMinusGroupApiModel
    */
    suspend fun enterpriseAdminProvisionAndInviteEnterpriseGroup(accessToken: String? = null, enterprise: kotlin.String, request: InlineObject142ApiModel): ScimMinusEnterpriseMinusGroupApiModel

    /**
    * Provision and invite a SCIM enterprise user
    *
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.  Provision enterprise membership for a user, and send organization invitation emails to the email address.  You can optionally include the groups a user will be invited to join. If you do not provide a list of &#x60;groups&#x60;, the user is provisioned for the enterprise, but no organization invitation emails will be sent.
    *
    * @param request 
    * @return ScimMinusEnterpriseMinusUserApiModel
    */
    suspend fun enterpriseAdminProvisionAndInviteEnterpriseUser(accessToken: String? = null, enterprise: kotlin.String, request: InlineObject145ApiModel): ScimMinusEnterpriseMinusUserApiModel

    /**
    * Set SCIM information for a provisioned enterprise group
    *
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.  Replaces an existing provisioned group’s information. You must provide all the information required for the group as if you were provisioning it for the first time. Any existing group information that you don&#39;t provide will be removed, including group membership. If you want to only update a specific attribute, use the [Update an attribute for a SCIM enterprise group](#update-an-attribute-for-a-scim-enterprise-group) endpoint instead.
    *
    * @param request 
    * @return ScimMinusEnterpriseMinusGroupApiModel
    */
    suspend fun enterpriseAdminSetInformationForProvisionedEnterpriseGroup(accessToken: String? = null, enterprise: kotlin.String, scimGroupId: kotlin.String, request: InlineObject143ApiModel): ScimMinusEnterpriseMinusGroupApiModel

    /**
    * Set SCIM information for a provisioned enterprise user
    *
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.  Replaces an existing provisioned user&#39;s information. You must provide all the information required for the user as if you were provisioning them for the first time. Any existing user information that you don&#39;t provide will be removed. If you want to only update a specific attribute, use the [Update an attribute for a SCIM user](#update-an-attribute-for-an-enterprise-scim-user) endpoint instead.  You must at least provide the required values for the user: &#x60;userName&#x60;, &#x60;name&#x60;, and &#x60;emails&#x60;.  **Warning:** Setting &#x60;active: false&#x60; removes the user from the enterprise, deletes the external identity, and deletes the associated &#x60;{scim_user_id}&#x60;.
    *
    * @param request 
    * @return ScimMinusEnterpriseMinusUserApiModel
    */
    suspend fun enterpriseAdminSetInformationForProvisionedEnterpriseUser(accessToken: String? = null, enterprise: kotlin.String, scimUserId: kotlin.String, request: InlineObject146ApiModel): ScimMinusEnterpriseMinusUserApiModel

    /**
    * Update an attribute for a SCIM enterprise group
    *
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.  Allows you to change a provisioned group’s individual attributes. To change a group’s values, you must provide a specific Operations JSON format that contains at least one of the add, remove, or replace operations. For examples and more information on the SCIM operations format, see the [SCIM specification](https://tools.ietf.org/html/rfc7644#section-3.5.2).
    *
    * @param request 
    * @return ScimMinusEnterpriseMinusGroupApiModel
    */
    suspend fun enterpriseAdminUpdateAttributeForEnterpriseGroup(accessToken: String? = null, enterprise: kotlin.String, scimGroupId: kotlin.String, request: InlineObject144ApiModel): ScimMinusEnterpriseMinusGroupApiModel

    /**
    * Update an attribute for a SCIM enterprise user
    *
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.  Allows you to change a provisioned user&#39;s individual attributes. To change a user&#39;s values, you must provide a specific &#x60;Operations&#x60; JSON format that contains at least one of the &#x60;add&#x60;, &#x60;remove&#x60;, or &#x60;replace&#x60; operations. For examples and more information on the SCIM operations format, see the [SCIM specification](https://tools.ietf.org/html/rfc7644#section-3.5.2).  **Note:** Complicated SCIM &#x60;path&#x60; selectors that include filters are not supported. For example, a &#x60;path&#x60; selector defined as &#x60;\&quot;path\&quot;: \&quot;emails[type eq \\\&quot;work\\\&quot;]\&quot;&#x60; will not work.  **Warning:** If you set &#x60;active:false&#x60; using the &#x60;replace&#x60; operation (as shown in the JSON example below), it removes the user from the enterprise, deletes the external identity, and deletes the associated &#x60;:scim_user_id&#x60;.  &#x60;&#x60;&#x60; {   \&quot;Operations\&quot;:[{     \&quot;op\&quot;:\&quot;replace\&quot;,     \&quot;value\&quot;:{       \&quot;active\&quot;:false     }   }] } &#x60;&#x60;&#x60;
    *
    * @param request 
    * @return ScimMinusEnterpriseMinusUserApiModel
    */
    suspend fun enterpriseAdminUpdateAttributeForEnterpriseUser(accessToken: String? = null, enterprise: kotlin.String, scimUserId: kotlin.String, request: InlineObject147ApiModel): ScimMinusEnterpriseMinusUserApiModel

}

class HttpClientEnterpriseAdminApi(private val httpClientProvider: HttpClientProvider) : EnterpriseAdminApi {
    internal val httpClient = httpClientProvider.provide()

    override suspend fun enterpriseAdminDeleteScimGroupFromEnterprise(accessToken: String?, enterprise: kotlin.String, scimGroupId: kotlin.String) {
        val path = "/scim/v2/enterprises/{enterprise}/Groups/{scim_group_id}".replace("{"+"enterprise"+"}", "$enterprise").replace("{"+"scim_group_id"+"}", "$scimGroupId")

        return httpClient.request {
            url { encodedPath = path }
            method = HttpMethod.Delete
        }
    }

    override suspend fun enterpriseAdminDeleteUserFromEnterprise(accessToken: String?, enterprise: kotlin.String, scimUserId: kotlin.String) {
        val path = "/scim/v2/enterprises/{enterprise}/Users/{scim_user_id}".replace("{"+"enterprise"+"}", "$enterprise").replace("{"+"scim_user_id"+"}", "$scimUserId")

        return httpClient.request {
            url { encodedPath = path }
            method = HttpMethod.Delete
        }
    }

    override suspend fun enterpriseAdminGetProvisioningInformationForEnterpriseGroup(accessToken: String?, enterprise: kotlin.String, scimGroupId: kotlin.String, excludedAttributes: kotlin.String?): ScimMinusEnterpriseMinusGroupApiModel {
        val path = "/scim/v2/enterprises/{enterprise}/Groups/{scim_group_id}".replace("{"+"enterprise"+"}", "$enterprise").replace("{"+"scim_group_id"+"}", "$scimGroupId")

        return httpClient.request {
            url { encodedPath = path }
            method = HttpMethod.Get
            parameter("excluded_attributes", excludedAttributes)
        }
    }

    override suspend fun enterpriseAdminGetProvisioningInformationForEnterpriseUser(accessToken: String?, enterprise: kotlin.String, scimUserId: kotlin.String): ScimMinusEnterpriseMinusUserApiModel {
        val path = "/scim/v2/enterprises/{enterprise}/Users/{scim_user_id}".replace("{"+"enterprise"+"}", "$enterprise").replace("{"+"scim_user_id"+"}", "$scimUserId")

        return httpClient.request {
            url { encodedPath = path }
            method = HttpMethod.Get
        }
    }

    override suspend fun enterpriseAdminListProvisionedGroupsEnterprise(accessToken: String?, enterprise: kotlin.String, startIndex: kotlin.Int?, count: kotlin.Int?, filter: kotlin.String?, excludedAttributes: kotlin.String?): ScimMinusGroupMinusListMinusEnterpriseApiModel {
        val path = "/scim/v2/enterprises/{enterprise}/Groups".replace("{"+"enterprise"+"}", "$enterprise")

        return httpClient.request {
            url { encodedPath = path }
            method = HttpMethod.Get
            parameter("start_index", startIndex)
            parameter("count", count)
            parameter("filter", filter)
            parameter("excluded_attributes", excludedAttributes)
        }
    }

    override suspend fun enterpriseAdminListProvisionedIdentitiesEnterprise(accessToken: String?, enterprise: kotlin.String, startIndex: kotlin.Int?, count: kotlin.Int?, filter: kotlin.String?): ScimMinusUserMinusListMinusEnterpriseApiModel {
        val path = "/scim/v2/enterprises/{enterprise}/Users".replace("{"+"enterprise"+"}", "$enterprise")

        return httpClient.request {
            url { encodedPath = path }
            method = HttpMethod.Get
            parameter("start_index", startIndex)
            parameter("count", count)
            parameter("filter", filter)
        }
    }

    override suspend fun enterpriseAdminProvisionAndInviteEnterpriseGroup(accessToken: String?, enterprise: kotlin.String, request: InlineObject142ApiModel): ScimMinusEnterpriseMinusGroupApiModel {
        val path = "/scim/v2/enterprises/{enterprise}/Groups".replace("{"+"enterprise"+"}", "$enterprise")

        return httpClient.request {
            url { encodedPath = path }
            method = HttpMethod.Post
            body = request
        }
    }

    override suspend fun enterpriseAdminProvisionAndInviteEnterpriseUser(accessToken: String?, enterprise: kotlin.String, request: InlineObject145ApiModel): ScimMinusEnterpriseMinusUserApiModel {
        val path = "/scim/v2/enterprises/{enterprise}/Users".replace("{"+"enterprise"+"}", "$enterprise")

        return httpClient.request {
            url { encodedPath = path }
            method = HttpMethod.Post
            body = request
        }
    }

    override suspend fun enterpriseAdminSetInformationForProvisionedEnterpriseGroup(accessToken: String?, enterprise: kotlin.String, scimGroupId: kotlin.String, request: InlineObject143ApiModel): ScimMinusEnterpriseMinusGroupApiModel {
        val path = "/scim/v2/enterprises/{enterprise}/Groups/{scim_group_id}".replace("{"+"enterprise"+"}", "$enterprise").replace("{"+"scim_group_id"+"}", "$scimGroupId")

        return httpClient.request {
            url { encodedPath = path }
            method = HttpMethod.Put
            body = request
        }
    }

    override suspend fun enterpriseAdminSetInformationForProvisionedEnterpriseUser(accessToken: String?, enterprise: kotlin.String, scimUserId: kotlin.String, request: InlineObject146ApiModel): ScimMinusEnterpriseMinusUserApiModel {
        val path = "/scim/v2/enterprises/{enterprise}/Users/{scim_user_id}".replace("{"+"enterprise"+"}", "$enterprise").replace("{"+"scim_user_id"+"}", "$scimUserId")

        return httpClient.request {
            url { encodedPath = path }
            method = HttpMethod.Put
            body = request
        }
    }

    override suspend fun enterpriseAdminUpdateAttributeForEnterpriseGroup(accessToken: String?, enterprise: kotlin.String, scimGroupId: kotlin.String, request: InlineObject144ApiModel): ScimMinusEnterpriseMinusGroupApiModel {
        val path = "/scim/v2/enterprises/{enterprise}/Groups/{scim_group_id}".replace("{"+"enterprise"+"}", "$enterprise").replace("{"+"scim_group_id"+"}", "$scimGroupId")

        return httpClient.request {
            url { encodedPath = path }
            method = HttpMethod.Patch
            body = request
        }
    }

    override suspend fun enterpriseAdminUpdateAttributeForEnterpriseUser(accessToken: String?, enterprise: kotlin.String, scimUserId: kotlin.String, request: InlineObject147ApiModel): ScimMinusEnterpriseMinusUserApiModel {
        val path = "/scim/v2/enterprises/{enterprise}/Users/{scim_user_id}".replace("{"+"enterprise"+"}", "$enterprise").replace("{"+"scim_user_id"+"}", "$scimUserId")

        return httpClient.request {
            url { encodedPath = path }
            method = HttpMethod.Patch
            body = request
        }
    }

}
