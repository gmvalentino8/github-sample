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
 * @param id The id of the environment.
 * @param nodeId 
 * @param name The name of the environment.
 * @param url 
 * @param htmlUrl 
 */
@Serializable
data class PendingDeploymentEnvironmentApiModel(
    /* The id of the environment. */
    @SerialName(value = "id")
    val id: kotlin.Int? = null,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String? = null,
    /* The name of the environment. */
    @SerialName(value = "name")
    val name: kotlin.String? = null,
    @SerialName(value = "url")
    val url: kotlin.String? = null,
    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String? = null
) {

}

