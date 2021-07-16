
package Concessionaria;

import java.util.Scanner;
        
public class Veiculos
{
private static Scanner teclado;

    int formaM, formaCR, formaCM, moto = 10 , carro = 8, caminhao = 4;

void moto()
{   
     
    Scanner jumper = new Scanner (System.in);
    
    
     System.out.println("                                   Temos 10 motos disponiveis \n");
     System.out.println("                                    Esolha a moto desejada ");
     System.out.println(" 1 Honda, preco -> R$8 mil | 2 Bros, preco-> R$10 mil | 3 Shineray, preco-> R$4 mil \n");
     moto = jumper.nextInt();  
     
 
         switch(moto)
    {
         case 1 : System.out.println("              Voceª escolheu a moto Honda \n"); break;
         
         case 2 : System.out.println("              Voceª escolheu a moto Bros \n"); break;
         
         case 3 : System.out.println("              Voceª escolheu a moto Shineray \n"); break;
             
         default:
         {
          System.out.println(" OPCAO INVALIDA \n");   
         }
    }
}
 




void carro()
{
    
    Scanner jumper = new Scanner (System.in);
    
     System.out.println("                                   Temos 8 carros disponiveis \n ");
     System.out.println("                                    Esolha o carro desejado ");
     System.out.println(" 1 Corola, preco -> R$120 mil | 2 FOX, preco-> R$80 mil | 3 Golf, preco-> R$70 mil \n");
     carro = jumper.nextInt();  
     
 
         switch(carro)
    {   
        
         case 1 : System.out.println("              Voce escolheu o carro Corola. \n"); break;
         
         case 2 : System.out.println("              Voce escolheu o carro FOX. \n"); break;
            
         case 3 : System.out.println("              Voce escolheu o carro Golf. \n"); break;
             
         default:
         
          System.out.println(" OPCAO INVALIDA \n");            
    }  
     
    
}





void caminhao()
{
     Scanner jumper = new Scanner (System.in);
     System.out.println("                                   Temos 4 caminhoes disponiveis \n ");    
     
     System.out.println("                                    Esolha o caminhao desejado ");
     System.out.println(" 1 Mecerdes benz, preco -> R$200 mil | 2 Iveco, preco-> R$130 mil | 3 Scania, preco-> R$170 mil \n");
     caminhao = jumper.nextInt();  
     
 
         switch(caminhao)
    {   
        
         case 1 : System.out.println("              Voce escolheu o caminhao Mecerdes Benz. \n"); break;
         
         case 2 : System.out.println("              Voce escolheu o caminhao Iveco. \n");  break;
         
         case 3 : System.out.println("              Voce escolheu o caminhao Scania. \n"); break;
             
         default:
         
          System.out.println(" OPCAO INVALIDA \n");   
              
    }  
     
}
    
    
    
    
    
    
    
    
    
    
    
    
   
}
