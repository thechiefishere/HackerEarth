package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class CountriesGrouping {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			ArrayList<Integer> arr = new ArrayList<>();
			ArrayList<Integer> arrCopy = new ArrayList<>();
			int N = Integer.parseInt(br.readLine());
			StringTokenizer stk = new StringTokenizer(br.readLine());
			while(stk.hasMoreTokens())
				arr.add(Integer.parseInt(stk.nextToken()));
			
			arrCopy.addAll(arr);
			Collections.sort(arrCopy, Collections.reverseOrder());
			int numOfCountries = 0;
			boolean done = false;
			if(arrCopy.get(arrCopy.size() - 1) > 100)
			{
				System.out.println("Invalid Data");
				done = true;
			}
			if(!done)
			{
				for(int i = 0; i < arr.size(); i++)
				{
					int adder = arr.get(i);
					if(adder + i <= arr.size())
					{
						for(int j = i; j < (adder + i); j++)
						{
							if(arr.get(j) != adder)
							{
								System.out.println("Invalid Data");
								done = true;
								break;
							}
						}
						i = adder + i - 1;
						numOfCountries++;
					}
					else
					{
						System.out.println("Invalid Data");
						done = true;
						break;
					}
				}
			}
			
			if(!done)
				System.out.println(numOfCountries);
			
			t++;
		}
	}

}
