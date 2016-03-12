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
public class Lowongan {
    private BerkasLamaran[] berkasMasuk = new BerkasLamaran[100];
    private BerkasLamaran[] berkasDiterima = new BerkasLamaran[100];
    private int numOfBerkasMasuk = 0;
    private Date deadline;
    private String namaPekerjaan;
    private int idLowongan;
    
    public Lowongan(int idLowongan, Date deadline){
        this.deadline = deadline;
        this.idLowongan = idLowongan;
    }
    
    public Lowongan(int idLowongan, Date deadline,String namaPekerjaan){
        this.deadline = deadline;
        this.namaPekerjaan = namaPekerjaan;
        this.idLowongan = idLowongan;
    }
    
    public void addBerkas(BerkasLamaran b){
        this.berkasMasuk[numOfBerkasMasuk] = b;
        numOfBerkasMasuk++;
    }
    
    public void terimaBerkas(){
        this.berkasMasuk[numOfBerkasMasuk] = this.berkasDiterima[numOfBerkasMasuk];
        numOfBerkasMasuk++;
    }
    
    public BerkasLamaran getBerkasMasuk(int index){
        return berkasMasuk[index];
    }

    public BerkasLamaran getBerkasMasuk1(int id){
        int indeks = 0;
        while (berkasMasuk[indeks].getIdBerkas() != id){
            indeks++;
        }
        return berkasMasuk[indeks];
    }
    
    public BerkasLamaran removeBerkasMasuk(int id){
        int indeks = 0;
        while (berkasMasuk[indeks].getIdBerkas() != id){
            indeks++;
        }
        return berkasMasuk[indeks] = null;
    }
    
    public BerkasLamaran getBerkasDiterima(int index){
        return berkasDiterima[index];
    }
    
    
    
    /**
     * @return the deadline
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    /**
     * @return the namaPekerjaan
     */
    public String getNamaPekerjaan() {
        return namaPekerjaan;
    }

    /**
     * @param namaPekerjaan the namaPekerjaan to set
     */
    public void setNamaPekerjaan(String namaPekerjaan) {
        this.namaPekerjaan = namaPekerjaan;
    }

    /**
     * @return the idLowongan
     */
    public int getIdLowongan() {
        return idLowongan;
    }

    /**
     * @param idLowongan the idLowongan to set
     */
    public void setIdLowongan(int idLowongan) {
        this.idLowongan = idLowongan;
    }
}
