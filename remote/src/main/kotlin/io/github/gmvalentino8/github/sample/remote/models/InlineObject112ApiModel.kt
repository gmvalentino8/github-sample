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
 * @param base The name of the base branch that the head will be merged into.
 * @param head The head to merge. This can be a branch name or a commit SHA1.
 * @param commitMessage Commit message to use for the merge commit. If omitted, a default message will be used.
 */
@Serializable
data class InlineObject112ApiModel(
    /* The name of the base branch that the head will be merged into. */
    @SerialName(value = "base")
    val base: kotlin.String,
    /* The head to merge. This can be a branch name or a commit SHA1. */
    @SerialName(value = "head")
    val head: kotlin.String,
    /* Commit message to use for the merge commit. If omitted, a default message will be used. */
    @SerialName(value = "commit_message")
    val commitMessage: kotlin.String? = null
) {

}

