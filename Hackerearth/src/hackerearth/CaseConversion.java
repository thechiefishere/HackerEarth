package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaseConversion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			String S = br.readLine();
			
			StringBuffer sb = new StringBuffer("");
			
			if(Character.isUpperCase(S.charAt(0)))
			{
				int baseIndex = 0;
				int newIndex = 0;
				for(int i = 0; i < S.length(); i++)
				{
					
					if(Character.isUpperCase(S.charAt(i)) || i == S.length() - 1)
					{
						newIndex = i;
						if(i == S.length() - 1 && Character.isLowerCase(S.charAt(i)))
							newIndex += 1;
						String eachWord = S.substring(baseIndex, newIndex).toLowerCase();
						sb.append(eachWord + "_");
						baseIndex = newIndex;
					}
					if(i == S.length() - 1 && Character.isUpperCase(S.charAt(i)))
					{
						sb.append(Character.toLowerCase(S.charAt(i)));
						sb.deleteCharAt(0);
					}
					else if(i == S.length() - 1 && !Character.isUpperCase(S.charAt(i)))
					{
						sb.deleteCharAt(sb.length() - 1);
						sb.deleteCharAt(0);
					}
				}
				
				System.out.println(sb);
			}
			else
			{
				int baseIndex = 0;
				int newIndex = 0;
				for(int i = 0; i < S.length(); i++)
				{
					
					if(Character.isUpperCase(S.charAt(i)) || i == S.length() - 1)
					{
						newIndex = i;
						if(i == S.length() - 1 && Character.isLowerCase(S.charAt(i)))
							newIndex += 1;
						String eachWord = S.substring(baseIndex, newIndex).toLowerCase();
						sb.append(eachWord + "_");
						baseIndex = newIndex;
					}
					if(i == S.length() - 1 && Character.isUpperCase(S.charAt(i)))
						sb.append(Character.toLowerCase(S.charAt(i)));
					else if(i == S.length() - 1 && !Character.isUpperCase(S.charAt(i)))
						sb.deleteCharAt(sb.length() - 1);
				}
				
				System.out.println(sb);
			}
			t++;
		}
	}

}
