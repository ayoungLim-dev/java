// java 프로그래밍 4주차 예제 4

public class Book {

	String title;
	String author;
	
	public Book() { //매개변수 없는 생성자
		title = "제목없음"; author = "작자미상";
	}
	
	public Book(String t) { //매개변수가 하나인 생성자
		title = t; author = "작자미상";		
	}
	
	public Book(String t, String a) { //매개변수가 두 개인 생성자		
		title = t; author = a;
	}
	
	public static void main(String[] args) {
		Book noTitle = new Book(); // 첫 번째 생성자 실행
		Book littlePrince = new Book("어린왕자", "생텍쥐페리"); // 세 번째 생성자 실행
		Book loveStory = new Book("춘향전"); // 두 번째 생성자 실행
		System.out.println(noTitle.title+" "+noTitle.author);
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
	}
}
