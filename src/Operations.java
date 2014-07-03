import java.util.ArrayList;
import java.util.Random;

public class Operations {
	
	ArrayList<Person> population;
	Person person;
	Data data;
	
	int age;
	int maxInteractions;
	int ageRange;
	int currentId;
	
	ArrayList<Integer> ages;
	ArrayList<Integer> level;
	ArrayList<Integer> ranges;
	
	Random rand;
	int rnd; 
	
	
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
	

	}

	public ArrayList<Person> populate(){
		
		
		for(int i=0;i<99;i++){
			
			rnd = rand.nextInt(ages.size());
			person.age = ages.get(rnd);
			ages.remove(rnd);
			ages.trimToSize();
			
			rnd = rand.nextInt(level.size());
			person.maxInteractions = level.get(rnd);
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
		
		for(int i=pop.size();i<birthRate;i++){
			
			person.age = 20;
			
			rnd = rand.nextInt(level.size());
			person.maxInteractions = level.get(rnd);
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
		
		return pop;
	}
	

}
