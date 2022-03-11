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
 * How the author is associated with the repository.
 *
 * Values: cOLLABORATOR,cONTRIBUTOR,fIRSTTIMER,fIRSTTIMECONTRIBUTOR,mANNEQUIN,mEMBER,nONE,oWNER
 */
@Serializable
enum class AuthorAssociationApiModel(val value: kotlin.String) {

    @SerialName(value = "COLLABORATOR")
    cOLLABORATOR("COLLABORATOR"),

    @SerialName(value = "CONTRIBUTOR")
    cONTRIBUTOR("CONTRIBUTOR"),

    @SerialName(value = "FIRST_TIMER")
    fIRSTTIMER("FIRST_TIMER"),

    @SerialName(value = "FIRST_TIME_CONTRIBUTOR")
    fIRSTTIMECONTRIBUTOR("FIRST_TIME_CONTRIBUTOR"),

    @SerialName(value = "MANNEQUIN")
    mANNEQUIN("MANNEQUIN"),

    @SerialName(value = "MEMBER")
    mEMBER("MEMBER"),

    @SerialName(value = "NONE")
    nONE("NONE"),

    @SerialName(value = "OWNER")
    oWNER("OWNER");

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
        fun encode(data: Any?): kotlin.String? = if (data is AuthorAssociationApiModel) "$data" else null

        /**
         * Returns a valid [AuthorAssociationApiModel] for [data], null otherwise.
         */
        fun decode(data: Any?): AuthorAssociationApiModel? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

