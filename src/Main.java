import java.sql.SQLOutput;
import java.util.Scanner;
//Parte una finalizada
public class Main {
    public static void main(String[] args) {
        System.out.println("semana3");
        System.out.println("Nayely Ayol");
        Scanner sc = new Scanner(System.in);
        Cocinero[] cocineros = new Cocinero[3];

        System.out.printf("\n-----INGRASE LA INFORMACION----");
        for (int i = 0; i <=2; i++) {
            System.out.println("\nCocinero"+(i+1));
            System.out.println("\nNombre: ");
            String nombre = sc.nextLine();
            System.out.printf("\nExperiencia: ");
            int experiencia = sc.nextInt();
            sc.nextLine();
            System.out.printf("\nEspecialidad: ");
            String especialidad = sc.nextLine();
            cocineros[i]=new Cocinero(nombre,especialidad,experiencia);
        }


        System.out.printf("\n------INFORMACION OBTENIDA------\n");
        for (int i=0; i<=2; i++) {
            cocineros[i].mostrarInfo();
        }
    }
}