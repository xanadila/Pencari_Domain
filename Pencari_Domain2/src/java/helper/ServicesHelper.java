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
import pojos.Services;

public class ServicesHelper {

    public ServicesHelper() {

    }

    public List<Services> getServices(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from Services";
        Query q = session.createQuery(query);
        List<Services> list = q.list();
        return list;
    }

}


