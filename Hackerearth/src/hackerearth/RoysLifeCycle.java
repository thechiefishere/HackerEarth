package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoysLifeCycle {

	public static int countCs(String allStrings, int presentIndex)
	{
		int toReturn = 0;
		
		int backwardCount = presentIndex - 1;
		int forwardCount = presentIndex;
		int count = 0;
		while(true)
		{
			if(backwardCount >= 0 && allStrings.charAt(backwardCount) == 'C')
				toReturn++;
			else
				break;
			
			backwardCount--;
		}
		while(true)
		{
			if(forwardCount < allStrings.length() && allStrings.charAt(forwardCount) == 'C')
				toReturn++;
			else
				break;
			
			forwardCount++;
		}
		
		return toReturn;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int n = 0;
		
		int largestDailyStreak = 0;
		int largestDayToDayStreak = 0;
		String allStrings = "";
		while(n < N)
		{
			String dailyCircle = br.readLine();
			allStrings += dailyCircle;
			
			for(int i = 0; i < dailyCircle.length(); i++)
			{
				int inc = 0;
				
				if(dailyCircle.charAt(i) == 'C')
				{
					for(int j = i; j < dailyCircle.length(); j++)
					{
						if(dailyCircle.charAt(j) == 'C')
							inc++;
						else
							break;
					}
					if(inc > largestDailyStreak)
						largestDailyStreak = inc;
				}
			}
			
			n++;
		}
		
		for(int i = 1; i < N; i++)
		{
			int subStringIndex = i * 1440;
			String subString = "";
			if(subStringIndex != (N * 1440))
				subString = allStrings.substring(subStringIndex - 1, subStringIndex + 1);
			
			if(subString.equals("CC"))
			{
				int totalCs = countCs(allStrings, subStringIndex);
				
				if(totalCs > largestDayToDayStreak)
					largestDayToDayStreak = totalCs;
				
				if(totalCs + subStringIndex - 1 == (N * 1440))
					break;
			}
		}
		
		if(largestDailyStreak > largestDayToDayStreak)
			largestDayToDayStreak = largestDailyStreak;
		
		System.out.println(largestDailyStreak + " " + largestDayToDayStreak);
	}

}
