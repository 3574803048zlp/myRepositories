package demo1;

public class RandomUtil {
	
	public static void random(int min,int max){
		for (int i = 0; i <5; i++) {
			int d = (int)Math.floor(Math.random()*(max-min)+min);
			System.out.println(d);
		}
		
		
	}
	
	public static void subRandom(int min,int max,int sub){
		int[] randomArray= new int[max];
	      for (int i = 0; i < randomArray.length; i++) {
			randomArray[i]=i;
		}
	      int[] numArray=new int[sub];
	      int i=0;
	      while(i<numArray.length){
	    	 int index=(int)(Math.random()*max);
	    	 if(randomArray[index]!=-1){
	    		 numArray[i]=randomArray[index];
	    		 randomArray[index]=-1;
	    		 i++;
	    	 }
	      }
	      System.out.println(numArray);
	}
}

