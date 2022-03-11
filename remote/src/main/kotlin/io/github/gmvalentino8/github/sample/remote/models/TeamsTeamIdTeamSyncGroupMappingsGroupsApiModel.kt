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
 * @param groupId ID of the IdP group.
 * @param groupName Name of the IdP group.
 * @param groupDescription Description of the IdP group.
 * @param id 
 * @param name 
 * @param description 
 */
@Serializable
data class TeamsTeamIdTeamSyncGroupMappingsGroupsApiModel(
    /* ID of the IdP group. */
    @SerialName(value = "group_id")
    val groupId: kotlin.String,
    /* Name of the IdP group. */
    @SerialName(value = "group_name")
    val groupName: kotlin.String,
    /* Description of the IdP group. */
    @SerialName(value = "group_description")
    val groupDescription: kotlin.String,
    @SerialName(value = "id")
    val id: kotlin.String? = null,
    @SerialName(value = "name")
    val name: kotlin.String? = null,
    @SerialName(value = "description")
    val description: kotlin.String? = null
) {

}

