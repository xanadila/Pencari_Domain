/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.UserCalonPembeliHelper;
import pojos.UserCalonPembeli;


/**
 *
 * @author basisa25
 */
public class TestAddPembeli1 {

    public static void main(String[] args) {
        String nama = "Kaneki";
        String password = "76543";
        String email = "kaneki@gmail.com";
        UserCalonPembeliHelper helper = new UserCalonPembeliHelper();
        helper.addNewUserCalonPembeli(new UserCalonPembeli(email, nama, password));
    }
}
