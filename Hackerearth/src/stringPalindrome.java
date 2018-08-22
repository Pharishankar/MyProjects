import java.util.*;
public class stringPalindrome {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String s1="";
	String s2=str;
	for(int i=str.length()-1;i>=0;i--)
	{
	 s1=s1+str.charAt(i);
	}
	if(s1.equals(s2)){
		System.out.println("yes");
	}else{
		System.out.println("no");
		}
	}
}
