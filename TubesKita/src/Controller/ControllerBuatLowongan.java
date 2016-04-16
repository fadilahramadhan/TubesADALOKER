/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.BuatLowongan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewConsole.Aplikasi;

/**
 *
 * @author Acer
 */
public class ControllerBuatLowongan implements ActionListener{
    BuatLowongan buatLowongan;
    Aplikasi app;
    public ControllerBuatLowongan(Aplikasi ap) {
        buatLowongan = new BuatLowongan();
        buatLowongan.addActionListener(this);
        buatLowongan.setVisible(true);      
        this.app = ap;
   }
    public void displayListPerusahaan(){
        buatLowongan.getTextAreaListPerusahaan().setText(app.getAllPerusahaan());
    }

    public void setApp(Aplikasi app) {
        this.app = app;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if  (o.equals(buatLowongan.getBtnKeMenuUtama1())){
            ControllerMenuAwal awal = new ControllerMenuAwal(app);
            buatLowongan.dispose();            
        } else if (o.equals(buatLowongan.getBtnBuatLowongan())){
            String idP = buatLowongan.getTextIdPerusahaanIn().getText();
            String idL = buatLowongan.getTextIdLowonganIn().getText();
            String nP = buatLowongan.getTextNamaPekerjaanIn().getText();
            app.getPerusahaan(Integer.parseInt(idP)).createLowongan(Integer.parseInt(idL), null, nP);            
            ControllerMenuPerusahaan  mPerusahaan = new ControllerMenuPerusahaan(app);
            buatLowongan.dispose();
            
        } else if (o.equals(buatLowongan.getBtnBack())) {
            ControllerMenuPerusahaan menuPerusahaan = new ControllerMenuPerusahaan(app);            
            buatLowongan.dispose();
        }
        
    }

    
}
