import java.util.Arrays;
import java.util.StringTokenizer;

class ST{
	
	public static void main(String[] args){
		
		//args[]를 toString을 이용해 배열을 문자열로 바꾼다.
		String answer = Arrays.toString(args);
		
		//answer에서 '['와 ']'를 공백으로 대체한다.
		answer=answer.replace("[","");
		answer=answer.replace("]","");
		
		//toString() 메서드를 이용해 answer -> 문자열로 리턴 / ,을 기준으로 토큰을 나눈다.
	    StringTokenizer stok = new StringTokenizer(answer, " ,");
	    
	    //hasMoreTokens()를 이용해 stok(문자열)에서 사용할 수 있는 문자열이 있는 지 테스트
	    while(stok.hasMoreTokens()){
	    	String str = stok.nextToken();
	    	System.out.println(str);
	    }
	}
}