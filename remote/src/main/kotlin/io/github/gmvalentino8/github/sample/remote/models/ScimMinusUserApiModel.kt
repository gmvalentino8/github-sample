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

package io.github.gmvalentino8.github.sample.remote.models

import io.github.gmvalentino8.github.sample.remote.models.ScimUserEmailsApiModel
import io.github.gmvalentino8.github.sample.remote.models.ScimUserMetaApiModel
import io.github.gmvalentino8.github.sample.remote.models.ScimUserNameApiModel
import io.github.gmvalentino8.github.sample.remote.models.ScimUserOperationsApiModel

import kotlinx.serialization.*

/**
 * SCIM /Users provisioning endpoints
 * @param schemas SCIM schema used.
 * @param id Unique identifier of an external identity
 * @param externalId The ID of the User.
 * @param userName Configured by the admin. Could be an email, login, or username
 * @param name 
 * @param emails user emails
 * @param active The active status of the User.
 * @param meta 
 * @param displayName The name of the user, suitable for display to end-users
 * @param organizationId The ID of the organization.
 * @param operations Set of operations to be performed
 */
@Serializable
data class ScimMinusUserApiModel(
    /* SCIM schema used. */
    @SerialName(value = "schemas")
    val schemas: kotlin.collections.List<kotlin.String>,
    /* Unique identifier of an external identity */
    @SerialName(value = "id")
    val id: kotlin.String,
    /* The ID of the User. */
    @SerialName(value = "externalId")
    val externalId: kotlin.String?,
    /* Configured by the admin. Could be an email, login, or username */
    @SerialName(value = "userName")
    val userName: kotlin.String?,
    @SerialName(value = "name")
    val name: ScimUserNameApiModel,
    /* user emails */
    @SerialName(value = "emails")
    val emails: kotlin.collections.List<ScimUserEmailsApiModel>,
    /* The active status of the User. */
    @SerialName(value = "active")
    val active: kotlin.Boolean,
    @SerialName(value = "meta")
    val meta: ScimUserMetaApiModel,
    /* The name of the user, suitable for display to end-users */
    @SerialName(value = "displayName")
    val displayName: kotlin.String? = null,
    /* The ID of the organization. */
    @SerialName(value = "organization_id")
    val organizationId: kotlin.Int? = null,
    /* Set of operations to be performed */
    @SerialName(value = "operations")
    val operations: kotlin.collections.List<ScimUserOperationsApiModel>? = null
) {

}

