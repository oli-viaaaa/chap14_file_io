package com.javalab.fileio.pkg03;

import java.io.*; // java.io 패키지 내에 있는 모든 클래스를 import함
//import java.io.BufferedReader;
//import java.io.FileReader;

/*
 * BufferedReader 보조 스트림 예제
 * 	- 문자 입출력 스트림으로 문자의 기본 스트림인 FileReader가 필요함.
 * 	- 문자를 2byte씩 읽어들임.
 * 상대 경로 : 현재의 프로젝트를 중심으로 한 경로
 */

public class BufferedReaderEx2 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 하드디스크 상의 실제 파일을 다룰 자바 프로그램 상의 파일 객체 생성
			File file = new File("src/com/javalab/fileio/pkg03/BufferedReaderEx2.java"); // 파일 객체 생성(상대경로)
			// Fire을 받아서 문자를 읽어들이는 FileReader 생성
			fr = new FileReader(file);
			// FileReader의 성능 향상을 위해 BufferedReader 보조 스트림 연결
			br = new BufferedReader(fr);
			
			int lineNo = 1;
			while (true) {
				String str = br.readLine(); // 한 행을 읽어들임.
				if (str == null) break;
				System.out.println(lineNo + "\t"+ str);
				lineNo++;
			}
			//BufferedReader 닫음 -> FileReader도 같이 닫힘.
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
