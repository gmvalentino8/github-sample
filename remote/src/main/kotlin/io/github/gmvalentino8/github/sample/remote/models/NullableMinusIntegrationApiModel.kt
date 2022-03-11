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

import io.github.gmvalentino8.github.sample.remote.models.NullableMinusSimpleMinusUserApiModel

import kotlinx.serialization.*

/**
 * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.
 * @param id Unique identifier of the GitHub app
 * @param nodeId 
 * @param owner 
 * @param name The name of the GitHub app
 * @param description 
 * @param externalUrl 
 * @param htmlUrl 
 * @param createdAt 
 * @param updatedAt 
 * @param permissions The set of permissions for the GitHub app
 * @param events The list of events for the GitHub app
 * @param slug The slug name of the GitHub app
 * @param installationsCount The number of installations associated with the GitHub app
 * @param clientId 
 * @param clientSecret 
 * @param webhookSecret 
 * @param pem 
 */
@Serializable
data class NullableMinusIntegrationApiModel(
    /* Unique identifier of the GitHub app */
    @SerialName(value = "id")
    val id: kotlin.Int,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,
    @SerialName(value = "owner")
    val owner: NullableMinusSimpleMinusUserApiModel?,
    /* The name of the GitHub app */
    @SerialName(value = "name")
    val name: kotlin.String,
    @SerialName(value = "description")
    val description: kotlin.String?,
    @SerialName(value = "external_url")
    val externalUrl: kotlin.String,
    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,
    @SerialName(value = "created_at")
    val createdAt: kotlin.String,
    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String,
    /* The set of permissions for the GitHub app */
    @SerialName(value = "permissions")
    val permissions: kotlin.collections.Map<kotlin.String, kotlin.String>,
    /* The list of events for the GitHub app */
    @SerialName(value = "events")
    val events: kotlin.collections.List<kotlin.String>,
    /* The slug name of the GitHub app */
    @SerialName(value = "slug")
    val slug: kotlin.String? = null,
    /* The number of installations associated with the GitHub app */
    @SerialName(value = "installations_count")
    val installationsCount: kotlin.Int? = null,
    @SerialName(value = "client_id")
    val clientId: kotlin.String? = null,
    @SerialName(value = "client_secret")
    val clientSecret: kotlin.String? = null,
    @SerialName(value = "webhook_secret")
    val webhookSecret: kotlin.String? = null,
    @SerialName(value = "pem")
    val pem: kotlin.String? = null
) {

}

