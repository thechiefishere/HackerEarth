package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class EqualArmies {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> commandosPosition = new ArrayList<>();
			int n = 0;
			while(n < N)
			{
				StringTokenizer stk = new StringTokenizer(br.readLine());
				int sum = 0;
				while(stk.hasMoreTokens())
					sum += (Integer.parseInt(stk.nextToken()));
				
				commandosPosition.add(sum);
				n++;
			}
			
			Collections.sort(commandosPosition);
			//System.out.println("commandosPosition = " + commandosPosition);
			if(N % 2 != 0)
			{
				int midNum = commandosPosition.get(N / 2);
				//System.out.println("midNum = " + midNum);
				int firstIndexOfMidNum = commandosPosition.indexOf(midNum);
				//System.out.println("FI = " + firstIndexOfMidNum);
				int lastIndexOfMidNum = commandosPosition.lastIndexOf(midNum);
				//System.out.println("LI = " + lastIndexOfMidNum);
				if((N / 2) - firstIndexOfMidNum == lastIndexOfMidNum - (N / 2))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else
			{
				int midNum1 = commandosPosition.get((N - 1) / 2);
				int midNum2 = commandosPosition.get(N / 2);
				int diff = midNum2 - midNum1;
				if(diff < 0)
					diff *= -1;
				
				if(midNum1 == midNum2)
				{
					int firstIndexOfMidNum = commandosPosition.indexOf(midNum1);
					int lastIndexOfMidNum = commandosPosition.lastIndexOf(midNum2);
					if(((N - 1) / 2) - firstIndexOfMidNum == lastIndexOfMidNum - (N / 2))
						System.out.println("YES");
					else
						System.out.println("NO");
				}
				else if((midNum1 != midNum2) && diff > 1)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			
			t++;
		}
	}

}
