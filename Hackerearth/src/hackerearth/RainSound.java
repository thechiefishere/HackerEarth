package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RainSound {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(stk.nextToken());
			int R = Integer.parseInt(stk.nextToken());
			int S = Integer.parseInt(stk.nextToken());
			
			int min = -1;
			int max = -1;
			
			if(L >= S)
			{
				if(L % S == 0)
					min = L / S;
				else
					min = (L / S) + 1;
			}
			if(R >= S)
				max = R / S;
			
			if(min > max)
			{
				min = -1;
				max = -1;
			}
			if(L < S && R >= S)
				min = 1;
			
			System.out.println(min + " " + max);
			t++;
		}
	}

}
