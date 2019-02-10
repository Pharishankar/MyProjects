
public class SplitString {
	
	public static void main(String[] args) {
		String str="jan-feb-march";
		String[] temp;
		String delimeter="-";
		temp=str.split(delimeter);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
	}
}
