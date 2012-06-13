/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.spring.impl;

import demo.spring.entity.Mahasiswa;
import demo.spring.service.MahasiswaService;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * ini adalah class MahasiswaServiceImpl
 */
@Service("mahasiswaService")
@Transactional
public class MahasiswaServiceImpl implements MahasiswaService{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Mahasiswa mahasiswa) {
        sessionFactory.getCurrentSession().saveOrUpdate(mahasiswa);
    }

    @Override
    public void delete(Mahasiswa mahasiswa) {
        sessionFactory.getCurrentSession().delete(mahasiswa);
    }

    @Override
    public Long count() {
        return (Long) sessionFactory.getCurrentSession().createQuery("select count(*) from Mahasiswa m").uniqueResult();
    }

    @Override
    public Mahasiswa getMahasiswa(Long id) {
        return (Mahasiswa)sessionFactory.getCurrentSession().createQuery("from Mahasiswa m where m.id=:id").setParameter("id", id).uniqueResult();
    }

    @Override
    public List<Mahasiswa> getAllMahasiswa() {
        return sessionFactory.getCurrentSession().createQuery("from Mahasiswa m").list();
    }
    
}
