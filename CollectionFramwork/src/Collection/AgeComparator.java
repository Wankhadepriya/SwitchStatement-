package Collection;
import java.util.*;
public class AgeComparator implements Comparator<StudentD>{  
	
	public int compare(StudentD s1,StudentD s2){  
	if(s1.age==s2.age)  
	return 0;  
	else if(s1.age>s2.age)  
	return 1;  
	else  
	return -1;  
	}  

}
