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
	static int pOneUpper;
	static int pOneLower;
	static int pTwoUpper;
	static int pTwoLower;
	static int didDelete;
	static double birthDouble;
	
	public static void main(String [] args)
	{
		
		opr = new Operations();
		population = opr.populate();
		popInteractions = new ArrayList<Person>();
		randOne = new Random();
		randTwo = new Random();
		
		interaction = new int[3];
		interactions = new ArrayList<Object>();
		time = 0;
		

		do{
			popInteractions = (ArrayList<Person>)population.clone();	
			
			for(int i = 0;i<popInteractions.size();i++){
				popInteractions.get(i).setMaxInteractions();

			}
			
		do{
			
			pOnePosition = randOne.nextInt(popInteractions.size());
			pTwoPosition = randTwo.nextInt(popInteractions.size());
			
			pOne = popInteractions.get(pOnePosition);
			pTwo = popInteractions.get(pTwoPosition);

			if(pOnePosition!= pTwoPosition){
				
				pOneUpper = pOne.getUpper();
				pOneLower = pTwo.getLower();
				pTwoUpper = pOne.getUpper();
				pTwoLower = pOne.getLower();				
				
				if((pTwo.age >= pOneLower && pTwo.age <=pOneUpper) && (pOne.age >= pTwoLower && pOne.age <=pTwoUpper)){
					 
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
				
			
		}while(popInteractions.size() > 1);
		

		
		for(int i = 0;i<population.size();i++){
			population.get(i).age = population.get(i).age + 10;
		
			if(population.get(i).checkAlive() == false){
				population.remove(i);
				
			}		
		}
		
		
		
		birthDouble = ((double)population.size() / 100) * 15;
		birthRate = (int)birthDouble;
		
		population =  (ArrayList<Person>)(opr.birth(population, birthRate)).clone();	
		System.out.println(time);
	
		time = time + 10;
		
		}while(time < 1000);
			
	}
}
