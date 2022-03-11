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
 * Content Traffic
 * @param path 
 * @param title 
 * @param count 
 * @param uniques 
 */
@Serializable
data class ContentMinusTrafficApiModel(
    @SerialName(value = "path")
    val path: kotlin.String,
    @SerialName(value = "title")
    val title: kotlin.String,
    @SerialName(value = "count")
    val count: kotlin.Int,
    @SerialName(value = "uniques")
    val uniques: kotlin.Int
) {

}

