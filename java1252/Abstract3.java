import java.util.Scanner;

import java.util.*;
abstract class Instrument{
	public abstract void play();
}
class Piano extends Instrument{
	public void play(){
		System.out.println("Piano is playing  tan tan tan tan ");
	}
}
class Flute extends Instrument{
public void play(){
		System.out.println("Flute is playing  toot toot toot toot");
	}
}
class Guitar extends Instrument{
public void play(){
		System.out.println("Guitar is playing  tin  tin  tin");
	}
}
public class Abstract3 {
    public static void main(String args[]){
    	Object io[]=new Object[10];
    	io[0]=new Piano();
    	io[1]=new Guitar();
    	io[2]=new Flute();
    	io[3]=new Guitar();
    	io[4]=new Piano();
    	io[5]=new Flute();
    	for(int i=0;io[i]!=null;i++)
    	{
    		if(io[i] instanceof Piano)
    		{
    			System.out.println("Piano Object indexed at "+i);
    		}
    		if(io[i] instanceof Guitar)
    		{
    			System.out.println("Guitar Object indexed at "+i);
    		}
    		if(io[i] instanceof Flute)
    		{
    			System.out.println("Flute Object indexed at "+i);
    		}
        }
    }
}
        		
           
       	   