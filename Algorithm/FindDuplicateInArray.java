
public class FindDuplicateInArray {
	
	public static void main(String[] args) {
		int []arr={1,2,3,4,2,1};
		System.out.println("duplicates elements are:-");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]);
				}
			}
			
		}
		/*String str="harishankar";
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i] == ch[j])
				{
					System.out.println(ch[i]);
					break;
				}
			}
		}*/
	}
}
