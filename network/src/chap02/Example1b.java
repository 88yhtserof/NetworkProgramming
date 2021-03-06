package chap02;

import java.io.IOException;
import java.io.OutputStream; //모든 출력 스트림의 부모 클래스이다.

public class Example1b {

	public static void generateCharacters(OutputStream out) throws IOException {
		int firstPrintableCharacter = 33;
		int lastPrintableCharacter = 126;
		int size = (lastPrintableCharacter - firstPrintableCharacter + 1) + 2; //줄바꿈 문자 2개 포함
		byte[] a = new byte[size];
		
		int index = 0;
		for(int ch = firstPrintableCharacter; ch <= lastPrintableCharacter; ch++)
			a[index++] = (byte)ch; //byte로 형변환
		//줄바꿈 문자는 따로 저장
		a[index++] = '\r'; //CR
		a[index++] = '\n'; //LF
		
		out.write(a); //void write(byte[])-byte 배열인 a를 출력한다.
	}
	
	public static void main(String[] args) throws IOException {
		generateCharacters(System.out); 
		//System클래스의 out 멤버변수는 PrintStream의 객체이다. PrintStream은 OutputStream클래스의 자식 클래스이다.
	}
}
