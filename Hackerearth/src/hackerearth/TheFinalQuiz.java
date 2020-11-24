package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class TheFinalQuiz {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int t = 0;
		while(t < T)
		{
			System.out.println("t = " + (t + 1));
			List<Integer> arr = new ArrayList<>();
			List<Integer> winCount = new ArrayList<>();
			
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int myScore = Integer.parseInt(stk.nextToken());
			int aliceScore = Integer.parseInt(stk.nextToken());
			int bobScore = Integer.parseInt(stk.nextToken());
			List<Integer> answerList = new ArrayList<>();
			
			stk = new StringTokenizer(br.readLine());
			int aliceGuess = Integer.parseInt(stk.nextToken());
			int bobGuess = Integer.parseInt(stk.nextToken());
			
			int aliceAddition = aliceScore + aliceGuess;
			int aliceSubtraction = aliceScore - aliceGuess;
			int bobAddition = bobScore + bobGuess;
			int bobSubtraction = bobScore - bobGuess;
			
			arr.add(aliceScore + aliceGuess);
			arr.add(aliceScore - aliceGuess);
			arr.add(bobScore + bobGuess);
			arr.add(bobScore - bobGuess);
			System.out.println("myScore = " + myScore);
			System.out.println("arr = " + arr);
			if((aliceAddition >= (myScore * 2) && aliceSubtraction >= (myScore * 2)) || (bobAddition >= (myScore * 2) && bobSubtraction >= (myScore * 2)))
				System.out.println(0);
			else
			{
				for(int i = 0; i < arr.size(); i++)
				{
					int wCountA = 0;
					int wCountS = 0;
					if(myScore * 2 > arr.get(i) + 1)
					{
						int diff = (arr.get(i) + 1) - myScore;
						if(diff < 0)
							diff = 0;
						int toCheckA = myScore + diff;
						int toCheckS = myScore - diff;
						System.out.println("when arr(i) = " + arr.get(i) + " toCheckA = " + toCheckA + " and toCheckS = " + toCheckS);
						
						for(int j = 0; j < arr.size(); j++)
						{
							if(toCheckA > arr.get(j))
								wCountA++;
							if(toCheckS > arr.get(j))
								wCountS++;
						}
					}
					System.out.println("when arr(i) = " + arr.get(i) + " wCountA = " + wCountA + " and wCountS = " + wCountS);
					winCount.add(wCountA);
					winCount.add(wCountS);
				}
				
				for(int i = 0; i < winCount.size(); i++)
				{
					winCount.add(i, winCount.get(i) + winCount.get(i + 1));
					winCount.remove(i + 1);
					winCount.remove(i + 1);
				}
				
				System.out.println("winCount = " + winCount.toString());
				ArrayList<Integer> winCountCopy = new ArrayList<>();
				winCountCopy.addAll(winCount);
				Collections.sort(winCountCopy, Collections.reverseOrder());
				int mostWins = winCountCopy.get(0);
				
				for(int i = 0; i < winCount.size(); i++)
				{
					if(winCount.get(i) == mostWins)
					{
						int toAdd = (arr.get(i) + 1) - myScore;
						if(toAdd < 0)
							toAdd = 0;
						answerList.add(toAdd);
					}
				}
				if(mostWins == 0)
					System.out.println(0);
				else
				{
					System.out.println("answerList = " + answerList.toString());
					Collections.sort(answerList);
					System.out.println(answerList.get(0));
				}
			}
			
			/*List<Integer> guessList = new ArrayList<>();
			int answer = 0;
			if(aliceAddition >= bobAddition && (myScore * 2) >= aliceAddition + 1)
			{
				int toAdd = (aliceAddition + 1) - myScore;
				if(toAdd < 0)
					toAdd = 0;
				guessList.add(toAdd);
			}
			else if(bobAddition > aliceAddition && (myScore * 2) >= bobAddition + 1)
			{
				int toAdd = (bobAddition + 1) - myScore;
				if(toAdd < 0)
					toAdd = 0;
				guessList.add(toAdd);
			}
			else if(aliceAddition >= bobAddition && (myScore * 2) < aliceAddition + 1 && (myScore * 2) >= bobAddition + 1)
			{
				System.out.println("I entered here");
				int toAdd = (bobAddition + 1) - myScore;
				if(toAdd < 0)
					toAdd = 0;
				guessList.add(toAdd);
			}
			else if(bobAddition > aliceAddition && (myScore * 2) < bobAddition + 1 && (myScore * 2) >= aliceAddition + 1)
			{
				int toAdd = (aliceAddition + 1) - myScore;
				if(toAdd < 0)
					toAdd = 0;
				guessList.add(toAdd);
			}
			if(aliceSubtraction >= bobSubtraction && (myScore * 2) >= aliceSubtraction + 1)
			{
				int toAdd = (aliceSubtraction + 1) - myScore;
				if(toAdd < 0)
					toAdd = 0;
				guessList.add(toAdd);
			}
			else if(bobSubtraction > aliceSubtraction && (myScore * 2) >= bobSubtraction + 1)
			{
				int toAdd = (bobSubtraction + 1) - myScore;
				if(toAdd < 0)
					toAdd = 0;
				guessList.add(toAdd);
			}
			if(guessList.size() == 2)
			{
				if(t + 1 == 64)
					System.out.println(guessList.toString());
				int sub = myScore + guessList.get(0);
				if(sub > aliceSubtraction && sub > bobSubtraction)
					answer = guessList.get(0);
				else
					answer = guessList.get(1);
			}
			else if(guessList.size() == 1)
				answer = guessList.get(0);
			
			System.out.println("answer = " + answer);
			
			/*for(int i = 0; i < arr.size(); i++)
			{
				int wCountA = 0;
				int wCountS = 0;
				if(myScore * 2 > arr.get(i) + 1)
				{
					int diff = (arr.get(i) + 1) - myScore;
					if(diff < 0)
						diff *= -1;
					int toCheckA = myScore + diff;
					int toCheckS = myScore - diff;
				}
			}*/
			
			t++;
		}
	}

}
