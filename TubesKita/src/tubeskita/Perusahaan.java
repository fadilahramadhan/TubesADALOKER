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
public class Perusahaan extends Orang{
    private Lowongan[] daftarLowongan = new Lowongan[100];
    private int numOfLowongan = 0;
    
    public void createLowongan(int idLowongan, Date deadline){
        if(numOfLowongan<100){
            daftarLowongan[numOfLowongan] = new Lowongan(idLowongan, deadline);
            numOfLowongan++;
        }  
    }
    public void createLowongan(int idLowongan, Date deadline, String namaPekerjaan){
        if(numOfLowongan<100){
            daftarLowongan[numOfLowongan] = new Lowongan(idLowongan, deadline, namaPekerjaan);
            numOfLowongan++;
        }  
    }
    
    public Lowongan getLowongan(int index){
        return daftarLowongan[index];
    }

    public Lowongan getLowongan1(int id){
        int indeks = 0;
        while (daftarLowongan[indeks].getIdLowongan() != id){
            indeks++;
        }
        return daftarLowongan[indeks];
    }
    public void removeLowongan(int id){
        int indeks = 0;
        while (daftarLowongan[indeks].getIdLowongan() != id){
            indeks++;
        }
        daftarLowongan[indeks] = null; 
    }
}
