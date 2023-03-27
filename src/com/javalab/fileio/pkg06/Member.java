package com.javalab.fileio.pkg06;

import java.io.Serializable;

////*
//* 직렬화용 Member 클래스
//*- 자바에서는 Serializable 인터페이스를 구현한 클래스만 직렬화가 가능
// *  - 직렬화 대상은 (인스턴스 필드)만으로 제한됨.
// *  - 이클립스가 자동으로 serialVersionUID 생성해줄 수도 있다.
// *    개발자가 안만들면 컴파일러가 컴파일 타임에 만들어서 바이트 코드에 넣어줌.
//*/

public class Member implements Serializable {
   // 직렬화 역직렬화시 같은 클래스 타입이라는 것을 증명해주는 역할
   //private static final long serialVersionUID = -622284561026719240L;
   
   private String id;
   private String name;
   
   public Member(String id, String name) {
      this.id = id;
      this.name = name;
   }
      
   @Override
   public String toString() { return id + ": " + name; }
}