package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5575_Timecard {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[3];
		int[] aM = new int[3];
		int[] b = new int[3];
		int[] bM = new int[3];
		int[] c = new int[3];
		int[] cM = new int[3];
		
		String[] s = br.readLine().split(" ");
		a[0] = Integer.parseInt(s[0]); //A 시
		a[1] = Integer.parseInt(s[1]); //A 분
		a[2] = Integer.parseInt(s[2]); //A 초
		aM[0] = Integer.parseInt(s[3]); //A 초
		aM[1] = Integer.parseInt(s[4]); //A 초
		aM[2] = Integer.parseInt(s[5]); //A 초
		
		
		s = br.readLine().split(" ");
		b[0] = Integer.parseInt(s[0]); //B 시
		b[1] = Integer.parseInt(s[1]); //B 분
		b[2] = Integer.parseInt(s[2]); //B 초
		bM[0] = Integer.parseInt(s[3]); //A 초
		bM[1] = Integer.parseInt(s[4]); //A 초
		bM[2] = Integer.parseInt(s[5]); //A 초
		
		s = br.readLine().split(" ");
		c[0] = Integer.parseInt(s[0]); //C 시
		c[1] = Integer.parseInt(s[1]); //C 분
		c[2] = Integer.parseInt(s[2]); //C 초
		cM[0] = Integer.parseInt(s[3]); //A 초
		cM[1] = Integer.parseInt(s[4]); //A 초
		cM[2] = Integer.parseInt(s[5]); //A 초
		
		int sumA = 0-a[0]*360-a[1]*60-a[2]+aM[0]*360+aM[1]*60+aM[2];
		int sumB = 0-b[0]*360-b[1]*60-b[2]+bM[0]*360+bM[1]*60+bM[2];
		int sumC = 0-c[0]*360-c[1]*60-c[2]+cM[0]*360+cM[1]*60+cM[2];
		
		System.out.print(sumA/360+" ");
		sumA%=360;
		if(sumA>=60) {
			System.out.print(sumA%60+" ");
		} else {
			System.out.print(0+" ");
		}
		sumA%=60;
		System.out.println(sumA);
		
		System.out.print(sumB/360+" ");
		sumB%=360;
		if(sumB>=60) {
			System.out.print(sumB%60+" ");
		} else {
			System.out.print(0+" ");
		}
		sumB%=60;
		System.out.println(sumB);
		
		System.out.print(sumC/360+" ");
		sumC%=360;
		if(sumC>=60) {
			System.out.print(sumC%60+" ");
		} else {
			System.out.print(0+" ");
		}
		sumC%=60;
		System.out.println(sumC);

	}

}
