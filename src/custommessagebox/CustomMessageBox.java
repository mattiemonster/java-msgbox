/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custommessagebox;

import javax.swing.JFrame;

/**
 *
 * @author i
 */
public class CustomMessageBox {

    public static void main(String[] args) {
        Window win = new Window();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setTitle("Custom Message Box");
        win.setResizable(false);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
    
}
