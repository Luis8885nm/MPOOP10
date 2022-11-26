/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

import excepcionePropias.LimiteDeposito;
import excepcionePropias.LimiteRetiros;
import excepcionePropias.SaldoInsuficienteExceptions;

/**
 *
 * @author poo01alu30
 */
class Cuenta { 
    private double saldo;  
    private int c;
    public Cuenta() {
    }
    
    public void retirar(double monto) throws SaldoInsuficienteExceptions, LimiteRetiros{
        System.out.println("Retirando.....$"+monto);
        if(c==3) 
            throw new LimiteRetiros(); 
        else
            if(saldo<monto) 
                throw new SaldoInsuficienteExceptions();
             else
                this.saldo-= monto;  
                c = c+1;
        
        
    } 
    public void depositar(double monto) throws LimiteDeposito{
        System.out.println("Depositando..."+monto); 
        if(monto>20000) 
            throw new LimiteDeposito(); 
        else
            this.saldo+=monto;
    } 

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }

    
    
}
