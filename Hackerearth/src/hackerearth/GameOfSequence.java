package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class GameOfSequence {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			Set<Integer> arr = new HashSet<>();
			int N = Integer.parseInt(br.readLine());
			StringTokenizer stk = new StringTokenizer(br.readLine());
			while(stk.hasMoreTokens())
				arr.add(Integer.parseInt(stk.nextToken()));
			
			if(arr.size() % 2 == 0)
				System.out.println("Q");
			else
				System.out.println("P");
			
			
			t++;
		}
	}

}
