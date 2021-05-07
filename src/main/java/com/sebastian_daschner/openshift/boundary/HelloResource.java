package com.sebastian_daschner.openshift.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.time.Instant;

@Path("hello")
public class HelloResource {

    @GET
    public String hello() {
        return "Hello OpenShift and Jenkins";
    }

    @GET
    @Path("{key}")
    public String helloFrom(@PathParam("key") String key) {
        return "Hello from " + key;
    }    

}
