package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/account")
public class AccountResource {

    @GET
    @Path("/{login}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getOne(@PathParam("login") String login) {
        return User.find("FROM User u LEFT JOIN FETCH u.roles WHERE u.login = ?1", login).firstResult();
    }
}