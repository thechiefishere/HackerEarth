package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KillCodesWish {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(stk.nextToken());
			int M = Integer.parseInt(stk.nextToken());
			int[] arr = new int[N];
			
			stk = new StringTokenizer(br.readLine());
			int inc = 0;
			int largest = 0;
			int answer = 0;
			
			while(stk.hasMoreTokens())
			{
				arr[inc] = Integer.parseInt(stk.nextToken());
				inc++;
			}
			
			for(int i = 0; i < arr.length; i++)
			{
				double div = (double)arr[i] / (double)M;
				int divInt = (int) div;
				if(div > divInt)
					divInt += 1;
					
				if(divInt >= largest)
				{
					answer = i + 1;
					largest = divInt;
				}
			}
			
			System.out.println(answer);
			
			t++;
		}
	}

}
