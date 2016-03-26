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
        Date date = new Date();
        Perusahaan p = new Perusahaan(209, "susanto","Pesona Bali","Pria");
        p.createLowongan(102, date, "HRD");
        System.out.println(p.getLowongan(0).getNamaPekerjaan());
        System.out.println(p.getLowongan(0).getIdLowongan());
        System.out.println(p.getLowongan(0).getDeadline());
        System.out.println(p.displayInfo());
        System.out.println(p.getLowonganById(102).getNamaPekerjaan());
        
        Pelamar pel = new Pelamar(101, "Fadil", "permata buah batu", "Pria");
        pel.createBerkas(201);      
        System.out.println(pel.getBerkas().getIdBerkas());
        System.out.println(pel.getBerkas().getCv());
        
    }
}
