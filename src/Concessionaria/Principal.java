package Concessionaria;

import java.util.Scanner;
        
public class Principal {
    
private static Scanner teclado;
        
    public static void main(String[] args) {
        
        Scanner jumper = new Scanner (System.in);
        
    int imprime, opcao;
            
    
    System.out.println("            BEM VINDO A SOPRANOS VEICULOS \n");



    Veiculos c1 = new Veiculos();
    Carrinho v1 = new Carrinho();
     
    
    System.out.println("             Esolha o veiculo desejado ");
System.out.println(" 1 para moto, 2 para carro ou 3 para caminhao. \n");
imprime = jumper.nextInt();

    switch(imprime)
    {
        case 1: 
            c1.moto(); v1.dados(); v1.confirmar(); break;   
            
        case 2:
            c1.carro(); v1.dados(); v1.confirmar(); break;   
        
        case 3: 
            c1.caminhao(); v1.dados(); v1.confirmar(); break;   
        
    default:
    {
    System.out.println(" OPCAO INVALIDA \n"); 
    }
    }
    
    
     



        
        
        
        
        
    }
    
}
