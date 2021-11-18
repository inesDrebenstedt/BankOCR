package com.codingdojo.userstory1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class SegmentsToString {
	
	public static CharSequence[] poolOfSegmentedNumbers = new CharSequence[10];	

	public void fileConverter(){
		try {
			BufferedReader in = new BufferedReader(new FileReader("digitList.txt"));//reads file created above, substitute with file path here
			String str;
			File newFile = new File("accountNumbersList.txt");
			newFile.setWritable(true);
			newFile.setReadable(true);
			BufferedWriter out = new BufferedWriter(new FileWriter(newFile, true));
			
				while( (str = in.readLine()) != null) {
					//TODO
					out.append("\n");					
					out.write( "TODO"
//							( convertSequenceToString(
//						             	determineSequence(  									
//									          in.readLine() 									
//									)))
							);
	// is needed bc. otherwise will give java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "listItem" is null
	str = in.readLine();
				}
				
				in.close();
				out.close();
				
			} catch (IOException e) {
				System.out.println("Exception occured in checkIfFirstLineIsEmpty(): " + e );
				e.printStackTrace();
			}
	}
	
	public ArrayList<String[]> readSegmentLineAndConvertToString(){
				
		String erste = "";
		String zweite = "";
		String dritte = "";
		String vierte = "";
		String fuenfte = "";
		String sechste = "";
		String siebte = "";
		String achte = "";
		String neunte = "";
		
		ArrayList<String> firstArabics = new ArrayList<String>();
		ArrayList<String> singleGroupOfFourLines = new ArrayList<String>();
		ArrayList<ArrayList<String>> allGroupsOfFourLines = new ArrayList<ArrayList<String>>();
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("digitList.txt"));//reads file created above, substitute with file path here
			String str;
 			
			int lineCounter = 0;
			//parse through file, take each 4 lines and put them into group
				while( (str = in.readLine()) != null) {
					
					if(str.length() != 0){						
					
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
						
						//System.out.println(first );
//								+ " " + second 
//								+ " " + third + " " + fourth + " " + fifth 
//								+ " " + sixth + " " + seventh + " " + eighth 
//								+ " " + nineth);											
					}

					//System.out.println("line count" + lineCounter);
					lineCounter++;
					
					//System.out.println("-> " + str );//+ ", linecount: " + lineCounter);
					//singleGroupOfFourLines.add(str);	
					
					if( (lineCounter / 4) == 1){
						lineCounter = 0;
						allGroupsOfFourLines.add(singleGroupOfFourLines);
						firstArabics.add(erste);
						System.out.println("Group completed!, # " + allGroupsOfFourLines.size());						
					}	
					
					if( (lineCounter % 3) == 0){

						//test(erste);
					}
					
					
					
	// is not allowed here bc. otherwise will give nonsense String output
	//str = in.readLine();
				}
				
				in.close();
				
				//test2(firstArabics);
				//test(erste); test(zweite);
				
				//System.out.println("1st: " + erste );
				//System.out.println("2nd: " + zweite);
															
			} catch (IOException e) {
				System.out.println("Exception occured in checkIfFirstLineIsEmpty(): " + e );
				e.printStackTrace();
			}
		
		return null;
	}
	
	public void test(String numberOverThreeLines){
		
		Character[] individualNumbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
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
		
		for(int i = 0; i < numbersAsDigits.length; i++){
			if(numbersAsDigits[i].contains(threeLiner)){
				System.out.print( individualNumbers[i] );
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

			
	}
	
	public void test2(ArrayList<String> firstArabics){
		
		System.out.println("Size of firstArabics: " + firstArabics.size());
		
		System.out.println( firstArabics.get( firstArabics.size()-1 ) );
	}


}
