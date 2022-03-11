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


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The type of reviewer. Must be one of: `User` or `Team`
 *
 * Values: user,team
 */
@Serializable
enum class DeploymentMinusReviewerMinusTypeApiModel(val value: kotlin.String) {

    @SerialName(value = "User")
    user("User"),

    @SerialName(value = "Team")
    team("Team");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: Any?): kotlin.String? = if (data is DeploymentMinusReviewerMinusTypeApiModel) "$data" else null

        /**
         * Returns a valid [DeploymentMinusReviewerMinusTypeApiModel] for [data], null otherwise.
         */
        fun decode(data: Any?): DeploymentMinusReviewerMinusTypeApiModel? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
