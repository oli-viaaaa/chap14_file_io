package com.javalab.fileio.pkg01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * FilrInputStream 예제
 * 	- read(byte[] b) : byte[] 배열을 통해서 한꺼번에 읽어들임. 성능이 개선됨.
 */

public class FilrInputStreamExam02 {
	public static void main(String[] args) {
		// FileInputStream을 try문 밖으로 뺌.
		FileInputStream fis = null;
		try {
			// 자바 프로그램에서 사용할 파일 객체 생성
			// File 객체의 생성자에 "파일이 위치한 경로와 파일명 전달"
			File file = new File("c:/filetest/1234.txt");

			fis = new FileInputStream(file); // 읽어들이는 빨대가 파일에 꽂힘
			
			// read() 메소드에 파라미터로 전달됨.
			byte[] data = new byte[100];
			
			while (true) {
				int num = fis.read(data); // 100byt를 한꺼번에 읽어들임. 읽은 갯수를 num에 저장
				if (num == -1) break;
				
				for (int i = 0; i < num; i++) {
					System.out.print((char) data[i]);
				}
			}
			// 자원종료
			// fis.close();

		} catch (FileNotFoundException e) { // 혹시 파일이 존재하지 않을 경우의 오류
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) { // 파일을 읽어들이다가 생길지 모르는 오류 대비(예외 처리)
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e2) {
					System.out.println("파일의 자원을 닫다가 오류남 : " + e2.getMessage());
				}
			}
		}

	}

}
