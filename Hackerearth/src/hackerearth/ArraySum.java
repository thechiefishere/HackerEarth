package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArraySum {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[N];
		int inc = 0;
		StringTokenizer stk = new StringTokenizer(br.readLine());
		while(stk.hasMoreTokens())
		{
			arr[inc] = Long.parseLong(stk.nextToken());
			inc++;
		}
		
		long answer = 0;
		for(int i = 0; i < N; i++)
			answer += arr[i];
		
		System.out.println(answer);
	}

}
