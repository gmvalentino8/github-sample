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
 * The author of the file. Default: The `committer` or the authenticated user if you omit `committer`.
 * @param name The name of the author or committer of the commit. You'll receive a `422` status code if `name` is omitted.
 * @param email The email of the author or committer of the commit. You'll receive a `422` status code if `email` is omitted.
 * @param date 
 */
@Serializable
data class ReposRepoNameContentsPathAuthorApiModel(
    /* The name of the author or committer of the commit. You'll receive a `422` status code if `name` is omitted. */
    @SerialName(value = "name")
    val name: kotlin.String,
    /* The email of the author or committer of the commit. You'll receive a `422` status code if `email` is omitted. */
    @SerialName(value = "email")
    val email: kotlin.String,
    @SerialName(value = "date")
    val date: kotlin.String? = null
) {

}

