package biblioteca;

import java.util.Scanner;

public class BIBLIOTECA {

    public static void main (String[] args){
        
        try (Scanner s = new Scanner(System.in)) {

            System.out.print("Bienvenido a la biblioteca universitara, por favor ingrese su nombre de usuario: ");
            String nombre1 = s.nextLine();
            
            System.out.print("Ingrese su facultad: ");
            String facultad1 = s.nextLine();
            
            System.out.print("Ingrese su edad: ");
            int edad1 = s.nextInt();
            s.nextLine();
            
            Usuario persona1 = new Usuario (nombre1,facultad1,edad1);
            
            int opcion;
            
            do {
                System.out.println("UN GUSTO TENERTE AQUÍ " + nombre1);
                System.out.println("\n--- MENÚ DE OPCIONES DE LA BIBLIOTECA ---");
                System.out.println("1. Encontrar libro por categoría");
                System.out.println("2. Agregar libro");
                System.out.println("3. Ver mi perfil");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = s.nextInt();
                
                switch (opcion) {
                    
                    case 1 -> {
                        int opciones;
                        
                        do{
                            System.out.println("\n--- SELECCIONE LA CATEGORÍA ---");
                            System.out.println("1. Ciencia");
                            System.out.println("2. Literatura");
                            System.out.println("3. Matemática");
                            System.out.println("4. Idiomas");
                            System.out.println("5. Física");
                            System.out.println("6. Salir");
                            System.out.print("Seleccione una opción: ");
                            
                            opciones = s.nextInt();
                            
                            switch (opciones) {
                                case 1 -> {
                                    System.out.println("\n--- LIBROS DE CIENCIA ---");
                                    System.out.println("- La biología en el planeta V2");
                                    System.out.println("- Química desde cero");
                                    System.out.println("- Conservación de la materia desde un laboratorio");
                                }
                                
                                case 2 -> {
                                    System.out.println("\n--- LIBROS DE LITERATURA ---");
                                    System.out.println("- Relatos cortos de Kody Evans");
                                    System.out.println("- Biografía de Hegel");
                                    System.out.println("- El gato negro");                                    
                                }
                                
                                case 3 -> {
                                    System.out.println("\n--- LIBROS DE MATEMÁTICAS ---");
                                    System.out.println("- Ecuaciones diferenciales");
                                    System.out.println("- Trigonometría aplicada a casos de uso");
                                    System.out.println("- Matemática detallada (Tomo 4)");                                        
                                }
                                
                                case 4 -> {
                                    System.out.println("\n--- LIBROS DE IDIOMAS ---");
                                    System.out.println("- Miss Eva Potlins");
                                    System.out.println("- Pourquoi la maison est rouge");
                                    System.out.println("- English module 1");                                    
                                }
                                
                                case 5 -> {
                                    System.out.println("\n--- LIBROS DE FÍSICA ---");
                                    System.out.println("- Formulas básicas y ejemplos");
                                    System.out.println("- Física y sus derivadas");
                                    System.out.println("- Cambio de proporcionalidades multiples");                                   
                                }
                                
                                case 6 -> {
                                    System.out.println("Saliendo de la app...");
                                }
                        default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");        
                            }
                        } while (opciones != 6);
                    }
                        
                        
                        
                    case 2 -> {
                        
                        System.out.print("Ingrese su libro para agregar: ");
                        String nuevo1 = s.nextLine();
                        s.nextLine();
                        
                        Libro Biblio1 = new Libro (nuevo1);
                        
                        Biblio1.VerNuevo();
                    }
                                                     
                    case 3 -> persona1.Cuenta();   
                        
                    case 4 -> System.out.println("Saliendo de la app...");
            default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            } while (opcion != 4);
        }
    }
}
    