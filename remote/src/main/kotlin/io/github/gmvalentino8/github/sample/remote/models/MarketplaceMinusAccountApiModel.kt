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
 * @param url 
 * @param id 
 * @param type 
 * @param login 
 * @param nodeId 
 * @param email 
 * @param organizationBillingEmail 
 */
@Serializable
data class MarketplaceMinusAccountApiModel(
    @SerialName(value = "url")
    val url: kotlin.String,
    @SerialName(value = "id")
    val id: kotlin.Int,
    @SerialName(value = "type")
    val type: kotlin.String,
    @SerialName(value = "login")
    val login: kotlin.String,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String? = null,
    @SerialName(value = "email")
    val email: kotlin.String? = null,
    @SerialName(value = "organization_billing_email")
    val organizationBillingEmail: kotlin.String? = null
) {

}
