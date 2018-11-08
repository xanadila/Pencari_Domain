/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Date;
import util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.UserCalonPembeli;

public class UserCalonPembeliHelper {

    public UserCalonPembeliHelper() {

    }

    public List<UserCalonPembeli> getUserCalonPembeli(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from UserCalonPembeli";
        Query q = session.createQuery(query);
        List<UserCalonPembeli> list = q.list();
        return list;
    }
    public void addNewUserCalonPembeli(
            String email,
            String nama,
            String password) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        UserCalonPembeli pembeli = new UserCalonPembeli(email,nama, password);
        session.saveOrUpdate(pembeli);
        transaction.commit();
        session.close();

    }

}


