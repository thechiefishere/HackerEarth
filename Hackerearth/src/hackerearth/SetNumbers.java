package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SetNumbers {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			int N = Integer.parseInt(br.readLine());
			
			int closestPowerOf2 = 0;
			for(int i = 30; i >= 0; i--)
			{
				closestPowerOf2 = (int) Math.pow(2, i);
				if(closestPowerOf2 == N)
				{
					System.out.println(N - 1);
					break;
				}
				else if((closestPowerOf2 - 1 == N))
				{
					System.out.println(N);
					break;
				}
				else if(closestPowerOf2 <= N)
				{
					System.out.println(closestPowerOf2 - 1);
					break;
				}
			}
			
			t++;
		}
	}

}
