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
    
    public void displayListPelamarMasuk(){
        lihatPelamar.getTextAreaPelamarMasuk().setText(app.getAllPelamarMasuk());
    }
    public void displayListPelamarDiterima(){
        lihatPelamar.getTextAreaPelamarDiterima().setText(app.getAllPelamarDiterima());
    }

    public ControllerLihatPelamar(Aplikasi ap) {
        lihatPelamar = new LihatPelamar();
        lihatPelamar.addActionListener(this);
        lihatPelamar.setVisible(true);
        this.app = ap;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       Object o = e.getSource();
        if (o.equals(lihatPelamar.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal(app);
            lihatPelamar.dispose();
            
        }else if (o.equals(lihatPelamar.getBtnBack())){
            ControllerMenuPerusahaan menuPerusahaan = new ControllerMenuPerusahaan(app);
            lihatPelamar.dispose();
            
        }
    }
    
}
