/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author USUARIO
 */ 
import excepcionePropias.LimiteDeposito;
import excepcionePropias.LimiteRetiros;
import excepcionePropias.SaldoInsuficienteExceptions;
public class POOP10 {

    /**
     * @param args the command line arguments
     * @throws excepcionePropias.LimiteDeposito
     * @throws excepcionePropias.LimiteRetiros 
     */
    public static void main(String[] args) throws LimiteDeposito, LimiteRetiros {
        // TODO code application logic here
        try{
    String mensajes[]={"Mensaje 1","Mensaje 2", "Mensaje 3"}; 
    for (int i = 0; i <= mensajes.length ; i++){
            System.out.println(mensajes[i]);
        }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error:Apuntador fuera de límites");
            //e.printStackTrace();
            
        }
        System.out.println("##########Finally#############");
        try{
            float x=10/2; 
            System.out.println("X="+x);
        }catch(ArithmeticException e){
            System.out.println("Syntax error");
        }finally{ 
            System.out.println("cualquier cosa que suceda entra al finally");
        }  
        
        
        System.out.println("###########Catch Anidado############");
        try{
            float x=10/0; 
            System.out.println("X="+x); 
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro:Apuntador fuera de l'imites");
            //e.printStackTrace(); 
        }catch(ArithmeticException e){
            System.out.println("Syntax error");
        }
        System.out.println("###########Propagación de excepciones ############"); 
        try{
            float division =metodoDivision(4,0); 
            System.out.println("Division="+division); 
        }catch(ArithmeticException e){
            System.out.println("Syntax error en el metodo xd");
        } 
        try{
            System.out.println("#######################Excepciones marcadas##########################");
            float div = metodoDivisionMarcada(3,0); 
        }catch(ArithmeticException e){
            System.out.println("Syntax error division marcada");
        } 
        System.out.println("###################cración de excepciones########################");  
        
        Cuenta cuenta= new Cuenta();  
       try{
           
          
        cuenta.depositar(18_000); 
        System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());   
        cuenta.depositar(21_000); 
        System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
        cuenta.retirar(10_000); 
        System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());  
        cuenta.retirar(10); 
        System.out.println("Saldo de cuenta: $"+cuenta.getSaldo()); 
        cuenta.retirar(50_000);  
        System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());  
        cuenta.retirar(10); 
        System.out.println("Saldo de cuenta: $"+cuenta.getSaldo()); 
        cuenta.retirar(20); 
        System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
        }catch(LimiteDeposito | SaldoInsuficienteExceptions | LimiteRetiros ex){  
            System.out.println(ex.getMessage());
             
        } 
       try{  
           System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());   
                cuenta.depositar(21_000);
       }catch(LimiteDeposito ex){
           System.out.println(ex.getMessage());
       }
    }
    private static float metodoDivision(int a, int b){
        return a/b;
    }
    private static float metodoDivisionMarcada(int a, int b)throws ArithmeticException {
        return a/b;
    }
    
}
