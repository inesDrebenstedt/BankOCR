package com.codingdojo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test2 {

	//reads list.txt and gives List of lines as String items:
	public ArrayList<String> readList() {
		
		ArrayList<String> allLinesAsString = new ArrayList<String>();
		String listItem = "";
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("list.txt"));
			String str;// = in.readLine();
			
			while( (str = in.readLine()) != null) {					
 									
				listItem = str;									          
				allLinesAsString.add(listItem);
				//System.out.println("Read line: " + str);
				// is needed bc. otherwise will give java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "listItem" is null
				//str = in.readLine();
			}
			
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return allLinesAsString;
	}

	
	public ArrayList<String[]> makeStringListToStringarrayList(ArrayList<String> allLinesAsString){
		
		System.out.println("List size: " + allLinesAsString.size());
		
		ArrayList<String[]> allLinesAsStringArrays = new ArrayList<String[]>();
		String[] singleLineAsArray = new String[9];
		
		for(int i = 0; i < allLinesAsString.size(); i++){
					
			for(int k = 0; k < 9; k++){
				Character c;				
				c = allLinesAsString.get(i).charAt(k);
				singleLineAsArray[k] = c.toString();
				allLinesAsStringArrays.add(singleLineAsArray);
				//System.out.print(": " + c);
			
				if(k == 8){System.out.println();}
			}
		}
		
		return allLinesAsStringArrays;
	}
	
	public ArrayList<String[]> determineSequence(ArrayList<String[]> listItemsAsArrays){
		
		System.out.println(listItemsAsArrays.size());
		
		ArrayList<String[]> poolOfNumbersAsDigitSymbols = new ArrayList<String[]>();
		
		String[] zeroAsDigit = {" _ ", "| |", "|_|"};
		String[] oneAsDigit = {"   ", " | ", " | "};
		String[] twoAsDigit = {" _ ", " _|",  "|_ "};
		String[] threeAsDigit =  {" _ ", " _|" ,  " _|"};
		String[] fourAsDigit =  {"   " , "|_|" ,  "  |"};
		String[] fiveAsDigit =  {" _ " , "|_ " ,  " _|"};
		String[] sixAsDigit =  {" _ " , "|_ " ,  "|_|"};
		String[] sevenAsDigit = {"_  " , " | " , " | "};
		String[] eightAsDigit =  {" _ " , "|_|" ,  "|_|"};
		String[] nineAsDigit =  {" _ " , "|_|" ,  " _|"};
		
		poolOfNumbersAsDigitSymbols.add(zeroAsDigit);
		poolOfNumbersAsDigitSymbols.add(oneAsDigit);
		poolOfNumbersAsDigitSymbols.add(twoAsDigit);
		poolOfNumbersAsDigitSymbols.add(threeAsDigit);
		poolOfNumbersAsDigitSymbols.add(fourAsDigit);
		poolOfNumbersAsDigitSymbols.add(fiveAsDigit);
		poolOfNumbersAsDigitSymbols.add(sixAsDigit);
		poolOfNumbersAsDigitSymbols.add(sevenAsDigit);
		poolOfNumbersAsDigitSymbols.add(eightAsDigit);
		poolOfNumbersAsDigitSymbols.add(nineAsDigit);
		
		//ArrayList<String[]> sequenceItemLines = new ArrayList<String[]>();
		
		String[] singleLineAsStringArray = new String[9];
		String[] individualNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

		for(int m = 0; m < 500; m++){
		for(int i = 0; i < 9; i++){
			singleLineAsStringArray = listItemsAsArrays.get(m);
			System.out.print("->" + singleLineAsStringArray[i]);
			if(m%8 == 0){
				System.out.println();
			}

			for(int k = 0; k < 10; k++){
				
//			if(listItemsAsArrays.get(i)[k] == individualNumbers[k]){
//				sequenceItemLines.add(poolOfNumbersAsDigitSymbols.get(k));
//				System.out.print("individualNumbers[k]: " + individualNumbers[k]);
//				
//				for(String c : poolOfNumbersAsDigitSymbols.get(k)){
//					System.out.println(c);					
//				}
//				
//			}
				
			}
			//System.out.println("\n");
		}
		}
		
		//System.out.println(" Size of determined array list = " + sequenceItemLines.size());
		return null;
	}
	
	
}
