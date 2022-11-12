/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public abstract class Observador {

    protected Subject sujeto;

    public abstract void actualizar();
    public abstract void agregar(Subject subject);

}
