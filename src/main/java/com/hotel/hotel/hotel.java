/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel.hotel;

/**
 *
 * @author Admin
 */
public class hotel {
    public static void main (String args[]){
        
        Quartos quarto1 = new Quartos("1");
        //criação do quarto atribuindo valor ao contrutor
        
        
        quarto1.nome = "Suíte Master";
        quarto1.valor = "650,00";
        //atribuindo valores aos atributos
        
        
        Quartos quarto2 = new Quartos("2");
        
        quarto2.nome = "Simples";
        quarto2.valor = "200,00";
        
        Quartos quarto3 = new Quartos("2");
        
        quarto3.nome = "Intermediaria";
        quarto3.valor = "400,00";
        
        System.out.println("Quarto: " +quarto1.numero+"| Nome: "+quarto1.nome+ "| Valor: " +quarto1.valor+ "| Cortesia: "+ quarto1.Cortesia);
        System.out.println("Quarto: " +quarto2.numero+"| Nome: "+quarto2.nome+ "| Valor: " +quarto2.valor+ "| Cortesia: "+ quarto2.Cortesia);
        System.out.println("Quarto: " +quarto3.numero+"| Nome: "+quarto3.nome+ "| Valor: " +quarto3.valor+ "| Cortesia: "+ quarto3.Cortesia);
        //apresentando os valores atribuidos nos atributos 
        
    }
}
