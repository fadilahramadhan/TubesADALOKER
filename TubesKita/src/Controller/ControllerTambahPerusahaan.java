/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TambahPerusahaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewConsole.Aplikasi;

/**
 *
 * @author Acer
 */
public class ControllerTambahPerusahaan implements ActionListener{
    Aplikasi app;
    TambahPerusahaan tambahPerusahaan;

    public ControllerTambahPerusahaan(Aplikasi ap) {
        tambahPerusahaan = new TambahPerusahaan();
        
        tambahPerusahaan.addActionListener(this);
        tambahPerusahaan.setVisible(true);
        this.app = ap;
        tambahPerusahaan.getTextIdPerusahaan().setText((app.getNextIdPerusahaan()+1)+"");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(tambahPerusahaan.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal(app);
            tambahPerusahaan.dispose();
        } else if (o.equals(tambahPerusahaan.getBtnTambahPerusahaan())) {
            String nama = tambahPerusahaan.getTextNamaPerusahaan().getText();
            String alamat = tambahPerusahaan.getTextAlamat().getText();
            String jk = tambahPerusahaan.getTextJenisKelamin().getText();
            
            String id =tambahPerusahaan.getTextIdPerusahaan().getText();
            app.addPerusahaan(Integer.parseInt(id), nama, alamat, jk);
            app.tambahId();
            
            ControllerMenuAwal menuAwal = new ControllerMenuAwal(app);
            tambahPerusahaan.dispose();
        }
    }
}
