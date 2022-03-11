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
 * @param self 
 * @param git 
 * @param html 
 */
@Serializable
data class FileCommitContentLinksApiModel(
    @SerialName(value = "self")
    val self: kotlin.String? = null,
    @SerialName(value = "git")
    val git: kotlin.String? = null,
    @SerialName(value = "html")
    val html: kotlin.String? = null
) {

}
