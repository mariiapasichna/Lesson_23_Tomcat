package com.mariiapasichna.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class TestApi {

    @GET
    public Response test() {
        User user = new User("Alex", 22);
        Gson gson = new GsonBuilder().create();
        return Response.status(Response.Status.OK)
                .entity(gson.toJson(user))
                .build();
    }

    private static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}