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

import io.github.gmvalentino8.github.sample.remote.models.GitCommitAuthorApiModel
import io.github.gmvalentino8.github.sample.remote.models.GitCommitParentsApiModel
import io.github.gmvalentino8.github.sample.remote.models.GitCommitTreeApiModel
import io.github.gmvalentino8.github.sample.remote.models.GitCommitVerificationApiModel

import kotlinx.serialization.*

/**
 * Timeline Committed Event
 * @param sha SHA for the commit
 * @param nodeId 
 * @param url 
 * @param author 
 * @param committer 
 * @param message Message describing the purpose of the commit
 * @param tree 
 * @param parents 
 * @param verification 
 * @param htmlUrl 
 * @param event 
 */
@Serializable
data class TimelineMinusCommittedMinusEventApiModel(
    /* SHA for the commit */
    @SerialName(value = "sha")
    val sha: kotlin.String,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,
    @SerialName(value = "url")
    val url: kotlin.String,
    @SerialName(value = "author")
    val author: GitCommitAuthorApiModel,
    @SerialName(value = "committer")
    val committer: GitCommitAuthorApiModel,
    /* Message describing the purpose of the commit */
    @SerialName(value = "message")
    val message: kotlin.String,
    @SerialName(value = "tree")
    val tree: GitCommitTreeApiModel,
    @SerialName(value = "parents")
    val parents: kotlin.collections.List<GitCommitParentsApiModel>,
    @SerialName(value = "verification")
    val verification: GitCommitVerificationApiModel,
    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,
    @SerialName(value = "event")
    val event: kotlin.String? = null
) {

}

