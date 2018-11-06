/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.UserCalonPembeliHelper;
import java.util.List;

import pojos.UserCalonPembeli;

/**
 *
 * @author Ren
 */
public class TestUser {

    public static void main(String[] args) {
        UserCalonPembeliHelper helper = new UserCalonPembeliHelper();
        List<UserCalonPembeli> list = helper.getUserCalonPembeli();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNama());
            System.out.println(list.get(i).getPassword());
            System.out.println(list.get(i).getEmail());
        }

    }
}
