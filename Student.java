
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
	       
	       public Student() {
	    	   
	       }
	       
	       
	       public void printFullName(){
	    	    //TODO implement 
	    	   System.out.println( firstName + " " + lastName );
	       }
	    		

	       public boolean isApproved(){
	    	     //TODO implement: should return true if grade >= 60
	    	   return grade >= 60;
	       }

	       public int changeYearIfApproved(){
	    	     //TODO implement: the student should advance to the next year if he/she grade is >= 60
	    	   if (this.isApproved()) {
	    	        this.year = this.year + 1; 
	    	        System.out.println("¡Felicidades " + firstName + "! Has pasado al año " + this.year + ".");
	    	        }
	    	   return this.year;
	    	   }
}