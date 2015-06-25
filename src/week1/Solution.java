package week1;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public Solution(File in) {
		ArrayList<Student> lijst = new ArrayList<Student>();
		try {
			lijst = run(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		Collections.sort(lijst);
		
	}

	// Implement the run method to return the answer to the problem posed by the
	// inputstream.

	public  ArrayList<Student> run(File in) throws FileNotFoundException {
		Scanner sc = new Scanner(in);
		int size;
		ArrayList<Student> result = new ArrayList<Student>();
		
		
		try {
			//System.out.println(sc.next());
			size = sc.nextInt();
			
			
			for (int i = 0; i < size; i++) {
				sc.nextLine();
				int studentnr = sc.nextInt();
				String stad = sc.next();
				String naam = sc.next();
				
				
				
				Student temp = new Student(studentnr, stad, naam);
				result.add(temp);
				System.out.println(temp);
			}
				
			
		} finally {
			sc.close();
			
		}
		
		return result;
	
	}
}


