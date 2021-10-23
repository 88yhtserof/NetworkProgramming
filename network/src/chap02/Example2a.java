package chap02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2a {
	public static void fileCopy(String sourceFile, String targetFile) throws IOException {
		FileInputStream in = new FileInputStream(sourceFile); //파일에서 데이터를 읽어오는 입력 스트림 객체 생성
		FileOutputStream out = new FileOutputStream(targetFile); //파일에 데이터를 쓰는 출력 스트림 객체 생성
		byte[] a = new byte[1024];

		while(true) {
			int count = in.read(a); //입력스트림에서 데이터를 읽고, 읽은 데이터를 배열 a에 저장한다.그 후 읽은 데이터의 개수를 반환한다. 파일
			if(count < 0) break; //입력 스트림의 끝을 만나면, 즉 읽을 데이터가 없으면 -1을 반환한다.

			out.write(a, 0, count); //배열 a의 인덱스 0부터 count 길이만큼 출력 스트림에 출력한다. 파일
		}
		/*
		입출력 스트림을 사용한 후 반드시 close해야한다.
		close를 하지 않으면:
		-출력 버퍼에 남아있는 데이터가 출력되지 않을 수 있다. -> 대다수의 스트림이 close 시 버퍼 내용을강제 출력해주는 flush가 자동으로 되기 때문
		-반납되지 않은 시스템 자원이 쌓여 시스템이 무거워지고 느려질 수 있다.
		-반납되지 않은 시스템 자원이 쌓여 자원 부족 에러가 발생할 수 있다.
		*/
		in.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		fileCopy("d:/programming/java/2021_2_Network/a.txt", "d:/programming/java/2021_2_Network/b.txt");
	}
}
