
package Concessionaria;

import java.util.Scanner;

public class Carrinho {
    
private static Scanner teclado;

 long CPF; 
 int formaM;
 String nome;

void dados()        
{   
   Scanner jumper = new Scanner(System.in);
   
    System.out.println("            Escolha sua forma de pagamento");
    System.out.println("      Digite -> 1 para á vista ou 2 para cartão. \n"); 
    formaM = jumper.nextInt();
      
    switch (formaM)
    {
        case 1: System.out.println("        Você escolheu a forma à vista. \n"); break;
            
        case 2: System.out.println("        Você escolheu a forma no cartão. \n"); break;
        
        default:
        
            System.out.println(" OPÇÃO INVALIDA \n");
        
    }
    
}

void confirmar()
{
    Scanner jumper = new Scanner(System.in);
    System.out.println("         Confirme seus dados pessoais");
    
    System.out.println("             Digite seu CPF  \n");
    CPF = jumper.nextLong();
    
    System.out.println("             Digite seu nome completo  \n");
    nome = jumper.next();
    
    System.out.println(" Dados confirmados com sucesso, aguarde seu cumpom fiscal.");
}   
    

}
