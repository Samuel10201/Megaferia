/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author examen
 */
public abstract class Libro {
    protected String titulo, isbn, genero, formato;
    protected ArrayList<Autor> autores = new ArrayList<>();
    protected float valor;
    protected Editorial editorial;
}
