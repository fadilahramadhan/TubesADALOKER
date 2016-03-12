/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskita;
import java.util.Date;
/**
 *
 * @author Acer
 */
public class TubesKita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perusahaan p = new Perusahaan("susanto","Pesona Bali","Pria");
        p.createLowongan(102, null, "HRD");
        System.out.println(p.getLowongan(0).getNamaPekerjaan());
        System.out.println(p.getNama());
        System.out.println(p.getAlamat());
        System.out.println(p.displayInfo());
        
        Pelamar pel = new Pelamar("Fadil", "permata buah batu", "Pria",20,6287);
        pel.createBerkas(201);
        System.out.println(pel.displayInfo());        
        System.out.println(pel.getBerkas(0).getIdBerkas());
        
    }
    
}
