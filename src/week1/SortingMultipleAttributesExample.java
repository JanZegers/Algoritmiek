package week1;

 
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
/**
 * This program demonstrates how to sort a list collection by multiple
 * attributes using a chained comparator.
 *
 * @author www.codejava.net
 *
 */
public class SortingMultipleAttributesExample {
 
    public static void main(String[] args) {
 
 
        List<Student> listStudents = new ArrayList<Student>();
 
        listStudents.add(new Student(2343243, "Gouda", "Jan"));
        listStudents.add(new Student(435243, "Delft", "Tim"));
        listStudents.add(new Student(3453455, "Delft", "Tim"));
        listStudents.add(new Student(54322, "Delft", "Tim"));
        listStudents.add(new Student(3456345, "Delft", "Jan"));

        System.out.println("*** Before sorting:");
 
        for (Student student : listStudents) {
            System.out.println(student);
        }
        
        
        
        Collections.sort(listStudents, new StudentComparator(
                new StudentCityComparator(),
                new StudentNameComparator())
        );
        
       
 
        System.out.println("\n*** After sorting:");
 
        for (Student student : listStudents) {
            System.out.println(student);
        }
 
    }
}