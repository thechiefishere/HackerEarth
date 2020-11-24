package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class HackersWithBits {

	public static int[] countOnes(ArrayList<Integer> a, int presentIndex)
	{
		int[] toReturn = new int[3];
		
		int backwardCount = presentIndex - 1;
		int backwardSum = 0;
		while(backwardCount >= 0)
		{
			if(a.get(backwardCount) != 0)
				backwardSum++;
			else
				break;
			
			backwardCount--;
		}
		
		int forwardCount = presentIndex + 1;
		int forwardSum = 0;
		while(forwardCount < a.size())
		{
			if(a.get(forwardCount) != 0)
				forwardSum++;
			else
				break;
			
			forwardCount++;
		}
		
		toReturn[0] = backwardSum;
		toReturn[1] = forwardSum;
		toReturn[2] = backwardSum + forwardSum;
		
		return toReturn;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer stk = new StringTokenizer(br.readLine());
		while(stk.hasMoreTokens())
			arr.add(Integer.parseInt(stk.nextToken()));
		
		int answer = 0;
		int neededIndex = 0;
		int backwardLength = 0;
		int forwardLength = 0;
		boolean onePresent = false;
		boolean zeroPresent = false;
		for(int i = 0; i < arr.size(); i++)
		{
			if(arr.get(i) == 0)
			{
				zeroPresent = true;
				int[] onesLength = countOnes(arr, i);
				if(onesLength[2] > answer)
				{
					answer = onesLength[2];
					backwardLength = onesLength[0];
					forwardLength = onesLength[1];
					neededIndex = i;
				}
			}
		}
		
		
		for(int i = 0; i < neededIndex - backwardLength; i++)
		{
			if(arr.get(i) == 1)
			{
				onePresent = true;
				break;
			}
		}
		for(int i = arr.size() - 1; i > neededIndex + forwardLength; i--)
		{
			if(arr.get(i) == 1)
			{
				onePresent = true;
				break;
			}
		}
		
		
		if(onePresent)
			answer += 1;
		if(zeroPresent == false)
			answer = N;
		
		System.out.println(answer);
	}

}
