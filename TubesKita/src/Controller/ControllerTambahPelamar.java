/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TambahPelamar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewConsole.Aplikasi;

/**
 *
 * @author Acer
 */
public class ControllerTambahPelamar implements ActionListener{
    TambahPelamar tambahPelamar;
    Aplikasi app;

    public ControllerTambahPelamar(Aplikasi ap) {
        tambahPelamar = new TambahPelamar();
        tambahPelamar.addActionListener(this);
        tambahPelamar.setVisible(true);
        this.app = ap;
        tambahPelamar.getTextIdPelamar().setText((app.getNextIdPelamar()+1)+"");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(tambahPelamar.getBtnBack())) {
            ControllerMenuPelamar menuPelamar = new ControllerMenuPelamar(app);
            tambahPelamar.dispose();
        } else if (o.equals(tambahPelamar.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal(app);
            tambahPelamar.dispose();
            
        } else if (o.equals(tambahPelamar.getBtnBuatPelamar())) {
            String nama = tambahPelamar.getTextNama().getText();
            String alamat = tambahPelamar.getTextAlamat().getText();
            String jk = tambahPelamar.getTextJenisKelamin().getText();
            String id = tambahPelamar.getTextIdPelamar().getText();
            app.addPelamar(Integer.parseInt(id), nama, alamat, jk);
            app.tambahIdPelamar();
            
            ControllerMenuPelamar menuPelamar = new ControllerMenuPelamar(app);
            tambahPelamar.dispose();
        }
    }
    
}
