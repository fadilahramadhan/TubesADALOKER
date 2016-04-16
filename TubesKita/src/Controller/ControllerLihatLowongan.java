/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.BerkasLamaran;
import Model.Pelamar;
import View.LihatLowongan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewConsole.Aplikasi;

/**
 *
 * @author Acer
 */
public class ControllerLihatLowongan implements ActionListener{
    LihatLowongan lihatLowongan;
    Aplikasi app;

    public void displayListLowongan(){
        lihatLowongan.getTextAreaListLowongan().setText(app.getAllLowongan());
    }
    public ControllerLihatLowongan(Aplikasi ap) {
        lihatLowongan = new LihatLowongan();
        lihatLowongan.addActionListener(this);
        lihatLowongan.setVisible(true);
        this.app = ap;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(lihatLowongan.getBtnBack())) {
            ControllerMenuPelamar menuPelamar = new ControllerMenuPelamar(app);            
            lihatLowongan.dispose();
        } else if (o.equals(lihatLowongan.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal(app);
            lihatLowongan.dispose();
            
        } else if(o.equals(lihatLowongan.getBtnDaftar())){
            String idPel = lihatLowongan.getTextIdPelamar().getText();
            String idPer = lihatLowongan.getTextIdPerusahaan().getText();
            String idLow = lihatLowongan.getTextIdLowongan().getText();
            
            BerkasLamaran berkas = app.getPelamar(Integer.parseInt(idPel)).getBerkas();
            app.getPerusahaan(Integer.parseInt(idPer)).getLowonganById(Integer.parseInt(idLow)).addBerkas(berkas);
        }
        
    }
}
