package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringGame {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			String word = br.readLine();
			
			int count = 0;
			for(int i = 97; i <= 122; i++)
			{
				char character = (char) i;
				int index = word.indexOf(character);
				if(index != -1)
					count++;
			}
			
			if(count % 2 == 0)
				System.out.println("Player2");
			else
				System.out.println("Player1");
			
			t++;
		}
	}

}
