package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class CommunicatingCoronaviruses {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			StringTokenizer stk = new StringTokenizer(br.readLine());
			long N = Long.parseLong(stk.nextToken());
			int M = Integer.parseInt(stk.nextToken());
			
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N; i++)
				arr.add(0);
			for(int i = 0; i < M; i++)
			{
				stk = new StringTokenizer(br.readLine());
				long L = Long.parseLong(stk.nextToken());
				long R = Long.parseLong(stk.nextToken());
				int P = Integer.parseInt(stk.nextToken());
				for(int j = (int) (L - 1); j < R; j++)
					arr.set(j, arr.get(j) + P);
			}
		
			Collections.sort(arr);
			int xOr = 0;
			for(int i = 0; i < arr.size(); i++)
			{
				int element = arr.get(i);
				int firstIndex = arr.indexOf(element);
				int lastIndex = arr.lastIndexOf(element);
				int total = lastIndex - firstIndex + 1;
				if(total % 2 != 0)
					xOr ^= element;
				
				i = lastIndex;
			}
			
			System.out.println(xOr);
			
			t++;
		}
	}

}
