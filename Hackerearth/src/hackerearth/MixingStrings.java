package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MixingStrings {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> arr = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		int n = 0;
		
		while(n < N)
		{
			arr.add(br.readLine());
			n++;
		}
		
		
		while(true)
		{
			int longestSubString = 0;
			int firstIndexOfStringToMerge = 0;
			int secondIndexOfStringToMerge = 0;
			String mergedString = "";
			
			for(int i = 0; i < arr.size(); i++)
			{
				for(int j = 0; j < arr.size(); j++)
				{
					if(i == j)
						continue;
					
					for(int k = 0; k < arr.get(i).length(); k++)
					{
						String iSubString = arr.get(i).substring(k, arr.get(i).length());
						if(iSubString.length() <= arr.get(j).length())
						{
							if(iSubString.length() > longestSubString)
							{
								String jSubString = arr.get(j).substring(0, iSubString.length());
								if(iSubString.equals(jSubString))
								{
									longestSubString = iSubString.length();
									firstIndexOfStringToMerge = i;
									secondIndexOfStringToMerge = j;
									StringBuffer bufferIString = new StringBuffer(arr.get(i));
									mergedString = bufferIString.delete(k, arr.get(i).length()) + arr.get(j);
									break;
								}
							}
						}
					}
				}
			}
			
			if(longestSubString == 0)
			{
				int minimumLengthOfMixedString = 0;
				for(int i = 0; i < arr.size(); i++)
					minimumLengthOfMixedString += arr.get(i).length();
				
				System.out.println(minimumLengthOfMixedString);
				break;
			}
			else
			{
				arr.add(mergedString);
				if(firstIndexOfStringToMerge < secondIndexOfStringToMerge)
				{
					//System.out.println("am in first else");
					//System.out.println("arr.get(first) " + arr.get(firstIndexOfStringToMerge));
					//System.out.println("arr.get(second) " + arr.get(secondIndexOfStringToMerge));
					//System.out.println("mergedString = " + mergedString);
					arr.remove(firstIndexOfStringToMerge);
					arr.remove(secondIndexOfStringToMerge - 1);
					//System.out.println("arr = " + arr.toString());
				}
				else
				{
					//System.out.println("am in second else");
					//System.out.println("arr.get(second) " + arr.get(secondIndexOfStringToMerge));
					//System.out.println("arr.get(first) " + arr.get(firstIndexOfStringToMerge));
					//System.out.println("mergedString = " + mergedString);
					arr.remove(firstIndexOfStringToMerge);
					arr.remove(secondIndexOfStringToMerge);
					//System.out.println("arr = " + arr.toString());
				}
			}
		}
		
	}

}
