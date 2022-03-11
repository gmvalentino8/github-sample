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

import io.github.gmvalentino8.github.sample.remote.models.PullRequestMinimalHeadApiModel

import kotlinx.serialization.*

/**
 * 
 * @param id 
 * @param number 
 * @param url 
 * @param head 
 * @param base 
 */
@Serializable
data class PullMinusRequestMinusMinimalApiModel(
    @SerialName(value = "id")
    val id: kotlin.Int,
    @SerialName(value = "number")
    val number: kotlin.Int,
    @SerialName(value = "url")
    val url: kotlin.String,
    @SerialName(value = "head")
    val head: PullRequestMinimalHeadApiModel,
    @SerialName(value = "base")
    val base: PullRequestMinimalHeadApiModel
) {

}

