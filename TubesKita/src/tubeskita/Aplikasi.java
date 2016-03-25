/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskita;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Aplikasi {

    private ArrayList<Perusahaan> daftarPerusahaan = new ArrayList<>(); 
    private ArrayList<Pelamar> daftarPelamar = new ArrayList<>(); 
    public void addPerusahaan(String nama, String alamat, String jenisKelamin) {
        daftarPerusahaan.add(new Perusahaan(nama, alamat, jenisKelamin));
    }

    public void addPelamar(int id, String nama, String alamat, String jenisKelamin) {
        daftarPelamar.add(new Pelamar(id, nama, alamat, jenisKelamin));
    }
    
    public Pelamar getPelamar(int id){
        Pelamar a=null;
        for (int i = 0; i < daftarPelamar.size(); i++) {
            if (daftarPelamar.get(i).equals(id)) {
                a = daftarPelamar.get(i);
            }
        }
        return a;
    }
    
    public  Perusahaan getPerusahaan(int id){
        Perusahaan a=null;
        for (int i = 0; i < daftarPerusahaan.size() ;i++) {
            if (daftarPerusahaan.get(i).equals(id)) {
                a = daftarPerusahaan.get(id);
           }
        }
        return a;
    }
    
    public void deletePelamar(int id){
        for (int i = 0; i < daftarPelamar.size(); i++) {
            if (daftarPelamar.get(i).equals(id)) {
                daftarPelamar.remove(i);
            }            
        }
    }
    
    

}
