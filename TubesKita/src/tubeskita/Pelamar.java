/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskita;

/**
 *
 * @author Acer
 */
public class Pelamar extends Orang{
    
    private static BerkasLamaran[] berkas = new BerkasLamaran[10];
    private int numOfBerkas;
    public void createBerkas(int id){
        if (numOfBerkas < 10){
            berkas[numOfBerkas] = new BerkasLamaran(id);
            numOfBerkas ++;
        }
    }
    
    public String displayInfo(){
        return ("Nama   : "+getNama()+"n/Alamat   : "+getAlamat()+"n/Jenis Kelamin   : "+getJenisKelamin()+
                "n/Usia :"+getUsia()+"n/No Telepon    :"+getNoPe());
        
    }
    
}
