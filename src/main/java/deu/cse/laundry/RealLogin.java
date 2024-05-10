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
public class RealLogin implements Login{
    private int loginFail = 0;
    private String UserID = "user";
    private String UserPassword = "password";
    private String AdminiStratorID = "admin";
    private String AdminiStratorPassword = "admin";
    
    
    public boolean login(String ID, String Password) {
        if (ID.equals(AdminiStratorID) && Password.equals(AdminiStratorPassword)) {
            JOptionPane.showMessageDialog(null, "로그인 성공, 관리자님 환영합니다.", "안내", JOptionPane.INFORMATION_MESSAGE);
            Administrator adminFrame = new Administrator();
            adminFrame.setVisible(true);
            
            return true;
        } else if (ID.equals(UserID) && Password.equals(UserPassword)) {
            JOptionPane.showMessageDialog(null, "로그인 성공, " + UserID + "님 세탁방에 오신 것을 환영합니다.", "안내", JOptionPane.INFORMATION_MESSAGE);
            Customer customerFrame = new Customer();
            customerFrame.setVisible(true);
            
            return true;
        } else {
            loginFail++;
             if (loginFail >= 5) {
                JOptionPane.showMessageDialog(null, "5회 이상 틀리셔서 강제 종료됩니다.", "경고", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                 JOptionPane.showMessageDialog(null, "로그인 실패, " + loginFail + " 번 틀리셨습니다. 5회 이상 틀릴시 강제 종료 됩니다.", "경고", JOptionPane.INFORMATION_MESSAGE);
             }
            return false;
        }
    }
}
