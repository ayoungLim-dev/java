/*
java ���α׷��� ���� 6���� ���� 6
1. Book Ŭ������ Ȱ���Ͽ�, Book ��ü �迭(size=2) ����
2. ����ڿ��� å ����� ���ڸ� �Է¹���
3. Book ��ü �迭 �� ��� ���� ���
*/
import java.util.Scanner;

public class BookArray {
	public static void main(String[] args) {
		Book[] book=new Book[2]; // ���� 2���� book ��ü �迭 ����
		
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		
		//for ���� �̿��� Book�迭�� ����(=2)��ŭ ����ڿ��� å ����� ���� ����
		for(int i=0;i<book.length;i++) { 
			System.out.print("���� :");
			String title = scanner.nextLine(); // �����̳� �̸��� ������ ��� ���� �� �ֱ� ������ ������ ���Ե� ���� ��ü�� �б� ���� nextLine���� ����
			System.out.print("���� :");
			String author = scanner.nextLine(); // �����̳� �̸��� ������ ��� ���� �� �ֱ� ������ ������ ���Ե� ���� ��ü�� �б� ���� nextLine���� ����
			book[i] = new Book(title, author); // �Է� ���� title�� author�� book �迭�� ����
		}
		
		for(int i=0;i<book.length;i++)
			System.out.println("("+book[i].title+", "+book[i].author+")");
		
		scanner.close(); // ��ĳ�� ��ü �ݱ� 
	}
}
