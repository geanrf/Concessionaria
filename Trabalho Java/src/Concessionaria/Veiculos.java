
package Concessionaria;

import java.util.Scanner;
        
public class Veiculos
{
private static Scanner teclado;

    int formaM, formaCR, formaCM, moto = 10 , carro = 8, caminh�o = 4;

void moto()
{   
     
    Scanner jumper = new Scanner (System.in);
    
    
     System.out.println("                                   Temos 10 motos dispon�veis \n");
     System.out.println("                                    Esolha a moto desejada ");
     System.out.println(" 1 Honda, pre�o -> R$8 mil | 2 Bros, pre�o-> R$10 mil | 3 Shineray, pre�o-> R$4 mil \n");
     moto = jumper.nextInt();  
     
 
         switch(moto)
    {
         case 1 : System.out.println("              Voc� escolheu a moto Honda \n"); break;
         
         case 2 : System.out.println("              Voc� escolheu a moto Bros \n"); break;
         
         case 3 : System.out.println("              Voc� escolheu a moto Shineray \n"); break;
             
         default:
         {
          System.out.println(" OPC��O INVALIDA \n");   
         }
    }
}
 




void carro()
{
    
    Scanner jumper = new Scanner (System.in);
    
     System.out.println("                                   Temos 8 carros dispon�veis \n ");
     System.out.println("                                    Esolha o carro desejado ");
     System.out.println(" 1 Corola, pre�o -> R$120 mil | 2 FOX, pre�o-> R$80 mil | 3 Golf, pre�o-> R$70 mil \n");
     carro = jumper.nextInt();  
     
 
         switch(carro)
    {   
        
         case 1 : System.out.println("              Voc� escolheu o carro Corola. \n"); break;
         
         case 2 : System.out.println("              Voc� escolheu o carro FOX. \n"); break;
            
         case 3 : System.out.println("              Voc� escolheu o carro Golf. \n"); break;
             
         default:
         
          System.out.println(" OPC��O INVALIDA \n");            
    }  
     
    
}





void caminh�o()
{
     Scanner jumper = new Scanner (System.in);
     System.out.println("                                   Temos 4 caminh�es dispon�veis \n ");    
     
     System.out.println("                                    Esolha o caminh�o desejado ");
     System.out.println(" 1 Mecerdes benz, pre�o -> R$200 mil | 2 Iveco, pre�o-> R$130 mil | 3 Scania, pre�o-> R$170 mil \n");
     caminh�o = jumper.nextInt();  
     
 
         switch(caminh�o)
    {   
        
         case 1 : System.out.println("              Voc� escolheu o caminh�o Mecerdes Benz. \n"); break;
         
         case 2 : System.out.println("              Voc� escolheu o caminh�o Iveco. \n");  break;
         
         case 3 : System.out.println("              Voc� escolheu o caminh�o Scania. \n"); break;
             
         default:
         
          System.out.println(" OPC��O INVALIDA \n");   
              
    }  
     
}
    
    
    
    
    
    
    
    
    
    
    
    
   
}
