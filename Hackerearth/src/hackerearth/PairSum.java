package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PairSum {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		
		stk = new StringTokenizer(br.readLine());
		while(stk.hasMoreTokens())
			arr.add(Integer.parseInt(stk.nextToken()));
		
		boolean done = false;
		for(int i = 0; i < arr.size(); i++)
		{
			int diff = K - arr.get(i);
			int index = arr.indexOf(diff);
			if(index != -1 && index != i)
			{
				System.out.println("YES");
				done = true;
				break;
			}
		}
		
		if(!done)
			System.out.println("NO");
	}

}
