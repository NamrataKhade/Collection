package com.nts.corejava;

public class FormatString {
	public static void main(String[] args) {
		
		//Letter = “Dear Harry, This Java Course is nice. Thanks”
		
		//String letter=\" Dear Harry\,This Java is nice \. Thanks\";
		String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
        System.out.println();
        
        String replaceex="Have a  nice day !!";
        String replace = replaceex.replace(" ", "_");
        System.out.println(replace);
        
        //detect double and triple spaces in string
        String detect="Hello  Everyone   ,I hope all ok !!";
        System.out.println(detect.indexOf("  "));
        System.out.println(detect.indexOf("    "));
        
        


	}

}
