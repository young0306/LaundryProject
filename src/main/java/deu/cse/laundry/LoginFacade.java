/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.laundry;

import javax.swing.JOptionPane;

/**
 *
 * @author hesed
 */
public class LoginFacade {
    private Login realLogin;
    public LoginFacade() {
        this.realLogin = new RealLogin();
    }

    public boolean login(String ID, String Password) {
        return realLogin.login(ID, Password);
    }
    
    public void logout(){
        JOptionPane.showMessageDialog(null, "시스템을 종료합니다.", "안내", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
