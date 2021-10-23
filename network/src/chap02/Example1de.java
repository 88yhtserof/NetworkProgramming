package chap02;

import java.io.IOException;
import java.io.OutputStream;

public class Example1de {
	
	public static void generateCharacters(OutputStream out) throws IOException {
		int firstPrintableCharacter = 33;
		int lastPrintableCharacter = 126;
		for(int ch = firstPrintableCharacter; ch <= lastPrintableCharacter; ++ch)
			out.write(ch); //void write(int b)- 한 바이트를 출력/
		out.write('\r');
		out.flush(); //출력 버퍼에 내용을 강제 출력한다.
		out.close();//더 이상 스트림을 사용하지 않는다면 스트림을 닫는다.
		
		/*
		 * flush()
		 * write메서드는 바로 출력하는 것이 아니라 출력 버퍼에 모아두었다가 출력한다. 따라서 출력 버퍼가 다 차지 않으면 실제로 출력되지 않는다.
		 * 이전 예제에서는 \n이 출력 버퍼를 다 채웠기 때문에 실제로 출력되었지만, 여기서는 \n이 없기에 출력 버퍼가 다 차지 않아 출력되지 않은 상태로 종료하게 된다.
		 * 따라서 OutputStream 클래스의 flush 메서드를 사용해 출력 버퍼의 내용을 강제 출력한다.
		 * 
		 * close될 때 자동으로 flush되는 경우도 있지만, 네트워크 통신 출력 스트림 중에 꼭 close 하기 전 flush를 해야하는 출력 스트림도 있으니
		 * close하기 전에 꼭 flush하는 습관을 들이자.
		 */
	}
}
