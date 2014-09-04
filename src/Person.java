import java.util.Random;



public class Person {

	int age;
	int maxInteractions;
	int promiscuityLevel;
	int interactions;
	int ageRange;
	int id;
	int inCoupleWith;
	
	boolean settle;
	boolean isAlive;
	boolean cheater;
	boolean inCouple;
	
	Random rand;
	int rnd;
	
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
		
		settle = true;
		isAlive = true;
		cheater = false;
		inCouple = false;
		inCoupleWith = 0;
		
		rand = new Random();
		rnd = 0;
		
		

	}
	
	public boolean checkAlive(){
		
		switch(age){
			case 0: 
				if(generateRandom(1, 202)==1) {
					isAlive = false;
					}
			break;	
			case 10 :
				if(generateRandom(1, 7128)==1) {
					isAlive = false;
					}
			break;
			case 20:
				if(generateRandom(1, 3020)==1) {
					isAlive = false;
					}
			break;
			case 30:
				if(generateRandom(1, 3703)==1) {
					isAlive = false;
					}
			break;
			case 40:
				if(generateRandom(1, 870)==1) {
					isAlive = false;
					}
			break;
			case 50:
				if(generateRandom(1, 350)==1) {
					isAlive = false;
					}
			break;
			case 60:
				if(generateRandom(1, 145)==1) {
					isAlive = false;
					}
			break;
			case 70:
				if(generateRandom(1, 54)==1) {
					isAlive = false;
					}
			break;
			case 80:
				if(generateRandom(1, 18)==1) {
					isAlive = false;
					}
			break;
			case 90:
				if(generateRandom(1, 6)==1) {
					isAlive = false;
					}
			break;
			case 100:
					isAlive = false;
			break;
		}
		
		return isAlive;
		
	}
	
	public void setMaxInteractions(){
		
		switch(promiscuityLevel){
			case 1: 
				switch(age){
					case 10:
					case 60:
						maxInteractions = rand.nextInt((2-0)+1) + 2;
					break;
					case 20:
					case 30:
						maxInteractions = rand.nextInt((10-0)+1) + 10;
					break;
					case 40:
						maxInteractions = rand.nextInt((8-0)+1) + 8;
					break;
					case 50:
						maxInteractions = rand.nextInt((6-0)+1) + 6;
					break;				
					}
			break;
			case 2:
				switch(age){
					case 60:
					case 10:
						maxInteractions = rand.nextInt((4-2)+1) + 4;
					break;
					case 20:
					case 30:
						maxInteractions = rand.nextInt((20-5)+1) + 20;
					break;
					case 40:
						maxInteractions = rand.nextInt((16-3)+1) + 16;
					break;
					case 50:
						maxInteractions = rand.nextInt((12-3)+1) + 12;
					break;				
					}
			break;
			case 3:
				switch(age){
					case 60:
					case 10:
						maxInteractions = rand.nextInt((8-4)+1) + 8;
					break;
					case 20:
					case 30:
						maxInteractions = rand.nextInt((40-10)+1) + 40;
					break;
					case 40:
						maxInteractions = rand.nextInt((36-8)+1) + 36;
					break;
					case 50:
						maxInteractions = rand.nextInt((32-6)+1) + 32;
					break;				
				}
			break;
			case 4:
				switch(age){
					case 60:
					case 10:
						maxInteractions = rand.nextInt((15-8)+1) + 15;
					break;
					case 20:
					case 30:
						maxInteractions = rand.nextInt((200-20)+1) + 200;
					break;
					case 40:
						maxInteractions = rand.nextInt((160-18)+1) + 160;
					break;
					case 50:
						maxInteractions = rand.nextInt((120-16)+1) + 120;
					break;				
				}
			break;	
			
		}
	}
	
	public int getUpper(){
        upper = age + ageRange;
		return upper;
	}
	
	public int getLower(){
        lower = age - ageRange;
		return lower;
	}
	
	public int generateRandom(int min, int max) {
	    rnd = rand.nextInt((max - min) + 1) + min;
	    return rnd;
	}
}
