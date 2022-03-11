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
 * @param note The project card's note
 * @param archived Whether or not the card is archived
 */
@Serializable
data class InlineObject50ApiModel(
    /* The project card's note */
    @SerialName(value = "note")
    val note: kotlin.String? = null,
    /* Whether or not the card is archived */
    @SerialName(value = "archived")
    val archived: kotlin.Boolean? = null
) {

}

