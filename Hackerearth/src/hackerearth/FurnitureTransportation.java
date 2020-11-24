package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class FurnitureTransportation {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int L = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		stk = new StringTokenizer(br.readLine());
		while(stk.hasMoreTokens())
			arr.add(Integer.parseInt(stk.nextToken()));
		
		int firstIndex = 0;
		int nextIndex = 0;
		int answer = 0;
		
		for(int i = 0; i < arr.size(); i++)
		{
			if(arr.get(i) > L)
			{
				nextIndex = i;
				int sub = nextIndex - firstIndex;
				if(sub >= M)
					answer += (sub + 1  - M);
				
				firstIndex = nextIndex + 1;
			}
			if(i == arr.size() - 1 && arr.get(i) <= L)
			{
				if(firstIndex == 0)
				{
					nextIndex = N;
					int sub = nextIndex - firstIndex;
					if(sub >= M)
						answer += (sub + 1 - M);
				}
				else
				{
					nextIndex = i;
					int sub = nextIndex - firstIndex;
					if(sub >= M)
						answer += (sub + 1 - M);
				}
			}
		}
		
		System.out.println(answer);
	}

}
