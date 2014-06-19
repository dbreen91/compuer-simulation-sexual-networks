import java.util.ArrayList;
import java.util.Random;


public class Simulation {
	
	static Operations opr;
	static ArrayList<Person> population;
	static ArrayList<Person> popInteractions;
	static int[] interaction;
	static ArrayList<Object> interactions;
	static int time;
	static int birthRate;
	static Person pDumb;
	static Person pOne;
	static Person pTwo;
	static int pOnePosition;
	static int pTwoPosition;
	static Random randOne;
	static Random randTwo;
	int rNmOne;
	int rNmTwo;
	
	public Simulation(){
		
		opr = new Operations();
		population = opr.populate();
		popInteractions = new ArrayList<Person>();
		interaction = new int[2];
		interactions = new ArrayList<Object>();
		time = 0;
		birthRate = (population.size() / 100) * 15;
		
	}
	
	public static void main(String [] args)
	{
		
		do{
			
		
			popInteractions = population;	
		
		
		do{
			pOnePosition = randOne.nextInt(popInteractions.size());
			pTwoPosition = randTwo.nextInt(popInteractions.size());
			
			pOne = popInteractions.get(pOnePosition);
			pTwo = popInteractions.get(pTwoPosition);
				
			if(pOnePosition!= pTwoPosition){
				
				if((Math.abs(pOne.age - pTwo.age) == pOne.ageRange) && (Math.abs(pOne.age - pTwo.age) == pTwo.ageRange)){
					
					
					interaction[0] = pOne.id;
					interaction[1] = pTwo.id;
					interaction[2] = time;
					
					interactions.add(interaction);
					
					pOne.interactions ++;
					pTwo.interactions ++;
					
					if(pOne.interactions == pOne.maxInteractions){
						popInteractions.remove(pOnePosition);
						popInteractions.trimToSize();
					}
					
					if(pTwo.interactions == pTwo.maxInteractions){
						popInteractions.remove(pTwoPosition);
						popInteractions.trimToSize();
					}
					
				}
	
			}
				
			
		}while(popInteractions.size() !=1);
		
		for(int i = 0;i<population.size();i++){
			population.get(i).age = population.get(i).age + 10;
		
			if(population.get(i).isAlive == false){
				population.remove(i);
			}		
		}
		
		population = opr.birth(population, birthRate);
		
		birthRate = (population.size() / 100) * 15;
			
			time = time + 10;
		}while(time < 1010);
		
		
	}
}
