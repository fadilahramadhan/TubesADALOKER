/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Controller.ControllerMenuAwal;
import viewConsole.Aplikasi;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HAFID
 */
public class Driver {

    public static void main(String[] args) {
        Aplikasi viewConsole = new Aplikasi();
//        viewConsole.menuUtama();
        Controller.ControllerMenuAwal c = new ControllerMenuAwal(viewConsole);

    }
}
