/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.UserCalonPembeliHelper;


/**
 *
 * @author basisa25
 */
public class TestAddPembeli {

    public static void main(String[] args) {

        String nama = "Jadi";
        String password = "21456";
        String email = "jadi@gmail.com";
        UserCalonPembeliHelper helper = new UserCalonPembeliHelper();
        helper.addNewUserCalonPembeli(nama, password, email);
    }
}
