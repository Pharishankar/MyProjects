import java.util.*;
public class TestPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<n;i++){
			for (int j = 2; j <=i; j++) {
				if(j==i){
					System.out.print(i+" ");
				}
				if(i%j==0){
					break;
				}
			}
		}
	}
}
