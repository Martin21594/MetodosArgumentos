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



public void imprimiredad () {
    System.out.println (edad);//imprime la edad 
}

public void imprimirnombre () {
    System.out.println (nombre);//imrpime el nombre
}

public void imprimirdire() {
    System.out.println (direccion);//imprime la direccion
}

public void suma (int numero1,int numero2) {
   int total=numero1+numero2;
    System.out.println(total);
}
    
public static void main(String args[]) {

    metodos metodo2=new metodos();//objeto que creo
    metodos calculo=new metodos();
    
    metodo2.imprimiredad();//muestra
    calculo.suma(15,20);
    
    
}

}