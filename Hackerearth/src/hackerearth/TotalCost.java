package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TotalCost {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int P = Integer.parseInt(stk.nextToken());
		int S = Integer.parseInt(stk.nextToken());
		int T = Integer.parseInt(stk.nextToken());
		int H = Integer.parseInt(stk.nextToken());
		int X = Integer.parseInt(stk.nextToken());
		
		int totalCost = 0;
		for(int i = 1; i <= X; i++)
		{
			if(S > T)
				totalCost += P;
			else
				totalCost += H;
			
			S--;
		}
		
		System.out.println(totalCost);
	}

}
