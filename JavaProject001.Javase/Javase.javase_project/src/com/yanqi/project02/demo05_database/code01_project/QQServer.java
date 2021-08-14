package com.yanqi.project02.demo05_database.code01_project;/*
 * QQServer���������˴���
 */

import java.net.*;
import java.io.*;
import java.sql.*;

public class QQServer {
	public static void main(String[] args) {
		try {
			// ��������8000�˿ڼ���
			ServerSocket ss = new ServerSocket(8000);

			System.out.println("����������8000�˿ڼ���......");
			Socket s = ss.accept();

			// �����û���������
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String uandp = br.readLine();

			// �����
			System.out.println(uandp);

			// ����û���������
			String u = uandp.split("%")[0];
			String p = uandp.split("%")[1];

			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw, true);
			
			//�����ݿ�����֤�û����
			Class.forName("org.gjt.mm.mysql.Driver") ;
			Connection cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/qq","root","123456") ;
			PreparedStatement ps = cn.prepareStatement("select * from user where username=? and password=?") ;
			ps.setString(1, u) ;
			ps.setString(2, p) ;
			
			ResultSet rs = ps.executeQuery() ;
			
			if (rs.next()) {
				// ������ȷ��Ϣ���ͻ���
				pw.println("ok");

				//���ϵؽ��տͻ��˷��͹�������Ϣ
				while (true) {
					String message = br.readLine();
					System.out.println(message);
				}
			} else {
				// ���ʹ�����Ϣ���ͻ���
				pw.println("err");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}