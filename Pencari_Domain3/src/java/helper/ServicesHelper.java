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
import pojos.Services;

public class ServicesHelper {

    public ServicesHelper() {

    }

    public List<Services> getServices() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from Services";
        Query q = session.createQuery(query);
        List<Services> list = q.list();
        return list;
    }
    
    public void addServices(Services services) {
        addServices(services.getId(),
                services.getDomain(),
                services.getHarga(),
                services.getNamaPenjual());
    }

    public void addServices(
            String id,
            String domain,
            double harga,
            String namaPenjual) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Services services = new Services(id, domain, harga, namaPenjual);
        session.saveOrUpdate(services);
        transaction.commit();
        session.close();

    }
}
