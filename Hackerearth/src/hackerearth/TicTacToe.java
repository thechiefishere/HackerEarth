package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TicTacToe {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] arr = new String[3][3];
		
		boolean done = false;
		int xCount = 0;
		int oCount = 0;
		int dotCount = 0;
		for(int i = 0; i < 3; i++)
		{
			StringTokenizer stk = new StringTokenizer(br.readLine());
			String s = stk.nextToken();
			for(int j = 0; j < 3; j++)
			{
				String toAdd = Character.toString(s.charAt(j));
				arr[i][j] = toAdd;
				if(toAdd.equals("X"))
					xCount++;
				else if(toAdd.equals("O"))
					oCount++;
				else
					dotCount++;
			}
		}
		if(oCount > xCount)
			System.out.println("Wait, what?");
		else if(xCount >= oCount + 2)
			System.out.println("Wait, what?");
		else if(arr[0][0].equals("X") && arr[0][1].equals("X") && arr[0][2].equals("X") && 
				((arr[1][0].equals("O") && arr[1][1].equals("O") && arr[1][2].equals("O")) || (arr[2][0].equals("O") && arr[2][1].equals("O") && arr[2][2].equals("O"))))
			System.out.println("Wait, what?");
		else if(arr[0][0].equals("O") && arr[0][1].equals("O") && arr[0][2].equals("O") && 
				((arr[1][0].equals("X") && arr[1][1].equals("X") && arr[1][2].equals("X")) || (arr[2][0].equals("X") && arr[2][1].equals("X") && arr[2][2].equals("X"))))
			System.out.println("Wait, what?");
		else if(arr[1][0].equals("X") && arr[1][1].equals("X") && arr[1][2].equals("X") &&
				((arr[0][0].equals("O") && arr[0][1].equals("O") && arr[0][2].equals("O")) || (arr[2][0].equals("O") && arr[2][1].equals("O") && arr[2][2].equals("O"))))
			System.out.println("Wait, what?");
		else if(arr[1][0].equals("O") && arr[1][1].equals("O") && arr[1][2].equals("O") &&
				((arr[0][0].equals("X") && arr[0][1].equals("X") && arr[0][2].equals("X")) || (arr[2][0].equals("X") && arr[2][1].equals("X") && arr[2][2].equals("X"))))
			System.out.println("Wait, what?");
		else if(arr[2][0].equals("X") && arr[2][1].equals("X") && arr[2][2].equals("X") && 
				((arr[0][0].equals("O") && arr[0][1].equals("O") && arr[0][2].equals("O") || (arr[1][0].equals("O") && arr[1][1].equals("O") && arr[1][2].equals("O")))))
			System.out.println("Wait, what?");
		else if(arr[2][0].equals("O") && arr[2][1].equals("O") && arr[2][2].equals("O") && 
				((arr[0][0].equals("X") && arr[0][1].equals("X") && arr[0][2].equals("X") || (arr[1][0].equals("X") && arr[1][1].equals("X") && arr[1][2].equals("X")))))
			System.out.println("Wait, what?");
		else if(arr[0][0].equals("X") && arr[1][0].equals("X") && arr[2][0].equals("X") && 
				((arr[0][1].equals("O") && arr[1][1].equals("O") && arr[2][1].equals("O")) || (arr[0][2].equals("O") && arr[1][2].equals("O") && arr[2][2].equals("O"))))
			System.out.println("Wait, what?");
		else if(arr[0][0].equals("O") && arr[1][0].equals("O") && arr[2][0].equals("O") && 
				((arr[0][1].equals("X") && arr[1][1].equals("X") && arr[2][1].equals("X")) || (arr[0][2].equals("X") && arr[1][2].equals("X") && arr[2][2].equals("X"))))
			System.out.println("Wait, what?");
		else if(arr[0][1].equals("X") && arr[1][1].equals("X") && arr[2][1].equals("X") && 
				((arr[0][0].equals("O") && arr[1][0].equals("O") && arr[2][0].equals("O")) || (arr[0][2].equals("O") && arr[1][2].equals("O") && arr[2][2].equals("O"))))
			System.out.println("Wait, what?");
		else if(arr[0][1].equals("O") && arr[1][1].equals("O") && arr[2][1].equals("O") && 
				((arr[0][0].equals("X") && arr[1][0].equals("X") && arr[2][0].equals("X")) || (arr[0][2].equals("X") && arr[1][2].equals("X") && arr[2][2].equals("X"))))
			System.out.println("Wait, what?");
		else if(arr[0][2].equals("X") && arr[1][2].equals("X") && arr[2][2].equals("X") && 
				((arr[0][0].equals("O") && arr[1][0].equals("O") && arr[2][0].equals("O")) || (arr[0][1].equals("O") && arr[1][1].equals("O") && arr[2][1].equals("O"))))
			System.out.println("Wait, what?");
		else if(arr[0][2].equals("O") && arr[1][2].equals("O") && arr[2][2].equals("O") && 
				((arr[0][0].equals("X") && arr[1][0].equals("X") && arr[2][0].equals("X")) || (arr[0][1].equals("X") && arr[1][1].equals("X") && arr[2][1].equals("X"))))
			System.out.println("Wait, what?");
		else if((arr[0][0].equals("X") && arr[0][1].equals("X") && arr[0][2].equals("X")) || (arr[0][0].equals("O") && arr[0][1].equals("O") && arr[0][2].equals("O")))
		{
			if(arr[0][0].equals("X"))
			{
				if(xCount == oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("X won.");
			}
			else
			{
				if(xCount > oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("O won.");
			}
		}
		else if((arr[1][0].equals("X") && arr[1][1].equals("X") && arr[1][2].equals("X")) || (arr[1][0].equals("O") && arr[1][1].equals("O") && arr[1][2].equals("O")))
		{
			if(arr[1][0].equals("X"))
			{
				if(xCount == oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("X won.");
			}
			else
			{
				if(xCount > oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("O won.");
			}
		}
		else if((arr[2][0].equals("X") && arr[2][1].equals("X") && arr[2][2].equals("X")) || (arr[2][0].equals("O") && arr[2][1].equals("O") && arr[2][2].equals("O")))
		{
			if(arr[2][0].equals("X"))
			{
				if(xCount == oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("X won.");
			}
			else
			{
				if(xCount > oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("O won.");
			}
		}
		else if((arr[0][0].equals("X") && arr[1][0].equals("X") && arr[2][0].equals("X")) || (arr[0][0].equals("O") && arr[1][0].equals("O") && arr[2][0].equals("O")))
		{
			if(arr[0][0].equals("X"))
			{
				if(xCount == oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("X won.");
			}
			else
			{
				if(xCount > oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("O won.");
			}
		}
		else if((arr[0][1].equals("X") && arr[1][1].equals("X") && arr[2][1].equals("X")) || (arr[0][1].equals("O") && arr[1][1].equals("O") && arr[2][1].equals("O")))
		{
			if(arr[0][1].equals("X"))
			{
				if(xCount == oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("X won.");
			}
			else
			{
				if(xCount > oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("O won.");
			}
		}
		else if((arr[0][2].equals("X") && arr[1][2].equals("X") && arr[2][2].equals("X")) || (arr[0][2].equals("O") && arr[1][2].equals("O") && arr[2][2].equals("O")))
		{
			if(arr[0][2].equals("X"))
			{
				if(xCount == oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("X won.");
			}
			else
			{
				if(xCount > oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("O won.");
			}
		}
		else if((arr[0][0].equals("X") && arr[1][1].equals("X") && arr[2][2].equals("X")) || (arr[0][0].equals("O") && arr[1][1].equals("O") && arr[2][2].equals("O")))
		{
			if(arr[0][0].equals("X"))
			{
				if(xCount == oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("X won.");
			}
			else
			{
				if(xCount > oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("O won.");
			}
		}
		else if((arr[0][2].equals("X") && arr[1][1].equals("X") && arr[2][0].equals("X")) || (arr[0][2].equals("O") && arr[1][1].equals("O") && arr[2][0].equals("O")))
		{
			if(arr[0][2].equals("X"))
			{
				if(xCount == oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("X won.");
			}
			else
			{
				if(xCount > oCount)
					System.out.println("Wait, what?");
				else
					System.out.println("O won.");
			}
		}
		else if(dotCount != 0)
		{
			if(oCount == xCount)
				System.out.println("X's turn.");
			else
				System.out.println("O's turn.");
		}
		else if(dotCount == 0)
			System.out.println("It's a draw.");
	}

}
