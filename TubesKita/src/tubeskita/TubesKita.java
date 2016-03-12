
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskita;

/**
 *
 * @author Eri Sadewo/If 38-02/1301140022
 */
public class TubesKita {
    abstract class Orang{
	private String nama; 
	private String alamat; 
	private String jenisKelamin;
	private String usia;
	private int nope;
        
	public void setnama(String nama){
		this.nama = nama;
	}
	
	public String getnama(){
		return nama;
	}
	
	public void setalamat(String alamat){
		this.alamat = alamat;
	}
	
	public String getalamat(){
		return alamat;
	}
	
	public void setjenisKelamin(String jeniskelamin){
		this.jenisKelamin = jeniskelamin;
	}
	
	public String getjenisKelamin(){
		return jenisKelamin;
	}
	
	public void setusia(String usia){
		this.usia = usia;
	}
	public String getusia(){
		return usia;
	}
	public void setnope(int nope){
		this.nope = nope;
	}
	public int getnope(){
		return nope;
	}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
