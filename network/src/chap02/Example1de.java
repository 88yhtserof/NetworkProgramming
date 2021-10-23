package chap02;

import java.io.IOException;
import java.io.OutputStream;

public class Example1de {
	
	public static void generateCharacters(OutputStream out) throws IOException {
		int firstPrintableCharacter = 33;
		int lastPrintableCharacter = 126;
		for(int ch = firstPrintableCharacter; ch <= lastPrintableCharacter; ++ch)
			out.write(ch); //void write(int b)- �� ����Ʈ�� ���/
		out.write('\r');
		out.flush(); //��� ���ۿ� ������ ���� ����Ѵ�.
		out.close();//�� �̻� ��Ʈ���� ������� �ʴ´ٸ� ��Ʈ���� �ݴ´�.
		
		/*
		 * flush()
		 * write�޼���� �ٷ� ����ϴ� ���� �ƴ϶� ��� ���ۿ� ��Ƶξ��ٰ� ����Ѵ�. ���� ��� ���۰� �� ���� ������ ������ ��µ��� �ʴ´�.
		 * ���� ���������� \n�� ��� ���۸� �� ä���� ������ ������ ��µǾ�����, ���⼭�� \n�� ���⿡ ��� ���۰� �� ���� �ʾ� ��µ��� ���� ���·� �����ϰ� �ȴ�.
		 * ���� OutputStream Ŭ������ flush �޼��带 ����� ��� ������ ������ ���� ����Ѵ�.
		 * 
		 * close�� �� �ڵ����� flush�Ǵ� ��쵵 ������, ��Ʈ��ũ ��� ��� ��Ʈ�� �߿� �� close �ϱ� �� flush�� �ؾ��ϴ� ��� ��Ʈ���� ������
		 * close�ϱ� ���� �� flush�ϴ� ������ ������.
		 */
	}
}
