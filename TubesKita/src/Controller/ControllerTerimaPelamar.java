/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TerimaPelamar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewConsole.Aplikasi;

/**
 *
 * @author Acer
 */
public class ControllerTerimaPelamar implements ActionListener{
    TerimaPelamar terimaPelamar;
    Aplikasi app;

    public ControllerTerimaPelamar(Aplikasi ap) {
        terimaPelamar = new TerimaPelamar();
        terimaPelamar.addActionListener(this);
        terimaPelamar.setVisible(true);
        this.app = ap;
    }
    public void displayPelamarMasuk(){
        terimaPelamar.getTextAreaPelamarMasuk().setText(app.getAllPelamarMasuk());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(terimaPelamar.getBtnKeMenuUtama())) {
            ControllerMenuAwal menuAwal = new ControllerMenuAwal(app);
            terimaPelamar.dispose();
            
        }else if (o.equals(terimaPelamar.getBtnBack())){
            ControllerMenuPerusahaan menuPerusahaan = new ControllerMenuPerusahaan(app);
            terimaPelamar.dispose();            
            
        } else if (o.equals(terimaPelamar.getBtnTerimaPelamar())) {
            String idPer = terimaPelamar.getTextIdPerusahaan().getText();
            String idLow = terimaPelamar.getTextIdLowongan().getText();
            String idPel = terimaPelamar.getTextIdPelamar().getText();
            app.terimaPelamar(Integer.parseInt(idPer), Integer.parseInt(idLow), Integer.parseInt(idPel));
            
            ControllerMenuPerusahaan menuPerusahaan = new ControllerMenuPerusahaan(app);
            terimaPelamar.dispose();  
        }
       
    }
    
}
