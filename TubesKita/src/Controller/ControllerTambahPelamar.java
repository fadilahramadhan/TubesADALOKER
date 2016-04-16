/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TambahPelamar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Acer
 */
public class ControllerTambahPelamar implements ActionListener{
    TambahPelamar tambahPelamar;

    public ControllerTambahPelamar() {
        tambahPelamar = new TambahPelamar();
        tambahPelamar.addActionListener(this);
        tambahPelamar.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(tambahPelamar.getBtnBack())) {
            ControllerMenuPelamar menuPelamar = new ControllerMenuPelamar();
            //belum
            tambahPelamar.dispose();
        } else if (o.equals(tambahPelamar.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal();
            tambahPelamar.dispose();
            
        } else if (o.equals(tambahPelamar.getBtnBuatPelamar())) {
            //belum
        }
    }
    
}
