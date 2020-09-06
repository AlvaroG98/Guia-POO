/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author GUILLERMO
 */
public class main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Perro perro = new Perro("Bruno","Purina",10,"Cafe");
        Gato gato = new Gato("Pascal","Wishkas",7,"Azules");
        Gallo gallo = new Gallo("Toto","Semillas",2,"Verde");
        Hamster hamster = new Hamster("Hamtaro","lechuga",5,10);

        //-->Nos muestra los detalles del objeto
        perro.mostrar();
        System.out.println("--------------------------------------------------");
        gato.mostrar();
        System.out.println("--------------------------------------------------");
        gallo.mostrar();
        System.out.println("--------------------------------------------------");
        hamster.mostrar();

    }
    
}
