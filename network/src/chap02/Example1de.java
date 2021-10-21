package chap02;

import java.io.IOException;
import java.io.OutputStream;

public class Example1de {
	
	public static void generateCharacters(OutputStream out) throws IOException {
		int firstPrintableCharacter = 33;
		int lastPrintableCharacter = 126;
		for(int ch = firstPrintableCharacter; ch <= lastPrintableCharacter; ++ch)
			out.write(ch); //void write(int b)- 한 바이트를 출력/
		ou
	}
}
