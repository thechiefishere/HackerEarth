package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FredoIsInAHurry {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		
		while(t < T)
		{
			int N = Integer.parseInt(br.readLine());
			
			int stairsPosition = 0;
			int stairsTime = 0;
			int elevatorPosition = 0;
			
			for(int i = 1; i <= N; i++)
			{
				if(N == 1)
				{
					System.out.println(1);
					break;
				}
				stairsPosition = i;
				stairsTime = (stairsPosition * (stairsPosition + 1)) / 2;
				elevatorPosition = N - stairsTime;
				
				if(elevatorPosition < stairsPosition)
				{
					stairsPosition = i - 1;
					stairsTime = (stairsPosition * (stairsPosition + 1)) / 2;
					elevatorPosition = N - stairsTime;
					
					if(elevatorPosition == stairsPosition)
						System.out.println(stairsTime * 2);
					else
					{
						int diff = elevatorPosition - stairsPosition;
						stairsTime += diff;
						System.out.println(stairsTime * 2);
					}
					
					break;
				}
			}
			
			t++;
		}
	}

}
