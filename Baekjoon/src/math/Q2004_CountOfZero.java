package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2004_CountOfZero {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int plus2 = 0;
		int plus5 = 0;
		
		//n * n-1 * n-2 * n-3 * ... * n-m+1 > 분자
		//소인수 분해 했을 때 2,5가 몇 개 있는지 더해준다. (분자니까)
		for(int i=n; i>=n-m+1; i--) {

			//5로 나눌수 있을 떄까지 반복.
			int num=i;
			while(true) { 
				if(num%5==0) {
					plus5++;
					num/=5;
				} else {
					break;
				}
			}

			//2로 나눌수 있을 떄까지 반복.
			num = i;
			while(true) {
				if(num%2==0) {
					plus2++;
					num/=2;
				} else {
					break;
				}
			}
		}
		
		//m * m-1 * m-2 * m-3 * ... * 1 > 분모
		//소인수 분해 했을 때 2,5가 몇 개 있는지 빼준다. (분모니까)
		for(int i=m; i>0; i--) {

			//5로 나눌수 있을 떄까지 반복.
			int num=i;
			while(true) {
				if(num%5==0 && plus5>0) { //여기는 빼주기만 하므로 plus5가 0보다 작으면 종료
					plus5--;
					num/=5;
				} else {
					break;
				}
			}
			
			//2로 나눌수 있을 떄까지 반복.
			num = i;
			while(true) {
				if(num%2==0 && plus2>0) { //여기는 빼주기만 하므로 plus2가 0보다 작으면 종료
					plus2--;
					num/=2;
				} else {
					break;
				}
			}
		}
		
		//2,5중에서 작은 숫자를 출력하면 그게 0의 갯수와 같다.
		if(plus5>plus2) {
			System.out.println(plus2);
		} else {
			System.out.println(plus5);
		}
	}
}
