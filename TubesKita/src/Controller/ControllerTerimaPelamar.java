/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TerimaPelamar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Acer
 */
public class ControllerTerimaPelamar implements ActionListener{
    TerimaPelamar terimaPelamar;

    public ControllerTerimaPelamar() {
        terimaPelamar = new TerimaPelamar();
        terimaPelamar.addActionListener(this);
        terimaPelamar.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(terimaPelamar.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal();
            terimaPelamar.dispose();
            //belum;
            
        }else if (o.equals(terimaPelamar.getBtnBack())){
            ControllerMenuPerusahaan menuPerusahaan = new ControllerMenuPerusahaan();
            terimaPelamar.dispose();
            //belum
            
        }
       
    }
    
}
