package CSP20140901;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int count=0;
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for(int j=0;j<n;j++) {
				if(nums[i]-nums[j]==1) {
					count++;
//					System.out.println("("+nums[i]+","+nums[j]+")");
				}
			}
		}
		System.out.println(count);
		
	}

}
