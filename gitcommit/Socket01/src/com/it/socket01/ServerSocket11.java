package com.it.socket01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocket11 {

	public static void main(String[] args) {
		ServerSocket ss;
		try {
			ss = new ServerSocket(8888);
		
		System.out.println("111");
		Socket s = ss.accept();
		System.out.println("serverOk");
		InputStream is = s.getInputStream();
		FileOutputStream fos=new FileOutputStream ("E:\\Tomcat\\fileObject\\t11.txt");
		int len=0;
		byte[] b=new byte[1024];
		while((len=is.read(b))!=-1){
			System.out.println("len:"+len);
			fos.write(b, 0, len);
			
		}
		System.out.println(1122);
		//回馈信息
		OutputStream os = s.getOutputStream();
		os.write("上传成功！".getBytes());
		System.out.println("over");
		os.close();
		fos.close();
		s.close();
		ss.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
