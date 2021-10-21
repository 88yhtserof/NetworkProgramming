package chap02;

import java.io.IOException;
import java.io.OutputStream; //��� ��� ��Ʈ���� �θ� Ŭ�����̴�.

public class Example1b {

	public static void generateCharacters(OutputStream out) throws IOException {
		int firstPrintableCharacter = 33;
		int lastPrintableCharacter = 126;
		int size = (lastPrintableCharacter - firstPrintableCharacter + 1) + 2; //�ٹٲ� ���� 2�� ����
		byte[] a = new byte[size];
		
		int index = 0;
		for(int ch = firstPrintableCharacter; ch <= lastPrintableCharacter; ch++)
			a[index++] = (byte)ch; //byte�� ����ȯ
		//�ٹٲ� ���ڴ� ���� ����
		a[index++] = '\r'; //CR
		a[index++] = '\n'; //LF
		
		out.write(a); //void write(byte[])-byte �迭�� a�� ����Ѵ�.
	}
	
	public static void main(String[] args) throws IOException {
		generateCharacters(System.out); 
		//SystemŬ������ out ��������� PrintStream�� ��ü�̴�. PrintStream�� OutputStreamŬ������ �ڽ� Ŭ�����̴�.
	}
}