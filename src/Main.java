import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("semana3");
        System.out.println("Nayely del Rocio Ayol Guanluisa");
        Scanner sc = new Scanner(System.in);
        Cocinero[] cocineros = new Cocinero[3];

        System.out.println("\n-----INGRASE LA INFORMACION----");
        for (int i = 0; i <=2; i++) {
            System.out.println("\nCocinero"+(i+1));
            System.out.println("\nNombre: ");
            String nombre = sc.nextLine();
            System.out.println("\nExperiencia: ");
            int experiencia = sc.nextInt();
            sc.nextLine();
            System.out.println("\nEspecialidad: ");
            String especialidad = sc.nextLine();
            cocineros[i]=new Cocinero(nombre,especialidad,experiencia);
        }

        System.out.println("\n------INFORMACION OBTENIDA------\n");
        for (int i=0; i<=2; i++) {
            cocineros[i].mostrarInfo();
        }
    }
}