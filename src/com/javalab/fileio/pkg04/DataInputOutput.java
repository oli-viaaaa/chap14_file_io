package com.javalab.fileio.pkg04;

import java.io.*;

/*
 * DataInputOutputStream
 * 	- 기본형 데이터를 좀더 편리하게 읽고 쓸 수 있습니다.
 */

public class DataInputOutput {
	public static void main(String[] args) throws Exception{
		// DataOutputStream 생성
		File file = new File("c:/filetest/primitive.db");
		//FileOutputStream 생성
		FileOutputStream fos = new FileOutputStream(file);
		// FileOutputStream을 기반으로 기본형 자료를 좀 더 편리하게 읽고 쓰기 위함.
		DataOutputStream dos = new DataOutputStream(fos);
		
		// 기본 타입 출력
		dos.writeUTF("홍길동"); // UTF-8 형식으로 인코딩하여 문자열 출력
		dos.writeDouble(95.5);
		dos.writeInt(1);

		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); // 잔류데이터 전부 사용
		dos.close();
		fos.close();
		
		// DataInputStream 생성
		FileInputStream fis = new FileInputStream("c:/filestest/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		// 기본 타입 입력
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF();// UTF-8 형식으로 코딩된 문자열 출력
			double score = dis.readDouble(); // double type 읽기
			int order = dis.readInt(); // int type 읽기
			System.out.println(name + " : " +score+" : " +order);
		}
		
		dis.close();
		fis.close();

	}

}
