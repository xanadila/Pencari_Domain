/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.UserDomainProviderHelper;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.UserDomainProvider;
import javax.ws.rs.POST;


/**
 * REST Web Service
 *
 * @author Lenovo
 */
@Path("addpenjual")
public class serviceaddPenjual {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public serviceaddPenjual() {
    }

    /**
     * Retrieves representation of an instance of service.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @GET
    @Path("getPenjual")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPenjual() {
       UserDomainProviderHelper helper = new UserDomainProviderHelper();
        List<UserDomainProvider> list = helper.getUserDomainProvider();
        Gson gson = new Gson();
        return Response.status(200)
                .entity(gson.toJson(list))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET,POST,HEAD,OPTIONS,PUT")
                .header("Access-Control-Allow-Headers",
                        "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers")
                .header("Access-Exposed-Headers",
                        "Access-Control-Allow-Origin,Access-Control-Allow-Credentials")
                .header("Access-Support-Credentials",
                        "true")
                .header("Access-Control-Max-Age", "2")
                .header("Access-Preflight-Maxage", "2")
                .build();
    }
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    @POST
    @Path("addPenjual")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addNewDomainProvider(String data) {
        Gson gson = new Gson();
        UserDomainProvider penjual = gson.fromJson(data, UserDomainProvider.class);
        UserDomainProviderHelper helper = new UserDomainProviderHelper();
        helper.addNewDomainProvider(
        penjual.getEmail(),
        penjual.getNama(),
        penjual.getPassword());
        return Response
                .status(200)
                .entity(penjual)
                .build();
        
    }
}
