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
 * Porter Large File
 * @param refName 
 * @param path 
 * @param oid 
 * @param propertySize 
 */
@Serializable
data class PorterMinusLargeMinusFileApiModel(
    @SerialName(value = "ref_name")
    val refName: kotlin.String,
    @SerialName(value = "path")
    val path: kotlin.String,
    @SerialName(value = "oid")
    val oid: kotlin.String,
    @SerialName(value = "size")
    val propertySize: kotlin.Int
) {

}

