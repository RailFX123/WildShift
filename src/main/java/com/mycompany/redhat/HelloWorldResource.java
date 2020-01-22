/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redhat;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author David Natareno
 */
@Path("HelloWorld")
public class HelloWorldResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HelloWorldResource
     */
    public HelloWorldResource() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.redhat.HelloWorldResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "{\"Message\":\"Hello World3\"}";
    }

    /**
     * PUT method for updating or creating an instance of HelloWorldResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}