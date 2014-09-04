import java.util.ArrayList;

public class Data {

	Data_Values dataValues;
	
	ArrayList<Integer> ages;
	ArrayList<Integer> level;
	ArrayList<Integer> ranges;	
	ArrayList<Boolean> settlers;	
	
	int initialPopulation;
	int birthRate;
	
	public Data(){
		
		dataValues= new Data_Values();		
		
		ages =  new ArrayList<Integer>();
		level = new ArrayList<Integer>();
		ranges = new ArrayList<Integer>();
		settlers = new ArrayList<Boolean>();
		
		
		initialPopulation = dataValues.initial_popuation_size;
		birthRate = dataValues.birth_rate;

	}
	
	/*Creates an ArrayList of ages based on the percentage values for 
	  each age group from which person objects are assigned an age from */
	public ArrayList<Integer> setAges(){
		
		for(int i=0;i<dataValues.Initial_Pop_0;i++){
			ages.add(0);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_5;i++){
			ages.add(5);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_10;i++){
			ages.add(10);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_15;i++){
			ages.add(15);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_20;i++){
			ages.add(20);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_25;i++){
			ages.add(25);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_30;i++){
			ages.add(30);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_35;i++){
			ages.add(35);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_40;i++){
			ages.add(40);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_45;i++){
			ages.add(45);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_50;i++){
			ages.add(50);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_55;i++){
			ages.add(55);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_60;i++){
			ages.add(60);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_65;i++){
			ages.add(65);
		}
		
		for(int i = 0;i<dataValues.Initial_Pop_70;i++){
			ages.add(70);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_75;i++){
			ages.add(75);
		}
		
		for(int i = 0;i<dataValues.Initial_Pop_80;i++){
			ages.add(80);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_85;i++){
			ages.add(85);
		}
		
		for(int i = 0;i<dataValues.Initial_Pop_90;i++){
			ages.add(90);
		}
		
		return ages;
	}
	
	
	/*Creates an ArrayList of promiscuity levels based on the percentage values for 
	  each of the different levels from which person objects are assigned a promiscuity level from */
	public ArrayList<Integer> setPromiscuityLevel(){
		
		for(int i = 0;i<dataValues.Percent_With_Low_Promiscuity;i++){
			level.add(1);
		}
		
		for(int i = 0;i<dataValues.Percent_With_Medium_Promiscuity;i++){
			level.add(2);
		}
		
		for(int i = 0;i<dataValues.Percent_With_High_Promiscuity;i++){
			level.add(3);
		}
		
		for(int i = 0;i<dataValues.Percent_With_Very_High_Promiscuity;i++){
			level.add(4);
		}
		
		return level;
	}
	
	/*Creates an ArrayList of age ranges based on the percentage values for 
	  each of the different ranges from which person objects are assigned the age range the operate within */
	public ArrayList<Integer> setRanges(){
		
		for(int i=0;i<dataValues.Range_Percentage_5;i++){
			ranges.add(5);
		}
		
		for(int i=0;i<dataValues.Range_Percentage_10;i++){
			ranges.add(10);
		}
		
		for(int i=0;i<dataValues.Range_Percentage_15;i++){
			ranges.add(15);
		}
		
		for(int i=0;i<dataValues.Range_Percentage_20;i++){
			ranges.add(20);
		}
		
		for(int i=0;i<dataValues.Range_Percentage_25;i++){
			ranges.add(25);
		}
		
		for(int i=0;i<dataValues.Range_Percentage_30;i++){
			ranges.add(30);
		}
		
		return ranges;
		
	}
	
	public ArrayList<Boolean> setSettlers(){
		
		for(int i=0;i<dataValues.Settle_Down_Percentage;i++){
			settlers.add(true);
		}
		
		for(int i=0;i<dataValues.Dont_Settle_Percentage;i++){
			settlers.add(false);
		}
		
		return settlers;
		
	}
}
