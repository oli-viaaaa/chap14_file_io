package com.javalab.fileio.pkg03;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.stream.Stream;

/*
 * FileReader + BufferedReader 사용
 * 읽어들인 데이터를 Stream<E> 스트림 저장해서 처리
 */

public class FileReaderStream {
	public static void main(String[] args) throws IOException {

		Path path = Paths.get("src/com/javalab/fileio/pkg03/linedata.txt"); // Path 경로
		Stream<String> stream;

		// File 객체가 반환됨
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		// 메모리 버퍼를 통해서 읽어들이는 신무기 장착(FileReader 필요함)
		BufferedReader br = new BufferedReader(fileReader);

		// BufferedReader의 lines() 메소드 이용해서 읽어들이고 Stream<String>에 저장
		stream = br.lines();

		// Stream 반복
		stream.forEach(System.out::println);
		// stream.forEach(s -> {System.out.println(s);});
		// stream.forEach(s -> System.out.println(s));

		// Stream 반납
		stream.close();

	}

}
