/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LihatPelamar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewConsole.Aplikasi;

/**
 *
 * @author Acer
 */
public class ControllerLihatPelamar implements ActionListener{
    LihatPelamar lihatPelamar;
    Aplikasi app;

    public ControllerLihatPelamar() {
        lihatPelamar = new LihatPelamar();
        lihatPelamar.addActionListener(this);
        lihatPelamar.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       Object o = e.getSource();
        if (o.equals(lihatPelamar.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal();
            lihatPelamar.dispose();
            //belum;
            
        }else if (o.equals(lihatPelamar.getBtnBack())){
            ControllerMenuPerusahaan menuPerusahaan = new ControllerMenuPerusahaan();
            lihatPelamar.dispose();
            //belum
            
        }
    }
    
}
