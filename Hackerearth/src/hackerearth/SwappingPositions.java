package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwappingPositions {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			int N = Integer.parseInt(br.readLine());
			String Si = br.readLine();
			String Ti = br.readLine();
			
			StringBuffer diff = new StringBuffer("");
			if(Si.equals(Ti))
				System.out.println("YES");
			else
			{
				int count = 0;
				for(int i = 0; i < Si.length(); i++)
				{
					if(Character.compare(Si.charAt(i), Ti.charAt(i)) != 0)
					{
						diff.append(Si.charAt(i));
						diff.append(Ti.charAt(i));
						count++;
					}
					if(count > 2)
					{
						System.out.println("NO");
						break;
					}
				}
				if(count == 1)
					System.out.println("YES");
				else if(count == 2)
				{
					if(diff.charAt(0) == diff.charAt(1) || diff.charAt(0) == diff.charAt(3) 
							|| diff.charAt(2) == diff.charAt(1) || diff.charAt(2) == diff.charAt(3))
						System.out.println("YES");
					else if(diff.charAt(0) == diff.charAt(2) && diff.charAt(1) == diff.charAt(3))
						System.out.println("YES");
					else
						System.out.println("NO");
				}
			}
			
			t++;
		}
	}

}
