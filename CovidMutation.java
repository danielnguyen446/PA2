/**
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: none
 * 
 * This file contains a program to k-reverse a sample of DNA. It takes the string and the integer k and outputs the string with every k-sized chunk reversed.
 */
 
import java.util.Scanner;

/**
 * This class will prompt the user to enter the string of characters as well as an integer on the next line. 
 * The integer k will specify the chunk size.
 * The program will print each of the chunks in reverse with a nested loop. If there is a final chunk that is smaller than length k, the program will also print this in reverse.
 */

public class CovidMutation
{
	public static void main(String[] args)
	{
		String seq; //store the genome sequence
		String chunk;
		String babyChunk;   //in case there is a remainder chunk
		int k=0;    //chunk size
		
		Scanner scnr = new Scanner(System.in);  //scan the sequence
		seq = scnr.next();
		k = scnr.nextInt();
		
    int numberChunks = seq.length()/k;  //find the number of chunks
		
		for(int a=0; a<numberChunks; a++)
		{
            chunk = seq.substring(a*k, a*k+k);  //split the string into chunks
            
            for(int b=k-1; b>=0; b--)   //print the chunk, but starting from the value of k index
            {
                System.out.print(chunk.charAt(b));
            }
		}
		
		if(seq.length()%k!=0)   //in case of remainder chunk
        {
            babyChunk = seq.substring(numberChunks*k, seq.length());  //make a remainder chunk
            
            for(int c=babyChunk.length()-1; c>=0; c--)  //lastly, print the remainder babyChunk in reverse
            {
                System.out.print(babyChunk.charAt(c));
            }
        }
	}
}
