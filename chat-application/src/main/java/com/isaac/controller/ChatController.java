package main.java.com.isaac.controller;

@Path("/api/chat")
public class ChatController {
    
    @GET
    @Path("/{benutzerid}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMessages(@PathParam("benutzerid") String userId) {
        // Implement logic to return messages for a user
        return Response.ok().build();
    }

    @POST
    @Path("/{benutzerid}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response sendMessage(@PathParam("benutzerid") String userId, String messageData) {
        // Implement logic to send a message to a user
        return Response.status(Response.Status.CREATED).build();
    }
}
