package Phone;

class Phone {
	  // name , tel �ʵ�
	  String name;
	  String tel; // - �������� int Ÿ���� �ƴ� String Ÿ�� ����
	  
	  // Phone �⺻ ������
	  public Phone() {
	  }
	  
	  // �μ��� name�� tel�� �޴� ������ ����
	  public Phone(String name, String tel) {
	       this.name=name; // this ���۷����� �̿��� �μ��� ���� �� ��ü�� ��������� �־��� 
	       this.tel=tel;
	  }

}