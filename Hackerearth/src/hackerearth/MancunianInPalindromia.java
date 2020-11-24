package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MancunianInPalindromia {

	public static boolean isPalindrome(String s)
	{
		boolean toReturn = false;
		
		StringBuffer rev = new StringBuffer(s);
		rev.reverse();
		
		if(s.equals(rev.toString()))
			return true;
		
		return toReturn;
	}
	
	public static boolean palindromePossible(String s)
	{
		int itsOdd = 0;
		
		for(int i = 97; i <= 122; i++)
		{
			char alph = (char) i;
			int counter = 0;
			for(int j = 0; j < s.length(); j++)
				if(Character.compare(s.charAt(j), alph) == 0)
					counter++;
			
			if(counter % 2 != 0)
				itsOdd++;
			
			if(itsOdd > 1)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int L = Integer.parseInt(stk.nextToken());
		int n = 0;
		
		int count = 0;
		while(n < N)
		{
			String name = br.readLine();
			if(palindromePossible(name))
			{
				if(isPalindrome(name))
					count++;
				else
				{
					for(int i = 0; i < name.length(); i++)
					{
						//System.out.println("i = " + i);
						int des = i + 1;
						String firstPart = name.substring(0, des);
						String revFirstPart = new StringBuffer(firstPart).reverse().toString();
						//System.out.println("firstPart = " + firstPart);
						int kEndPoint = (name.length() - firstPart.length() - 1);
						for(int k = 0; k < kEndPoint; k++)
						{
							String midPart = "";
							if(k > 0)
								midPart = name.substring(i + 1, i + 1 + k);
							
							//System.out.println("midPart = " + midPart);
							if(k > 0)
								des += 1;
							
							int jEndPoint = name.length() - des - 1;
							for(int j = 0; j < jEndPoint; j++)
							{
								String secondPart = name.substring(des, j + des + 2);
								String revSecondPart = new StringBuffer(secondPart).reverse().toString();
								String lastPart = "";
								//System.out.println("secondPart = " + secondPart);
								if(j < jEndPoint - 1)
									lastPart = name.substring(j + des + 2);
								//System.out.println("lastPart = " + lastPart);
								
								String joinedString1 = firstPart + midPart + secondPart + lastPart;
								String joinedString2 = revFirstPart + midPart + secondPart + lastPart;
								String joinedString3 = revFirstPart + midPart + revSecondPart + lastPart;
								String joinedString4 = firstPart + midPart + revSecondPart + lastPart;
								
								if(isPalindrome(joinedString1) || isPalindrome(joinedString2) || isPalindrome(joinedString3) || isPalindrome(joinedString4))
								{
									System.out.println("joinedString1 = " + joinedString1);
									System.out.println("joinedString2 = " + joinedString2);
									System.out.println("joinedString3 = " + joinedString3);
									System.out.println("joinedString4 = " + joinedString4);
								}
							}
						}
					}
				}
			}
			n++;
		}
	}

}
