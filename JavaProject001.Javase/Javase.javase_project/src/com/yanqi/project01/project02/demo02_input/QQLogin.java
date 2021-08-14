package com.yanqi.project01.project02.demo02_input;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class QQLogin extends JFrame implements ActionListener {
	JTextField txtUser = new JTextField() ;
	JPasswordField txtPass = new JPasswordField() ;
	
	public QQLogin() {
		this.setSize(250 , 125) ;
		
		//new���
		JLabel labUser = new JLabel("�û���") ;
		JLabel labPass = new JLabel("����") ;
		
		JButton btnLogin = new JButton("��½") ;
		JButton btnReg = new JButton("ע��") ;
		JButton btnCancel = new JButton("ȡ��") ;
		
		//ע���¼�����
		btnLogin.addActionListener(this) ;
		btnReg.addActionListener(this) ;
		btnCancel.addActionListener(this) ;
		
		//�����������
		JPanel panInput = new JPanel() ;
		panInput.setLayout(new GridLayout(2 , 2)) ;
		
		panInput.add(labUser) ;
		panInput.add(txtUser) ;
		
		panInput.add(labPass) ;
		panInput.add(txtPass) ;
		
		//���ð�ť���
		JPanel panButton = new JPanel() ;
		panButton.setLayout(new FlowLayout()) ;
		
		panButton.add(btnLogin) ;
 		panButton.add(btnReg) ;
 		panButton.add(btnCancel) ;
 		
 		//���ô���
 		this.setLayout(new BorderLayout()) ;
 		
 		this.add(panInput , BorderLayout.CENTER) ;
 		this.add(panButton , BorderLayout.SOUTH) ;
 
	}
	public static void main(String args[]){
		QQLogin w = new QQLogin() ;
		w.setVisible(true) ;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("��½")){
			String u = txtUser.getText() ;
			String p = txtPass.getText() ;
		}
		if(arg0.getActionCommand().equals("ע��")){
			System.out.println("�û�����ע��") ;
		}
		if(arg0.getActionCommand().equals("ȡ��")){
			System.out.println("�û�����ȡ��") ;
		}
	}
}