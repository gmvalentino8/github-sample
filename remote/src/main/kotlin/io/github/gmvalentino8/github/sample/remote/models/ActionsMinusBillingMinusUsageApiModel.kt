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

import io.github.gmvalentino8.github.sample.remote.models.ActionsBillingUsageMinutesUsedBreakdownApiModel

import kotlinx.serialization.*

/**
 * 
 * @param totalMinutesUsed The sum of the free and paid GitHub Actions minutes used.
 * @param totalPaidMinutesUsed The total paid GitHub Actions minutes used.
 * @param includedMinutes The amount of free GitHub Actions minutes available.
 * @param minutesUsedBreakdown 
 */
@Serializable
data class ActionsMinusBillingMinusUsageApiModel(
    /* The sum of the free and paid GitHub Actions minutes used. */
    @SerialName(value = "total_minutes_used")
    val totalMinutesUsed: kotlin.Int,
    /* The total paid GitHub Actions minutes used. */
    @SerialName(value = "total_paid_minutes_used")
    val totalPaidMinutesUsed: kotlin.Int,
    /* The amount of free GitHub Actions minutes available. */
    @SerialName(value = "included_minutes")
    val includedMinutes: kotlin.Int,
    @SerialName(value = "minutes_used_breakdown")
    val minutesUsedBreakdown: ActionsBillingUsageMinutesUsedBreakdownApiModel
) {

}

