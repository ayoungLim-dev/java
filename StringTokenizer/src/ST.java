import java.util.Arrays;
import java.util.StringTokenizer;

class ST{
	
	public static void main(String[] args){
		
		//args[]�� toString�� �̿��� �迭�� ���ڿ��� �ٲ۴�.
		String answer = Arrays.toString(args);
		
		//answer���� '['�� ']'�� �������� ��ü�Ѵ�.
		answer=answer.replace("[","");
		answer=answer.replace("]","");
		
		//toString() �޼��带 �̿��� answer -> ���ڿ��� ���� / ,�� �������� ��ū�� ������.
	    StringTokenizer stok = new StringTokenizer(answer, " ,");
	    
	    //hasMoreTokens()�� �̿��� stok(���ڿ�)���� ����� �� �ִ� ���ڿ��� �ִ� �� �׽�Ʈ
	    while(stok.hasMoreTokens()){
	    	String str = stok.nextToken();
	    	System.out.println(str);
	    }
	}
}