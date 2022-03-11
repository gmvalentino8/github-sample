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

import io.github.gmvalentino8.github.sample.remote.models.PagesHealthCheckAltDomainApiModel
import io.github.gmvalentino8.github.sample.remote.models.PagesHealthCheckDomainApiModel

import kotlinx.serialization.*

/**
 * Pages Health Check Status
 * @param domain 
 * @param altDomain 
 */
@Serializable
data class PagesMinusHealthMinusCheckApiModel(
    @SerialName(value = "domain")
    val domain: PagesHealthCheckDomainApiModel? = null,
    @SerialName(value = "alt_domain")
    val altDomain: PagesHealthCheckAltDomainApiModel? = null
) {

}

