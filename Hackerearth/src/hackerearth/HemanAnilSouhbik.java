package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HemanAnilSouhbik {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			int N = Integer.parseInt(br.readLine());
			
			if(N == 1)
				System.out.println(1);
			else
			{
				for(int i = 32; i >= 1; i--)
				{
					int closestPowOfTwo = (int) Math.pow(2, i);
					if(N >= closestPowOfTwo)
					{
						int remainder = N - closestPowOfTwo;
						if(remainder == 0)
							System.out.println(closestPowOfTwo);
						else
							System.out.println(2 * remainder);
						
						break;
					}
				}
			}
			t++;
		}
	}

}
