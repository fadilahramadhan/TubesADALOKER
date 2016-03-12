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
    
    public Pelamar(String nama, String alamat, String jenisKelamin){
        super(nama,alamat,jenisKelamin);
    }
    
    public Pelamar(String nama, String alamat, String jenisKelamin, int usia, int noPe){
        super(nama,alamat,jenisKelamin,usia,noPe);
    }
    
    public void createBerkas(int id){
        if (numOfBerkas < 10){
            berkas[numOfBerkas] = new BerkasLamaran(id);
            numOfBerkas ++;
        }
    }
    
    public BerkasLamaran getBerkas(int indeks){
        return berkas[indeks];
    }
    
    public BerkasLamaran getBerkas1(int id){
        int indeks = 0;
        while (berkas[indeks].getIdBerkas()!= id){
            indeks++;
        }
        return berkas[indeks];
    }
    
    public String displayInfo(){
        return ("Nama   : "+getNama()+"\nAlamat   : "+getAlamat()+"\nJenis Kelamin   : "+getJenisKelamin()+
                "\nUsia :"+getUsia()+"\nNo Telepon    :"+getNoPe());
        
    }
    
}
