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

import io.github.gmvalentino8.github.sample.remote.models.NullableMinusSimpleMinusUserApiModel

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * A collection of related issues and pull requests.
 * @param url 
 * @param htmlUrl 
 * @param labelsUrl 
 * @param id 
 * @param nodeId 
 * @param number The number of the milestone.
 * @param state The state of the milestone.
 * @param title The title of the milestone.
 * @param description 
 * @param creator 
 * @param openIssues 
 * @param closedIssues 
 * @param createdAt 
 * @param updatedAt 
 * @param closedAt 
 * @param dueOn 
 */
@Serializable
data class NullableMinusMilestoneApiModel(
    @SerialName(value = "url")
    val url: kotlin.String,
    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,
    @SerialName(value = "labels_url")
    val labelsUrl: kotlin.String,
    @SerialName(value = "id")
    val id: kotlin.Int,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,
    /* The number of the milestone. */
    @SerialName(value = "number")
    val number: kotlin.Int,
    /* The state of the milestone. */
    @SerialName(value = "state")
    val state: NullableMinusMilestoneApiModel.State = State.`open`,
    /* The title of the milestone. */
    @SerialName(value = "title")
    val title: kotlin.String,
    @SerialName(value = "description")
    val description: kotlin.String?,
    @SerialName(value = "creator")
    val creator: NullableMinusSimpleMinusUserApiModel?,
    @SerialName(value = "open_issues")
    val openIssues: kotlin.Int,
    @SerialName(value = "closed_issues")
    val closedIssues: kotlin.Int,
    @SerialName(value = "created_at")
    val createdAt: kotlin.String,
    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String,
    @SerialName(value = "closed_at")
    val closedAt: kotlin.String?,
    @SerialName(value = "due_on")
    val dueOn: kotlin.String?
) {

    /**
     * The state of the milestone.
     * Values: `open`,closed
     */
    @Serializable(with = State.Serializer::class)
    enum class State(val value: kotlin.String) {
        `open`("open"),
        closed("closed");

        @kotlinx.serialization.Serializer(forClass = State::class)
        object Serializer {
            override fun deserialize(decoder: Decoder): State {
                val decoded = decoder.decodeString()
                return values().first { it.value == decoded }
            }

            override val descriptor: SerialDescriptor
                get() = PrimitiveSerialDescriptor(
                    "NullableMinusMilestoneApiModel.State.Serializer",
                    PrimitiveKind.STRING
                )

            override fun serialize(encoder: Encoder, value: State) {
                return encoder.encodeString(value.value)
            }
        }
    }
}

