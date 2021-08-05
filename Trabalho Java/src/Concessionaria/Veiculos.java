
package Concessionaria;

import java.util.Scanner;
        
public class Veiculos
{
private static Scanner teclado;

    int formaM, formaCR, formaCM, moto = 10 , carro = 8, caminhão = 4;

void moto()
{   
     
    Scanner jumper = new Scanner (System.in);
    
    
     System.out.println("                                   Temos 10 motos disponíveis \n");
     System.out.println("                                    Esolha a moto desejada ");
     System.out.println(" 1 Honda, preço -> R$8 mil | 2 Bros, preço-> R$10 mil | 3 Shineray, preço-> R$4 mil \n");
     moto = jumper.nextInt();  
     
 
         switch(moto)
    {
         case 1 : System.out.println("              Você escolheu a moto Honda \n"); break;
         
         case 2 : System.out.println("              Você escolheu a moto Bros \n"); break;
         
         case 3 : System.out.println("              Você escolheu a moto Shineray \n"); break;
             
         default:
         {
          System.out.println(" OPCÇÃO INVALIDA \n");   
         }
    }
}
 




void carro()
{
    
    Scanner jumper = new Scanner (System.in);
    
     System.out.println("                                   Temos 8 carros disponíveis \n ");
     System.out.println("                                    Esolha o carro desejado ");
     System.out.println(" 1 Corola, preço -> R$120 mil | 2 FOX, preço-> R$80 mil | 3 Golf, preço-> R$70 mil \n");
     carro = jumper.nextInt();  
     
 
         switch(carro)
    {   
        
         case 1 : System.out.println("              Você escolheu o carro Corola. \n"); break;
         
         case 2 : System.out.println("              Você escolheu o carro FOX. \n"); break;
            
         case 3 : System.out.println("              Você escolheu o carro Golf. \n"); break;
             
         default:
         
          System.out.println(" OPCÇÃO INVALIDA \n");            
    }  
     
    
}





void caminhão()
{
     Scanner jumper = new Scanner (System.in);
     System.out.println("                                   Temos 4 caminhões disponíveis \n ");    
     
     System.out.println("                                    Esolha o caminhão desejado ");
     System.out.println(" 1 Mecerdes benz, preço -> R$200 mil | 2 Iveco, preço-> R$130 mil | 3 Scania, preço-> R$170 mil \n");
     caminhão = jumper.nextInt();  
     
 
         switch(caminhão)
    {   
        
         case 1 : System.out.println("              Você escolheu o caminhão Mecerdes Benz. \n"); break;
         
         case 2 : System.out.println("              Você escolheu o caminhão Iveco. \n");  break;
         
         case 3 : System.out.println("              Você escolheu o caminhão Scania. \n"); break;
             
         default:
         
          System.out.println(" OPCÇÃO INVALIDA \n");   
              
    }  
     
}
    
    
    
    
    
    
    
    
    
    
    
    
   
}
