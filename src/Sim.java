import java.util.ArrayList;
import java.util.Random;

public class Sim {
	
	  Operations opr;
	  Data_Values data;
	  int birthRatePercentage;
	  
	  ArrayList<Person> population;
	  ArrayList<Person> popInteractions;
	  ArrayList<Person> settleInteractions;
	  ArrayList<Person> couplePop;
	  
	  int cheaters;
	  
	  Person[] settled;
	  ArrayList<Object> couples;
	  
	  int[] interaction;
	  ArrayList<Object> interactions;
	  
	  int time;
	  int birthRate;
	  
	  Person pDumb;
	  Person pOne;
	  Person pTwo;
	  
	  int pOnePosition;
	  int pTwoPosition;
	  
	  Random randOne;
	  Random randTwo;
	  
	  int ranHolder;
	  
	  int pOneUpper;
	  int pOneLower;
	  int pTwoUpper;
	  int pTwoLower;
	  
	  int didDelete;
	  
	  double birthDouble;
	  
	  int deadcount;
	  int birthCount;
	  
	  int ageHolder;
	  boolean settleHolder;
	  boolean coupleHolder;
	  
	  double divorceDouble;
	  int divorceRate;
	  int divorcePercentage;
	  
	  public Sim(){
		  
		 	opr = new Operations();
		 	data = new Data_Values();
		 	birthRatePercentage = data.birth_rate;
		 	divorcePercentage = data.Percentage_of_Divorces;
		 	
			population = opr.populate();
			popInteractions = new ArrayList<Person>();
			couplePop = new ArrayList<Person>();
			
			randOne = new Random();
			randTwo = new Random();
			
			interaction = new int[3];
			settled = new Person[2];
			
			interactions = new ArrayList<Object>();
			
	  }
	  
	  public void runSimulation(){
		  
		  do{
				
			  setPopulationForInteractions();
			  setPopulationForSettleInteractions();
				
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
								
								
							}
							
							if(pTwo.interactions > pTwo.maxInteractions){
								
									popInteractions.remove(pTwoPosition);		
								
							}
							
							popInteractions.trimToSize();
						}
					}
						
					
				}while(popInteractions.size() > 1);
			
				System.out.println("Year:" + time + " Population Size:" + population.size() + " Interactions:" + interactions.size() + " Dead Count" + deadcount + " Birth Count" + birthCount);
						
				for(int i = 0;i<population.size();i++){
					population.get(i).age = population.get(i).age + 5;
				
					if(population.get(i).checkAlive() == false){
						population.remove(i);
						deadcount++;
					}		
				}
				
				birthDouble = ((double)population.size() / 100) * birthRatePercentage;
				birthRate = (int)birthDouble;
				birthCount +=birthRate;
				
				population =  (ArrayList<Person>)(opr.birth(population, birthRate)).clone();	
				
				time = time + 5;
			
			}while(time < 1000);
				  
	  }
	  
	 public void setPopulationForSettleInteractions() {
		// TODO Auto-generated method stub
		 settleInteractions = (ArrayList<Person>)popInteractions.clone();	
			
			for(int i = 0;i<settleInteractions.size();i++){
				settleHolder =settleInteractions.get(i).settle;
				ageHolder = settleInteractions.get(i).age;
				if(settleHolder==false || ageHolder==15){ 
				settleInteractions.remove(i);
			}else {
				popInteractions.remove(i);
			}
			}
			
			settleInteractions.trimToSize();
	}

	public void setPopulationForInteractions(){
		  
		  popInteractions = (ArrayList<Person>)population.clone();	
			
			for(int i = 0;i<popInteractions.size();i++){
				
				ageHolder =popInteractions.get(i).age;
				coupleHolder = popInteractions.get(i).inCouple;
				
				if(15 >= ageHolder && ageHolder <=60 && coupleHolder == false ){ 
				popInteractions.get(i).setMaxInteractions();
					if(settleHolder==true && ageHolder!=15 && coupleHolder== false){ 
						settleInteractions.add(popInteractions.get(i));
					}
					if(coupleHolder == true){
						couplePop.add(popInteractions.get(i));
					}
				}else{	
				popInteractions.remove(i);
				}
			}
			
		
			popInteractions.trimToSize();
			
			
	  
	  }
	
	public void setCheaters(){
		
	}
	
	public void setDivorces(){
		
		divorceDouble = ((double)couples.size() / 100) * divorcePercentage;
		divorceRate = (int)divorceDouble;
		
	   for(int i=0;i <divorceRate;i++){
		   
		   ranHolder= randOne.nextInt(couples.size());
						
			couples.remove(ranHolder);
			couples.trimToSize();
			
	   }
	}
	
	public void getCouples(){
		
		do{
			
			pOnePosition = randOne.nextInt(settleInteractions.size());
			pTwoPosition = randTwo.nextInt(settleInteractions.size());
			
			pOne = settleInteractions.get(pOnePosition);
			pTwo = settleInteractions.get(pTwoPosition);

			if(pOnePosition!= pTwoPosition){
				
				pOneUpper = pOne.getUpper();
				pOneLower = pTwo.getLower();
				pTwoUpper = pOne.getUpper();
				pTwoLower = pOne.getLower();				
				
				if((pTwo.age >= pOneLower && pTwo.age <=pOneUpper) && (pOne.age >= pTwoLower && pOne.age <=pTwoUpper)){
					 
					settled[0] = pOne;
					settled[1] = pTwo;
					
					couples.add(couples);
					
					settleInteractions.remove(pOnePosition);
					settleInteractions.remove(pTwoPosition);
					
					settleInteractions.trimToSize();

					}
				}
			
				
			
		}while(popInteractions.size() > 1);
		
	}
	  
	  
	 
}
	  


