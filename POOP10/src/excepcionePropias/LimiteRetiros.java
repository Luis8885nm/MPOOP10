/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionePropias;

/**
 *
 * @author USUARIO
 */
public class LimiteRetiros extends Exception {

    public LimiteRetiros() {
        super("No se pueden hacer mas de 3 retiros al día, vuelve mañana:)");
    }
    
}
