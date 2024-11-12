package com.isaac.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/gruppen")
public class GruppenConroller {
    
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllGroups() {
        // TODO: Implement logic to return all groups
        return Response.ok().build();
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createGroup(String groupData) {
        // TODO: Implement logic to create a new group
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGroupById(@PathParam("id") String groupId) {
        // TODO: Implement logic to return group details by ID
        return Response.ok().build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateGroup(@PathParam("id") String groupId, String updatedData) {
        // TODO: Implement logic to update group information
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteGroup(@PathParam("id") String groupId) {
        // TODO: Implement logic to delete a group
        return Response.noContent().build();
    }

    @GET
    @Path("/{id}/mitglieder")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGroupMembers(@PathParam("id") String groupId) {
        // TODO: Implement logic to return group members
        return Response.ok().build();
    }

    @POST
    @Path("/{id}/mitglieder")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addGroupMember(@PathParam("id") String groupId, String memberData) {
        // TODO: Implement logic to add a member to a group
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    @Path("/{id}/mitglieder/{mitgliedId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response removeGroupMember(@PathParam("id") String groupId, @PathParam("mitgliedId") String memberId) {
        // TODO: Implement logic to remove a member from a group
        return Response.noContent().build();
    }
}
