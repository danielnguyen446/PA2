/**
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: none
 * 
 * This file contains a program to analyze a sample of DNA. It uses variables, string methods, loops, and if-else statements.
 */
 
import java.util.Scanner;

/**
 * This class will prompt the user to enter the gene sequence. It will then output how many times the base T appears in the complementary sequence,
 * as well as displaying the full complementary sequence. 
 */
public class CovidGenomeAnalysis
{
	public static void main(String[] args)
	{
		String seq; /**store the genome sequence*/
		char base;
		int thymineCount=0; /**how many letter T's there are in the output*/
	    
		Scanner scnr = new Scanner(System.in);  /**scan the sequence into seq*/
        	seq = scnr.next();
		
        	for(int a=0; a<seq.length(); a++)   /**loop. do this for each letter in the sequence*/
        	{
        		base = seq.charAt(a);   /**the base to examine*/
        		if (base =='A')
        		{
                		thymineCount++; /**increment thymine count.*/
        		}
		}   
            
        	seq = seq.replace('A', 'B');    /**temporarily move A to B, since the code can't perform the replacements simultaneously*/
        	seq = seq.replace('T', 'A');
        	seq = seq.replace('B', 'T');    /**can only make it T after T has been replaced.*/
        
        	seq = seq.replace('C', 'D');    /**same for C. temporary replacement.*/
        	seq = seq.replace('G', 'C'); 
        	seq = seq.replace('D', 'G'); 
    
        	System.out.println(thymineCount + " " + seq); /**print the output.*/
	}
}
