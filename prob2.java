import java.lang.*;
import java.util.*;
public class prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			arr[i]=a;
		}
		for(int i=0;i<n;i++) {
			int a=arr[i];
			int c=0;
			for(int j=0;j<n;j++) {
				if(a==arr[j]) {
					int b=a;
					c++;
				}
			}
			if(c==2) {
				arr1[i]=a;
			}
		}
		for(int i=0;i<n;i++) {
			int a=arr1[i];
			boolean x=true;
			for(int j=i+1;j<n;j++) {
				if(a==arr1[j]) {
					x=false;
				}
			}
			if(x) {
				if(arr1[i]!=0){
					System.out.println(arr1[i]);}
			}
		}
	}

}