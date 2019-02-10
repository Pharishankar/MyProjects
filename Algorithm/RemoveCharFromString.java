
public class RemoveCharFromString {
	
	public static void main(String[] args) {
		String str="This is java";
		//String s1=str.substring(4);//substring(4) means from inclusive 4 index to end 
		//System.out.println(s1);
		System.out.println(removeCharAt(str,3));
	}
	public static String removeCharAt(String s,int pos)
	{
		return s.substring(0, pos) + s.substring(pos + 1);
	}
}
