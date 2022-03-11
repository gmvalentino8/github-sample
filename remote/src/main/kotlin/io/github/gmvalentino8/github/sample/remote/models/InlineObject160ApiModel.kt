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
 * @param permission The permission to grant the team on this repository. Can be one of:   \\* `pull` - team members can pull, but not push to or administer this repository.   \\* `push` - team members can pull and push, but not administer this repository.   \\* `admin` - team members can pull, push and administer this repository.      If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.
 */
@Serializable
data class InlineObject160ApiModel(
    /* The permission to grant the team on this repository. Can be one of:   \\* `pull` - team members can pull, but not push to or administer this repository.   \\* `push` - team members can pull and push, but not administer this repository.   \\* `admin` - team members can pull, push and administer this repository.      If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository. */
    @SerialName(value = "permission")
    val permission: InlineObject160ApiModel.Permission? = null
) {

    /**
     * The permission to grant the team on this repository. Can be one of:   \\* `pull` - team members can pull, but not push to or administer this repository.   \\* `push` - team members can pull and push, but not administer this repository.   \\* `admin` - team members can pull, push and administer this repository.      If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.
     * Values: pull,push,admin
     */
    @Serializable(with = Permission.Serializer::class)
    enum class Permission(val value: kotlin.String) {
        pull("pull"),
        push("push"),
        admin("admin");

        @kotlinx.serialization.Serializer(forClass = Permission::class)
        object Serializer {
            override fun deserialize(decoder: Decoder): Permission {
                val decoded = decoder.decodeString()
                return values().first { it.value == decoded }
            }

            override val descriptor: SerialDescriptor
                get() = PrimitiveSerialDescriptor(
                    "InlineObject160ApiModel.Permission.Serializer",
                    PrimitiveKind.STRING
                )

            override fun serialize(encoder: Encoder, value: Permission) {
                return encoder.encodeString(value.value)
            }
        }
    }
}

