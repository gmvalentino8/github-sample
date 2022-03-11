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
 * @param id An identifier for the upload.
 * @param url The REST API URL for checking the status of the upload.
 */
@Serializable
data class CodeMinusScanningMinusSarifsMinusReceiptApiModel(
    /* An identifier for the upload. */
    @SerialName(value = "id")
    val id: kotlin.String? = null,
    /* The REST API URL for checking the status of the upload. */
    @SerialName(value = "url")
    val url: kotlin.String? = null
) {

}
