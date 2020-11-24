package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThePrimeCells {

	public static boolean isPrime(int n)
	{
		boolean toReturn = true;
		
		if(n < 3)
			return true;
		if(n % 2 == 0 || n % 3 == 0)
			return false;
		for(int i = 5; i * i <= n; i += 6)
			if(n % i == 0 || n % (i + 2) == 0)
				return false;
		
		return toReturn;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int n = 0;
		int[][] arr = new int[N][N];
		while(n < N)
		{
			StringTokenizer stk = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++)
				arr[n][i] = Integer.parseInt(stk.nextToken());
			n++;
		}
		
		int answer = 0;
		for(int i = 0; i < N; i++)
		{	
			for(int j = 0; j < N; j++)
			{
				int sum = 0;
				int top = 0;
				int bottom = 0;
				int left = 0;
				int right = 0;
				
				if(i != 0)
					top = arr[i - 1][j];
				if(i != N - 1)
					bottom = arr[i + 1][j];
				if(j != 0)
				    left = arr[i][j - 1];
				if(j != N - 1)
					right = arr[i][j + 1];
				
				sum = top + bottom + left + right;
				if(isPrime(sum))
					answer++;
			}
		}
		
		System.out.println(answer);
	}

}
