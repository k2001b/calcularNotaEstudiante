import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Ingrese el doumento del estudiante: ");
        String documentoEstudiante = sc.nextLine();
        System.out.println("Seleccione el programa: \n1 - Desarrollo de software\n2 - Diseño Grafico\n3 - Gastronomía");
        String programa = sc.nextLine();
        switch(programa){
            case "1":
                System.out.println("Programa de desarrollo de software");
                System.out.println("Seleccione la materia:\n1 - logica de programacion\n2 - Metodologias agiles\n - Introducción a la programación");
                String materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de logica de programacion");
                break;
            case "2":
                System.out.println("Nota de metodologias agiles");
                break;
                case "3":
                        System.out.println("Nota de introduccion");
                        break;
                System.out.println("Programa de diseño grafico");
                break;
            case "3":
                System.out.println("Programa de Gastronomia");
                break;


        }
    }
}