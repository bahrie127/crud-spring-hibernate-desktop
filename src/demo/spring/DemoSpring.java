/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.spring;

import demo.spring.service.MahasiswaService;
import demo.spring.ui.FormUtama;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author bahrie
 */
public class DemoSpring {

    private static MahasiswaService mahasiswaService;
    
    public static void main(String[] args) {
        ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        mahasiswaService=(MahasiswaService) appContext.getBean("mahasiswaService");
        
//        Mahasiswa mahasiswa=new Mahasiswa();
//        mahasiswa.setNim("0803442");
//        mahasiswa.setName("Rohman");
//        mahasiswaService.save(mahasiswa);
//        
//        List<Mahasiswa> mahasiswaAll=mahasiswaService.getAllMahasiswa();
//        for(Mahasiswa m : mahasiswaAll){
//            System.out.println("Nim : "+m.getNim()+" , nama : "+m.getName());
//        }
        FormUtama fm=new FormUtama();
        fm.setVisible(true);
    }

    public static MahasiswaService getMahasiswaService() {
        return mahasiswaService;
    }
    
    
}
