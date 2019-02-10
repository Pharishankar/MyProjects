
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergTwoArrays {
	
	public static void main(String[] args) {
		String a[]={"A","B","C"};
		String b[]={"D","E"};
		List list=new ArrayList(Arrays.asList(a));
		list.add(Arrays.asList(b));
		//Object c[]=list.toArray();
		//System.out.println(Arrays.toString(c));
		System.out.println(list);
	}
}
