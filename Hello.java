package kr.ac.bu;

// Hello 클래스 선언
public class Hello {

	// print() 메서드
	public void print(String name) {
		System.out.println("Hello, " + name);
	}

	// 진입 메서드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello hello = new Hello(); // new 키워드를 사용해 객체 생성
		hello.print("Java!");
	}

}
