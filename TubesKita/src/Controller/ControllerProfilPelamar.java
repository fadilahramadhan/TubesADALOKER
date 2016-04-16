/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ProfilPelamar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Acer
 */
public class ControllerProfilPelamar implements ActionListener{
    ProfilPelamar profilPelamar;

    public ControllerProfilPelamar() {
        profilPelamar = new ProfilPelamar();
        profilPelamar.addActionListener(this);
        profilPelamar.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(profilPelamar.getBtnBack())) {
            ControllerMenuPelamar menuPelamar = new ControllerMenuPelamar();
            //belum
            profilPelamar.dispose();
        } else if (o.equals(profilPelamar.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal();
            profilPelamar.dispose();
            
        } else if (o.equals(profilPelamar.getBtnLihatProfil())) {
            //belum
            
        }
    }
}
