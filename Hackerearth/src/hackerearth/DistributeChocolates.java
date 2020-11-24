package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DistributeChocolates {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			StringTokenizer stk = new StringTokenizer(br.readLine());
			long C = Long.parseLong(stk.nextToken());
			long N = Long.parseLong(stk.nextToken());
			
			long addOns = ((N - 1) * N) / 2;
			long remainder = (C - addOns) / N;
			long a = (remainder * N) + addOns;
			long answer = C - a;
			if(remainder <= 0)
				System.out.println(C);
			else
				System.out.println(answer);
			
			
			
			t++;
		}
	}
}
