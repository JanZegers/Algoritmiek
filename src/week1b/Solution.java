package week1b;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	private Set stadlijst;
	private Set namenlijst;
	public Solution(File in) {
		stadlijst = new HashSet();
		namenlijst = new HashSet();
		
		ArrayList<Student> lijst = new ArrayList<Student>();
		try {
			lijst = run(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
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
				stadlijst.add(stad);
				String naam = sc.next();
				namenlijst.add(naam);
				
				
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


