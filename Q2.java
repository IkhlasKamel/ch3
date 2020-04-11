/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ikhlas Kamel
 */
public class Q2 {
     
	public static void main(String[] args) throws IOException 
	{ 
			File file = new File("C:\\Users\\Ikhlas Kamel\\Desktop\\Texts.txt"); 
		FileInputStream fileStream = new FileInputStream(file); 
		InputStreamReader input = new InputStreamReader(fileStream); 
		BufferedReader reader = new BufferedReader(input); 
		
		String line; 
		
		int countWord = 0; 
		int sentenceCount = 0; 
		int letterCount = 0; 
		int paragraphCount = 1; 
		int whitespaceCount = 0; 
		
		
		while((line = reader.readLine()) != null) 
		{ 
			if(line.equals("")) 
			{ 
				paragraphCount++; 
			} 
			if(!(line.equals(""))) 
			{ 
				
				letterCount += line.length(); 
				
				String[] wordList = line.split("\\s+"); 
				
				countWord += wordList.length; 
				whitespaceCount += countWord -1; 
				
				String[] sentenceList = line.split("[!?.:]+"); 
				
				sentenceCount += sentenceList.length; 
			} 
		} 
		
		System.out.println("Total word count = " + countWord); 
		System.out.println("Total number of sentences = " + sentenceCount); 
		System.out.println("Total number of letter  = " + letterCount); 
		System.out.println("Number of paragraphs = " + paragraphCount); 
		System.out.println("Total number of whitespaces = " + whitespaceCount); 
        }

}