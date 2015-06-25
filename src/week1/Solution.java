package week1;



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
	
	private int counter;

	public Solution(File in) {

		ArrayList<Student> listStudents = new ArrayList<Student>();
		try {
			listStudents = run(in);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	      System.out.println("*** Before sorting:");
	      
	        for (Student student : listStudents) {
	            System.out.println(student);
	        }


	        Collections.sort(listStudents, new StudentNameComparator());
	        Collections.sort(listStudents, new StudentCityComparator());
	        
	        
	        ArrayList<Student> listStudentsNew = new ArrayList<Student>();

	        System.out.println("\n*** After sorting:");
	        Student studentOld = new Student(0, "a", " a" );
	        counter = 1;
	        for (Student student : listStudents) {
	        	
	        	if(student.getCity().equals(studentOld.getCity()) && student.getName().equals(studentOld.getName())){
	        			counter += 1;
	        			//System.out.println(" ik ben hier");
	        	}
	        	else{
	        		if(studentOld.getId()!=0){
	        			System.out.println(counter);
	        		}
	        		//System.out.println(studentOld + " is oude dt");
	        		System.out.print(student  + " ");
	        		studentOld = student;
	        		
	        		counter = 1;
	        				
	        	}
	        	
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
				//stadlijst.add(stad);
				String naam = sc.next();
				//namenlijst.add(naam);
				
				
				Student temp = new Student(studentnr, stad, naam);
				result.add(temp);
				
			}
				
			
		} finally {
			sc.close();
			
		}
		
		return result;
	
	}
}


