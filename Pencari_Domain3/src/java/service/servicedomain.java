/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.ServicesHelper;
import helper.UserCalonPembeliHelper;
import helper.UserDomainProviderHelper;
import java.text.ParseException;
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
import javax.ws.rs.QueryParam;
import pojos.Services;
import pojos.UserCalonPembeli;


/**
 * REST Web Service
 *
 * @author Lenovo
 */
@Path("domain")
public class servicedomain {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public servicedomain() {
    }
     @GET
    @Produces(MediaType.APPLICATION_JSON)
     public Response getJson() {
        //TODO return proper representation object
        ServicesHelper test = new ServicesHelper();
        List<Services> list = test.getServices();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return Response
                .status(200)
                .entity(json)
                .build();
    }

    /**
     * Retrieves representation of an instance of service.GenericResource
     * @return an instance of java.lang.String
     */
   

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @GET
    @Path("getdomain")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAlldomain() {
       ServicesHelper helper = new ServicesHelper();
        List<Services> list = helper.getServices();
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
    @Path("addPembeli")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addServices(String data) {
        Gson gson = new Gson();
        Services servis = gson.fromJson(data, Services.class);
        ServicesHelper helper = new ServicesHelper();
        helper.addServices(
        servis.getId(),
        servis.getDomain(),
        servis.getHarga(),
        servis.getNamaPenjual()
        
        
        );
        
        
        return Response
                .status(200)
                .entity(servis)
                .build();
        
    }
    @GET
    @Path("caridomain")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson(@QueryParam("domain") String domain) throws ParseException {
        ServicesHelper helper = new ServicesHelper();
        Services hasilCari = helper.cariDomain(domain);
        Gson gson = new Gson();
//        return Response.status(200)
//                .entity(json)
//                .build();
        return Response.status(200)
                .entity(gson.toJson(hasilCari))
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
    
    @GET
    @Path("caridomainid")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson1(@QueryParam("id") String id) throws ParseException {
        ServicesHelper helper = new ServicesHelper();
        Services hasilCari = helper.cariDomainId(id);
        Gson gson = new Gson();
//        return Response.status(200)
//                .entity(json)
//                .build();
        return Response.status(200)
                .entity(gson.toJson(hasilCari))
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
    
}
