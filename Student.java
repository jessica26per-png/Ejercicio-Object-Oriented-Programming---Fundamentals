
public class Student {

	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;
	       
	       
	       public void printFullName(String firstName, String lastName ){
	    	   this.firstName = firstName.toUpperCase();
	           this.lastName =  lastName.toUpperCase();
	           this.registration = registration;
	           this.grade = grade;
	           this.year = year;
	    		}

	       public void isApproved(){
	    	     //TODO implement: should return true if grade >= 60
	    		 }

	       public int changeYearIfApproved(){
	    	     //TODO implement: the student should advance to the next year if he/she grade is >= 60
	    	     // Make year = year + 1, and print "Congragulations" if the student has been approved
	    	     return 0;
	    	     }
	       
}

