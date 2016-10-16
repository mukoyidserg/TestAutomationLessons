package lesson3.intermediatelevel;

import java.util.Arrays;

public class Task8 {
	
	public void camelCaseSeparator(String camelString) {
		String wordsInString[] = camelString.split("(?=\\p{Upper})");
		System.out.println(Arrays.toString(camelString.split("(?=\\p{Upper})")));
	}
	
	public static void main(String[] args) {
		Task8 myInstance = new Task8();
		myInstance.camelCaseSeparator("checkChangingProfilePicture");
	}



