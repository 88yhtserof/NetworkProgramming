package chap02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2a {
	public static void fileCopy(String sourceFile, String targetFile) throws IOException {
		FileInputStream in = new FileInputStream(sourceFile); //���Ͽ��� �����͸� �о���� �Է� ��Ʈ�� ��ü ����
		FileOutputStream out = new FileOutputStream(targetFile); //���Ͽ� �����͸� ���� ��� ��Ʈ�� ��ü ����
		byte[] a = new byte[1024];

		while(true) {
			int count = in.read(a); //�Է½�Ʈ������ �����͸� �а�, ���� �����͸� �迭 a�� �����Ѵ�.�� �� ���� �������� ������ ��ȯ�Ѵ�. ����
			if(count < 0) break; //�Է� ��Ʈ���� ���� ������, �� ���� �����Ͱ� ������ -1�� ��ȯ�Ѵ�.

			out.write(a, 0, count); //�迭 a�� �ε��� 0���� count ���̸�ŭ ��� ��Ʈ���� ����Ѵ�. ����
		}
		/*
		����� ��Ʈ���� ����� �� �ݵ�� close�ؾ��Ѵ�.
		close�� ���� ������:
		-��� ���ۿ� �����ִ� �����Ͱ� ��µ��� ���� �� �ִ�. -> ��ټ��� ��Ʈ���� close �� ���� ���������� ������ִ� flush�� �ڵ����� �Ǳ� ����
		-�ݳ����� ���� �ý��� �ڿ��� �׿� �ý����� ���ſ����� ������ �� �ִ�.
		-�ݳ����� ���� �ý��� �ڿ��� �׿� �ڿ� ���� ������ �߻��� �� �ִ�.
		*/
		in.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		fileCopy("d:/programming/java/2021_2_Network/a.txt", "d:/programming/java/2021_2_Network/b.txt");
	}
}
