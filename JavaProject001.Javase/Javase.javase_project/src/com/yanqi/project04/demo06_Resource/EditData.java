package com.yanqi.project04.demo06_Resource;/*
 * 
 * EditData�࣬�ṩ�½���ɾ�����޸ĵĹ���
 * 
 */
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class EditData extends JFrame implements ActionListener {
	ArrayList<JLabel> colName = new ArrayList<JLabel>();
	ArrayList<JTextField> values = new ArrayList<JTextField>();
	HashMap<String, String> data;
	private String database;
	private String table;
	private int x;
	private int y;
	private int width;
	private int height;
	boolean nu = true;// ������½������޸ģ�true���޸ģ�false���½�

	EditData(String database, String table, int x, int y, int width,
			int height, int width2, HashMap<String, String> data) {
		// ����������ת��
		this.database = database;
		this.table = table;
		this.data = data;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		// �趨������ʾλ��
		this.setLocation(x, y + height);

		// ���ݴ����ȣ�����ÿ���ܹ����ŵ���Ŀ��,ÿ�����ṩ��200�����ص�
		int cols = (width + width2) / 200;

		// ������Ҫ�����ܹ���ʾȫ����Ŀ
		int rows = 0;
		if (data.size() % cols == 0) {// ���������������
			rows = data.size() / cols;
		} else {
			rows = data.size() / cols + 1;
		}
		// ���㴰��ĸ߶�Ϊ��ÿ��15�����ص㣬�����·���ť��100�����ص�
		int h = rows * 15 + 100;
		this.setSize(width + width2, h);

		// ѭ��new��JLabel
		for (String col : data.keySet()) {
			JLabel l = new JLabel(col);
			colName.add(l);
		}

		// ѭ��new JTextField
		for (String v : data.values()) {
			JTextField f = new JTextField(v);
			values.add(f);
		}

		// new���ܰ�ť
		JButton btnNew = new JButton("���");
		JButton btnDelete = new JButton("ɾ��");
		JButton btnSave = new JButton("����");

		// ע���¼�����
		btnNew.addActionListener(this);
		btnDelete.addActionListener(this);
		btnSave.addActionListener(this);

		// ��ť����
		JPanel panButton = new JPanel();
		panButton.setLayout(new GridLayout(1, 3));

		panButton.add(btnNew);
		panButton.add(btnDelete);
		panButton.add(btnSave);

		// ����򲼾�
		JPanel panInput = new JPanel();
		panInput.setLayout(new GridLayout(rows, cols));

		// ����ǩ������������һ��С������У��������߲���һ��
		for (int i = 0; i < data.size(); i++) {
			JPanel p = new JPanel();
			p.setLayout(new GridLayout(1, 2));
			p.add((JLabel) colName.get(i));
			p.add((JTextField) values.get(i));

			panInput.add(p);
		}

		this.setLayout(new BorderLayout());

		this.add(panInput, BorderLayout.CENTER);
		this.add(panButton, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals("���")) {
			// ������Ե������
			nu = false;
			for (JTextField txt : values) {
				txt.setText("");
			}
		}
		if (arg0.getActionCommand().equals("ɾ��")) {
			try {
				// ƴ��SQL���
				String SQLStr = "delete from " + table;
				SQLStr += " where 1=1 ";
				for (String col : data.keySet()) {
					SQLStr += " and " + col + "='";
					SQLStr += changCode(data.get(col).toString()) + "' ";
				}

				// ����SQLָ��
				Connection cn = DataBase.getConnection(database);
				Statement st = cn.createStatement();
				st.executeUpdate(SQLStr);

				review();
			} catch (Exception e) {
			}
		}
		if (arg0.getActionCommand().equals("����")) {
			if (nu) {
				// �޸�
				try {
					// ƴ��SQL���
					String SQLStr = "update " + table + " set ";
					for (int i = 0; i < colName.size(); i++) {
						SQLStr += colName.get(i).getText() + "='";
						SQLStr += changCode(values.get(i).getText());
						SQLStr += "',";
					}
					SQLStr = SQLStr.substring(0, SQLStr.length() - 1);// ȥ������һ������
					SQLStr += " where 1=1 ";
					for (String col : data.keySet()) {
						if (data.get(col) != null) {
							SQLStr += " and " + col + "='";
							SQLStr += changCode(data.get(col).toString()) + "' ";
						}
					}

					System.out.println(SQLStr);

					// ����SQLָ��
					Connection cn = DataBase.getConnection(database);
					Statement st = cn.createStatement();
					st.executeUpdate(SQLStr);

					review();

				} catch (Exception e) {
				}
			} else {
				// �½�
				try {
					// ƴ��SQL���
					String SQLStr = "insert into " + table + "(";
					for (String col : data.keySet()) {
						SQLStr += col + ",";
					}
					SQLStr = SQLStr.substring(0, SQLStr.length() - 1);// ȥ������һ������
					SQLStr += ") values(";
					for (JTextField txt : values) {
						SQLStr += "'" + txt.getText() + "',";
					}
					SQLStr = SQLStr.substring(0, SQLStr.length() - 1);// ȥ������һ������
					SQLStr += ")";

					// ����SQLָ��
					Connection cn = DataBase.getConnection(database);
					Statement st = cn.createStatement();
					st.executeUpdate(SQLStr);

					review();
				} catch (Exception e) {
				}
			}
		}
	}

	public void review() {
		this.setVisible(false);
		ShowTable.w.setVisible(false);
		ShowTable.w = new ShowData(database, table, x, y, width, height);
		ShowTable.w.setVisible(true);
	}
	public String changCode(String s) {
		String ss ="";
		try{
			ss =  new String(s.getBytes("gb2312") , "iso-8859-1") ;
		}catch(Exception e){}
		return ss ;
	}
}