package com.codingdojo.testclasses;

import com.codingdojo.FileMaker;
import com.codingdojo.StringToDigitConverter;

public class TestMain {

	public static void main(String[] args) {
		
		Double x = 0.0;
		
		for(int i = 0; i < 500; i++){
			x = Math.random()* 10;
			int y = x.intValue();
			//x = (double) Math.round(x);
			
		//System.out.println( y );
		}

		
//		FileMaker fm = new FileMaker();
//		fm.testAccountNumberMaker();	
		
		StringToDigitConverter stdc = new StringToDigitConverter();
		//System.out.println("---> " + "\n" + stdc.numberToDigit('0') );
//		
//		stdc.fileConverter();
//		stdc.convertListToArraylistOfStringArrays();
		
		char[] individualNumbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

		
	}

}
