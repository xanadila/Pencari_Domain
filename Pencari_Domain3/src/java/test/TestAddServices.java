/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.ServicesHelper;

public class TestAddServices {
    public static void main(String[] args) {
        String id = "002";
        String domain = ".tk";
        double harga = 50000;
        String namaPenjual = "Ren";
        ServicesHelper helper = new ServicesHelper();
        helper.addServices(id, domain, harga, namaPenjual);
    }
    
}
