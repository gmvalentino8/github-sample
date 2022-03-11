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
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * 
 * @param op 
 * @param path 
 * @param `value` 
 */
@Serializable
data class ScimUserOperationsApiModel(
    @SerialName(value = "op")
    val op: ScimUserOperationsApiModel.Op,
    @SerialName(value = "path")
    val path: kotlin.String? = null,
    @SerialName(value = "value")
    val `value`: kotlin.String? = null
) {

    /**
     * 
     * Values: add,remove,replace
     */
    @Serializable(with = Op.Serializer::class)
    enum class Op(val value: kotlin.String) {
        add("add"),
        remove("remove"),
        replace("replace");

        @kotlinx.serialization.Serializer(forClass = Op::class)
        object Serializer {
            override fun deserialize(decoder: Decoder): Op {
                val decoded = decoder.decodeString()
                return values().first { it.value == decoded }
            }

            override val descriptor: SerialDescriptor
                get() = PrimitiveSerialDescriptor(
                    "ScimUserOperationsApiModel.Op.Serializer",
                    PrimitiveKind.STRING
                )

            override fun serialize(encoder: Encoder, value: Op) {
                return encoder.encodeString(value.value)
            }
        }
    }
}

