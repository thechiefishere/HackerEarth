package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class CityTravel {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> tArr = new ArrayList<>();
		ArrayList<Integer> yArr = new ArrayList<>();
		ArrayList<Integer> tArrOrdered = new ArrayList<>();
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(stk.nextToken());
		int X = Integer.parseInt(stk.nextToken());
		int N = Integer.parseInt(stk.nextToken());
		int n = 0;
		
		int numOfDays = 0;
		int counter = 1;
		
		while(n < N)
		{
			stk = new StringTokenizer(br.readLine());
			tArr.add(Integer.parseInt(stk.nextToken()));
			yArr.add(Integer.parseInt(stk.nextToken()));
			n++;
		}
		
		tArrOrdered.addAll(tArr);
		Collections.sort(tArrOrdered);
		int lastExceptionalDay = 0;
		long sum = 0;
		boolean done = false;
		for(int i = 0; i < tArrOrdered.size(); i++)
		{
			int multiplier = tArrOrdered.get(i) - lastExceptionalDay - 1;
			if(multiplier * X < 0)
				multiplier = 1;
			sum += (multiplier * X);
			numOfDays += multiplier;
			if(S - sum == 0)
			{
				System.out.println(numOfDays);
				done = true;
				break;
			}
			else if(S - sum < 0)
			{
				long remainder = sum - S;
				remainder /= X;
				System.out.println(numOfDays - remainder);
				done = true;
				break;
			}
			
			int distOfTheDay = yArr.get(tArr.indexOf(tArrOrdered.get(i)));
			sum += distOfTheDay;
			if(S - sum <= 0)
			{
				System.out.println(tArrOrdered.get(i));
				done = true;
				break;
			}
			
			numOfDays++;
			lastExceptionalDay = tArrOrdered.get(i);
		}
		if(!done)
		{
			long remainder = S - sum;
			long extraDays = remainder / X;
			
			if((remainder % X) == 0)
				System.out.println(numOfDays + extraDays);
			else
				System.out.println(numOfDays + extraDays + 1);
		}
		
	}

}
