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
 * @param id 
 * @param nodeId 
 * @param url 
 * @param name 
 * @param description 
 * @param color 
 * @param default 
 */
@Serializable
data class PullRequestSimpleLabelsApiModel(
    @SerialName(value = "id")
    val id: kotlin.Long,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,
    @SerialName(value = "url")
    val url: kotlin.String,
    @SerialName(value = "name")
    val name: kotlin.String,
    @SerialName(value = "description")
    val description: kotlin.String,
    @SerialName(value = "color")
    val color: kotlin.String,
    @SerialName(value = "default")
    val default: kotlin.Boolean
) {

}

