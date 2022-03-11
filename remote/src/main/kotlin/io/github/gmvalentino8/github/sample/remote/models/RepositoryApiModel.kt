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

import io.github.gmvalentino8.github.sample.remote.models.NullableMinusLicenseMinusSimpleApiModel
import io.github.gmvalentino8.github.sample.remote.models.NullableMinusSimpleMinusUserApiModel
import io.github.gmvalentino8.github.sample.remote.models.RepositoryPermissionsApiModel
import io.github.gmvalentino8.github.sample.remote.models.RepositoryTemplateRepositoryApiModel
import io.github.gmvalentino8.github.sample.remote.models.SimpleMinusUserApiModel

import kotlinx.serialization.*

/**
 * A git repository
 * @param id Unique identifier of the repository
 * @param nodeId 
 * @param name The name of the repository.
 * @param fullName 
 * @param license 
 * @param forks 
 * @param owner 
 * @param `private` Whether the repository is private or public.
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
 * @param gitUrl 
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
 * @param sshUrl 
 * @param stargazersUrl 
 * @param statusesUrl 
 * @param subscribersUrl 
 * @param subscriptionUrl 
 * @param tagsUrl 
 * @param teamsUrl 
 * @param treesUrl 
 * @param cloneUrl 
 * @param mirrorUrl 
 * @param hooksUrl 
 * @param svnUrl 
 * @param homepage 
 * @param language 
 * @param forksCount 
 * @param stargazersCount 
 * @param watchersCount 
 * @param propertySize 
 * @param defaultBranch The default branch of the repository.
 * @param openIssuesCount 
 * @param hasIssues Whether issues are enabled.
 * @param hasProjects Whether projects are enabled.
 * @param hasWiki Whether the wiki is enabled.
 * @param hasPages 
 * @param hasDownloads Whether downloads are enabled.
 * @param archived Whether the repository is archived.
 * @param disabled Returns whether or not this repository disabled.
 * @param pushedAt 
 * @param createdAt 
 * @param updatedAt 
 * @param openIssues 
 * @param watchers 
 * @param organization 
 * @param permissions 
 * @param isTemplate Whether this repository acts as a template that can be used to generate new repositories.
 * @param topics 
 * @param visibility The repository visibility: public, private, or internal.
 * @param allowRebaseMerge Whether to allow rebase merges for pull requests.
 * @param templateRepository 
 * @param tempCloneToken 
 * @param allowSquashMerge Whether to allow squash merges for pull requests.
 * @param allowAutoMerge Whether to allow Auto-merge to be used on pull requests.
 * @param deleteBranchOnMerge Whether to delete head branches when pull requests are merged
 * @param allowMergeCommit Whether to allow merge commits for pull requests.
 * @param allowForking Whether to allow forking this repo
 * @param subscribersCount 
 * @param networkCount 
 * @param masterBranch 
 * @param starredAt 
 */
@Serializable
data class RepositoryApiModel(
    /* Unique identifier of the repository */
    @SerialName(value = "id")
    val id: kotlin.Int,
    @SerialName(value = "node_id")
    val nodeId: kotlin.String,
    /* The name of the repository. */
    @SerialName(value = "name")
    val name: kotlin.String,
    @SerialName(value = "full_name")
    val fullName: kotlin.String,
    @SerialName(value = "license")
    val license: NullableMinusLicenseMinusSimpleApiModel?,
    @SerialName(value = "forks")
    val forks: kotlin.Int,
    @SerialName(value = "owner")
    val owner: SimpleMinusUserApiModel,
    /* Whether the repository is private or public. */
    @SerialName(value = "private")
    val `private`: kotlin.Boolean = false,
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
    @SerialName(value = "git_url")
    val gitUrl: kotlin.String,
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
    @SerialName(value = "ssh_url")
    val sshUrl: kotlin.String,
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
    @SerialName(value = "clone_url")
    val cloneUrl: kotlin.String,
    @SerialName(value = "mirror_url")
    val mirrorUrl: kotlin.String?,
    @SerialName(value = "hooks_url")
    val hooksUrl: kotlin.String,
    @SerialName(value = "svn_url")
    val svnUrl: kotlin.String,
    @SerialName(value = "homepage")
    val homepage: kotlin.String?,
    @SerialName(value = "language")
    val language: kotlin.String?,
    @SerialName(value = "forks_count")
    val forksCount: kotlin.Int,
    @SerialName(value = "stargazers_count")
    val stargazersCount: kotlin.Int,
    @SerialName(value = "watchers_count")
    val watchersCount: kotlin.Int,
    @SerialName(value = "size")
    val propertySize: kotlin.Int,
    /* The default branch of the repository. */
    @SerialName(value = "default_branch")
    val defaultBranch: kotlin.String,
    @SerialName(value = "open_issues_count")
    val openIssuesCount: kotlin.Int,
    /* Whether issues are enabled. */
    @SerialName(value = "has_issues")
    val hasIssues: kotlin.Boolean = true,
    /* Whether projects are enabled. */
    @SerialName(value = "has_projects")
    val hasProjects: kotlin.Boolean = true,
    /* Whether the wiki is enabled. */
    @SerialName(value = "has_wiki")
    val hasWiki: kotlin.Boolean = true,
    @SerialName(value = "has_pages")
    val hasPages: kotlin.Boolean,
    /* Whether downloads are enabled. */
    @SerialName(value = "has_downloads")
    val hasDownloads: kotlin.Boolean = true,
    /* Whether the repository is archived. */
    @SerialName(value = "archived")
    val archived: kotlin.Boolean = false,
    /* Returns whether or not this repository disabled. */
    @SerialName(value = "disabled")
    val disabled: kotlin.Boolean,
    @SerialName(value = "pushed_at")
    val pushedAt: kotlin.String?,
    @SerialName(value = "created_at")
    val createdAt: kotlin.String?,
    @SerialName(value = "updated_at")
    val updatedAt: kotlin.String?,
    @SerialName(value = "open_issues")
    val openIssues: kotlin.Int,
    @SerialName(value = "watchers")
    val watchers: kotlin.Int,
    @SerialName(value = "organization")
    val organization: NullableMinusSimpleMinusUserApiModel? = null,
    @SerialName(value = "permissions")
    val permissions: RepositoryPermissionsApiModel? = null,
    /* Whether this repository acts as a template that can be used to generate new repositories. */
    @SerialName(value = "is_template")
    val isTemplate: kotlin.Boolean? = false,
    @SerialName(value = "topics")
    val topics: kotlin.collections.List<kotlin.String>? = null,
    /* The repository visibility: public, private, or internal. */
    @SerialName(value = "visibility")
    val visibility: kotlin.String? = "public",
    /* Whether to allow rebase merges for pull requests. */
    @SerialName(value = "allow_rebase_merge")
    val allowRebaseMerge: kotlin.Boolean? = true,
    @SerialName(value = "template_repository")
    val templateRepository: RepositoryTemplateRepositoryApiModel? = null,
    @SerialName(value = "temp_clone_token")
    val tempCloneToken: kotlin.String? = null,
    /* Whether to allow squash merges for pull requests. */
    @SerialName(value = "allow_squash_merge")
    val allowSquashMerge: kotlin.Boolean? = true,
    /* Whether to allow Auto-merge to be used on pull requests. */
    @SerialName(value = "allow_auto_merge")
    val allowAutoMerge: kotlin.Boolean? = false,
    /* Whether to delete head branches when pull requests are merged */
    @SerialName(value = "delete_branch_on_merge")
    val deleteBranchOnMerge: kotlin.Boolean? = false,
    /* Whether to allow merge commits for pull requests. */
    @SerialName(value = "allow_merge_commit")
    val allowMergeCommit: kotlin.Boolean? = true,
    /* Whether to allow forking this repo */
    @SerialName(value = "allow_forking")
    val allowForking: kotlin.Boolean? = null,
    @SerialName(value = "subscribers_count")
    val subscribersCount: kotlin.Int? = null,
    @SerialName(value = "network_count")
    val networkCount: kotlin.Int? = null,
    @SerialName(value = "master_branch")
    val masterBranch: kotlin.String? = null,
    @SerialName(value = "starred_at")
    val starredAt: kotlin.String? = null
) {

}

