package com.yanqi.project03.demo11_synchronous;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.* ;
import java.net.* ;
import java.awt.event.*;

public class QQMain extends JFrame implements ActionListener , Runnable, WindowListener{
	JTextField txtMess = new JTextField() ;
	JComboBox cmbUser = new JComboBox() ;
	JTextArea txtContent = new JTextArea() ;
	private Socket s ;
	public void setSocket(Socket value){
		s = value ;
		
		//�����߳�
		Thread t = new Thread(this) ;
		t.start() ;
	}
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
			
			pw.println(txtMess.getText()) ;
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
				}			}
		}catch(Exception e){}
	}

	/**
	 * Method windowOpened
	 *
	 *
	 * @param e
	 *
	 */
	public void windowOpened(WindowEvent e) {
		// TODO: Add your code here
	}

	/**
	 * Method windowClosing
	 *
	 *
	 * @param e
	 *
	 */
	public void windowClosing(WindowEvent e) {
		try{
			OutputStream os = s.getOutputStream() ;
			OutputStreamWriter osw = new OutputStreamWriter(os) ;
			PrintWriter pw = new PrintWriter(osw , true) ;
			
			pw.println("{exit}") ;

			//�����˳�
			System.exit(0) ;
		}catch(Exception ex){}
	}

	/**
	 * Method windowClosed
	 *
	 *
	 * @param e
	 *
	 */
	public void windowClosed(WindowEvent e) {
		// TODO: Add your code here
	}

	/**
	 * Method windowIconified
	 *
	 *
	 * @param e
	 *
	 */
	public void windowIconified(WindowEvent e) {
		// TODO: Add your code here
	}

	/**
	 * Method windowDeiconified
	 *
	 *
	 * @param e
	 *
	 */
	public void windowDeiconified(WindowEvent e) {
		// TODO: Add your code here
	}

	/**
	 * Method windowActivated
	 *
	 *
	 * @param e
	 *
	 */
	public void windowActivated(WindowEvent e) {
		// TODO: Add your code here
	}

	/**
	 * Method windowDeactivated
	 *
	 *
	 * @param e
	 *
	 */
	public void windowDeactivated(WindowEvent e) {
		// TODO: Add your code here
	}
}