package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class AABBAAC {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			ArrayList<String> arr = new ArrayList<>();
			ArrayList<Long> lenOfArr = new ArrayList<>();
			
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(stk.nextToken());
			int M = Integer.parseInt(stk.nextToken());
			int n = 0;
			int m = 0;
			
			StringBuffer toPrint = new StringBuffer("");
			while(n < N)
			{
				arr.add(br.readLine());
				long toAdd = 0;
				int index = n;
				for(int i = 0; i < arr.size(); i++)
				{
					toAdd += (Math.pow(2, index) * arr.get(i).length());
					index--;
				}
				lenOfArr.add(toAdd);
				
				n++;
			}
			
			while(m < M)
			{
				long x = Long.parseLong(br.readLine()) + 1l;
				int counter = 0;
				boolean done = false;
				
				for(int i = lenOfArr.size() - 1; i >= 0; i--)
				{
					if(x == lenOfArr.get(i))
					{
						int position = arr.get(i).length() - 1;
						toPrint.append(arr.get(i).charAt((int) position));
						done = true;
						break;
					}
					else if((lenOfArr.get(i) - x) < arr.get(i).length() && lenOfArr.get(i) > x)
					{
						long position =  ((arr.get(i).length() - 1) - (lenOfArr.get(i) - x));
						toPrint.append(arr.get(i).charAt((int) position));
						done = true;
						break;
					}
				}
				
				if(!done)
				{
					long xCopy = x;
					int j = lenOfArr.size() - 1;
				  T :while(xCopy > lenOfArr.get(0))
					{
						for(; j >= 0; j--)
						{
							if(xCopy >= lenOfArr.get(j))
							{
								xCopy -= lenOfArr.get(j);
								counter += (Math.pow(2, (j + 1)));
								if(xCopy == 0)
								{
									int position = arr.get(j).length() - 1;
									toPrint.append(arr.get(j).charAt((int) position));
									done = true;
									break T;
								}
								else if((xCopy -= arr.get(j).length()) <= 0)
								{
									long position = xCopy;
									if(position < 0)
										position *= -1;
									toPrint.append(arr.get(j).charAt((int) position));
									done = true;
									break T;
								}
							}
						}
					}
					
					if(!done)
					{
						int inc = 0;
						while(true)
						{
							if(counter % 4 == 0)
							{
								toPrint.append(arr.get(inc).charAt((int) xCopy - 1));
								break;
							}
							else
							{
								counter -= 2;
								counter /= 2;
							}
							
							inc++;
							
						}
					}
				}
				
				m++;
			}
			
			System.out.println(toPrint);
			
			t++;
		}
	}

}
