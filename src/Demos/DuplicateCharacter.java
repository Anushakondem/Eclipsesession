package Demos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) 
	{
		String str = "Maheshbabu";
		char[] chars = str.toCharArray();// m a h e s h b a b u
		Map<Character, Integer>charMap = new HashMap<>();
		//m =1; a = 2; h=2;e=1;
		
		for (Character  ch : chars) 
		{
			if (charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);//a=2; h= 2;
			}
			else
			{
				charMap.put(ch, 1);//m = 1; e =1;s=1;
			}
		}
		Set<Character> keys = charMap.keySet();
		for (Character ch : keys)
		{
			if (charMap.get(ch)>1)
			{
				System.out.println("Character " + ch + " duplicate"+ charMap.get(ch) + "times");
			}
		}

	}

}
