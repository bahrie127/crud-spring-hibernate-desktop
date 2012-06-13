/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.spring.dao;

import demo.spring.entity.Mahasiswa;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * ini adalah class MahasiswaDao
 */
@Component
public class MahasiswaDao {
    @Autowired
    private SessionFactory sessionFactory;
    
    public void save(Mahasiswa mahasiswa){
        sessionFactory.getCurrentSession().saveOrUpdate(mahasiswa);
    }
    
    public void delete(Mahasiswa mahasiswa){
        sessionFactory.getCurrentSession().delete(mahasiswa);
    }
    
    public Mahasiswa getById(Long id){
        return (Mahasiswa)sessionFactory.getCurrentSession().createQuery("from Mahasiswa m where m.id=:id").setParameter("id", id).uniqueResult();
    }
    
    public List<Mahasiswa> getAll(){
        return sessionFactory.getCurrentSession().createQuery("from Mahasiswa m").list();
    }
    
    public Long count(){
        return (Long) sessionFactory.getCurrentSession().createQuery("select count(*) from Mahasiswa m").uniqueResult();
    }
}
