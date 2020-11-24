package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class AniruddhasQueue {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		
		while(t < T)
		{
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>();
			StringTokenizer stk = new StringTokenizer(br.readLine());
			while(stk.hasMoreTokens())
				arr.add(Integer.parseInt(stk.nextToken()));
			
			long sumOfArrayElement = 0L;
			for(int i = 0; i < arr.size(); i++)
				sumOfArrayElement += arr.get(i);
			
			long M = Long.parseLong(br.readLine());
			
			long div = M / sumOfArrayElement;
			if(div >= 1)
			{
				long remainder = M - (sumOfArrayElement * div);
				if(remainder == 0)
				{
					ArrayList<Integer> arrCopy = new ArrayList<>();
					arrCopy.addAll(arr);
					Collections.sort(arrCopy, Collections.reverseOrder());
					int indexToPrint = 0;
					
					for(int i = 0; i < arrCopy.size(); i++)
					{
						if(arrCopy.get(i) == 0)
							break;
						else
						{
							if(arr.lastIndexOf(arrCopy.get(i)) > indexToPrint)
								indexToPrint = arr.lastIndexOf(arrCopy.get(i));
						}
					}
					
					System.out.println(indexToPrint + 1);
				}
				else
				{
					for(int i = 0; i < arr.size(); i++)
					{
						remainder -= arr.get(i);
						if(remainder <= 0)
						{
							System.out.println(i + 1);
							break;
						}
					}
				}
			}
			else
			{
				for(int i = 0; i < arr.size(); i++)
				{
					M -= arr.get(i);
					if(M <= 0)
					{
						System.out.println(i + 1);
						break;
					}
				}
			}
			
			t++;
		}
	}

}
