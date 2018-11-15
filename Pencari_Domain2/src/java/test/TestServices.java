/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.ServicesHelper;
import java.util.List;
import pojos.Services;


/**
 *
 * @author Ren
 */
public class TestServices {

    public static void main(String[] args) {
        ServicesHelper helper = new ServicesHelper();
        List<Services> list = helper.getServices();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getDomain());
            System.out.println(list.get(i).getNamaPenjual());
            System.out.println(list.get(i).getHarga());
        }

    }
}
