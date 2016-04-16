/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LihatLowongan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Acer
 */
public class ControllerLihatLowongan implements ActionListener{
    LihatLowongan lihatLowongan;

    public ControllerLihatLowongan() {
        lihatLowongan = new LihatLowongan();
        lihatLowongan.addActionListener(this);
        lihatLowongan.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(lihatLowongan.getBtnBack())) {
            ControllerMenuPelamar menuPelamar = new ControllerMenuPelamar();
            //belum
            lihatLowongan.dispose();
        } else if (o.equals(lihatLowongan.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal();
            lihatLowongan.dispose();
            
        } else if(o.equals(lihatLowongan.getBtnDaftar())){
            //belum
        }
        
    }
}
