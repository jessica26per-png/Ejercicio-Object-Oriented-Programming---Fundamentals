
public class Student {

	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;
	       
	       
	       public Student(String firstName, String lastName, int registration, int grade, int year) {
	    	    this.firstName = firstName;
	    	    this.lastName = lastName;
	    	    this.registration = registration;
	    	    this.grade = grade;
	    	    this.year = year;
	       
}//class student    
	       
	       public Student(String firstName, String lastName, int registration) {
	    	    this.firstName = firstName;
	    	    this.lastName = lastName;
	    	    this.registration = registration;
	    	    this.grade = 0; 
	    	    this.year = 1;
	       
	       }// constructor 2
	       
	       
	       public void printFullName(){
	    	    //TODO implement 
	    	   
	    		}

	       public void isApproved(){
	    	     //TODO implement: should return true if grade >= 60
	    		 }

	    public int changeYearIfApproved(){
	    	     //TODO implement: the student should advance to the next year if he/she grade is >= 60
	    	     // Make year = year + 1, and print "Congragulations" if the student has been approved
	    	     return 0;
	    }
	       


