package ch20_array;

public class CharArray {
	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		
		char ch ='A';
		
		for(int i =0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		for(char alpha : alphabets) {
			System.out.println(alpha+","+(int)alpha);
		}
	}
}
