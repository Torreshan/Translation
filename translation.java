package translation;
import java.util.*;
	 

public class translation 
{
	
	static void calculate(String s)
	{
		Map<String,Integer> maps = new HashMap<String,Integer>();
		for (int j =0;j<s.length();j++)
		{
			String k = String.valueOf((s.charAt(j)));
			if(!maps.containsKey(k))
				maps.put(k,1);
		
		else
		{
			int val =maps.get(k);
			maps.put(k,val+1);
		}
        }		
		for(Map.Entry j :maps.entrySet())  
			{System.out.print(j.getKey()+"*"+j.getValue()+" ");}
		     System.out.println();
	}
	public static void main(String[] args)
	{
	String[] en = {"Eagle","ape","bee","ant","moose","elephant","duck","donkey","fish","fly","dog","beetle","cat","cow","lion","mouse","nightingale","ox","horse","rat","sheep","butterfly","swan","pig","spider","bird","whale","wolf","worm","goat"};
	String[] de = {"Adler","Affe","Biene","Ameise","Elch","Elefant","Ente","Esel","Fisch","Fliege","Hund","Kaefer","Katze","Kuh","Loewe","Maus","Nachtigel","Ochse","Pferde","Ratte","Schaf","Schmetterling","Schwan","Schwein","Spinne","Vogel","Wal","Wolf","Wurm","Ziege"};// TODO Auto-generated method stub
	int flag = 0;
	    	
	System.out.println("Please input a number or a word");
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    try {
    	int a =Integer.parseInt(s);
        if(a>=30) 
        	System.out.println(" Not so many words!");
        else
        	{
        	System.out.print("(EN):"+en[a]+","+" ");
        	calculate(en[a]);
        	System.out.print("(DE):"+de[a]+","+" ");
        	calculate(de[a]);
        	}
    	}
catch (NumberFormatException e)
{	
    	//outer:
    for( int i=0; i<de.length; i++)
    {   
    	if(de[i].equals(s))
    	{   System.out.print("(DE):"+s+","+" ");
    		calculate(s);
    		System.out.print("(EN):"+en[i]+","+" ");
    		calculate(en[i]);
    		flag = flag + 1;
    		//break outer;
        }
    	 if(en[i].equals(s))
    	{
    		System.out.print("(EN):"+s+","+" ");
    		calculate(s);
            System.out.print("(DE):"+de[i]+","+" ");
            calculate(de[i]);
            flag = flag + 1;
        }
    	
    	
    }
    if (flag < 1)
    
    		System.out.println("there is no that word!");
    		//break outer;
     
   }

  }
}

