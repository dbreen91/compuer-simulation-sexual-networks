import java.util.ArrayList;
import java.util.Random;


public class Data {

	ArrayList<Integer> ages;
	ArrayList<Integer> interactions;
	ArrayList<Integer> ranges;
	
	Random rand;
	int rnd; 
	
	int[] rangesChoice;
	
	public Data(){
		
		rand = new Random();
		
		rangesChoice[0]=10;
		rangesChoice[1]=20;
		rangesChoice[2]=30;
		
	}
	
	public ArrayList<Integer> setAges(){
		
		
		for(int i=0;i<23;i++){
			ages.add(20);
		}
		
		for(int i=23;i<46;i++){
			ages.add(30);
		}
		for(int i=46;i<66;i++){
			ages.add(40);
		}
		for(int i=66;i<85;i++){
			ages.add(50);
		}
		for(int i=85;i<=99;i++){
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
