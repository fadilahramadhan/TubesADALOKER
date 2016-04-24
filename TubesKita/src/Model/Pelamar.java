/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Acer
 */
public class Pelamar extends Orang{
    private BerkasLamaran berkas;
    private int idPelamar;

    public int getIdPelamar() {
        return idPelamar;
    }

    public void setIdPelamar(int idPelamar) {
        this.idPelamar = idPelamar;
    }
    private int numOfBerkas;

    public Pelamar(int idPelamar, String nama, String alamat, String jenisKelamin) {
        super(nama, alamat, jenisKelamin);
        this.idPelamar = idPelamar;
    }
    
   
    
    public void createBerkas(int id){
        berkas = new BerkasLamaran(id,displayInfo());
    }
    
    public BerkasLamaran getBerkas(){
        return berkas;
    }
    
    public String displayInfo(){
        return ("ID Pelamar : "+getIdPelamar()+"\n    Nama   : "+getNama()+"\n    Alamat   : "+getAlamat()+"\n    Jenis Kelamin   : "+getJenisKelamin());
        
    }
}
