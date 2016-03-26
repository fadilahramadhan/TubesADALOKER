/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskita;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class Perusahaan extends Orang{
    private int idPerusahaan;
    private ArrayList<Lowongan> daftarLowongan = new ArrayList<>();
    
    public int getIdPerusahaan() {
        return idPerusahaan;
    }

    public void setIdPerusahaan(int idPerusahaan) {
        this.idPerusahaan = idPerusahaan;
    }
            
    public int getSizeLowongan(){
        return daftarLowongan.size();
    }
    private int numOfLowongan = 0;

    public Perusahaan(int idPerusahaan, String nama, String alamat, String jenisKelamin) {
        super(nama, alamat, jenisKelamin);
        this.idPerusahaan = idPerusahaan;
    }
    

    public void createLowongan(int idLowongan, Date deadline, String namaPekerjaan){
        this.daftarLowongan.add(new Lowongan(idLowongan, deadline, namaPekerjaan));
          
    }
    
    public Lowongan getLowongan(int index){
        return daftarLowongan.get(index);
    }

    public Lowongan getLowonganById(int id){
        int idx = -1;
        for (int i = 0; i < daftarLowongan.size(); i++) {
            if (daftarLowongan.get(i).getIdLowongan()== id) {
                idx = i;
                break;
            }
        }
        return daftarLowongan.get(idx);
    }
    public void removeLowongan(int indeks){
        daftarLowongan.remove(indeks);
    }
    public String displayInfo(){
        return ("ID Perusahaan : "+getIdPerusahaan()+"\nNama   : "+getNama()+"\nAlamat   : "+getAlamat()+"\nJenis Kelamin   : "+getJenisKelamin()
                );
        
    }
}
