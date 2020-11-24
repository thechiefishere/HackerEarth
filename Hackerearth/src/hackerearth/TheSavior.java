package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class TheSavior {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		
		while(t < T)
		{
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>();
			int count = 0;
			StringTokenizer stk = new StringTokenizer(br.readLine());
			while(stk.hasMoreTokens())
				arr.add(Integer.parseInt(stk.nextToken()));
			
			Collections.sort(arr);
			if(arr.size() == 1)
				System.out.println(0);
			else
			{
				for(int i = 0; i < arr.size() - 1; i++)
				{
					for(int j = i + 1; j < arr.size(); j++)
					{
						int sum = arr.get(i) + arr.get(j);
						if(arr.get(i) != arr.get(j) && sum % 2 == 0)
							count++;
					}
				}
				
				System.out.println(count);
			}
			t++;
		}
	}

}
