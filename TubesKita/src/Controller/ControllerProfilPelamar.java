/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ProfilPelamar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewConsole.Aplikasi;

/**
 *
 * @author Acer
 */
public class ControllerProfilPelamar implements ActionListener{
    ProfilPelamar profilPelamar;
    Aplikasi app;

    public ControllerProfilPelamar(Aplikasi ap) {
        profilPelamar = new ProfilPelamar();
        profilPelamar.addActionListener(this);
        profilPelamar.setVisible(true);
        this.app = ap;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(profilPelamar.getBtnBack())) {
            ControllerMenuPelamar menuPelamar = new ControllerMenuPelamar(app);           
            profilPelamar.dispose();
        } else if (o.equals(profilPelamar.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal(app);
            profilPelamar.dispose();
            
        } else if (o.equals(profilPelamar.getBtnLihatProfil())) {
            String id = profilPelamar.getTextIdPelamar().getText();
            profilPelamar.getTextNama().setText(app.getPelamar(Integer.parseInt(id)).getNama());
            profilPelamar.getTextAlamat().setText(app.getPelamar(Integer.parseInt(id)).getAlamat());
            profilPelamar.getTextJenisKelamin().setText(app.getPelamar(Integer.parseInt(id)).getJenisKelamin());                        
        } else if (o.equals(profilPelamar.getBtnBuatBerkas())) {
            String id = profilPelamar.getTextIdPelamar().getText();
            app.getPelamar(Integer.parseInt(id)).createBerkas(app.getNextIdBerkas()+1);
            app.tambahIdBerkas();
            
        }
    }
}
