package 扫描器1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		/*String str=scanner.next();*/
		/*int str=scanner.nextInt();
		System.out.println("接收到的内容"+str);
		str=scanner.nextInt();
		System.out.println("接收到的内容"+str);*/
		
		/*String str=scanner.nextLine();
		System.out.println("接收到的内容"+str);*/
	
		/*String str="1234";
		String str2="56";
		System.out.println(str+str2);
		System.out.println(Integer.parseInt(str)+Integer.parseInt(str2));*/
	  List<String> list=new ArrayList();
	  list.add("dafei");
	  list.add("zhangtong");
	  for (int i=0;i<list.size();i++) {
		  System.out.println(list.get(i));
		  
	  }
	
	
	}
  
	
}
