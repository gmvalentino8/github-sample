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

import io.github.gmvalentino8.github.sample.remote.models.CommitApiModel
import io.github.gmvalentino8.github.sample.remote.models.DiffMinusEntryApiModel

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Commit Comparison
 * @param url 
 * @param htmlUrl 
 * @param permalinkUrl 
 * @param diffUrl 
 * @param patchUrl 
 * @param baseCommit 
 * @param mergeBaseCommit 
 * @param status 
 * @param aheadBy 
 * @param behindBy 
 * @param totalCommits 
 * @param commits 
 * @param files 
 */
@Serializable
data class CommitMinusComparisonApiModel(
    @SerialName(value = "url")
    val url: kotlin.String,
    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,
    @SerialName(value = "permalink_url")
    val permalinkUrl: kotlin.String,
    @SerialName(value = "diff_url")
    val diffUrl: kotlin.String,
    @SerialName(value = "patch_url")
    val patchUrl: kotlin.String,
    @SerialName(value = "base_commit")
    val baseCommit: CommitApiModel,
    @SerialName(value = "merge_base_commit")
    val mergeBaseCommit: CommitApiModel,
    @SerialName(value = "status")
    val status: CommitMinusComparisonApiModel.Status,
    @SerialName(value = "ahead_by")
    val aheadBy: kotlin.Int,
    @SerialName(value = "behind_by")
    val behindBy: kotlin.Int,
    @SerialName(value = "total_commits")
    val totalCommits: kotlin.Int,
    @SerialName(value = "commits")
    val commits: kotlin.collections.List<CommitApiModel>,
    @SerialName(value = "files")
    val files: kotlin.collections.List<DiffMinusEntryApiModel>? = null
) {

    /**
     * 
     * Values: diverged,ahead,behind,identical
     */
    @Serializable(with = Status.Serializer::class)
    enum class Status(val value: kotlin.String) {
        diverged("diverged"),
        ahead("ahead"),
        behind("behind"),
        identical("identical");

        @kotlinx.serialization.Serializer(forClass = Status::class)
        object Serializer {
            override fun deserialize(decoder: Decoder): Status {
                val decoded = decoder.decodeString()
                return values().first { it.value == decoded }
            }

            override val descriptor: SerialDescriptor
                get() = PrimitiveSerialDescriptor(
                    "CommitMinusComparisonApiModel.Status.Serializer",
                    PrimitiveKind.STRING
                )

            override fun serialize(encoder: Encoder, value: Status) {
                return encoder.encodeString(value.value)
            }
        }
    }
}

