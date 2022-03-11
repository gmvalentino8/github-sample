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
 * Custom repository roles created by organization administrators
 * @param id 
 * @param name 
 */
@Serializable
data class OrganizationMinusCustomMinusRepositoryMinusRoleApiModel(
    @SerialName(value = "id")
    val id: kotlin.Int,
    @SerialName(value = "name")
    val name: kotlin.String
) {

}

