package chap02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example1a {
	
	public static void generateCharacters(OutputStream out) throws IOException {
		int firstPrintableCharacter = 33;
		int lastPrintableCharacter = 126;
		
		for(int ch = firstPrintableCharacter; ch <= lastPrintableCharacter; ch++)
			out.write(ch); //void write(int b)-한 바이트씩 출력한다.
		
		out.write('\r'); //CR, carriage return 줄바꿈 문자
		out.write('\n'); //LF, line feed 줄바꿈 문자
	}
	
	public static void main(String[] args) throws IOException {
		generateCharacters(System.out); //up casting:자식 클래스 타입의 객체를 부모 클래스 타입의 변수에 대입하는 것. 
		//가급적 부모타입의 변수를 사용하는 것이 바람직하다. 그래야 다형성 호출이 가능.
		//System.out은 PrintStream의 객체로, 콘솔에 출력된다. PrintStream은 OutputStream클래스의 자식 클래스이다.
		generateCharacters(new FileOutputStream("D:/programming/java/2021_2_Network/test.txt"));//데이터가 파일에 출력된다
	}
}
