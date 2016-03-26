/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubeskita;

import java.awt.BorderLayout;
import java.time.Instant;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author HAFID
 */
public class Aplikasi {
    Date date = new Date();
    int idperusahaan = 0;
    int idpelamar = 100;
    int idberkas = 1000;
    private ArrayList<Perusahaan> daftarPerusahaan = new ArrayList<>(); 
    private ArrayList<Pelamar> daftarPelamar = new ArrayList<>(); 
    Scanner input = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    
    public void addPerusahaan(int id,String nama, String alamat, String jenisKelamin) {
        daftarPerusahaan.add(new Perusahaan(id,nama, alamat, jenisKelamin));
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
    
    public Perusahaan getPerusahaan(int id){
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
    
    public void tambah(){
        idperusahaan++;
        System.out.println("Buka Lowongan");
        System.out.println("ID Perusahaan : "+idperusahaan);
        System.out.print("Nama Perusahaan : ");
        String nama = input.nextLine();
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Jenis Kelamin : ");
        String jk = input.nextLine();
        addPerusahaan(idperusahaan, nama, alamat, jk);
        System.out.println("Perusahaan Berhasil Ditambahkan !");
        menuUtama();
    }
    
    public void menuPerusahaan(){
        System.out.print("Username : ");
        String user = input.next();
        System.out.print("Password : ");
        String pswd = input.next();
        if (user.equals("admin") && pswd.equals("asd")){
            Scanner pil = new Scanner(System.in);
            System.out.println("====MENU PERUSAHAAN====");
            System.out.println("1. Create Lowongan");
            System.out.println("2. Lihat Pelamar");
            System.out.println("3. Terima Pelamar");
            System.out.println("4. Menu Utama");
            System.out.println("List Perusahaan");
            for (int i = 0; i < daftarPerusahaan.size(); i++) {
                System.out.println(daftarPerusahaan.get(i).getIdPerusahaan()+". "+daftarPerusahaan.get(i).getNama());
            }
            System.out.print("Masukkan Pilihan : ");
            int pilih = pil.nextInt();
            switch (pilih){
                case 1:{
                    System.out.println("Masukkan Data Lowongan");
                    System.out.println("ID Perusahaan : ");
                    int idPe = inputInt.nextInt();
                    System.out.print("ID LOWONGAN : ");
                    int idLo = inputInt.nextInt();
                    System.out.println("DeadLine : ");
                    //String deadline = input.nextLine();
                    System.out.print("Nama Pekerjaan : ");
                    String namaPekerjaan = input.nextLine();
                    daftarPerusahaan.get(idPe).createLowongan(idLo, date, namaPekerjaan);
                break;
                }
                case 2:{
                    System.out.println("Nama-Nama Pelamar");
                    for (int i = 0; i < daftarPerusahaan.size(); i++) {
                            System.out.println("\n "+daftarPerusahaan.get(i).getNama());
                        for (int j = 0; j < daftarPerusahaan.get(i).getSizeLowongan(); j++) {
                            System.out.println("\n \n"+daftarPerusahaan.get(i).getLowongan(j).getNamaPekerjaan());
                             for (int k = 0; k < daftarPerusahaan.get(i).getLowongan(j).getSizeBerkasMasuk(); k++) {
                                 System.out.println("\n \n \n"+daftarPerusahaan.get(i).getLowongan(j).getBerkasMasuk(k).getCv());
                            }
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("Terima Berkas Pelamar");
                    System.out.print("Masukkan ID Berkas Yang Diterima : ");
                    int idBerkas = inputInt.nextInt();
                    break;
                }
                case 4:{
                    menuUtama();
                }
            }
        }else{
            System.out.println("Username atau Password Anda Salah");
            System.out.println("Kembali Ke Menu Utama");
            menuUtama();
        }
    }
    public void menuPelamar(){
        Scanner pil = new Scanner(System.in);
        System.out.println("====MENU PELAMAR====");
        System.out.println("1. Daftar Lamaran");
        System.out.println("2. Cari Lowongan");
        System.out.println("3. Buat Berkas");
        System.out.println("4. Menu Utama");
        System.out.print("Masukkan Pilihan : ");
        int pilih = pil.nextInt();
        switch (pilih){
            case 1:{
                idpelamar++;
                System.out.println("ID Pelamar : "+idpelamar);
                System.out.print("Masukkan Nama : ");
                String nama = input.nextLine();
                System.out.print("Masukkan Alamat : ");
                String alamat = input.nextLine();
                System.out.print("Masukkan JenisKelamin : ");
                String jk = input.nextLine();
                addPelamar(idpelamar, nama, alamat, jk);
                System.out.println("Data Berhasil Masuk");
                menuPelamar();
                break;
            }
            case 2:{
                //belum tau
            }
            case 3:{
                idberkas++;
                System.out.println("Masukkan ID anda : ");
                int id1 = inputInt.nextInt();
                daftarPelamar.get(id1).createBerkas(idberkas);
                System.out.println("Berkas Sudah Dibuat : ");
                System.out.println("Id berkas : "+daftarPelamar.get(id1).getBerkas().getIdBerkas());
                System.out.println(daftarPelamar.get(id1).getBerkas().getCv());
                System.out.println("Data Berhasil Masuk");
                menuPelamar();
            }
            case 4:{
                menuUtama();
                break;
            }
        }
    }
    public void menuUtama(){
        Scanner pil = new Scanner(System.in);
        System.out.println("===Menu ADALOKER===");
        System.out.println("1. Perusahan");
        System.out.println("2. Pelamar");
        System.out.println("3. Tambah Perusahaan");
        System.out.print("Masukkan Pilihan : ");
        int pilih = pil.nextInt();
        switch (pilih){
            case 1:{
                menuPerusahaan();
                break;
            }
            case 2:{
                menuPelamar();
                break;
            }
            case 3:{
                tambah();
                break;
            }
        }
    }
}
