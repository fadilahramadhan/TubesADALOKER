/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskita;

/**
 *
 * @author Eri Sadewo - 1301140022 - if 38 02
 */
public abstract class Orang {
	private String nama; 
	private String alamat; 
	private String jenisKelamin;
	private String usia;
	private int noPe;
    private int nope;
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setAlamat(String alamat){
		this.alamat = alamat;
	}
	
	public String getAlamat(){
		return alamat;
	}
	
	public void setjenisKelamin(String jenisKelamin){
		this.jenisKelamin = jenisKelamin;
	}
	
	public String getjenisKelamin(){
		return jenisKelamin;
	}
	
	public void setUsia(String usia){
		this.usia = usia;
	}
	public String getUsia(){
		return usia;
	}
	public void setnoPe(int nope){
		this.nope = nope;
	}
	public int getnoPe(){
		return nope;
	}
}
    

