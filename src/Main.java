import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiantes est1 = null, est2 = null;
        Ciudadanos c1 = null, c2 = null;
        Mascotas m1 = null, m2 = null;
        int option;


        do{
            System.out.println("\n--------MENU---------");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Ingresar ciudadano");
            System.out.println("3. Ingresar mascota");
            System.out.println("4. Modificar los valores del estudiante");
            System.out.println("5. Modificar los valores del ciudadano");
            System.out.println("6. Modificar los valores del mascota");
            System.out.println("7. imprimir los valores de estudiante");
            System.out.println("8. imprimir los valores de ciudadano");
            System.out.println("9. imprimir los valores de mascota");
            System.out.println("0. Salir");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                    est1 = new Estudiantes();
                    System.out.println("Estudiante 1 creado");
                    est2 = new Estudiantes();
                    System.out.println("Estudiante 2 creado");
                    break;
                case 2:
                    c1 = new Ciudadanos("Angel","Manuel",23);
                    System.out.println("Ciudadano 1 creado");
                    c2 = new Ciudadanos("Daniel","Machego",25);
                    System.out.println("Ciudadano 2 creado");
                    break;
                case 3:
                    m1 = new Mascotas("Mike",5,"Mezclada");
                    System.out.println("Mascota 1 creado");
                    m2 = new Mascotas("Kira",7,"Chihuahua");
                    System.out.println("Mascota 2 creado");
                    break;
                case 4:
                    System.out.println("Modificacion de datos del estudainte");
                    if (est1== null || est2 ==null) {
                        System.out.println("Primero debe crear a los estudiantes");

                    }
                    else {
                        System.out.println("Ingrese el nombre del estudiante 1: ");
                        est1.setNombre(scanner.nextLine());
                        System.out.println("Ingrese el apellido del estudiante 1: ");
                        est1.setApellido(scanner.nextLine());
                        System.out.println("Ingrese la edad del estudiante: ");
                        est1.setEdad(scanner.nextInt());
                        System.out.println("Ingrese el nombre del estudiante 2: ");
                        est2.setNombre(scanner.nextLine());
                        System.out.println("Ingrese el apellido del estudiante 2: ");
                        est2.setApellido(scanner.nextLine());
                        System.out.println("Ingrese la edad del estudiante: ");
                        est2.setEdad(scanner.nextInt());
                    }
                break;
                case 5:
                    if(c1 == null || c2 == null) {
                        System.out.println("Primero debe crear a los ciudadanos");
                    }
                    else {
                        System.out.println("Modificacion de datos del ciudadano");
                        System.out.println("Ingrese el nuevo nombre para el ciudadano 1");
                        c1.setNombre(scanner.nextLine());
                        scanner.nextLine();
                        System.out.println("Ingrese el apellido para el ciudadano 1");
                        c1.setApellido(scanner.nextLine());
                        System.out.println("Ingrese la edad para el ciudadano 1");
                        c1.setEdad(scanner.nextInt());
                        System.out.println("Ingrese el nuevo nombre para el ciudadano 2");
                        c2.setNombre(scanner.nextLine());
                        System.out.println("Ingrese el apellido para el ciudadano 2");
                        c2.setApellido(scanner.nextLine());
                        System.out.println("Ingrese la edad para el ciudadano 2");
                        c2.setEdad(scanner.nextInt());}
                    break;
                case 6:
                    if(m1 == null || m2 == null) {
                        System.out.println("Primero debe crear a los mascotas");
                    }
                    else {
                    System.out.println("Modificacion de datos del mascota");
                    System.out.println("Ingrese el nuevo nombre para el mascota 1");
                    m1.setNombre(scanner.nextLine());
                    System.out.println("Ingrese la edad para mascota 1");
                    m1.setEdad(scanner.nextInt());
                    System.out.println("Ingrese la raza de la mascota 1");
                    m1.setRaza(scanner.nextLine());
                    System.out.println("Ingrese el nuevo nombre para el mascota 2");
                    m2.setNombre(scanner.nextLine());
                    System.out.println("Ingrese la edad para mascota 2");
                    m2.setEdad(scanner.nextInt());
                    System.out.println("Ingrese la raza de la mascota 2");
                    m2.setRaza(scanner.nextLine());
                }
                    break;
                case 7:
                    if (est1 == null || est2 == null){
                    System.out.println("No hay datos que mostrar");
                }
                    else{
                    System.out.println("Imorimir los datos de los estudaintes");
                    System.out.println(est1.mostrarEstudiantes());
                    System.out.println(est2.mostrarEstudiantes());
                }
                    break;
                case 8:
                    if (c1 == null || c2 == null) {
                        System.out.println("Primero debe crear a los ciudadanos");
                    }
                    else {
                    System.out.println("Imprimir los datos de los ciudadanos");
                    System.out.println(c1.mostrarCiudadanos());
                    System.out.println(c2.mostrarCiudadanos());
                    }
                    break;
                case 9:
                    if (m1 == null || m2 == null) {
                        System.out.println("Primero debe crear a los mascotas");
                    }
                    else {
                    System.out.println("Imprimir los datos de las mascotas");
                    System.out.println(m1.mostrarMascotas());
                    System.out.println(m2.mostrarMascotas());}
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese un numero correcto");
            }

        } while (option != 0);

        scanner.close();
    }
}