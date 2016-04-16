/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuPelamar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Acer
 */
public class ControllerMenuPelamar implements ActionListener{
    MenuPelamar menuPelamar;

    public ControllerMenuPelamar() {
        menuPelamar = new MenuPelamar();
        menuPelamar.addActionListener(this);
        menuPelamar.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(menuPelamar.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal();
            menuPelamar.dispose();
        } else if (o.equals(menuPelamar.getBtnLihatLowongan())){
            ControllerLihatLowongan lihatLowongan = new ControllerLihatLowongan();
            //belum
            menuPelamar.dispose();
            
        } else if (o.equals(menuPelamar.getBtnProfilPelamar())) {
            ControllerProfilPelamar profilPelamar = new ControllerProfilPelamar();
            //belum
            menuPelamar.dispose();
            
        } else if (o.equals(menuPelamar.getBtnTambahPelamar())){
            ControllerTambahPelamar tambahPelamar = new ControllerTambahPelamar();
            //belum
            menuPelamar.dispose();
            
        }
    }
    
}
