import java.util.ArrayList;
import java.util.Random;


public class Data {

	ArrayList<Integer> ages;
	ArrayList<Integer> interactions;
	ArrayList<Integer> ranges;
	Data_Values dataValues;
	
	Random rand;
	int rnd; 
	int[] rangesChoice;
	
	public Data(){
		
		rand = new Random();
		dataValues= new Data_Values();
		
		ages =  new ArrayList<Integer>();
		interactions = new ArrayList<Integer>();
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
	
	public ArrayList<Integer> setInteractions(){
		
		for(int i=0;i<=99;i++){
			
			rnd = rand.nextInt((10 - 2) + 1) + 2;
			interactions.add(rnd);
		}
		
		return interactions;
	}
	
	public ArrayList<Integer> setRanges(){
		
		for(int i=0;i<=99;i++){
			rnd = rand.nextInt(rangesChoice.length);
			rnd = rangesChoice[rnd];
			ranges.add(rnd);
		}
		
		return ranges;
		
	}
}
