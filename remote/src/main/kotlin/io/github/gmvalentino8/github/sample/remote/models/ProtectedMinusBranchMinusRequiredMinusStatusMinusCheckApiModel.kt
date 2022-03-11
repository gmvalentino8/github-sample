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

import io.github.gmvalentino8.github.sample.remote.models.ProtectedBranchRequiredStatusCheckChecksApiModel

import kotlinx.serialization.*

/**
 * Protected Branch Required Status Check
 * @param contexts 
 * @param checks 
 * @param url 
 * @param enforcementLevel 
 * @param contextsUrl 
 * @param strict 
 */
@Serializable
data class ProtectedMinusBranchMinusRequiredMinusStatusMinusCheckApiModel(
    @SerialName(value = "contexts")
    val contexts: kotlin.collections.List<kotlin.String>,
    @SerialName(value = "checks")
    val checks: kotlin.collections.List<ProtectedBranchRequiredStatusCheckChecksApiModel>,
    @SerialName(value = "url")
    val url: kotlin.String? = null,
    @SerialName(value = "enforcement_level")
    val enforcementLevel: kotlin.String? = null,
    @SerialName(value = "contexts_url")
    val contextsUrl: kotlin.String? = null,
    @SerialName(value = "strict")
    val strict: kotlin.Boolean? = null
) {

}

