package SDET21.GenericUtils;

import java.util.Random;

public class javautility {
	
	public int getRandomNunber()
	{
		Random ran = new Random();
		int random = ran.nextInt(100);
		return random;
		
	}

}
