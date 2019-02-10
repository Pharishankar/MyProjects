import java.util.Arrays;

public class compareTwoArrays {
	
	public static void main(String[] args) {
		int[] arr1={1,2,3,4,5,6};
		int[] arr2={1,2,3,4,5,6};
		int[] arr3={1,2,3,4};
		
		System.out.println("Array 1 and Array 2 is Equal?:"+Arrays.equals(arr1, arr2));
		System.out.println("Array 1 and Array 3 is Equal?:"+Arrays.equals(arr1, arr3));
	}
}
