package constructorDemo;

public class Marks {
	
	int result;

  public static void main(String[]args) {
	  
	Marks m=new Marks(60);
	   
	  
  }
  
  public Marks(int marks) {
	  result=marks;
	  
	 
  }
  
  
  
  public void displayResult() {
	  
	  System.out.println("Final marks for student is "+result);
  }

}
