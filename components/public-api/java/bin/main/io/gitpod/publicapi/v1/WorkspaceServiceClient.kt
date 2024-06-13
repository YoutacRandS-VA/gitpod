// Copyright (c) 2024 Gitpod GmbH. All rights reserved.
// Licensed under the GNU Affero General Public License (AGPL).
// See License.AGPL.txt in the project root for license information.

// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: gitpod/v1/workspace.proto
//
package io.gitpod.publicapi.v1

import com.connectrpc.Headers
import com.connectrpc.MethodSpec
import com.connectrpc.ProtocolClientInterface
import com.connectrpc.ResponseMessage
import com.connectrpc.ServerOnlyStreamInterface
import com.connectrpc.StreamType

public class WorkspaceServiceClient(
  private val client: ProtocolClientInterface,
) : WorkspaceServiceClientInterface {
  /**
   *  GetWorkspace returns a single workspace.
   *
   *  +return NOT_FOUND User does not have access to a workspace with the given
   *  ID +return NOT_FOUND Workspace does not exist
   */
  override suspend fun getWorkspace(request: WorkspaceOuterClass.GetWorkspaceRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.GetWorkspaceResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/GetWorkspace",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.GetWorkspaceRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.GetWorkspaceResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  WatchWorkspaceStatus watches the workspaces status changes
   *
   *  workspace_id +return NOT_FOUND Workspace does not exist
   */
  override suspend fun watchWorkspaceStatus(headers: Headers):
      ServerOnlyStreamInterface<WorkspaceOuterClass.WatchWorkspaceStatusRequest, WorkspaceOuterClass.WatchWorkspaceStatusResponse>
      = client.serverStream(
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/WatchWorkspaceStatus",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.WatchWorkspaceStatusRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.WatchWorkspaceStatusResponse::class,
      StreamType.SERVER,
    ),
  )


  /**
   *  WatchWorkspaceImageBuildLogs watches the image build logs of the workspace
   */
  override suspend fun watchWorkspaceImageBuildLogs(headers: Headers):
      ServerOnlyStreamInterface<WorkspaceOuterClass.WatchWorkspaceImageBuildLogsRequest, WorkspaceOuterClass.WatchWorkspaceImageBuildLogsResponse>
      = client.serverStream(
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/WatchWorkspaceImageBuildLogs",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.WatchWorkspaceImageBuildLogsRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.WatchWorkspaceImageBuildLogsResponse::class,
      StreamType.SERVER,
    ),
  )


  /**
   *  ListWorkspaces returns a list of workspaces that match the query.
   */
  override suspend fun listWorkspaces(request: WorkspaceOuterClass.ListWorkspacesRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.ListWorkspacesResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/ListWorkspaces",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.ListWorkspacesRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.ListWorkspacesResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  ListWorkspaceSessions returns a list of workspace sessions that match the
   */
  override suspend
      fun listWorkspaceSessions(request: WorkspaceOuterClass.ListWorkspaceSessionsRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.ListWorkspaceSessionsResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/ListWorkspaceSessions",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.ListWorkspaceSessionsRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.ListWorkspaceSessionsResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  CreateAndStartWorkspace creates a new workspace and starts it.
   */
  override suspend
      fun createAndStartWorkspace(request: WorkspaceOuterClass.CreateAndStartWorkspaceRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.CreateAndStartWorkspaceResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/CreateAndStartWorkspace",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.CreateAndStartWorkspaceRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.CreateAndStartWorkspaceResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  StartWorkspace starts an existing workspace.
   *  If the specified workspace is not in stopped phase, this will return the
   *  workspace as is.
   */
  override suspend fun startWorkspace(request: WorkspaceOuterClass.StartWorkspaceRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.StartWorkspaceResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/StartWorkspace",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.StartWorkspaceRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.StartWorkspaceResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  UpdateWorkspace updates the workspace.
   */
  override suspend fun updateWorkspace(request: WorkspaceOuterClass.UpdateWorkspaceRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.UpdateWorkspaceResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/UpdateWorkspace",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.UpdateWorkspaceRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.UpdateWorkspaceResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  StopWorkspace stops a running workspace.
   */
  override suspend fun stopWorkspace(request: WorkspaceOuterClass.StopWorkspaceRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.StopWorkspaceResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/StopWorkspace",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.StopWorkspaceRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.StopWorkspaceResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  DeleteWorkspace deletes a workspace.
   *  When the workspace is running, it will be stopped as well.
   *  Deleted workspaces cannot be started again.
   */
  override suspend fun deleteWorkspace(request: WorkspaceOuterClass.DeleteWorkspaceRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.DeleteWorkspaceResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/DeleteWorkspace",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.DeleteWorkspaceRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.DeleteWorkspaceResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  ListWorkspaceClasses enumerates all available workspace classes.
   */
  override suspend
      fun listWorkspaceClasses(request: WorkspaceOuterClass.ListWorkspaceClassesRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.ListWorkspaceClassesResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/ListWorkspaceClasses",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.ListWorkspaceClassesRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.ListWorkspaceClassesResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  ParseContextURL parses a context URL and returns the workspace metadata and
   *  spec. Not implemented yet.
   */
  override suspend fun parseContextURL(request: WorkspaceOuterClass.ParseContextURLRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.ParseContextURLResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/ParseContextURL",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.ParseContextURLRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.ParseContextURLResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  GetWorkspaceDefaultImage returns the default workspace image of specified
   *  workspace.
   */
  override suspend
      fun getWorkspaceDefaultImage(request: WorkspaceOuterClass.GetWorkspaceDefaultImageRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.GetWorkspaceDefaultImageResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/GetWorkspaceDefaultImage",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.GetWorkspaceDefaultImageRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.GetWorkspaceDefaultImageResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  SendHeartBeat sends a heartbeat to activate the workspace
   */
  override suspend fun sendHeartBeat(request: WorkspaceOuterClass.SendHeartBeatRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.SendHeartBeatResponse> = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/SendHeartBeat",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.SendHeartBeatRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.SendHeartBeatResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  GetWorkspaceOwnerToken returns an owner token of workspace.
   */
  override suspend
      fun getWorkspaceOwnerToken(request: WorkspaceOuterClass.GetWorkspaceOwnerTokenRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.GetWorkspaceOwnerTokenResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/GetWorkspaceOwnerToken",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.GetWorkspaceOwnerTokenRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.GetWorkspaceOwnerTokenResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  GetWorkspaceEditorCredentials returns an credentials that is used in editor
   *  to encrypt and decrypt secrets
   */
  override suspend
      fun getWorkspaceEditorCredentials(request: WorkspaceOuterClass.GetWorkspaceEditorCredentialsRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.GetWorkspaceEditorCredentialsResponse>
      = client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/GetWorkspaceEditorCredentials",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.GetWorkspaceEditorCredentialsRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.GetWorkspaceEditorCredentialsResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  CreateWorkspaceSnapshot creates a snapshot of the workspace that can be
   *  shared with others.
   */
  override suspend
      fun createWorkspaceSnapshot(request: WorkspaceOuterClass.CreateWorkspaceSnapshotRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.CreateWorkspaceSnapshotResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/CreateWorkspaceSnapshot",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.CreateWorkspaceSnapshotRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.CreateWorkspaceSnapshotResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  WaitWorkspaceSnapshot waits for the snapshot to be available or failed.
   */
  override suspend
      fun waitForWorkspaceSnapshot(request: WorkspaceOuterClass.WaitForWorkspaceSnapshotRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.WaitForWorkspaceSnapshotResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/WaitForWorkspaceSnapshot",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.WaitForWorkspaceSnapshotRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.WaitForWorkspaceSnapshotResponse::class,
      StreamType.UNARY,
    ),
  )


  /**
   *  UpdateWorkspacePort updates the port of workspace.
   */
  override suspend fun updateWorkspacePort(request: WorkspaceOuterClass.UpdateWorkspacePortRequest,
      headers: Headers): ResponseMessage<WorkspaceOuterClass.UpdateWorkspacePortResponse> =
      client.unary(
    request,
    headers,
    MethodSpec(
    "gitpod.v1.WorkspaceService/UpdateWorkspacePort",
      io.gitpod.publicapi.v1.WorkspaceOuterClass.UpdateWorkspacePortRequest::class,
      io.gitpod.publicapi.v1.WorkspaceOuterClass.UpdateWorkspacePortResponse::class,
      StreamType.UNARY,
    ),
  )

}
