/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.UserDomainProvider;

public class UserDomainProviderHelper {

    public UserDomainProviderHelper() {

    }

    public List<UserDomainProvider> getUserDomainProvider(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from UserDomainProvider";
        Query q = session.createQuery(query);
        List<UserDomainProvider> list = q.list();
        return list;
    }
    
    public void addNewDomainProvider(
            String email,
            String nama,
            String password) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        UserDomainProvider penjual = new UserDomainProvider(email,nama, password);
        session.saveOrUpdate(penjual);
        transaction.commit();
        session.close();

    }

}


