/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class Lowongan {
    private ArrayList<BerkasLamaran> berkasMasuk = new ArrayList<>();
    private ArrayList<BerkasLamaran> berkasDiterima = new ArrayList<>();
    private int numOfBerkasMasuk = 0;
    private Date deadline;
    private String namaPekerjaan;
    private int idLowongan;
    
    public Lowongan(int idLowongan, Date deadline) {
        this.deadline = deadline;
        this.idLowongan = idLowongan;
    }

    public Lowongan(int idLowongan, Date deadline, String namaPekerjaan) {
        this.deadline = deadline;
        this.namaPekerjaan = namaPekerjaan;
        this.idLowongan = idLowongan;
    }

    public void addBerkas(BerkasLamaran b) {
        this.berkasMasuk.add(b);
    }

    public void terimaBerkas(BerkasLamaran b) {

        for (int i = 0; i < berkasMasuk.size(); i++) {
            if (berkasMasuk.get(i).equals(b)) {
                berkasDiterima.add(b);
                removeBerkasMasuk(i);
            }
        }

    }
    
    public int getSizeBerkasMasuk(){
        return berkasMasuk.size();
    }
    
    public int getSizeBerkasDiterima(){
        return berkasDiterima.size();
    }

    public BerkasLamaran getBerkasMasuk(int index) {
        return berkasMasuk.get(index);
    }

    public BerkasLamaran getBerkasMasukByID(int id) {
        int idx = -1;
        for (int i = 0; i < berkasMasuk.size(); i++) {
            if (berkasMasuk.get(i).getIdBerkas() == id) {
                idx = i;
                break;
            }
        }
        return berkasMasuk.get(idx);
    }

    public void removeBerkasMasuk(int idx) {
        berkasMasuk.remove(idx);
    }

    public BerkasLamaran getBerkasDiterima(int index) {
        return berkasDiterima.get(index);
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
