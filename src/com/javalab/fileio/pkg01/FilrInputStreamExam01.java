package com.javalab.fileio.pkg01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * FilrInputStream 예제
 * 	- 1byte 단위로 데이터 읽어들임.
 */

public class FilrInputStreamExam01 {
	public static void main(String[] args) {
		// FileInputStream을 try문 밖으로 뺌.
		FileInputStream fis = null;
		try {
			// 자바 프로그램에서 사용할 파일 객체 생성
			// File 객체의 생성자에 "파일이 위치한 경로와 파일명 전달"
			File file = new File("c:/filetest/123.txt");

			// 파일을 읽어들이는 기본 클래스인 FileInputStream 객체를 생성
			// FileInputStream 생성자에 위에서 만든 file 객체 전달
			// InputStream is = new FileInputStream(file); //읽어들이는 빨대가 파일에 꽂힘
			fis = new FileInputStream(file); // 읽어들이는 빨대가 파일에 꽂힘

			while (true) {
				int data = fis.read();
				if (data == -1)
					break;
				System.out.print((char) data); // char type로 형변환

			}
			// 자원종료
			// is.close();

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
