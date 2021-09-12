package Collection;
import java.util.*;  

public class NameComparator implements Comparator<StudentD>
{  
	public int compare(StudentD s1,StudentD s2){  
		return s1.name.compareTo(s2.name);  
		}  
}


