/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TambahPerusahaan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Acer
 */
public class ControllerTambahPerusahaan implements ActionListener{
    TambahPerusahaan tambahPerusahaan;

    public ControllerTambahPerusahaan() {
        tambahPerusahaan = new TambahPerusahaan();
        tambahPerusahaan.addActionListener(this);
        tambahPerusahaan.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(tambahPerusahaan.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal();
            tambahPerusahaan.dispose();
        } else if (o.equals(tambahPerusahaan.getBtnTambahPerusahaan())) {
            //belum
        }
    }
}
