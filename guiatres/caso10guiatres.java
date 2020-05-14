package guiatres;

import java.util.Scanner;
    	import java.text.DecimalFormat;

public class caso10guia3rrrrrrrrrrr {

	public static void main(String[] args) {
		

		Scanner slc = new Scanner(System.in);
		//paso1
		System.out.print("Ingrese horas trabajadas: ");
		int cantidad = slc.nextInt();
		//pàso2
		
		System.out.print("Ingrese sueldo por hora: ");
		int horas = slc.nextInt();
		
		DecimalFormat df = new DecimalFormat ("#.00");
		System.out.println("Ingrese minutos que llegate  tarde: ");
    	int des = slc.nextInt();
		

        float x2;
    	float x3;
    	float let2;
    	float let3;
    	
    	
    	
    	
		float ou =(float)horas * cantidad;
    	
    	
    	
    	
    	
    	float neto;
    	
    	
		
	

		
		
	
        float porce = 0;
        float ore = 0;
        float ore3 = 0;
        
        float ted = 0;
    
        float ted2 = 0;
	    float ted3 = 0;
	    float tedi = 0;
		
		if(cantidad <= 50) {
	   
		tedi = 0;
		System.out.println("impuesto :" + tedi);
	
		
		if(des <= 15) {
		let3 = 0;
		System.out.println("impuesto : " + let3);
		 neto = ou + tedi - let3;

		System.out.println("impuesto : " + neto);

		}
		else{
			if(des <= 30 ) {	
		x2 = (float)0.002 * ou;
		let3 = ou - x2;

		System.out.println("impuesto : " + let3);
		 neto = ou + tedi - let3;
		System.out.println("impuesto : " + neto);
			}
		    else{
		    	if(des <= 30 ) {
		    		x3 = (float)0.005 * ou;
		    	let3 = ou - x3;
		    	System.out.println("impuesto : " + let3);
		    	 neto = ou + tedi - let3;
		    	System.out.println("impuesto : " + neto);
        }
        else{
        	if(cantidad <= 60 ) {
       
    	porce = (float)0.02 * ou;
    	tedi = ou + porce;
    	
    	System.out.println("impuesto : " + ted);
        	
       if(des <= 15) {
    	let3 = 0;
    	System.out.println("impuesto : " + let3);
    	 neto = ou + tedi - let3;

    	System.out.println("impuesto : " + neto);

    	}
    	else{
    		if(des <= 30 ) {	
    	x2 = (float)0.002 * ou;
    	let3 = ou - x2;

    	System.out.println("impuesto : " + let3);
     neto = ou + tedi - let3;
    	System.out.println("impuesto : " + neto);
    		}
    	    else{
    	    	if(des <= 30 ) {
    	    		x3 = (float)0.005 * ou;
    	    	let3 = ou - x3;
    	    	System.out.println("impuesto : " + let3);
    	     neto = ou + tedi - let3;
    	    	System.out.println("impuesto : " + neto);
        	}
            else{
            	if(cantidad <= 70 ) { 
         
        ore = (float)0.8 * ou;
        tedi = ore + ou;
        System.out.println("impuesto : " + tedi);
          
        if(des <= 15) {
        let3 = 0;
        System.out.println("impuesto : " + let3);
         neto = ou + tedi - let3;

        System.out.println("impuesto : " + neto);
        }
        else{
        	if(des <= 30 ) {	
        x2 = (float)0.002 * ou;
        let3 = ou - x2;

        System.out.println("impuesto : " + let3);
    neto = ou + tedi - let3;
        System.out.println("impuesto : " + neto);
        	}
            else{
            	if(des <= 30 ) {
            		x3 = (float)0.005 * ou;
            	let3 = ou - x3;
            	System.out.println("impuesto : " + let3);
             neto = ou + tedi - let3;
            	System.out.println("impuesto : " + neto);
            	}
            	else {
        if(cantidad <= 80 ) { 	
        
            ore = (float)0.13 * ou;	
            tedi = ou + ore;
            System.out.println("impuesto : " + tedi);
        }
		else{
             if(des <= 15) {
            let3 = 0;
            System.out.println("impuesto : " + let3);
            neto = ou + tedi - let3;

            System.out.println("impuesto : " + neto);
}
            else{
            	if(des <= 30 ) {	
            x2 = (float)0.002 * ou;
            let3 = ou - x2;

            System.out.println("impuesto : " + let3);
         neto = ou + tedi - let3;
            System.out.println("impuesto : " + neto);
            	}
                else{
                	if(des <= 30 ) {
                		x3 = (float)0.005 * ou;
                	let3 = ou - x3;
                	System.out.println("impuesto : " + let3);
                 neto = ou + tedi - let3;
                	System.out.println("impuesto : " + neto);
            	}
        else {
        	 if(cantidad >= 80 ) {
        		 
        		 ore3 = (float)0.15 * ou;
        		 tedi = ou + porce;
        		System.out.println("impuesto : " + tedi);
        	 
        	if(des <= 15) {
        		let3 = 0;
        		System.out.println("impuesto : " + let3);
        		 neto = ou + tedi - let3;

        		System.out.println("impuesto : " + neto);
        		}
        		else{
        			if(des <= 30 ) {	
        		x2 = (float)0.002 * ou;
        		let3 = ou - x2;

        		System.out.println("impuesto : " + let3);
        	 neto = ou + tedi - let3;
        		System.out.println("impuesto : " + neto);
        			}
        		    else{
        		    	if(des <= 30 ) {
        		    		x3 = (float)0.005 * ou;
        		    	let3 = ou - x3;
        		    	System.out.println("impuesto : " + let3);
        		     neto = ou + tedi - let3;
        		    	System.out.println("impuesto : " + neto);
        		
        		    	}
        		    }
        		}
        	 }
        }
                }
            }
        }
            	}
            }
        }
            	}
            }
    	    }
    	}
        	}
        }
		    	
		    }
		}
	
}
	}
}



		    
        		
        		
        		
        		
        		
        		
        		
