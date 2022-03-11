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
 * @param key The public SSH key to add to your GitHub account.
 * @param title A descriptive name for the new key.
 */
@Serializable
data class InlineObject167ApiModel(
    /* The public SSH key to add to your GitHub account. */
    @SerialName(value = "key")
    val key: kotlin.String,
    /* A descriptive name for the new key. */
    @SerialName(value = "title")
    val title: kotlin.String? = null
) {

}

