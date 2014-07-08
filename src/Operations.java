import java.util.ArrayList;
import java.util.Random;

public class Operations {
	
	ArrayList<Person> population;
	Person person;
	Data data;
	
	int age;
	int ageRange;
	int currentId;
	
	ArrayList<Integer> ages;
	ArrayList<Integer> level;
	ArrayList<Integer> ranges;
	
	Random rand;
	int rnd;
	
	boolean isAlive;
	int maxInteractions;
	
	
	
	public Operations(){
		
		population = new ArrayList<Person>();
		person = new Person();
		data = new Data();
		
		ages = data.setAges();
		level = data.setPromiscuityLevel();
		ranges = data.setRanges();
		
		rand = new Random();
		rnd = 0;
		
		currentId = 0;
		
		isAlive = true;
	

	}
	
	
	public ArrayList<Person> populate(){
		
		
		for(int i=0;i<1000;i++){
			
			person = new Person();
			rnd = rand.nextInt(ages.size());
			person.age = ages.get(rnd);
			
			ages.remove(rnd);
			
			ages.trimToSize();
			
			rnd = rand.nextInt(level.size());
			person.promiscuityLevel = level.get(rnd);
			level.remove(rnd);
			level.trimToSize();
			
			rnd = rand.nextInt(ranges.size());
			person.ageRange = ranges.get(rnd);
			ranges.remove(rnd);
			ranges.trimToSize();
			
			person.id = currentId;
			currentId ++;			
			
			if(ages.isEmpty()){
				
				ages = data.setAges();
			}
			
			if(level.isEmpty()){
				level = data.setPromiscuityLevel();
			}

			if(ranges.isEmpty()){
				ranges = data.setRanges();
			}
			
			population.add(person);
		}
		
		
		return population;
	}
	
	
public ArrayList<Person> birth(ArrayList<Person> pop, int birthRate){
	

	
		for(int i=0;i<birthRate;i++){
			
			person = new Person();
			person.age = 20;
			
			rnd = rand.nextInt(level.size());
			person.promiscuityLevel = level.get(rnd);
			level.remove(rnd);
			level.trimToSize();
			
			rnd = rand.nextInt(ranges.size());
			person.ageRange = ranges.get(rnd);
			ranges.remove(rnd);
			ranges.trimToSize();
			
			person.id = currentId;
			currentId ++;
			
			
						
			if(ages.isEmpty()){

				ages = data.setAges();
			}
			
			if(level.isEmpty()){
				level = data.setPromiscuityLevel();
			}

			if(ranges.isEmpty()){
				ranges = data.setRanges();
			}
			
			pop.add(person);
		}
		System.out.println("this shud be " + pop.size());
		return pop;
	}

		public int generateRandom(int min, int max) {
		
		    rnd = rand.nextInt((max - min) + 1) + min;
		
		    return rnd;
		}
		
		public boolean checkAlive(int age) {
			
			switch(age){
			
			case 0: 
				if(generateRandom(1, 202)==1) {
					isAlive = false;
					}
			case 5:
				if(generateRandom(1, 4881)==1) {
					isAlive = false;
					}
				break;
			case 10 :
			case 15 :
				if(generateRandom(1, 9375)==1) {
					isAlive = false;
					}
				break;
			case 20:
			case 25:
				if(generateRandom(1, 3020)==1) {
					isAlive = false;
					}
				break;
			case 30:
			case 35:
				if(generateRandom(1, 3703)==1) {
					isAlive = false;
					}
				break;
			case 40:
			case 45:
				if(generateRandom(1, 870)==1) {
					isAlive = false;
					}
				break;
			case 50:
			case 55:
				if(generateRandom(1, 350)==1) {
					isAlive = false;
					}
				break;
			case 60:
			case 65:
				if(generateRandom(1, 145)==1) {
					isAlive = false;
					}
				break;
			case 70:
			case 75:
				if(generateRandom(1, 54)==1) {
					isAlive = false;
					}
				break;
			case 80:
			case 85:
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
		
		public int setInteractions(int level){
			
			switch(level){
			
			case 1: 
				maxInteractions = rand.nextInt((10-1)+1) + 1;
				break;
			case 2:
				maxInteractions = rand.nextInt((20-10)+1) + 10;
				break;
			case 3:
				maxInteractions = rand.nextInt((30-20)+1) + 20;
				break;
			case 4:
				maxInteractions = rand.nextInt((50-30)+1) +30;
				break;	
			}
			return maxInteractions;
		}
		
		
	

}
