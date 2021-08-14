package com.yanqi.project01.project02.demo01_chat;

import javax.swing.*;
import java.awt.*;

public class QQMain {
	public static void main(String args[]){
		JFrame w = new JFrame() ;
		
		w.setSize(300 , 400) ;
		
		//new���
		JTextField txtMess = new JTextField() ;
		
		JComboBox cmbUser = new JComboBox() ;
		JButton btnSend = new JButton("����") ;
		
		JTextArea txtContent = new JTextArea() ;
		//���ù�����
		JScrollPane spContent = new JScrollPane(txtContent) ;
		
		//����С���
		JPanel panSmall = new JPanel() ;
		panSmall.setLayout(new GridLayout(1 , 2)) ;
		
		panSmall.add(cmbUser) ;
		panSmall.add(btnSend) ;
		
		//���ô����
		JPanel panBig = new JPanel() ;
		panBig.setLayout(new GridLayout(2 , 1)) ;
		
		panBig.add(txtMess) ;
		panBig.add(panSmall) ;
		
 		//���ô���
		w.setLayout(new BorderLayout()) ;
		
		w.add(panBig , BorderLayout.NORTH) ;
		w.add(spContent , BorderLayout.CENTER) ;

		w.setVisible(true) ;
	}
}