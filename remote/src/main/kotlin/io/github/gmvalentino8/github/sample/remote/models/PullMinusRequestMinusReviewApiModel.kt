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

import io.github.gmvalentino8.github.sample.remote.models.AuthorAssociationApiModel
import io.github.gmvalentino8.github.sample.remote.models.NullableMinusSimpleMinusUserApiModel
import io.github.gmvalentino8.github.sample.remote.models.TimelineReviewedEventLinksApiModel

import kotlinx.serialization.*

/**
 * Pull Request Reviews are reviews on pull requests.
 * @param id Unique identifier of the review
 * @param nodeId 
 * @param user 
 * @param body The text of the review.
 * @param state 
 * @param htmlUrl 
 * @param pullRequestUrl 
 * @param links 
 * @param commitId A commit SHA for the review.
 * @param authorAssociation 
 * @param submittedAt 
 * @param bodyHtml 
 * @param bodyText 
 */
@Serializable
data class PullMinusRequestMinusReviewApiModel(
    /* Unique identifier of the review */
    @SerialName(value = "id")
    val id: kotlin.Int,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,
    @SerialName(value = "user")
    val user: NullableMinusSimpleMinusUserApiModel?,
    /* The text of the review. */
    @SerialName(value = "body")
    val body: kotlin.String,
    @SerialName(value = "state")
    val state: kotlin.String,
    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,
    @SerialName(value = "pull_request_url")
    val pullRequestUrl: kotlin.String,
    @SerialName(value = "_links")
    val links: TimelineReviewedEventLinksApiModel,
    /* A commit SHA for the review. */
    @SerialName(value = "commit_id")
    val commitId: kotlin.String,
    @Contextual @SerialName(value = "author_association")
    val authorAssociation: AuthorAssociationApiModel,
    @SerialName(value = "submitted_at")
    val submittedAt: kotlin.String? = null,
    @SerialName(value = "body_html")
    val bodyHtml: kotlin.String? = null,
    @SerialName(value = "body_text")
    val bodyText: kotlin.String? = null
) {

}

