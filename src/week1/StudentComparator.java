package week1;

 
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
/**
 * This is a chained comparator that is used to sort a list by multiple
 * attributes by chaining a sequence of comparators of individual fields
 * together.
 * @author www.codejava.net
 *
 */
public class StudentComparator implements Comparator<Student> {
 
    private List<Comparator<Student>> listComparators;
 
    @SafeVarargs
    public StudentComparator(Comparator<Student>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }
 
    @Override
    public int compare(Student student1, Student student2) {
        for (Comparator<Student> comparator : listComparators) {
            int result = comparator.compare(student1, student2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}