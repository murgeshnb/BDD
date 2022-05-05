package practice;

import java.util.List;

public class LISttt {

	public static void main(String[] args) {
		//List<List<String>> list=new 
		
		String s="123abc";
		int no=0;
		for (int i = 0; i < s.length(); i++) {
//				if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
//					no=no+s.charAt(i)-48;
//				}
				 if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
					//no=no+s.charAt(i);
					 System.out.print(s.charAt(i));
				}
		}
	//	System.out.println(no);
		
		}

}
