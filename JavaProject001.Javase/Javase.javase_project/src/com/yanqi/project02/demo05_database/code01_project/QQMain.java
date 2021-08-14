package com.yanqi.project02.demo05_database.code01_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.* ;
import java.net.* ;

public class QQMain extends JFrame implements ActionListener{
	JTextField txtMess = new JTextField() ;
	JComboBox cmbUser = new JComboBox() ;
	JTextArea txtContent = new JTextArea() ;
	private Socket s ;
	public void setSocket(Socket value){
		s = value ;
	}
	QQMain(){
		this.setSize(300 , 400) ;
		
		//new���
		JButton btnSend = new JButton("����") ;
		
		JScrollPane spContent = new JScrollPane(txtContent) ;
		
		//ע���¼�����
		btnSend.addActionListener(this) ;
		
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
		this.setLayout(new BorderLayout()) ;
		
		this.add(panBig , BorderLayout.NORTH) ;
		this.add(spContent , BorderLayout.CENTER) ;

		//�������¼
		try{
			File f = new File("c:/work/�����¼.qq") ;
			
			FileReader fr = new FileReader(f) ;
			BufferedReader br = new BufferedReader(fr) ;
			
			while(br.ready()){
				txtContent.append(br.readLine()+"\n") ;
			}
		}catch(Exception e){}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// txtMess -------> txtContent
		txtContent.append(txtMess.getText()+"\n") ;
		
		// ��txtMess�����ݴ��������¼�ļ�
		try{
			File f = new File("c:/work/�����¼.qq") ;
			
			FileWriter fw = new FileWriter(f) ;
			PrintWriter pw = new PrintWriter(fw) ;
			
			pw.println(txtMess.getText()) ;
			
			pw.close() ;
		}catch(Exception e){}
		
		//������Ϣ��������
		try{
			OutputStream os = s.getOutputStream() ; 
			OutputStreamWriter osw = new OutputStreamWriter(os) ;
			PrintWriter pw = new PrintWriter(osw , true) ;
			
			pw.println(txtMess.getText()) ;
		}catch(Exception e){}

		// ���txtMess�е�����
		txtMess.setText("") ;		
	}
}