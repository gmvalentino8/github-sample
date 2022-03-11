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

import io.github.gmvalentino8.github.sample.remote.models.ReposRepoNamePullsPullNumberReviewsCommentsApiModel

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * 
 * @param commitId The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the pull request when you do not specify a value.
 * @param body **Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request review.
 * @param event The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://docs.github.com/rest/reference/pulls#submit-a-review-for-a-pull-request) when you are ready.
 * @param comments Use the following table to specify the location, destination, and contents of the draft review comment.
 */
@Serializable
data class InlineObject125ApiModel(
    /* The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the pull request when you do not specify a value. */
    @SerialName(value = "commit_id")
    val commitId: kotlin.String? = null,
    /* **Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request review. */
    @SerialName(value = "body")
    val body: kotlin.String? = null,
    /* The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://docs.github.com/rest/reference/pulls#submit-a-review-for-a-pull-request) when you are ready. */
    @SerialName(value = "event")
    val event: InlineObject125ApiModel.Event? = null,
    /* Use the following table to specify the location, destination, and contents of the draft review comment. */
    @SerialName(value = "comments")
    val comments: kotlin.collections.List<ReposRepoNamePullsPullNumberReviewsCommentsApiModel>? = null
) {

    /**
     * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://docs.github.com/rest/reference/pulls#submit-a-review-for-a-pull-request) when you are ready.
     * Values: aPPROVE,rEQUESTCHANGES,cOMMENT
     */
    @Serializable(with = Event.Serializer::class)
    enum class Event(val value: kotlin.String) {
        aPPROVE("APPROVE"),
        rEQUESTCHANGES("REQUEST_CHANGES"),
        cOMMENT("COMMENT");

        @kotlinx.serialization.Serializer(forClass = Event::class)
        object Serializer {
            override fun deserialize(decoder: Decoder): Event {
                val decoded = decoder.decodeString()
                return values().first { it.value == decoded }
            }

            override val descriptor: SerialDescriptor
                get() = PrimitiveSerialDescriptor(
                    "InlineObject125ApiModel.Event.Serializer",
                    PrimitiveKind.STRING
                )

            override fun serialize(encoder: Encoder, value: Event) {
                return encoder.encodeString(value.value)
            }
        }
    }
}

