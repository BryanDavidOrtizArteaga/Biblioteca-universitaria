package biblioteca;

import java.util.Scanner;

public class Usuario {
    
        String nombre;
        String facultad;
        int edad;
    
        public Usuario (String nombre, String facultad, int edad){
            this.nombre = nombre;
            this.facultad = facultad;
            this.edad = edad; 
        }
             
        void Cuenta(){
            System.out.println("\n--- DATOS DEL USUARIO ---");
            System.out.println("USUARIO:" + nombre);
            System.out.println("FACULTAD:" + facultad);
            System.out.println("EDAD:" + edad);
            System.out.println("");
        }
    
}
