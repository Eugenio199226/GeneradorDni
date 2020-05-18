package group.DniGenerator;

import java.util.Formatter;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Generador {
	public String generadorNum() 
	{
		int number=  (int) Math.floor(Math.random()*99999999+1);
		
		Formatter obj = new Formatter();
		String letra=comparador(number);
		String cuerpoDni=String.valueOf(obj.format("%08d", number)+letra);

		/*for ( int i=0;i <= 8;i++) 
		{
			if(i==0){
				i=String.valueOf(number).length();
				sb.append(number);
			}else 
			{
				sb.append("0");
			}
		}*/
		return cuerpoDni;

		
	}
	public String comparador(int numero) 
    {
	 	int valorCaculado=numero%23;
	 	Hashtable<String, Integer> dniLetras= new Hashtable<String, Integer>();
	 	dniLetras.put("T", 0);
	 	dniLetras.put("R", 1);
	 	dniLetras.put("W", 2);
	 	dniLetras.put("A", 3);
	 	dniLetras.put("G", 4);
	 	dniLetras.put("M", 5);
	 	dniLetras.put("Y", 6);
	 	dniLetras.put("F", 7);
	 	dniLetras.put("P", 8);
	 	dniLetras.put("D", 9);
	 	dniLetras.put("X", 10);
	 	dniLetras.put("B", 11);
	 	dniLetras.put("N", 12);
	 	dniLetras.put("J", 13);
	 	dniLetras.put("Z", 14);
	 	dniLetras.put("S", 15);
	 	dniLetras.put("Q", 16);
	 	dniLetras.put("V", 17);
	 	dniLetras.put("H", 18);
	 	dniLetras.put("L", 19);
	 	dniLetras.put("C", 20);
	 	dniLetras.put("K", 21);
	 	dniLetras.put("E", 22);
	 	Iterator<Map.Entry<String, Integer>> itr = dniLetras.entrySet().iterator();
	 	Map.Entry<String, Integer> entry = null;
	 	while(itr.hasNext()) 
	 	{
	 		entry = itr.next();
            //if this entry value is equals to the value
            if(entry.getValue().equals(valorCaculado)){
            	
                return entry.getKey();
            }
		
	 	}
	 	return "";
    }


}
