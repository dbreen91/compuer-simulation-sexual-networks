import java.util.Random;



public class Person {

	int age;
	int maxInteractions;
	int promiscuityLevel;
	int interactions;
	int ageRange;
	int id;
	boolean isAlive;
	Random rand;
	int upper; 
	int lower; 
	Operations opr;

	public Person(){
		
		age = 0;
		maxInteractions = 0;	
		promiscuityLevel = 0;
		interactions = 0;
		ageRange = 0;
		id = 0;
		isAlive = true;
		rand = new Random();
		opr = new Operations();
		
		
	}
	
	public boolean checkAlive(){
		
		isAlive = opr.checkAlive(age);
		return isAlive;
		
	}
	
	public int getUpper(){
        upper = age + ageRange;
		return upper;
	}
	
	public int getLower(){
        lower = age - ageRange;
		return lower;
	}
	
	public void setMaxInteractions(){
		
		maxInteractions = opr.setInteractions(promiscuityLevel);
		
				
	}
}
