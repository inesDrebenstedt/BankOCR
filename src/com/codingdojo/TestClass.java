package com.codingdojo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class TestClass {
	

	
	public ArrayList<String[]> convertListToArraylistOfStringArrays(){//hier sind noch alle Einträge erfasst.
		
		ArrayList<String[]> listOfLinesAsArrays = new ArrayList<String[]>();
		String[] temp = new String[9];
		
		try{
		BufferedReader in = new BufferedReader(new FileReader("list.txt"));//reads file created above, substitute with file path here
		String str = in.readLine();

		
		int lineCount = 0;
		while((str = in.readLine()) != null ){  //&& !in.readLine().isEmpty()){
			temp = convertStringToStringarray(str);
			
			listOfLinesAsArrays.add(temp);
			//System.out.println("Put into listOfLinesAsArrays: " + str);
			lineCount++;
			
		}
		
		System.out.println("LineCount: " + lineCount);

			in.close();			
		                                   
		   } catch (Exception e){
			e.printStackTrace();		                        
			}
			
		return listOfLinesAsArrays;
   }
//	
	public void showStringArraysInList( ArrayList<String[]> listOfLinesAsArrays ){
		
		String resultString = "";
		//System.out.println(listOfLinesAsArrays.size()); // contains 500 items
		
		for(int i = 0; i < listOfLinesAsArrays.size(); i++){
			for(int k = 0; k < listOfLinesAsArrays.get(i).length; k++){
				//System.out.print(listOfLinesAsArrays.get(i)[k]);
			}
			//System.out.println();
		}
		
	}
	
	public String[] convertStringToStringarray(String lineOfList){
		
		determineSequence(lineOfList);
		
		String[] resultAsArray = new String[9];
		int count = 0;
		
		for(int i = 0; i < lineOfList.length(); i++){
			count++;
			
			if( (i+1) <= lineOfList.length() ){
				resultAsArray[i] = lineOfList.substring(i, i+1);
				//System.out.print(": " + result[i]);
//				if(count == 9){
//					System.out.println();
//					count = 0;
//				}
			}
			
		}
		
		return resultAsArray;
	}
	
	public ArrayList<String[]> determineSequence(String listItem){
		
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
		
		ArrayList<String[]> sequenceItemLines = new ArrayList<String[]>();
		
		char[] individualNumbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		int count = 0;
		
		//parse through each of the 10 numbers to determine sequence
		for(int i = 0; i < 9; i++){
			//System.out.print("-> " + listItem.charAt(i) + " ");
//			System.out.println("\n");

			for(int k = 0; k < 10; k++){
				count++;
				
			if(listItem.charAt(i) == individualNumbers[k]){
				sequenceItemLines.add(poolOfNumbersAsDigitSymbols.get(k));
				//System.out.print("individualNumbers[k]: " + individualNumbers[k]);
				
				//System.out.println("Before System.out.print( c );");
				
				for(String c : poolOfNumbersAsDigitSymbols.get(k)){
					System.out.print( c + "\n");
//					if(count == 9){
//						System.out.println();
//					}
				}
				
			}
			}
//			System.out.println("\n");
		}
		
		System.out.println(" Size of determined array list = " + sequenceItemLines.size());
		return sequenceItemLines;
	}
	
	public void printSeqItemLines(ArrayList<String[]> sequenceItemLines){
		
		
	}
	

}
