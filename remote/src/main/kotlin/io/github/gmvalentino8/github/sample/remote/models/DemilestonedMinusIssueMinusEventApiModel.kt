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

import io.github.gmvalentino8.github.sample.remote.models.MilestonedIssueEventMilestoneApiModel
import io.github.gmvalentino8.github.sample.remote.models.NullableMinusIntegrationApiModel
import io.github.gmvalentino8.github.sample.remote.models.SimpleMinusUserApiModel

import kotlinx.serialization.*

/**
 * Demilestoned Issue Event
 * @param id 
 * @param nodeId 
 * @param url 
 * @param actor 
 * @param event 
 * @param commitId 
 * @param commitUrl 
 * @param createdAt 
 * @param performedViaGithubApp 
 * @param milestone 
 */
@Serializable
data class DemilestonedMinusIssueMinusEventApiModel(
    @SerialName(value = "id")
    val id: kotlin.Int,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,
    @SerialName(value = "url")
    val url: kotlin.String,
    @SerialName(value = "actor")
    val actor: SimpleMinusUserApiModel,
    @SerialName(value = "event")
    val event: kotlin.String,
    @SerialName(value = "commit_id")
    val commitId: kotlin.String?,
    @SerialName(value = "commit_url")
    val commitUrl: kotlin.String?,
    @SerialName(value = "created_at")
    val createdAt: kotlin.String,
    @SerialName(value = "performed_via_github_app")
    val performedViaGithubApp: NullableMinusIntegrationApiModel?,
    @SerialName(value = "milestone")
    val milestone: MilestonedIssueEventMilestoneApiModel
) {

}

