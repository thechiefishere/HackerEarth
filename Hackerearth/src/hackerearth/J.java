package hackerearth;

import java.util.Scanner;

public class J {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0; i <= 260; i++)
		{
			if(i % 3 == 0)
				continue;
			if(Integer.toString(i).indexOf('3') >= 0)
				continue;
			if(i > n)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
