package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DiwaliCelebration {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(stk.nextToken());
			int K = Integer.parseInt(stk.nextToken());
			int N = Integer.parseInt(stk.nextToken());
			
			int amountHeHas = A + (K * (N - 1));
			System.out.println(amountHeHas);
			t++;
		}
	}

}
