package chap02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example1a {
	
	public static void generateCharacters(OutputStream out) throws IOException {
		int firstPrintableCharacter = 33;
		int lastPrintableCharacter = 126;
		
		for(int ch = firstPrintableCharacter; ch <= lastPrintableCharacter; ch++)
			out.write(ch); //void write(int b)-�� ����Ʈ�� ����Ѵ�.
		
		out.write('\r'); //CR, carriage return �ٹٲ� ����
		out.write('\n'); //LF, line feed �ٹٲ� ����
	}
	
	public static void main(String[] args) throws IOException {
		generateCharacters(System.out); //up casting:�ڽ� Ŭ���� Ÿ���� ��ü�� �θ� Ŭ���� Ÿ���� ������ �����ϴ� ��. 
		//������ �θ�Ÿ���� ������ ����ϴ� ���� �ٶ����ϴ�. �׷��� ������ ȣ���� ����.
		//System.out�� PrintStream�� ��ü��, �ֿܼ� ��µȴ�. PrintStream�� OutputStreamŬ������ �ڽ� Ŭ�����̴�.
		generateCharacters(new FileOutputStream("D:/programming/java/2021_2_Network/test.txt"));//�����Ͱ� ���Ͽ� ��µȴ�
	}
}
