package Collection;
import java.util.*;
public class LinkListDemo2 
{
	public static void main(String args[])
	{
		LinkedList<String> ll=new LinkedList<String>();  
        System.out.println("Initial list of elements: "+ll);  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        System.out.println("After invoking add(E e) method: "+ll);  
         
        ll.add(1, "Gaurav");  
        System.out.println("After invoking add(int index, E element) method: "+ll);  
        LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("Sonoo");  
        ll2.add("Hanumat");  
        
        ll.addAll(ll2);  
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);  
        LinkedList<String> ll3=new LinkedList<String>();  
        ll3.add("John");  
        ll3.add("Rahul");  
        
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  
          
        ll.addFirst("Lokesh");  
        System.out.println("After invoking addFirst(E e) method: "+ll);  
        //Adding an element at the last position  
        ll.addLast("Harsh");  
        System.out.println("After invoking addLast(E e) method: "+ll);  
          
	}

}
