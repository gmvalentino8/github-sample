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

import io.github.gmvalentino8.github.sample.remote.models.CodespacesMinusSecretApiModel

import kotlinx.serialization.*

/**
 * 
 * @param totalCount 
 * @param secrets 
 */
@Serializable
data class InlineResponse20031ApiModel(
    @SerialName(value = "total_count")
    val totalCount: kotlin.Int,
    @SerialName(value = "secrets")
    val secrets: kotlin.collections.List<CodespacesMinusSecretApiModel>
) {

}

