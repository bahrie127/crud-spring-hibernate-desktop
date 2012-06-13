/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.spring.service;

import demo.spring.entity.Mahasiswa;
import java.util.List;

/**
 *
 * @author : Saiful Bahri
 * Blog    : http://bahrie27.wordpress.com/
 * Twitter : @bahrie127
 */
public interface MahasiswaService {

    public void save(Mahasiswa mahasiswa);

    public void delete(Mahasiswa mahasiswa);

    public Long count();

    public Mahasiswa getMahasiswa(Long id);

    public List<Mahasiswa> getAllMahasiswa();
}
