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
// 퍼사드 패턴을 적용한 클래스
public class LoginFacade {
    // realLogin, 실제 로그인 기능을 수행하는 객체
    private Login realLogin;
    
     // LoginFacade 생성자에서 realLogin 객체를 초기화
    public LoginFacade() {
        this.realLogin = new RealLogin();
    }
    
    // login 함수, ID와 비밀번호를 받아 realLogin 객체의 login 함수를 호출, 결과 반환
    public boolean login(String ID, String Password) {
        return realLogin.login(ID, Password);
    }
    // exitstart 함수, 로그아웃 메시지 출력 후 종료
    public void exitstart(){
        JOptionPane.showMessageDialog(null, "시스템을 종료합니다.", "안내", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
