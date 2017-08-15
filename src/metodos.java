/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class metodos {
int edad=18;
String nombre="juan"; // el atributo va dentro de la clase pero afuera del main.
String direccion="Chiclana";
int edadmiguel=26;
String nombremiguel="miguel";



public void imprimiredad () {
    System.out.println (edad);//imprime la edad 
    
}


public void imprimirnombre () {
    System.out.println (nombre);//imrpime el nombre
}

public void imprimirdire() {
    System.out.println (direccion);
}

public void imprimirmiguel() {
    System.out.println(edadmiguel+nombremiguel);
}
    
public static void main(String args[]) {

    metodos metodo2=new metodos();//objeto que creo
    metodos miguelmetodo=new metodos ();
   
    
    metodo2.imprimiredad();//muestra
    miguelmetodo.imprimirmiguel();
  
    
    
 
}

}