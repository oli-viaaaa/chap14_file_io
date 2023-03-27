package com.javalab.fileio.pkg03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 *  문자 입출력 FileReader, BufferedReader 클래스
 *  	- 문자를 2byte씩 읽어들임.
 */

public class BufferedReaderEx1 {
	public static void main(String[] args) {
		try {
			File file = new File("c:/filetest/1234.txt"); // 파일 객체 생성(절대 경로 [:/] 는 사용의 어려움이 있음)
			FileReader fr = new FileReader(file); // 장자인 파일리더에게 파일 정보 전달
			BufferedReader br = new BufferedReader(fr); // 파일을 읽어들이는 속도가 빨리짐
			
			/*String line = "";
			for (int i = 1;(line = br.readLine())!=null; i++) {
				System.out.println(i+":"+line);
			}
			*/
			
			int lineNo = 1;
			while (true) { // 파일 내용 끝까지 읽어들임
				String str = br.readLine(); // readLine 한 행을 읽어들임
				if(str == null) break; // 읽을 내용이 없을시 while문 종료
				System.out.println(lineNo + "\t" + str);
				lineNo++;
			}
			br.close(); 
		} catch (IOException e) {}

	} // main end

} // class end
