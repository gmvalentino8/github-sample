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

import io.github.gmvalentino8.github.sample.remote.models.GitTreeTreeApiModel

import kotlinx.serialization.*

/**
 * The hierarchy between files in a Git repository.
 * @param sha 
 * @param url 
 * @param truncated 
 * @param tree Objects specifying a tree structure
 */
@Serializable
data class GitMinusTreeApiModel(
    @SerialName(value = "sha")
    val sha: kotlin.String,
    @SerialName(value = "url")
    val url: kotlin.String,
    @SerialName(value = "truncated")
    val truncated: kotlin.Boolean,
    /* Objects specifying a tree structure */
    @SerialName(value = "tree")
    val tree: kotlin.collections.List<GitTreeTreeApiModel>
) {

}

