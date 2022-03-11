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
 * License Simple
 * @param key 
 * @param name 
 * @param url 
 * @param spdxId 
 * @param nodeId 
 * @param htmlUrl 
 */
@Serializable
data class LicenseMinusSimpleApiModel(
    @SerialName(value = "key")
    val key: kotlin.String,
    @SerialName(value = "name")
    val name: kotlin.String,
    @SerialName(value = "url")
    val url: kotlin.String?,
    @SerialName(value = "spdx_id")
    val spdxId: kotlin.String?,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,
    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String? = null
) {

}

