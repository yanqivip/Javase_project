package com.yanqi.project03.demo08_Copydirectory;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.* ;

public class CopyDir extends JFrame implements ActionListener , Runnable{
	JTextField txtFrom = new JTextField() ;
	JTextField txtTo = new JTextField() ;
	JTextArea txtIng = new JTextArea() ;
	
	CopyDir() {
		//���ô�������
		this.setSize(500 , 600) ;
		
		//new���
		JLabel labFrom = new JLabel("ԴĿ¼") ;
		JLabel labTo = new JLabel("Ŀ��Ŀ¼") ;
		
		JButton btnFrom = new JButton("ԴĿ¼") ;
		JButton btnTo = new JButton("Ŀ��Ŀ¼") ;
		
		JScrollPane sp = new JScrollPane(txtIng) ;
		
		JButton btnCopy = new JButton("����") ;
		
		//ע���¼�����
		btnFrom.addActionListener(this) ;
		btnTo.addActionListener(this) ;
		btnCopy.addActionListener(this) ;
		
		//�����������
		JPanel panInput = new JPanel() ;
		panInput.setLayout(new GridLayout(2 , 3)) ;
		
		panInput.add(labFrom) ;
		panInput.add(txtFrom) ;
		panInput.add(btnFrom) ;
		
		panInput.add(labTo) ;
		panInput.add(txtTo) ;
		panInput.add(btnTo) ;
		
 		//���ô���
		this.setLayout(new BorderLayout()) ;
		
		this.add(panInput , BorderLayout.NORTH) ;
		this.add(sp , BorderLayout.CENTER) ;
		this.add(btnCopy , BorderLayout.SOUTH) ;
	}
	public static void main(String[] args) {
		CopyDir w = new CopyDir() ;
		w.setVisible(true) ;
	}
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand().equals("ԴĿ¼")){
			JFileChooser fc = new JFileChooser() ;
			fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY) ;
			fc.showOpenDialog(this) ;
			File chooseFile = fc.getSelectedFile() ;
			txtFrom.setText(chooseFile.getPath()) ;
		}
		
		if(arg0.getActionCommand().equals("Ŀ��Ŀ¼")){
			JFileChooser fc = new JFileChooser() ;
			fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY) ;
			fc.showSaveDialog(this) ;
			File chooseFile = fc.getSelectedFile() ;
			txtTo.setText(chooseFile.getPath()) ;
		}		
		if(arg0.getActionCommand().equals("����")){
			Thread t = new Thread(this) ;
			t.start() ;		
		}
	}
	
	public void run(){
		copy(new File(txtFrom.getText()) , new File(txtTo.getText())) ;
	}
	
	//����Ŀ¼�ṹ
	public void copy(File from , File to) {
		String newDir = to.getPath()+"/"+from.getName() ;
		txtIng.append("���ڴ���Ŀ¼"+newDir+"...\n") ;
		File newDirFile = new File(newDir) ;
		newDirFile.mkdir() ;//����Ŀ¼
		File sub[] = from.listFiles();
		for (File s : sub) {
			if (s.isDirectory()) {
				copy(s , newDirFile) ;//�����Լ�
			}
			if (s.isFile()) {
				txtIng.append("���ڸ����ļ�"+s+"...\n") ;
				copyFile(s , new File(newDir+"/"+s.getName())) ;
			}
		}
	}
	
	//�����ļ�
	public void copyFile(File from , File to){
		try{
			FileInputStream fis = new FileInputStream(from) ;
			FileOutputStream fos = new FileOutputStream(to) ;
			
			byte[] tmp = new byte[8192] ;
			//����󲿷�����
			int length = fis.available()/8192 ;
			for (int i = 0; i < length ; i ++ ) {
				fis.read(tmp) ;
				fos.write(tmp) ;
			}
			//�������ʣ�µ�����
			int size = fis.read(tmp) ;
			fos.write(tmp, 0, size) ;
	
			fos.close() ;
		}catch(Exception e){}
	}			
}