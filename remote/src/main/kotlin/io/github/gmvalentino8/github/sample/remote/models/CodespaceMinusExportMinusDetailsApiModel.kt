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
 * An export of a codespace. Also, latest export details for a codespace can be fetched with id = latest
 * @param state State of the latest export
 * @param completedAt Completion time of the last export operation
 * @param branch Name of the exported branch
 * @param sha Git commit SHA of the exported branch
 * @param id Id for the export details
 * @param exportUrl Url for fetching export details
 */
@Serializable
data class CodespaceMinusExportMinusDetailsApiModel(
    /* State of the latest export */
    @SerialName(value = "state")
    val state: kotlin.String? = null,
    /* Completion time of the last export operation */
    @SerialName(value = "completed_at")
    val completedAt: kotlin.String? = null,
    /* Name of the exported branch */
    @SerialName(value = "branch")
    val branch: kotlin.String? = null,
    /* Git commit SHA of the exported branch */
    @SerialName(value = "sha")
    val sha: kotlin.String? = null,
    /* Id for the export details */
    @SerialName(value = "id")
    val id: kotlin.String? = null,
    /* Url for fetching export details */
    @SerialName(value = "export_url")
    val exportUrl: kotlin.String? = null
) {

}

