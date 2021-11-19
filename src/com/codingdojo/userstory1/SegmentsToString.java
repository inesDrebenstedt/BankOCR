package com.codingdojo.userstory1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.naming.spi.DirStateFactory.Result;

public class SegmentsToString {
	
	public static CharSequence[] poolOfSegmentedNumbers = new CharSequence[10];	

//	public void fileConverter(){
//		try {
//			BufferedReader in = new BufferedReader(new FileReader("digitList.txt"));//reads file created above, substitute with file path here
//			String str;
//			File newFile = new File("accountNumbersList.txt");
//			newFile.setWritable(true);
//			newFile.setReadable(true);
//			BufferedWriter out = new BufferedWriter(new FileWriter(newFile, true));
//			
//				while( (str = in.readLine()) != null) {
//					//TODO
//					out.append("\n");					
//					out.append( readSegmentLineAndConvertToString() );
//	// is needed bc. otherwise will give java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "listItem" is null
//	str = in.readLine();
//				}
//				
//				in.close();
//				out.close();
//				
//			} catch (IOException e) {
//				System.out.println("Exception occured in checkIfFirstLineIsEmpty(): " + e );
//				e.printStackTrace();
//			}
//	}
	
	public StringBuilder readSegmentLineAndConvertToString(){
		
		int count = 0;
		
		StringBuilder result = new StringBuilder();
		ArrayList<StringBuilder> resultList = new ArrayList<StringBuilder>();
				
		String erste = "";
		String zweite = "";
		String dritte = "";
		String vierte = "";
		String fuenfte = "";
		String sechste = "";
		String siebte = "";
		String achte = "";
		String neunte = "";
		
		//ArrayList<String> firstArabics = new ArrayList<String>();
		ArrayList<String> singleGroupOfFourLines = new ArrayList<String>();
		ArrayList<ArrayList<String>> allGroupsOfFourLines = new ArrayList<ArrayList<String>>();
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("digitList.txt"));//reads file created above, substitute with file path here
			String str;
			File newFile = new File("accountNumbersList.txt");
			newFile.setWritable(true);
			newFile.setReadable(true);
			BufferedWriter out = new BufferedWriter(new FileWriter(newFile, true));
			
 			
			int lineCounter = 0;
			//parse through file, take each 4 lines and put them into group
				while( (str = in.readLine()) != null) {
		
					count++;
					
					if(str.length() != 0){						
					//str = in.readLine();
					
						CharSequence first = str.subSequence(0, 3);						
						erste += first + "\n";						
						CharSequence second = str.subSequence(3, 6);
						zweite += second + "\n";
						CharSequence third = str.subSequence(6, 9);
						dritte += third + "\n";
						CharSequence fourth = str.subSequence(9, 12);
						vierte += fourth + "\n";
						CharSequence fifth = str.subSequence(12, 15);
						fuenfte += fifth + "\n";
						CharSequence sixth = str.subSequence(15, 18);
						sechste += sixth + "\n";
						CharSequence seventh = str.subSequence(18, 21);
						siebte += seventh + "\n";
						CharSequence eighth = str.subSequence(21, 24);
						achte += eighth + "\n";
						CharSequence nineth = str.subSequence(24, 27);
						neunte += nineth + "\n";
						
						System.out.println(first 
								+ " " + second 
								+ " " + third + " " + fourth + " " + fifth 
								+ " " + sixth + " " + seventh + " " + eighth 
								+ " " + nineth);	
						
						out.append("\n");					
						out.append( first 
								+ " " + second 
								+ " " + third + " " + fourth + " " + fifth 
								+ " " + sixth + " " + seventh + " " + eighth 
								+ " " + nineth );
					}

					//System.out.println("line count" + lineCounter);
					lineCounter++;
					
					//System.out.println("-> " + str );//+ ", linecount: " + lineCounter);
					singleGroupOfFourLines.add(str);	
					
					if( (lineCounter / 4) == 1){
						lineCounter = 0;
						allGroupsOfFourLines.add(singleGroupOfFourLines);
						//firstArabics.add(erste);
//												
						
						result.append( takeDigitalNumberAndConvertItToChar(erste)
								+ takeDigitalNumberAndConvertItToChar(zweite)
								+ takeDigitalNumberAndConvertItToChar(dritte)
								+ takeDigitalNumberAndConvertItToChar(vierte)
								+ takeDigitalNumberAndConvertItToChar(fuenfte)
								+ takeDigitalNumberAndConvertItToChar(sechste)
								+ takeDigitalNumberAndConvertItToChar(siebte)
								+ takeDigitalNumberAndConvertItToChar(achte)
								+ takeDigitalNumberAndConvertItToChar(neunte)
						        + "\n");
						
						resultList.add(result);
						
						//System.out.println(result);
//						System.out.println("++++++++++++++++++++++++++++++++++++");
//						System.out.println( resultList.get(resultList.size()-1));
//						System.out.println("++++++++++++++++++++++++++++++++++++");

						
						 erste = "";
						 zweite = "";
						 dritte = "";
						 vierte = "";
						 fuenfte = "";
						 sechste = "";
						 siebte = "";
						 achte = "";
						 neunte = "";
						
						System.out.println("count: " + count);
						System.out.println("Group completed!, # " + allGroupsOfFourLines.size());						
					}	
					

					
	// is not allowed here bc. otherwise will give nonsense String output
	//str = in.readLine();
				
				}
				
				in.close();
				out.close();
				
				//test(zweite);
				
				//System.out.println("1st: " + erste );
				//System.out.println("2nd: " + zweite);
															
			} catch (IOException e) {
				System.out.println("Exception occured in checkIfFirstLineIsEmpty(): " + e );
				e.printStackTrace();
			}
		
		return result;
	}
	
	public String takeDigitalNumberAndConvertItToChar(String numberOverThreeLines){
		
		String[] individualNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] numbersAsDigits = new String[10];
		
//		String zeroAsDigit = 
		numbersAsDigits[0] = " _ " + "\n" + "| |" + "\n" + "|_|" + "\n";
//		String oneAsDigit = 
		numbersAsDigits[1] = "   " + "\n" + " | " + "\n" + " | " + "\n";
//		String twoAsDigit = 
		numbersAsDigits[2] = " _ " + "\n" + " _|" + "\n" +  "|_ " + "\n";
//		String threeAsDigit =
		numbersAsDigits[3] =  " _ " + "\n" + " _|" + "\n" +  " _|" + "\n";
//		String fourAsDigit =  
		numbersAsDigits[4] = "   " + "\n" + "|_|" + "\n" +  "  |" + "\n";
//		String fiveAsDigit = 
		numbersAsDigits[5] = " _ " + "\n" + "|_ " + "\n" + " _|" + "\n" ;
//		String sixAsDigit =  
		numbersAsDigits[6] = " _ " + "\n" + "|_ " + "\n" +  "|_|" + "\n";
//		String sevenAsDigit = 
		numbersAsDigits[7] = "_  " + "\n" + " | " + "\n" + " | " + "\n";
//		String eightAsDigit =  
		numbersAsDigits[8] = " _ " + "\n" + "|_|" + "\n" +  "|_|" + "\n";
//		String nineAsDigit =  
		numbersAsDigits[9] = " _ " + "\n" + "|_|" + "\n" +  " _|" + "\n";
				
		String threeLiner = numberOverThreeLines.substring(0, 12);
		String result = null;
		
		for(int i = 0; i < numbersAsDigits.length; i++){
			if(numbersAsDigits[i].contains(threeLiner)){
				result = individualNumbers[i];
				//System.out.print( individualNumbers[i] );
			}
		}
		
//		CharSequence cs1 = threeLiner;
//		CharSequence cs2 = fiveAsDigit;
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		System.out.println(threeLiner);
//		System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§");
//		System.out.println(fiveAsDigit);
//		
//		boolean test = fiveAsDigit.contentEquals(cs1);
//		System.out.println(test);

			return result;
	}
	
	public void test2(ArrayList<String> firstArabics){
		
		System.out.println("Size of firstArabics: " + firstArabics.size());
		
		System.out.println( firstArabics.get( firstArabics.size()-1 ) );
	}


}
