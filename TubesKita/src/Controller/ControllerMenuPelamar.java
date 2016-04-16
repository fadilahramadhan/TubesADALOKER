/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuPelamar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewConsole.Aplikasi;

/**
 *
 * @author Acer
 */
public class ControllerMenuPelamar implements ActionListener{
    MenuPelamar menuPelamar;
    Aplikasi app;

    public ControllerMenuPelamar(Aplikasi ap) {
        menuPelamar = new MenuPelamar();
        menuPelamar.addActionListener(this);
        menuPelamar.setVisible(true);
        this.app = ap;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(menuPelamar.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal(app);
            menuPelamar.dispose();
        } else if (o.equals(menuPelamar.getBtnLihatLowongan())){
            ControllerLihatLowongan lihatLowongan = new ControllerLihatLowongan(app);
            lihatLowongan.displayListLowongan();
            menuPelamar.dispose();
            
        } else if (o.equals(menuPelamar.getBtnProfilPelamar())) {
            ControllerProfilPelamar profilPelamar = new ControllerProfilPelamar(app);
            menuPelamar.dispose();
            
        } else if (o.equals(menuPelamar.getBtnTambahPelamar())){
            ControllerTambahPelamar tambahPelamar = new ControllerTambahPelamar(app);
            menuPelamar.dispose();
            
        }
    }
    
}
