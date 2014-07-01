

public class Person {

	int age;
	int maxInteractions;
	int promiscuityLevel;
	int interactions;
	int ageRange;
	int id;
	boolean isAlive;

	public Person(){
		
		age = 0;
		maxInteractions = 0;	
		promiscuityLevel =0;
		interactions = 0;
		ageRange = 0;
		id = 0;
		isAlive = true;
		
		
	}
	
	public void checkAlive(){
		
		if(age==60){
			isAlive = false;
		}
	}
	
	public void setMaxInteractions(int m){
		
		maxInteractions = m;
				
	}
}
