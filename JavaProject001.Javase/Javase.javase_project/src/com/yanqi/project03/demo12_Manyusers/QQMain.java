package com.yanqi.project03.demo12_Manyusers;/*
 * QQMain��������
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class QQMain extends JFrame implements ActionListener , Runnable , WindowListener{
	private Socket s ;
	public void setSocket(Socket value){
		s = value ;
		//���������߳�
		Thread t = new Thread(this) ;
		t.start() ;
	}
	JTextField txtMess = new JTextField() ;
	JComboBox cmbUser = new JComboBox() ;
	JTextArea txtContent = new JTextArea() ;
	
	QQMain(){
		this.setSize(300 , 400) ;
		
		//new���
		JButton btnSend = new JButton("����") ;
		
		JScrollPane spContent = new JScrollPane(txtContent) ;
		
		//ע���¼�����
		btnSend.addActionListener(this) ;
		this.addWindowListener(this) ;
		
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
			
			pw.println(cmbUser.getSelectedItem()+"%"+txtMess.getText()) ;
		}catch(Exception e){}
		
		// ���txtMess�е�����
		txtMess.setText("") ;
	}
	
	//�����߳�
	public void run() {
		try{
			InputStream is = s.getInputStream() ;
			InputStreamReader isr = new InputStreamReader(is) ;
			BufferedReader br = new BufferedReader(isr) ;
			
			while(true){
				String message = br.readLine() ;
				String type = message.split("%")[0] ;
				String mess = message.split("%")[1] ;
				if(type.equals("add")){
					cmbUser.addItem(mess) ;
				}
				if(type.equals("exit")){
					cmbUser.removeItem(mess) ;
				}
				if(type.equals("mess")){
					txtContent.append(mess+"\n") ;
				}
			}
		}catch(Exception e){}
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		try{
			OutputStream os = s.getOutputStream() ;
			OutputStreamWriter osw = new OutputStreamWriter(os) ;
			PrintWriter pw = new PrintWriter(osw , true) ;
			
			pw.println("{exit}") ;
			
			//�����˳�
			System.exit(0) ;
		}catch(Exception e){}
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}