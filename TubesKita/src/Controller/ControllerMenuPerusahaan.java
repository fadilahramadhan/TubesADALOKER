/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LihatPelamar;
import View.MenuPerusahaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewConsole.Aplikasi;

/**
 *
 * @author Acer
 */
public class ControllerMenuPerusahaan implements ActionListener {

    MenuPerusahaan menuPerusahaan;
    Aplikasi app;

    public ControllerMenuPerusahaan(Aplikasi ap) {
        menuPerusahaan = new MenuPerusahaan();
        menuPerusahaan.addActionListener(this);
        menuPerusahaan.setVisible(true);
        this.app = ap;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(menuPerusahaan.getBtnKeMenuUtama())) {
            ControllerMenuAwal awal = new ControllerMenuAwal(app);
            menuPerusahaan.dispose();
        } else if (o.equals(menuPerusahaan.getBtnBuatLowongan())) {
            ControllerBuatLowongan buatlowongan = new ControllerBuatLowongan(app);
            buatlowongan.displayListPerusahaan();
            menuPerusahaan.dispose();
        } else if (o.equals(menuPerusahaan.getBtnLihatPelamar())) {
            ControllerLihatPelamar lihatPelamar = new ControllerLihatPelamar(app);
            lihatPelamar.displayListPelamarMasuk();
            lihatPelamar.displayListPelamarDiterima();
            menuPerusahaan.dispose();
        } else if (o.equals(menuPerusahaan.getBtnTerimaPelamar())) {
            ControllerTerimaPelamar terimaPelamar = new ControllerTerimaPelamar(app);
            terimaPelamar.displayPelamarMasuk();
        }
    }
}
