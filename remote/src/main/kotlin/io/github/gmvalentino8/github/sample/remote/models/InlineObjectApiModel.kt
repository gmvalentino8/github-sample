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
 * 
 * @param url The URL to which the payloads will be delivered.
 * @param contentType The media type used to serialize the payloads. Supported values include `json` and `form`. The default is `form`.
 * @param secret If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers).
 * @param insecureSsl Determines whether the SSL certificate of the host for `url` will be verified when delivering payloads. Supported values include `0` (verification is performed) and `1` (verification is not performed). The default is `0`. **We strongly recommend not setting this to `1` as you are subject to man-in-the-middle and other attacks.**
 */
@Serializable
data class InlineObjectApiModel(
    /* The URL to which the payloads will be delivered. */
    @SerialName(value = "url")
    val url: kotlin.String? = null,
    /* The media type used to serialize the payloads. Supported values include `json` and `form`. The default is `form`. */
    @SerialName(value = "content_type")
    val contentType: kotlin.String? = null,
    /* If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers). */
    @SerialName(value = "secret")
    val secret: kotlin.String? = null,
    /* Determines whether the SSL certificate of the host for `url` will be verified when delivering payloads. Supported values include `0` (verification is performed) and `1` (verification is not performed). The default is `0`. **We strongly recommend not setting this to `1` as you are subject to man-in-the-middle and other attacks.** */
    @SerialName(value = "insecure_ssl")
    val insecureSsl: kotlin.String? = null
) {

}

