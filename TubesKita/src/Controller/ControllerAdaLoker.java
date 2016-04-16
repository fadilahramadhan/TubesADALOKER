/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import viewConsole.Aplikasi;
import Model.BerkasLamaran;
import Model.Lowongan;
import Model.Orang;
import Model.Pelamar;
import Model.Perusahaan;
import View.BuatLowongan;
import View.LihatLowongan;
import View.LihatPelamar;
import View.MenuAwal;
import View.MenuPelamar;
import View.MenuPerusahaan;
import View.ProfilPelamar;
import View.TambahPelamar;
import View.TerimaPelamar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Acer
 */
public class ControllerAdaLoker {
    BuatLowongan buatLowongan;
    LihatLowongan lihatLowongan;
    LihatPelamar lihatPelamar;
    MenuAwal menuAwal;
    MenuPelamar menuPelamar;
    MenuPerusahaan menuPerusahaan;
    ProfilPelamar profilPelamar;
    TambahPelamar tambahPelamar;
    TerimaPelamar terimaPelamar;
    
    public ControllerAdaLoker(){
        buatLowongan = new BuatLowongan();
        lihatLowongan = new LihatLowongan();
        lihatPelamar = new LihatPelamar();
        menuAwal = new MenuAwal();
        menuPelamar = new MenuPelamar();
        menuPerusahaan = new MenuPerusahaan();
        profilPelamar = new ProfilPelamar();
        tambahPelamar = new TambahPelamar();
        terimaPelamar = new TerimaPelamar();
        
        
    }
}
