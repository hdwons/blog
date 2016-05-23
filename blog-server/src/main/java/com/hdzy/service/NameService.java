package com.hdzy.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by donghe on 16/5/12.
 */
public class NameService {


    @GET
    @Path("/name")
    public String getName() {
        return "hello";
    }


}
