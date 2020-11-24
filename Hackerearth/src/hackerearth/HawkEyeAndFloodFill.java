package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HawkEyeAndFloodFill {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		int iInput = Integer.parseInt(stk.nextToken());
		int jInput = Integer.parseInt(stk.nextToken());
		int power = Integer.parseInt(stk.nextToken());
		
		int[][] arr = new int[N][N];
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				if(i == iInput && j == jInput)
				{
					arr[i][j] = power;
					continue;
				}
				
				int iCheck = iInput - i;
				if(iCheck < 0)
					iCheck *= -1;
				int jCheck = jInput - j;
				if(jCheck < 0)
					jCheck *= -1;
				
				if(iCheck >= jCheck)
				{
					int toAdd = power - iCheck;
					if(toAdd < 0)
						toAdd = 0;
					
					arr[i][j] = toAdd;
				}
				else
				{
					int toAdd = power - jCheck;
					if(toAdd < 0)
						toAdd = 0;
					
					arr[i][j] = toAdd;
				}
			}
		}
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
				System.out.print(arr[i][j] + " ");
			
			System.out.println();
		}
	}

}
