package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheDice {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		boolean doneAlready = false;
		if(s.charAt(s.length() - 1) == 6)
			System.out.println("-1");
		else
		{
			int count = 0;
			for(int i = 0; i < s.length(); i++)
			{
				if(Character.getNumericValue(s.charAt(i)) > 6 || Character.getNumericValue(s.charAt(s.length() - 1)) == 6)
				{
					doneAlready = true;
					System.out.println("-1");
					break;
				}
				else if(Character.getNumericValue(s.charAt(i)) < 6)
					count++;
				else if(Character.getNumericValue(s.charAt(i)) == 6)
				{
					count++;
					int inc = 0;
					for(int j = i; j < s.length(); j++)
					{
						if(Character.getNumericValue(s.charAt(j)) == 6)
							inc++;
						else
							break;
					}	
					i += inc;
				}
			}
			if(!doneAlready)
			    System.out.println(count);
		}
	}

}
