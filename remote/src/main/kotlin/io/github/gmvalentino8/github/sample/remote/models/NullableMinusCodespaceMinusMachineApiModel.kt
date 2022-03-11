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
 * A description of the machine powering a codespace.
 * @param name The name of the machine.
 * @param displayName The display name of the machine includes cores, memory, and storage.
 * @param operatingSystem The operating system of the machine.
 * @param storageInBytes How much storage is available to the codespace.
 * @param memoryInBytes How much memory is available to the codespace.
 * @param cpus How many cores are available to the codespace.
 * @param prebuildAvailability Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch was not specified as a ref, the default branch will be assumed. Value will be \"null\" if prebuilds are not supported or prebuild availability could not be determined. Value is the type of prebuild available, or \"none\" if none are available.
 */
@Serializable
data class NullableMinusCodespaceMinusMachineApiModel(
    /* The name of the machine. */
    @SerialName(value = "name")
    val name: kotlin.String,
    /* The display name of the machine includes cores, memory, and storage. */
    @SerialName(value = "display_name")
    val displayName: kotlin.String,
    /* The operating system of the machine. */
    @SerialName(value = "operating_system")
    val operatingSystem: kotlin.String,
    /* How much storage is available to the codespace. */
    @SerialName(value = "storage_in_bytes")
    val storageInBytes: kotlin.Int,
    /* How much memory is available to the codespace. */
    @SerialName(value = "memory_in_bytes")
    val memoryInBytes: kotlin.Int,
    /* How many cores are available to the codespace. */
    @SerialName(value = "cpus")
    val cpus: kotlin.Int,
    /* Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch was not specified as a ref, the default branch will be assumed. Value will be \"null\" if prebuilds are not supported or prebuild availability could not be determined. Value is the type of prebuild available, or \"none\" if none are available. */
    @SerialName(value = "prebuild_availability")
    val prebuildAvailability: NullableMinusCodespaceMinusMachineApiModel.PrebuildAvailability?
) {

    /**
     * Whether a prebuild is currently available when creating a codespace for this machine and repository. If a branch was not specified as a ref, the default branch will be assumed. Value will be \"null\" if prebuilds are not supported or prebuild availability could not be determined. Value is the type of prebuild available, or \"none\" if none are available.
     * Values: none,blob,pool
     */
    @Serializable(with = PrebuildAvailability.Serializer::class)
    enum class PrebuildAvailability(val value: kotlin.String) {
        none("none"),
        blob("blob"),
        pool("pool");

        @kotlinx.serialization.Serializer(forClass = PrebuildAvailability::class)
        object Serializer {
            override fun deserialize(decoder: Decoder): PrebuildAvailability {
                val decoded = decoder.decodeString()
                return values().first { it.value == decoded }
            }

            override val descriptor: SerialDescriptor
                get() = PrimitiveSerialDescriptor(
                    "NullableMinusCodespaceMinusMachineApiModel.PrebuildAvailability.Serializer",
                    PrimitiveKind.STRING
                )

            override fun serialize(encoder: Encoder, value: PrebuildAvailability) {
                return encoder.encodeString(value.value)
            }
        }
    }
}

