package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoyAndLeds {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(stk.nextToken());
		int R = Integer.parseInt(stk.nextToken());
		int G = Integer.parseInt(stk.nextToken());
		int B = Integer.parseInt(stk.nextToken());
		
		boolean redState = false;
		boolean greenState = false;
		boolean blueState = false;
		
		int redOnly = 0;
		int greenOnly = 0;
		int blueOnly = 0;
		int yellow = 0;
		int magenta = 0;
		int cyan = 0;
		int white = 0;
		int black = 0;
		
		int redCounter = 0;
		int greenCounter = 0;
		int blueCounter = 0;
		
		for(int i = 0; i < T; i++)
		{
			if(redState && !greenState && !blueState)
				redOnly++;
			else if(!redState && greenState && !blueState)
				greenOnly++;
			else if(!redState && !greenState && blueState)
				blueOnly++;
			else if(redState && greenState && !blueState)
				yellow++;
			else if(!redState && greenState && blueState)
				cyan++;
			else if(redState && !greenState && blueState)
				magenta++;
			else if(redState && greenState && blueState)
				white++;
			else if(!redState && !greenState && !blueState)
				black++;
			
			redCounter++;
			blueCounter++;
			greenCounter++;
			
			if(redCounter == R)
			{
				if(redState)
					redState = false;
				else
					redState = true;
				
				redCounter = 0;
			}
			if(greenCounter == G)
			{
				if(greenState)
					greenState = false;
				else
					greenState = true;
				
				greenCounter = 0;
			}
			if(blueCounter == B)
			{
				if(blueState)
					blueState = false;
				else
					blueState = true;
				
				blueCounter = 0;
			}
		}
		
		System.out.println(redOnly + " " + greenOnly + " " + blueOnly + " " + yellow + " " + cyan + " " + magenta + " " + white + " " + black);
	}

}
