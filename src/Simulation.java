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
	static int didDelete;
	
	
	
	public static void main(String [] args)
	{
		int l = 0;
		opr = new Operations();
		population = opr.populate();
		popInteractions = new ArrayList<Person>();
		randOne = new Random();
		randTwo = new Random();
		
		interaction = new int[3];
		interactions = new ArrayList<Object>();
		time = 0;
		birthRate = (population.size() / 100) * 15;
		
		popInteractions = population;	
		
		
		
		do{
			
		do{
			
			
			pOnePosition = randOne.nextInt(popInteractions.size());
			pTwoPosition = randTwo.nextInt(popInteractions.size());
			
			pOne = popInteractions.get(pOnePosition);
			pTwo = popInteractions.get(pTwoPosition);
			
			
				
			if(pOnePosition!= pTwoPosition){
				
				if((Math.abs(pOne.age - pTwo.age) == pOne.ageRange) && (Math.abs(pOne.age - pTwo.age) == pTwo.ageRange)){
					 
					
					
						System.out.println(pOne.interactions + " " +  pOne.maxInteractions);
						l++;					
					
					interaction[0] = pOne.id;
					interaction[1] = pTwo.id;
					interaction[2] = time;
					
					
					interactions.add(interaction);
					
					pOne.interactions ++;
					pTwo.interactions ++;
					
					
					if(pOne.interactions > pOne.maxInteractions){
						
						popInteractions.remove(pOnePosition);
						popInteractions.trimToSize();
						
					}
					
					if(pTwo.interactions > pTwo.maxInteractions){
						
						if(pTwoPosition == popInteractions.size()){
						popInteractions.remove(pTwoPosition-1);
						popInteractions.trimToSize();
						didDelete = 0;
						}
						else{
							popInteractions.remove(pTwoPosition);
							popInteractions.trimToSize();	
						}
						
							
						
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
			System.out.println("dsdsds" + time);
		}while(time < 1010);
		
		
		
	}
}
