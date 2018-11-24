/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.UserDomainProviderHelper;
import pojos.UserDomainProvider;



/**
 *
 * @author basisa25
 */
public class TestAddPenjual {

    public static void main(String[] args) {

        String nama = "Puspaningtyas";
        String password = "21456";
        String email = "puspaningtyas@gmail.com";
        UserDomainProviderHelper helper = new UserDomainProviderHelper();
        helper.addNewDomainProvider(email, nama, password);
    }
}
