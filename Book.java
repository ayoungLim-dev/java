// java ���α׷��� 4���� ���� 4

public class Book {

	String title;
	String author;
	
	public Book() { //�Ű����� ���� ������
		title = "�������"; author = "���ڹ̻�";
	}
	
	public Book(String t) { //�Ű������� �ϳ��� ������
		title = t; author = "���ڹ̻�";		
	}
	
	public Book(String t, String a) { //�Ű������� �� ���� ������		
		title = t; author = a;
	}
	
	public static void main(String[] args) {
		Book noTitle = new Book(); // ù ��° ������ ����
		Book littlePrince = new Book("�����", "�������丮"); // �� ��° ������ ����
		Book loveStory = new Book("������"); // �� ��° ������ ����
		System.out.println(noTitle.title+" "+noTitle.author);
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
	}
}
