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

import io.github.gmvalentino8.github.sample.remote.models.CodeMinusOfMinusConductApiModel
import io.github.gmvalentino8.github.sample.remote.models.MinimalRepositoryLicenseApiModel
import io.github.gmvalentino8.github.sample.remote.models.NullableMinusRepositoryApiModel
import io.github.gmvalentino8.github.sample.remote.models.RepositoryTemplateRepositoryPermissionsApiModel
import io.github.gmvalentino8.github.sample.remote.models.SimpleMinusUserApiModel

import kotlinx.serialization.*

/**
 * Minimal Repository
 * @param id 
 * @param nodeId 
 * @param name 
 * @param fullName 
 * @param owner 
 * @param `private` 
 * @param htmlUrl 
 * @param description 
 * @param fork 
 * @param url 
 * @param archiveUrl 
 * @param assigneesUrl 
 * @param blobsUrl 
 * @param branchesUrl 
 * @param collaboratorsUrl 
 * @param commentsUrl 
 * @param commitsUrl 
 * @param compareUrl 
 * @param contentsUrl 
 * @param contributorsUrl 
 * @param deploymentsUrl 
 * @param downloadsUrl 
 * @param eventsUrl 
 * @param forksUrl 
 * @param gitCommitsUrl 
 * @param gitRefsUrl 
 * @param gitTagsUrl 
 * @param issueCommentUrl 
 * @param issueEventsUrl 
 * @param issuesUrl 
 * @param keysUrl 
 * @param labelsUrl 
 * @param languagesUrl 
 * @param mergesUrl 
 * @param milestonesUrl 
 * @param notificationsUrl 
 * @param pullsUrl 
 * @param releasesUrl 
 * @param stargazersUrl 
 * @param statusesUrl 
 * @param subscribersUrl 
 * @param subscriptionUrl 
 * @param tagsUrl 
 * @param teamsUrl 
 * @param treesUrl 
 * @param hooksUrl 
 * @param gitUrl 
 * @param sshUrl 
 * @param cloneUrl 
 * @param mirrorUrl 
 * @param svnUrl 
 * @param homepage 
 * @param language 
 * @param forksCount 
 * @param stargazersCount 
 * @param watchersCount 
 * @param propertySize 
 * @param defaultBranch 
 * @param openIssuesCount 
 * @param isTemplate 
 * @param topics 
 * @param hasIssues 
 * @param hasProjects 
 * @param hasWiki 
 * @param hasPages 
 * @param hasDownloads 
 * @param archived 
 * @param disabled 
 * @param visibility 
 * @param pushedAt 
 * @param createdAt 
 * @param updatedAt 
 * @param permissions 
 * @param roleName 
 * @param templateRepository 
 * @param tempCloneToken 
 * @param deleteBranchOnMerge 
 * @param subscribersCount 
 * @param networkCount 
 * @param codeOfConduct 
 * @param license 
 * @param forks 
 * @param openIssues 
 * @param watchers 
 * @param allowForking 
 */
@Serializable
data class MinimalMinusRepositoryApiModel(
    @SerialName(value = "id")
    val id: kotlin.Int,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,
    @SerialName(value = "name")
    val name: kotlin.String,
    @SerialName(value = "full_name")
    val fullName: kotlin.String,
    @SerialName(value = "owner")
    val owner: SimpleMinusUserApiModel,
    @SerialName(value = "private")
    val `private`: kotlin.Boolean,
    @SerialName(value = "html_url")
    val htmlUrl: kotlin.String,
    @SerialName(value = "description")
    val description: kotlin.String?,
    @SerialName(value = "fork")
    val fork: kotlin.Boolean,
    @SerialName(value = "url")
    val url: kotlin.String,
    @SerialName(value = "archive_url")
    val archiveUrl: kotlin.String,
    @SerialName(value = "assignees_url")
    val assigneesUrl: kotlin.String,
    @SerialName(value = "blobs_url")
    val blobsUrl: kotlin.String,
    @SerialName(value = "branches_url")
    val branchesUrl: kotlin.String,
    @SerialName(value = "collaborators_url")
    val collaboratorsUrl: kotlin.String,
    @SerialName(value = "comments_url")
    val commentsUrl: kotlin.String,
    @SerialName(value = "commits_url")
    val commitsUrl: kotlin.String,
    @SerialName(value = "compare_url")
    val compareUrl: kotlin.String,
    @SerialName(value = "contents_url")
    val contentsUrl: kotlin.String,
    @SerialName(value = "contributors_url")
    val contributorsUrl: kotlin.String,
    @SerialName(value = "deployments_url")
    val deploymentsUrl: kotlin.String,
    @SerialName(value = "downloads_url")
    val downloadsUrl: kotlin.String,
    @SerialName(value = "events_url")
    val eventsUrl: kotlin.String,
    @SerialName(value = "forks_url")
    val forksUrl: kotlin.String,
    @SerialName(value = "git_commits_url")
    val gitCommitsUrl: kotlin.String,
    @SerialName(value = "git_refs_url")
    val gitRefsUrl: kotlin.String,
    @SerialName(value = "git_tags_url")
    val gitTagsUrl: kotlin.String,
    @SerialName(value = "issue_comment_url")
    val issueCommentUrl: kotlin.String,
    @SerialName(value = "issue_events_url")
    val issueEventsUrl: kotlin.String,
    @SerialName(value = "issues_url")
    val issuesUrl: kotlin.String,
    @SerialName(value = "keys_url")
    val keysUrl: kotlin.String,
    @SerialName(value = "labels_url")
    val labelsUrl: kotlin.String,
    @SerialName(value = "languages_url")
    val languagesUrl: kotlin.String,
    @SerialName(value = "merges_url")
    val mergesUrl: kotlin.String,
    @SerialName(value = "milestones_url")
    val milestonesUrl: kotlin.String,
    @SerialName(value = "notifications_url")
    val notificationsUrl: kotlin.String,
    @SerialName(value = "pulls_url")
    val pullsUrl: kotlin.String,
    @SerialName(value = "releases_url")
    val releasesUrl: kotlin.String,
    @SerialName(value = "stargazers_url")
    val stargazersUrl: kotlin.String,
    @SerialName(value = "statuses_url")
    val statusesUrl: kotlin.String,
    @SerialName(value = "subscribers_url")
    val subscribersUrl: kotlin.String,
    @SerialName(value = "subscription_url")
    val subscriptionUrl: kotlin.String,
    @SerialName(value = "tags_url")
    val tagsUrl: kotlin.String,
    @SerialName(value = "teams_url")
    val teamsUrl: kotlin.String,
    @SerialName(value = "trees_url")
    val treesUrl: kotlin.String,
    @SerialName(value = "hooks_url")
    val hooksUrl: kotlin.String,
    @SerialName(value = "git_url")
    val gitUrl: kotlin.String? = null,
    @SerialName(value = "ssh_url")
    val sshUrl: kotlin.String? = null,
    @SerialName(value = "clone_url")
    val cloneUrl: kotlin.String? = null,
    @SerialName(value = "mirror_url")
    val mirrorUrl: kotlin.String? = null,
    @SerialName(value = "svn_url")
    val svnUrl: kotlin.String? = null,
    @SerialName(value = "homepage")
    val homepage: kotlin.String? = null,
    @SerialName(value = "language")
    val language: kotlin.String? = null,
    @SerialName(value = "forks_count")
    val forksCount: kotlin.Int? = null,
    @SerialName(value = "stargazers_count")
    val stargazersCount: kotlin.Int? = null,
    @SerialName(value = "watchers_count")
    val watchersCount: kotlin.Int? = null,
    @SerialName(value = "size")
    val propertySize: kotlin.Int? = null,
    @SerialName(value = "default_branch")
    val defaultBranch: kotlin.String? = null,
    @SerialName(value = "open_issues_count")
    val openIssuesCount: kotlin.Int? = null,
    @SerialName(value = "is_template")
    val isTemplate: kotlin.Boolean? = null,
    @SerialName(value = "topics")
    val topics: kotlin.collections.List<kotlin.String>? = null,
    @SerialName(value = "has_issues")
    val hasIssues: kotlin.Boolean? = null,
    @SerialName(value = "has_projects")
    val hasProjects: kotlin.Boolean? = null,
    @SerialName(value = "has_wiki")
    val hasWiki: kotlin.Boolean? = null,
    @SerialName(value = "has_pages")
    val hasPages: kotlin.Boolean? = null,
    @SerialName(value = "has_downloads")
    val hasDownloads: kotlin.Boolean? = null,
    @SerialName(value = "archived")
    val archived: kotlin.Boolean? = null,
    @SerialName(value = "disabled")
    val disabled: kotlin.Boolean? = null,
    @SerialName(value = "visibility")
    val visibility: kotlin.String? = null,
    @SerialName(value = "pushed_at")
    val pushedAt: kotlin.String? = null,
    @SerialName(value = "created_at")
    val createdAt: kotlin.String? = null,
    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String? = null,
    @SerialName(value = "permissions")
    val permissions: RepositoryTemplateRepositoryPermissionsApiModel? = null,
    @SerialName(value = "role_name")
    val roleName: kotlin.String? = null,
    @SerialName(value = "template_repository")
    val templateRepository: NullableMinusRepositoryApiModel? = null,
    @SerialName(value = "temp_clone_token")
    val tempCloneToken: kotlin.String? = null,
    @SerialName(value = "delete_branch_on_merge")
    val deleteBranchOnMerge: kotlin.Boolean? = null,
    @SerialName(value = "subscribers_count")
    val subscribersCount: kotlin.Int? = null,
    @SerialName(value = "network_count")
    val networkCount: kotlin.Int? = null,
    @SerialName(value = "code_of_conduct")
    val codeOfConduct: CodeMinusOfMinusConductApiModel? = null,
    @SerialName(value = "license")
    val license: MinimalRepositoryLicenseApiModel? = null,
    @SerialName(value = "forks")
    val forks: kotlin.Int? = null,
    @SerialName(value = "open_issues")
    val openIssues: kotlin.Int? = null,
    @SerialName(value = "watchers")
    val watchers: kotlin.Int? = null,
    @SerialName(value = "allow_forking")
    val allowForking: kotlin.Boolean? = null
) {

}

