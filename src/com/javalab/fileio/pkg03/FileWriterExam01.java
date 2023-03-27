package com.javalab.fileio.pkg03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileWriter
 * 	- Writer를 상속받은 자식 클래스
 * 	- File을 2byte씩 저장한다(쓴다).
 */

public class FileWriterExam01 {
	public static void main(String[] args) {
		try {
			File file = new File("C:/filetest/test03.txt");
			FileWriter writer = new FileWriter(file);

			int i = 1;
			while (i <= 10) {
				writer.write("This is line " + i + " of the file.\n");
				i++;
			}

			writer.close(); // 자원 반납(원칙은 finally 구문에서 처리해야함.
			System.out.println("파일에 성공적으로 저장하였습니다.");
		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

}
