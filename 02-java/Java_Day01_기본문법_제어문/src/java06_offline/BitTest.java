package java06_offline;

public class BitTest {
	
	public static void main(String[] args) {
//		byte i = 5;
		{
			byte i = 5; // 00010100
			byte j = 3; // 00000011
						// 00000111 
			System.out.println(i|j); // 7
			System.out.println(i&j); // 1  특정 비트가 설정되어 있는지 판단
			System.out.println(i << 2); // 20 00000101 -> 00010100
			
			byte a = 5;
			a |= 2;
			
			byte b = 5;
			b &= 2;
		}
		int x = 300;
		
		// 00000101
		// 음수로 변환
		// 비트 반전(0을 1로, 1을 0으로)
		// 반전된 비트 값에 1을 더한다.
		// 11111010 비트 반전
		
		// 01111111
		// 10000000
		// 128
//		byte b = 127;
//		System.out.println(~b);
//		
//		byte j = 2;
//		// 00000010
//		
//		System.out.println(~i);
		
		
	}

}
