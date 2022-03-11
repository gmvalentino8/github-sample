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

import io.github.gmvalentino8.github.sample.remote.models.BranchMinusProtectionApiModel
import io.github.gmvalentino8.github.sample.remote.models.ShortBranchCommitApiModel

import kotlinx.serialization.*

/**
 * Short Branch
 * @param name 
 * @param commit 
 * @param `protected` 
 * @param protection 
 * @param protectionUrl 
 */
@Serializable
data class ShortMinusBranchApiModel(
    @SerialName(value = "name")
    val name: kotlin.String,
    @SerialName(value = "commit")
    val commit: ShortBranchCommitApiModel,
    @SerialName(value = "protected")
    val `protected`: kotlin.Boolean,
    @SerialName(value = "protection")
    val protection: BranchMinusProtectionApiModel? = null,
    @SerialName(value = "protection_url")
    val protectionUrl: kotlin.String? = null
) {

}

