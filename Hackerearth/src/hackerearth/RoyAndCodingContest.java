package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoyAndCodingContest {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(stk.nextToken());
			int M = Integer.parseInt(stk.nextToken());
			boolean mIsAPowerOf2 = false;
			int penTime = 0;
			int i = 1;
			
			if(N >= M)
			{
				for(i = 1; i <= 30; i++)
				{
					if(Math.pow(2, i) > M)
						break;
					else
					{
						if(Math.pow(2, i) == M)
						{
							mIsAPowerOf2 = true;
							penTime = i + 1;
						}
						else 
							penTime = i + 2;
						
					}
				}
				
				if(N == M)
					System.out.println(penTime);
				else if(N > M)
				{
					int numOfComputer = (int) Math.pow(2, penTime - 1);
					if(mIsAPowerOf2)
						numOfComputer = (int) Math.pow(2, penTime - 1);
					
					double remainingTime = (double)(N - numOfComputer) / (double)M;
					penTime += (int)remainingTime;
					if(remainingTime - (int) remainingTime > 0)
						penTime += 1;
					
					System.out.println(penTime);
				}
			}
			else if(N < M)
			{
				for(i = 1; i <= 30; i++)
				{
					if(Math.pow(2, i) > N)
						break;
					else
					{
						if(Math.pow(2, i) == N)
							penTime = i + 1;
						else 
							penTime = i + 2;
						
					}
				}
				System.out.println(penTime);
			}
			
			t++;
		}
	}

}
