package com.yanqi.project03.demo02_Linkednotepad;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyLinkedNote {
	public static void main(String args[]){
		JFrame w = new JFrame() ;
		w.setSize(300, 400);

		MyPanel mp = new MyPanel();
		w.add(mp);

		w.addKeyListener(mp);
		mp.addKeyListener(mp);

		w.setVisible(true);
	}
}

class MyPanel extends JPanel implements KeyListener {
	Node firstNode = new Node() ;//�����һ���ڵ�
	Node nowNode = firstNode ;//��ǰ�ڵ�
	int cursor = 0 ;
	public void paint(Graphics g) {
		super.paint(g);
		//����ÿ���ڵ�
		//��������ʱ������Node���͵ģ��������ܹ�ָ��ÿ���ڵ�
		Node tmpNode = firstNode ;
		int x = 0 ;//��Ҫ����x����
		while(tmpNode.next!=null){//���һ���ڵ��next��null
			g.drawString(""+tmpNode.next.value, 10+x*8, 10) ;
			x ++ ;
			//��tmpNode�������������ƶ�
			tmpNode = tmpNode.next ;
		}
		
		//��ʾ���
		g.drawLine(10+cursor*8, 0, 10+cursor*8, 10) ;
	}

	@Override
	public void keyPressed(KeyEvent e) {
	   if(e.getKeyCode()>=KeyEvent.VK_A&&e.getKeyCode()<=KeyEvent.VK_Z) {
			if(nowNode.next==null){//ĩβ��׷��ģʽ
				Node newNode = new Node() ;
				newNode.value = e.getKeyChar() ;
				nowNode.next = newNode ;
				nowNode = newNode ;
				cursor ++ ;
			}else {
				//1�������½ڵ�
				Node newNode = new Node() ;
				//2����ֵ
				newNode.value = e.getKeyChar() ;
				//3�����½ڵ��nextָ����һ���ڵ�
				newNode.next = nowNode.next ;
				//4���õ�ǰ�ڵ��nextָ���½ڵ�
				nowNode.next = newNode ;
				//5��ά��nowNode�͹��
				nowNode = newNode ;
				cursor ++ ;
			}		
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if(cursor>0){
				cursor -- ;
				//�ӵ�һ���ڵ㿪ʼ���ҵ���ǰ�ڵ��ǰһ���ڵ�
				Node tmpNode = firstNode ;
				while(tmpNode.next!=nowNode){//˼��һ��ѭ������
					tmpNode = tmpNode.next ;
				}
				nowNode = tmpNode ;//�޸�nowNode��ֵ
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if(nowNode.next!=null){//˼����Χ����
				cursor ++ ;
				nowNode = nowNode.next ;
			}
		}
		if(e.getKeyCode()==KeyEvent.VK_DELETE){
			if(nowNode.next!=null){
				nowNode.next = nowNode.next.next ;
			}		
		}
		repaint();
	}
	
	public void keyReleased(KeyEvent arg0) {
	}
	
	public void keyTyped(KeyEvent arg0) {
	}
}

class Node {
	public char value = ' ';
	public Node next = null ;
}