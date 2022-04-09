/*
java 프로그래밍 기초 6주차 예제 6
1. Book 클래스를 활용하여, Book 객체 배열(size=2) 생성
2. 사용자에게 책 제목과 저자를 입력받음
3. Book 객체 배열 각 멤버 내용 출력
*/

class Book {
	// 책 제목과 저자 필드 생성
	String title;
	String author;
	
	// 파라미터가 2개인 생성자
	public Book(String title, String author) {
		this.title = title; 
		this.author = author;
	}
}
