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


import kotlinx.serialization.*

/**
 * 
 * @param scopes A list of scopes that this authorization is in.
 * @param addScopes A list of scopes to add to this authorization.
 * @param removeScopes A list of scopes to remove from this authorization.
 * @param note A note to remind you what the OAuth token is for.
 * @param noteUrl A URL to remind you what app the OAuth token is for.
 * @param fingerprint A unique string to distinguish an authorization from others created for the same client ID and user.
 */
@Serializable
data class InlineObject10ApiModel(
    /* A list of scopes that this authorization is in. */
    @SerialName(value = "scopes")
    val scopes: kotlin.collections.List<kotlin.String>? = null,
    /* A list of scopes to add to this authorization. */
    @SerialName(value = "add_scopes")
    val addScopes: kotlin.collections.List<kotlin.String>? = null,
    /* A list of scopes to remove from this authorization. */
    @SerialName(value = "remove_scopes")
    val removeScopes: kotlin.collections.List<kotlin.String>? = null,
    /* A note to remind you what the OAuth token is for. */
    @SerialName(value = "note")
    val note: kotlin.String? = null,
    /* A URL to remind you what app the OAuth token is for. */
    @SerialName(value = "note_url")
    val noteUrl: kotlin.String? = null,
    /* A unique string to distinguish an authorization from others created for the same client ID and user. */
    @SerialName(value = "fingerprint")
    val fingerprint: kotlin.String? = null
) {

}

