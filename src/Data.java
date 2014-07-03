import java.util.ArrayList;
import java.util.Random;


public class Data {

	ArrayList<Integer> ages;
	ArrayList<Integer> level;
	ArrayList<Integer> ranges;
	Data_Values dataValues;
	
	Random rand;
	int rnd; 
	int[] rangesChoice;
	
	public Data(){
		
		rand = new Random();
		dataValues= new Data_Values();		
		ages =  new ArrayList<Integer>();
		level = new ArrayList<Integer>();
		ranges = new ArrayList<Integer>();
		rangesChoice = new int[3];
	
	}
	
	public ArrayList<Integer> setAges(){
		
		for(int i=0;i<dataValues.Initial_Pop_20;i++){
			ages.add(20);
		}
		
		for(int i=0;i<dataValues.Initial_Pop_30;i++){
			ages.add(30);
		}
		for(int i=0;i<dataValues.Initial_Pop_40;i++){
			ages.add(40);
		}
		for(int i=0;i<dataValues.Initial_Pop_50;i++){
			ages.add(50);
		}
		for(int i = 0;i<dataValues.Initial_Pop_60;i++){
			ages.add(60);
		}
		
		return ages;
	}
	
	public ArrayList<Integer> setPromiscuityLevel(){
		
		for(int i = 0;i<dataValues.Percent_With_Low_Promiscuity;i++){
			level.add(1);
		}
		
		for(int i = 0;i<dataValues.Percent_With_Medium_Promiscuity;i++){
			level.add(1);
		}
		
		for(int i = 0;i<dataValues.Percent_With_High_Promiscuity;i++){
			level.add(1);
		}
		
		for(int i = 0;i<dataValues.Percent_With_Very_High_Promiscuity;i++){
			level.add(1);
		}
		
		
		return level;
	}
	
	public ArrayList<Integer> setRanges(){
		
		for(int i=0;i<dataValues.Range_Percentage_10;i++){
			ranges.add(10);
		}
		
		for(int i=0;i<dataValues.Range_Percentage_20;i++){
			ranges.add(20);
		}
		
		for(int i=0;i<dataValues.Range_Percentage_30;i++){
			ranges.add(30);
		}
		
		
		return ranges;
		
	}
}
