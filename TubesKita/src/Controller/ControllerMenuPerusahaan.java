/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuPerusahaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Acer
 */
public class ControllerMenuPerusahaan implements ActionListener{
    MenuPerusahaan menuPerusahaan;
    
    public ControllerMenuPerusahaan() {
        menuPerusahaan = new MenuPerusahaan();
        menuPerusahaan.addActionListener(this);
        menuPerusahaan.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if  (o.equals(menuPerusahaan.getBtnKeMenuUtama())){
            ControllerMenuAwal awal = new ControllerMenuAwal();
            menuPerusahaan.dispose();
        } else if (o.equals(menuPerusahaan.getBtnBuatLowongan())){
            ControllerBuatLowongan buatlowongan = new ControllerBuatLowongan();
            buatlowongan.displayListPerusahaan();
            menuPerusahaan.dispose();
        } else if (o.equals(menuPerusahaan.getBtnLihatPelamar())){
            ControllerLihatPelamar lihatPelamar = new ControllerLihatPelamar();
            
            menuPerusahaan.dispose();
        } else if (o.equals(menuPerusahaan.getBtnTerimaPelamar())){
            ControllerTerimaPelamar terimaPelamar = new ControllerTerimaPelamar();
        }
    }
    
}
