/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import helper.UserCalonPembeliHelper;
import helper.UserDomainProviderHelper;
import java.util.List;

import pojos.UserCalonPembeli;
import pojos.UserDomainProvider;

/**
 *
 * @author Ren
 */
public class testDomainProvider{

    public static void main(String[] args) {
        UserDomainProviderHelper helper = new UserDomainProviderHelper();
        List<UserDomainProvider> list = helper.getUserDomainProvider();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNama());
            System.out.println(list.get(i).getPassword());
            System.out.println(list.get(i).getEmail());
        }

    }
}
