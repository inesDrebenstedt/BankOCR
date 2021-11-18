package com.codingdojo.userstory1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileMaker {

	
	// Generate List of size 500 with arbitrary account number variations
	public ArrayList<Integer[]> testAccountNumberMaker(){
		ArrayList<Integer[]> testAccountNumberList = new ArrayList<Integer[]>();
		
		for(int i = 0; i < 500; i++){

			testAccountNumberList.add(makeListItem());
			
		//System.out.println(" List size: " + testAccountNumberList.size());
		}
		
		makeFile(testAccountNumberList);
		
		return testAccountNumberList;
	}
	
	//generate list items:
	public static Integer[] makeListItem(){
		Integer[] listItem = new Integer[10];
		
		for(int k = 0; k < listItem.length; k++){
			Double x = 0.0;			
			x = Math.random()* 10;
			int y = x.intValue();
			listItem[k] = y;
			//SSystem.out.print(" listItem[k]: " + listItem[k]);
		}
		
		return listItem;
	}
	
	
	//make file with each randomly created test account number in each line:
	public static void makeFile(ArrayList<Integer[]> testAccountNumberList){
		try {

			File file = new File("list.txt"); 
			file.setWritable(true);
			file.setReadable(true);
			BufferedWriter out = new BufferedWriter(new FileWriter(file, true));

			    for(Integer[] intArr : testAccountNumberList){
			out.append("\n");
			    	
			//System.out.println("Appending intArr: " + printIntArrAsString(intArr));
			out.append( printIntArrAsString(intArr) );			
			    }
			    out.close();

	} catch (Exception e){
		e.printStackTrace();
	}
	}


	
	public static String printIntArrAsString(Integer[] intArr){ //tested: OK
		StringBuilder intArrAsString = new StringBuilder();
		
	for(Integer integer : intArr){
		intArrAsString.append(integer);
	}
		//System.out.println("Integer array as String: " + intArrAsString.toString());
		return intArrAsString.toString();
	}
	
	
	}
