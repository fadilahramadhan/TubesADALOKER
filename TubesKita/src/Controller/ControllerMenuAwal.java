/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuAwal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewConsole.Aplikasi;

/**
 *
 * @author Acer
 */
public class ControllerMenuAwal implements ActionListener{
    MenuAwal menuAwal;
    
    Aplikasi app;
    public ControllerMenuAwal(Aplikasi ap) {
        menuAwal = new MenuAwal();
        menuAwal.addActionListener(this);
        menuAwal.setVisible(true);
        
        app = ap;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(menuAwal.getBtnPerusahaan())) {
            ControllerMenuPerusahaan mPerusahaan = new ControllerMenuPerusahaan(app);
            menuAwal.dispose();
        } else if (o.equals(menuAwal.getBtnPelamar())){
            ControllerMenuPelamar menuPelamar = new ControllerMenuPelamar(app);
            menuAwal.dispose();
        } else if (o.equals(menuAwal.getBtnTmbhPerusahaan())){
            ControllerTambahPerusahaan tambahPerusahaan = new ControllerTambahPerusahaan(app);
            menuAwal.dispose();
        }
    }
    
}
