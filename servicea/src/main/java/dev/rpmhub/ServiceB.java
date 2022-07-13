package dev.rpmhub;

import javax.enterprise.inject.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "http://localhost:4444/serviceb")
public class ServiceB {

    @GET
    @Path("/person/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("name") String name);
    
}
