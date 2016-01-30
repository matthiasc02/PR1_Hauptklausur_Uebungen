package org.campus02.rekursion;

public class Palindrom {
	
public static boolean checkpalindrom(String Text){
		
		if(Text.length()<= 1){
			return true;
		}
		
		char first = Text.charAt(0);
		char last = Text.charAt(Text.length()-1);
		

		if(!Character.isLetter(first)){
			return checkpalindrom(Text.substring(1,Text.length()));
		}
		
		if(!Character.isLetter(last)){
			return checkpalindrom(Text.substring(0,Text.length()-1));
		}

		if(Character.isLetter(first) && Character.isLetter(last)){
		first=Character.toLowerCase(first);
		last=Character.toLowerCase(last);
		} else return false;
		
		if(first==last){
			return checkpalindrom(Text.substring(1,Text.length()-1));
		}
		return false;		
	}
}
