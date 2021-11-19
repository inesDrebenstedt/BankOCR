package com.codingdojo.testclasses;

import com.codingdojo.StringToDigitConverter;
import com.codingdojo.Test2;
import com.codingdojo.TestClass;

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
		
		//stdc.fileConverter();
		System.out.println("-------------------------------------------------------------------------------");
		//TestClass tc = new TestClass();
		//tc.convertListToArraylistOfStringArrays();
		//tc.showStringArraysInList(tc.convertListToArraylistOfStringArrays());
		
		//Test2 t2 = new Test2();
		//t2.makeStringListToStringarrayList( t2.readList() );
		//t2.determineSequence( t2.makeStringListToStringarrayList( t2.readList() ) );
		System.out.println("-------------------------------------------------------------------------------");

		
		char[] individualNumbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

		
	}

}
