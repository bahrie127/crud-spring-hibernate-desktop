/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.spring.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * ini adalah class Mahasiswa
 */
@Entity
@Table(name = "mahasiswa")
public class Mahasiswa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mahasiswa_id")
    private Long id;
    @Column(name = "nim", unique = true, length = 10)
    private String nim;
    @Column(name = "name", unique = true, length = 100)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
