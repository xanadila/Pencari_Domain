/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import helper.TransaksiHelper;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import pojos.Transaksi;

/**
 *
 * @author Lenovo
 */
@Path("transaksi")
public class TransaksiResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UserResource
     */
    public TransaksiResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    @GET
    @Path("getTransaksi")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTransaksi() {
        TransaksiHelper helper = new TransaksiHelper();
        List<Transaksi> list = helper.getTransaksi();
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

    @POST
    @Path("addTransaksi")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addTransaksi(String data) {
        Gson gson = new Gson();
        Transaksi transaksi = gson.fromJson(data, Transaksi.class);
        TransaksiHelper helper = new TransaksiHelper();
        helper.addTransaksi(transaksi.getId(),
                transaksi.getDomain(),
                transaksi.getHarga(),
                transaksi.getNamaPenjual(),
                transaksi.getTanggalPembelian());
        return Response
                .status(200)
                .entity(transaksi)
                .build();
    }
}
