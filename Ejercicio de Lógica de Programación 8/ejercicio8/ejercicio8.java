package ejercicio8;

import java.util.*;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int scannedNumbers[] = new int [10];
		int pCount = 0;
		int noPCount =0;
		int outputNumbers[] = new int[10];
		
		for(int i=0;i<10;i++)
		{
		    
		    System.out.println("Ingresa el numero " + (i+1));
		    scannedNumbers[i] = scan.nextInt();
		    
            if(wachaSiEsMiPrimo(scannedNumbers[i]))
            {
                //sonMisPrimos[pCount] = scannedNumbers[i];
                pCount++;
            }
            
            else{
               // noSonMisPrimos[noPCount] = scannedNumbers[i];
                noPCount++;
            }
		    
		}
		
		scan.close();
		int sonMisPrimos[] = new int [pCount];
		int noSonMisPrimos[] = new int [noPCount];
        int k = 0;
        int l = 0;
        
        for(int i=0;i<scannedNumbers.length;i++)
		{
            if(wachaSiEsMiPrimo(scannedNumbers[i]))
            {
                sonMisPrimos[k] = scannedNumbers[i];
                k++;
            }
            
            else{
               noSonMisPrimos[l] = scannedNumbers[i];
               l++;
            }
		}
		


sonMisPrimos = sortedArray(sonMisPrimos);
noSonMisPrimos = sortedArray(noSonMisPrimos);
int noprim = 0;
String tipo = "";

for(int i = 0; i <outputNumbers.length; i++)
{
    if(i>=outputNumbers.length-noSonMisPrimos.length)
    {
        outputNumbers[i] = noSonMisPrimos[noprim];
        noprim++;
        tipo ="ya no es mi primo";
    }
    else{
        outputNumbers[i] = sonMisPrimos[i];
        tipo = "es mi primo";
    }
    
    System.out.println("pos["+ i +"] = " +outputNumbers[i] + " " +tipo);
}



}//cierre main
	
public static int[] sortedArray(int [] myarray)
{
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < myarray.length - 1; i++) {
            swapped = false;
            for (j = 0; j < myarray.length - i - 1; j++) {
                if (myarray[j] > myarray[j + 1]) {
                    temp = myarray[j];
                    myarray[j] = myarray[j + 1];
                    myarray[j + 1] = temp;
                    swapped = true;
                }
            }
 

            if (swapped == false)
            {
                break;
            }
                
        }
        
        return myarray;
}

public static boolean wachaSiEsMiPrimo(int n)
{
    
           for(int j=2;j<=n/2;j++){
    		  if(n%j==0)
    		   {
    		      
    		        return false;
    		   }
		    }
        return n!=1;
}

}
