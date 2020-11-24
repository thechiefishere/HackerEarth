package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BattleOfWords {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			ArrayList<Character> alice = new ArrayList<>();
			ArrayList<Character> bob = new ArrayList<>();
			
			StringTokenizer aliceString = new StringTokenizer(br.readLine());
			StringTokenizer bobString = new StringTokenizer(br.readLine());
			
			while(aliceString.hasMoreTokens())
			{
				String stk = aliceString.nextToken();
				for(int i = 0; i < stk.length(); i++)
					alice.add(stk.charAt(i));
			}
			while(bobString.hasMoreTokens())
			{
				String stk = bobString.nextToken();
				for(int i = 0; i < stk.length(); i++)
					bob.add(stk.charAt(i));
			}
			
			Collections.sort(alice);
			Collections.sort(bob);
			
			boolean aliceWinsRound = false;
			boolean bobWinsRound = false;
			
			for(int i = 97; i <= 122; i++)
			{
				char toTest = (char)i;
				int aliceFirstIndex = alice.indexOf(toTest);
				int aliceLastIndex = alice.lastIndexOf(toTest);
				int numOfCharInAlice = aliceLastIndex - aliceFirstIndex;
				if(aliceFirstIndex == -1)
					numOfCharInAlice = -1;
				
				int bobFirstIndex = bob.indexOf(toTest);
				int bobLastIndex = bob.lastIndexOf(toTest);
				int numOfCharInBob = bobLastIndex - bobFirstIndex;
				if(bobFirstIndex == -1)
					numOfCharInBob = -1;
				
				if(numOfCharInAlice > numOfCharInBob)
					aliceWinsRound = true;
				else if(numOfCharInBob > numOfCharInAlice)
					bobWinsRound = true;
				
				if(aliceWinsRound && bobWinsRound)
				{
					System.out.println("You draw some.");
					break;
				}
			}
			
			if(aliceWinsRound && bobWinsRound == false)
				System.out.println("You win some.");
			else if(aliceWinsRound == false && bobWinsRound)
				System.out.println("You lose some.");
			
			
			t++;
		}
	}

}
