/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Transaksi;
import util.NewHibernateUtil;

/**
 *
 * @author Lenovo
 */
public class TransaksiHelper {

    public TransaksiHelper() {

    }

    public List<Transaksi> getTransaksi() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "From Transaksi";
        Query q = session.createQuery(query);
        List<Transaksi> list = q.list();
        return list;
    }

    public void addTransaksi(String id, String domain, Double harga, String namaPenjual, Date tanggalPembelian) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Transaksi transaksi = new Transaksi(id, domain, harga, namaPenjual, tanggalPembelian);
        session.saveOrUpdate(transaksi);
        transaction.commit();
        session.close();
    }
}
