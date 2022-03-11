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

import io.github.gmvalentino8.github.sample.remote.models.ApiOverviewSshKeyFingerprintsApiModel

import kotlinx.serialization.*

/**
 * Api Overview
 * @param verifiablePasswordAuthentication 
 * @param sshKeyFingerprints 
 * @param sshKeys 
 * @param hooks 
 * @param web 
 * @param api 
 * @param git 
 * @param packages 
 * @param pages 
 * @param importer 
 * @param actions 
 * @param dependabot 
 */
@Serializable
data class ApiMinusOverviewApiModel(
    @SerialName(value = "verifiable_password_authentication")
    val verifiablePasswordAuthentication: kotlin.Boolean,
    @SerialName(value = "ssh_key_fingerprints")
    val sshKeyFingerprints: ApiOverviewSshKeyFingerprintsApiModel? = null,
    @SerialName(value = "ssh_keys")
    val sshKeys: kotlin.collections.List<kotlin.String>? = null,
    @SerialName(value = "hooks")
    val hooks: kotlin.collections.List<kotlin.String>? = null,
    @SerialName(value = "web")
    val web: kotlin.collections.List<kotlin.String>? = null,
    @SerialName(value = "api")
    val api: kotlin.collections.List<kotlin.String>? = null,
    @SerialName(value = "git")
    val git: kotlin.collections.List<kotlin.String>? = null,
    @SerialName(value = "packages")
    val packages: kotlin.collections.List<kotlin.String>? = null,
    @SerialName(value = "pages")
    val pages: kotlin.collections.List<kotlin.String>? = null,
    @SerialName(value = "importer")
    val importer: kotlin.collections.List<kotlin.String>? = null,
    @SerialName(value = "actions")
    val actions: kotlin.collections.List<kotlin.String>? = null,
    @SerialName(value = "dependabot")
    val dependabot: kotlin.collections.List<kotlin.String>? = null
) {

}

