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
 * Project cards represent a scope of work.
 * @param url 
 * @param id The project card's ID
 * @param nodeId 
 * @param note 
 * @param creator 
 * @param createdAt 
 * @param updatedAt 
 * @param columnUrl 
 * @param projectUrl 
 * @param archived Whether or not the card is archived
 * @param columnName 
 * @param projectId 
 * @param contentUrl 
 */
@Serializable
data class ProjectMinusCardApiModel(
    @SerialName(value = "url")
    val url: kotlin.String,
    /* The project card's ID */
    @SerialName(value = "id")
    val id: kotlin.Int,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,
    @SerialName(value = "note")
    val note: kotlin.String?,
    @SerialName(value = "creator")
    val creator: NullableMinusSimpleMinusUserApiModel?,
    @SerialName(value = "created_at")
    val createdAt: kotlin.String,
    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String,
    @SerialName(value = "column_url")
    val columnUrl: kotlin.String,
    @SerialName(value = "project_url")
    val projectUrl: kotlin.String,
    /* Whether or not the card is archived */
    @SerialName(value = "archived")
    val archived: kotlin.Boolean? = null,
    @SerialName(value = "column_name")
    val columnName: kotlin.String? = null,
    @SerialName(value = "project_id")
    val projectId: kotlin.String? = null,
    @SerialName(value = "content_url")
    val contentUrl: kotlin.String? = null
) {

}

