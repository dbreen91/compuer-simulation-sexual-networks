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
	

	public Person(){
		
		age = 0;
		maxInteractions = 0;	
		promiscuityLevel = 0;
		interactions = 0;
		ageRange = 0;
		id = 0;
		isAlive = true;
		rand = new Random();
		
		
	}
	
	public void checkAlive(){
		
		if(age==60){
			isAlive = false;
		}
	}
	
	public void setMaxInteractions(){
		
		switch(promiscuityLevel){
		
		case 1: 
			//If level 1, set Max interactions to a number between 1-10
			maxInteractions = rand.nextInt((10-1)+1) + 1;
			break;
		case 2:
			//If level 2, set Max interactions to a number between 10-20
			maxInteractions = rand.nextInt((20-10)+1) + 10;
			break;
		case 3:
			//If level 3, set Max interactions to a number between 20-30
			maxInteractions = rand.nextInt((30-20)+1) + 20;
			break;
		case 4:
			//If level 4, set Max interactions to a number between 30-50
			maxInteractions = rand.nextInt((50-30)+1) +30;
			break;
			
		}
		
				
	}
}
