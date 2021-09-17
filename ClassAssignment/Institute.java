package Containment;

import java.util.Scanner;

public class Institute 
{
	         int id;
			 String name;
			 String branch;
			 String subject;
			 String topic;
			 String question;
			 
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getBranch() {
				return branch;
			}
			public void setBranch(String branch) {
				this.branch = branch;
			}
			public String getSubject() {
				return subject;
			}
			public void setSubject(String subject) {
				this.subject = subject;
			}
			public String getTopic() {
				return topic;
			}
			public void setTopic(String topic) {
				this.topic = topic;
			}
			public String getQuestion() {
				return question;
			}
			public void setQuestion(String question) {
				this.question = question;
			}
 
 
			public static void main(String args[])
			{
				Institute i=new Institute();
				
				Scanner sc =new Scanner(System.in);
		        System.out.println("Enter id:");
		        int id=sc.nextInt();
				
		        System.out.println("Enter name:");
		        String name=sc.next();
		        
				System.out.println("Enter branch:");
			    String branch=sc.next();
					
			    System.out.println("Enter Subject:");
			    String subject=sc.next();
			    
			    System.out.println("Enter topic:");
			    String topic=sc.next();
			    
			    System.out.println("Enter question:");
			    String question=sc.next();
			    
			    i.setId(id);
			    i.setName(name);
			    i.setBranch(branch);
			    i.setSubject(subject);
			    i.setTopic(topic);
			    i.setQuestion(question);
			    
			        
			   System.out.println("Student id  "+i.getId());
			   System.out.println("Student name "+i.getName());
			   System.out.println("Student branch  "+i.getBranch());
			   System.out.println("Student subject "+i.getSubject());
			   System.out.println("Student topic  "+i.getTopic());
			   System.out.println("Student question "+i.getQuestion());
			   
				
			}
}

 
