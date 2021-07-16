
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
    System.out.println("      Digite -> 1 para a vista ou 2 para cartao. \n"); 
    formaM = jumper.nextInt();
      
    switch (formaM)
    {
        case 1: System.out.println("        Você escolheu a forma a vista. \n"); break;
            
        case 2: System.out.println("        Você escolheu a forma no cartao. \n"); break;
        
        default:
        
            System.out.println(" OPCAO INVALIDA \n");
        
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
