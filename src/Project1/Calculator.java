package Project1;

import javax.swing.*;
import java.awt.*;

/*
    자바 GUI 실습
    자바 계산기 만들기
    https://youtu.be/zFAPpiL17ow?si=6riI4bcrwQrpjJIp 이 영상을보고 실습을 해보았다.
    https://www.notion.so/1d0d109330638013ba09e4637a9fe1c2?pvs=4 프로젝트 일지는 노션에 올려두었다.
*/

//프레임 출력 부분
class CalculatorFrame extends JFrame {

    private JTextField inputSpace;

    void calculatorframe() {
        setLayout(null);

        //택스트필드의 배경색/정렬위치/글씨체/위치,크기설정
        inputSpace = new JTextField();
        inputSpace.setEditable(false);
        inputSpace.setBackground(Color.WHITE);
        inputSpace.setHorizontalAlignment(JTextField.RIGHT);
        inputSpace.setFont(new Font("Pretendard", Font.BOLD, 50));
        inputSpace.setBounds(8,10,270,70);// 위치 x:8 y:10  | 크기 270x70
        add(inputSpace);

        //버튼 구성
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,4,10,10)); //격자형태로 배치해주는 GridLayout(가로칸수,세로칸수,좌우간격,상하간격)사용
        buttonPanel.setBounds(8,90,270,245);
        String[] button_names = { "C" , "+/-" , "%", "÷", "7" , "8", "9", "×", "4", "5", "6", "+", "1", "2", "3", "-", " ", "0", ".","=" };
        JButton[] buttons = new JButton[button_names.length];

        //버튼 폰트 설정
        for (int i = 0; i < button_names.length; i++) {
            buttons[i] = new JButton(button_names[i]);
            buttons[i].setFont(new Font("Pretendard", Font.BOLD, 16));
            if (buttons[i].getText().equals("C")) {
                buttons[i].setBackground(Color.LIGHT_GRAY);
                buttons[i].setForeground(Color.RED); //"C"버튼 폰트 빨간색
            } else {
            if ((i >= 4 && i <= 6) || (i >= 8 && i <= 10) || (i >= 12 && i <= 14) ||(i >= 16 && i <= 18) ){
                buttons[i].setBackground(Color.BLACK);
            } else buttons[i].setBackground(Color.GRAY);
            buttons[i].setForeground(Color.WHITE);
            buttons[i].setBorderPainted(false);
            }
            buttonPanel.add(buttons[i]);
        }
        add(buttonPanel);
        //계산기 기본 프레임 제작
        setTitle("계산기");
        setVisible(true);
        setSize(300,370);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//계산 처리 로직
class CalculatorLogic {
    public void inputNumber(String num){

    }
	public void inputOperator(String op){

    }
	public String calculate(){
        return null;
    }
	public void clear(){

    }
}


public class Calculator {
    public static void main(String[] args) {

        //맥OS Look and Feel 설정 변경
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        CalculatorFrame frame = new CalculatorFrame();
        frame.calculatorframe();
    }
}