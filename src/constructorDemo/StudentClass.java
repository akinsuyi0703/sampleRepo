package constructorDemo;

public class StudentClass {
	
	int result;

  public static void main(String[]args) {
	  
	  StudentClass obj1=new StudentClass(1);
	  obj1.displayResult();
	   
	  
  }
  
  public StudentClass() {
	  
	  System.out.println("Hey Welcome to school");
  }
  
  public StudentClass(String schoolName) {
	  
	  System.out.println("Hey Welcome to "+ schoolName+ " school");
  }
 
 public StudentClass(int rank) {
	  
	  System.out.println("Hey Welcome to school which ranked "+rank);
 }
 
 public StudentClass(String schoolName, int rank) {
	  
	  System.out.println("Hey Welcome to school");
 }
 
 public StudentClass(int rank, String schoolNmae) {
	  
	  System.out.println("Hey Welcome to school");
 }
  
  public void displayResult() {
	  
	  System.out.println("Final marks for student is "+result);
  }

}
