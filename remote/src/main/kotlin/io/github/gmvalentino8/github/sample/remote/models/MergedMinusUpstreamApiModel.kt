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
 * Results of a successful merge upstream request
 * @param message 
 * @param mergeType 
 * @param baseBranch 
 */
@Serializable
data class MergedMinusUpstreamApiModel(
    @SerialName(value = "message")
    val message: kotlin.String? = null,
    @SerialName(value = "merge_type")
    val mergeType: MergedMinusUpstreamApiModel.MergeType? = null,
    @SerialName(value = "base_branch")
    val baseBranch: kotlin.String? = null
) {

    /**
     * 
     * Values: merge,fastMinusForward,none
     */
    @Serializable(with = MergeType.Serializer::class)
    enum class MergeType(val value: kotlin.String) {
        merge("merge"),
        fastMinusForward("fast-forward"),
        none("none");

        @kotlinx.serialization.Serializer(forClass = MergeType::class)
        object Serializer {
            override fun deserialize(decoder: Decoder): MergeType {
                val decoded = decoder.decodeString()
                return values().first { it.value == decoded }
            }

            override val descriptor: SerialDescriptor
                get() = PrimitiveSerialDescriptor(
                    "MergedMinusUpstreamApiModel.MergeType.Serializer",
                    PrimitiveKind.STRING
                )

            override fun serialize(encoder: Encoder, value: MergeType) {
                return encoder.encodeString(value.value)
            }
        }
    }
}

