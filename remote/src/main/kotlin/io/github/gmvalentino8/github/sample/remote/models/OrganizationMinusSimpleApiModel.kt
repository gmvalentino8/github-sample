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
 * Organization Simple
 * @param login 
 * @param id 
 * @param nodeId 
 * @param url 
 * @param reposUrl 
 * @param eventsUrl 
 * @param hooksUrl 
 * @param issuesUrl 
 * @param membersUrl 
 * @param publicMembersUrl 
 * @param avatarUrl 
 * @param description 
 */
@Serializable
data class OrganizationMinusSimpleApiModel(
    @SerialName(value = "login")
    val login: kotlin.String,
    @SerialName(value = "id")
    val id: kotlin.Int,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,
    @SerialName(value = "url")
    val url: kotlin.String,
    @SerialName(value = "repos_url")
    val reposUrl: kotlin.String,
    @SerialName(value = "events_url")
    val eventsUrl: kotlin.String,
    @SerialName(value = "hooks_url")
    val hooksUrl: kotlin.String,
    @SerialName(value = "issues_url")
    val issuesUrl: kotlin.String,
    @SerialName(value = "members_url")
    val membersUrl: kotlin.String,
    @SerialName(value = "public_members_url")
    val publicMembersUrl: kotlin.String,
    @SerialName(value = "avatar_url")
    val avatarUrl: kotlin.String,
    @SerialName(value = "description")
    val description: kotlin.String?
) {

}

