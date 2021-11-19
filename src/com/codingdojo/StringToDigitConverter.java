package com.codingdojo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringToDigitConverter {
	
	//create FileReader
	
	public void fileConverter(){
		try {
			BufferedReader in = new BufferedReader(new FileReader("list.txt"));//reads file created above, substitute with file path here
			String str;// = in.readLine();
			
			File newFile = new File("digitList.txt");
			newFile.setWritable(true);
			newFile.setReadable(true);
			BufferedWriter out = new BufferedWriter(new FileWriter(newFile, true));
			//convertListToArraylistOfStringArrays(in);
			
				while( (str = in.readLine()) != null) {					
					out.append("\n");									
					out.write( ( convertSequenceToString(
						             	determineSequence(  str									
									          //in.readLine() 										          
									))));
					System.out.println("Read line: " + str);
	// is needed bc. otherwise will give java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "listItem" is null
	//str = in.readLine();
	
				}
				
				in.close();
				out.close();
				
			} catch (IOException e) {
				System.out.println("Exception occured in checkIfFirstLineIsEmpty(): " + e );
				e.printStackTrace();
			}
	}
	
	// take line out of file
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
		
		//parse through each of the 10 numbers to determine sequence
		for(int i = 0; i < 9; i++){
			//System.out.print("-> " + listItem.charAt(i) + " ");
//			System.out.println("\n");

			for(int k = 0; k < 10; k++){
			if(listItem.charAt(i) == individualNumbers[k]){
				sequenceItemLines.add(poolOfNumbersAsDigitSymbols.get(k));
				System.out.print("individualNumbers[k]: " + individualNumbers[k]);
				
				for(String c : poolOfNumbersAsDigitSymbols.get(k)){
					System.out.println(c);					
				}
				
			}
			}
			//System.out.println("\n");
		}
		
		System.out.println(" Size of determined array list = " + sequenceItemLines.size());
		return sequenceItemLines;
	}
	
	public String convertSequenceToString(ArrayList<String[]> sequenceOfLine){
		String resultString = "";
		//System.out.print("Size of sequenceOfLine: " + sequenceOfLine.size());
		//take each member of ArrayList. Each member
		
			for(int k = 0; k < 3; k++){
				
				for(int i = 0; i < 9; i++){
					
					resultString += sequenceOfLine.get(i)[k];

			System.out.print("-> " + resultString);
						
			}
				resultString += "\n";
				//System.out.print(resultString);
		}
		
			System.out.print(resultString);
		return resultString;
	}
	
//takes each line of list.txt and puts is into ArrayList<String[]> which in the end will be returned and used in ...
	public ArrayList<String[]> convertListToArraylistOfStringArrays(BufferedReader in){//hier sind noch alle Einträge erfasst.
		
		ArrayList<String[]> listOfLinesAsArrays = new ArrayList<String[]>();
		String[] temp = new String[9];
		
		try{
		//BufferedReader in = new BufferedReader(new FileReader("list.txt"));//reads file created above, substitute with file path here
		String str;// = in.readLine();
		
		int lineCount = 0;
		while((str = in.readLine()) != null){  //&& !in.readLine().isEmpty()){
			temp = convertStringToStringarray(str);
			listOfLinesAsArrays.add(temp);
			//System.out.println("Put into listOfLinesAsArrays: " + str);
			lineCount++;
		}
		System.out.println("LineCount: " + lineCount);

			//in.close();
			                 
		   } catch (Exception e){
			e.printStackTrace();
		                        }
			
		return listOfLinesAsArrays;
   }
	
	
public String[] convertStringToStringarray(String lineOfList){
	String[] result = new String[9];
	
	for(int i = 0; i < lineOfList.length(); i++){
		if( (i+1) <= (lineOfList.length()) ){
	result[i] = lineOfList.substring(i, i+1);
		}
	}
	
	return result;
}
	
}