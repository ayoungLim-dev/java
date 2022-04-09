/*
java 프로그래밍 기초 6주차 예제 6
1. Book 클래스를 활용하여, Book 객체 배열(size=2) 생성
2. 사용자에게 책 제목과 저자를 입력받음
3. Book 객체 배열 각 멤버 내용 출력
*/
import java.util.Scanner;

public class BookArray {
	public static void main(String[] args) {
		Book[] book=new Book[2]; // 값이 2개인 book 객체 배열 생성
		
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		
		//for 문을 이용해 Book배열의 길이(=2)만큼 사용자에게 책 제목과 저자 묻기
		for(int i=0;i<book.length;i++) { 
			System.out.print("제목 :");
			String title = scanner.nextLine(); // 제목이나 이름에 공백이 들어 있을 수 있기 때문에 공백이 포함된 문장 전체를 읽기 위해 nextLine으로 받음
			System.out.print("저자 :");
			String author = scanner.nextLine(); // 제목이나 이름에 공백이 들어 있을 수 있기 때문에 공백이 포함된 문장 전체를 읽기 위해 nextLine으로 받음
			book[i] = new Book(title, author); // 입력 받은 title과 author을 book 배열에 저장
		}
		
		for(int i=0;i<book.length;i++)
			System.out.println("("+book[i].title+", "+book[i].author+")");
		
		scanner.close(); // 스캐너 객체 닫기 
	}
}
