package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class RecursiveSums {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			int M = Integer.parseInt(br.readLine());
			int m = 0;
			long answer = 0;
			while(m < M)
			{
				StringTokenizer stk = new StringTokenizer(br.readLine());
				long len = Long.parseLong(stk.nextToken());
				int d = Integer.parseInt(stk.nextToken());
				long toAdd = 0;
				if(d == 0)
					toAdd = 0;
				else
				{
					toAdd = (len * d) % 9;
					if(toAdd == 0)
						toAdd = 9;
				}
				
				answer += toAdd;
				
				m++;
			}
			
			while(true)
			{
				String answerAsString = "" + answer;
				if(answerAsString.length() == 1)
					break;
				
				answer = 0;
				ArrayList<Integer> arr = new ArrayList<>();
				for(int i = 0; i < answerAsString.length(); i++)
					arr.add(Character.getNumericValue(answerAsString.charAt(i)));
				Collections.sort(arr);
				
				for(int i = 0; i < 9; i++)
				{
					int firstIndexOfI = arr.indexOf(i);
					if(firstIndexOfI != -1)
					{
						int lastIndexOfI = arr.lastIndexOf(i);
						int diff = lastIndexOfI - firstIndexOfI + 1;
						answer += (i * diff);
					}
				}
			}
			
			System.out.println(answer);
			
			t++;
		}
	}

}
