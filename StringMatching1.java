package problems;

import java.util.Scanner;

public class StringMatching1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		int flag = 0;
		System.out.println("Enter string 1 - ");
		s1 = sc.nextLine();
		System.out.println("Enter string 2 - ");
		s2 = sc.nextLine();
		char cs1[] = new char[100];
		char cs2[] = new char[100];
		cs1 = s1.toCharArray();
		cs2 = s2.toCharArray();
		int m = s1.length();
		int n = s2.length();
		if(m<=0 || n<=0){
			flag = 0;
		}
		else if(n>m){
			flag = 0;
		}
		else{
			for(int i=0;i<=m-n;i++){
				if(s2.compareTo(s1.substring(i, i+n-1)) == 1){
					flag = 1;
					break;
				}
				else{
					flag = 0;
				}
			}
		}
		if(flag == 0){
			System.out.println("not found");
		}
		else if(flag == 1){
			System.out.println("found");
		}
	}
}
