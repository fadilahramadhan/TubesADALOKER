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
public class BerkasLamaran {
    
    private int idBerkas;
    private String cv;
    
    public BerkasLamaran(int id){
        this.idBerkas=id;
    }
    
    public BerkasLamaran (int id, String cv){
        this.idBerkas=id;
        this.cv=cv;
    }

    /**
     * @return the id
     */
    public int getIdBerkas() {
        return idBerkas;
    }

    /**
     * @param id
     */
    public void setIdBerkas(int id) {
        this.idBerkas = id;
    }

    /**
     * @return the cv
     */
    public String getCv() {
        return cv;
    }

    /**
     * @param cv the cv to set
     */
    public void setCv(String cv) {
        this.cv = cv;
    }
}
