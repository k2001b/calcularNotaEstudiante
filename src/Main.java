import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notaExamenParcial = 0, notaTaller = 0, notaFinal = 0, notaMateria = 0;
        String materia = "";
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Ingrese el doumento del estudiante: ");

        String documentoEstudiante = sc.nextLine();
        System.out.println("Seleccione el programa: \n1 - Desarrollo de software\n2 - Gastronomia\n3 - Diseño grafico");
        
        String programa = sc.nextLine();
        switch(programa){
            case "1":
                System.out.println("Programa de desarrollo de software");
                System.out.println("Seleccione la materia:\n1 - logica de programacion\n2 - Metodologias agiles\n3 - Introducción a la programación");
                materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Notas de logica de programacion");
                        System.out.println("nota exámen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.print("nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.print("nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("el estudiante" + nombreEstudiante + "tiene la siguiente nota en la materia de logica: " + notaMateria);
                        if(notaMateria <2){
                            System.out.println("perdio definitivamente");
                        } else if(notaMateria < 2.9){
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }

                        break;
                    case "2":
                        System.out.println("Nota de metodologias agiles");
                        System.out.println("nota exámen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.print("nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.print("nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("el estudiante" + nombreEstudiante + "tiene la siguiente nota en la materia de Metodologias: " + notaMateria);
                        if(notaMateria <2){
                            System.out.println("perdio definitivamente");
                        } else if(notaMateria < 2.9){
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Nota de introduccion a la programación");
                        System.out.println("nota exámen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.print("nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.print("nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("el estudiante" + nombreEstudiante + "tiene la siguiente nota en la materia de Introducción: " + notaMateria);
                        if(notaMateria <2){
                            System.out.println("perdio definitivamente");
                        } else if(notaMateria < 2.9){
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }


            }
            case "2":
                System.out.println("programa de diseño grafico");
                System.out.println("Seleccione la materia:\n1 - costos\n2 - panaderia dulce \n3 - cocina internacional");
                materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de costos");
                        System.out.println("nota exámen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.print("nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.print("nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("el estudiante" + nombreEstudiante + "tiene la siguiente nota en la materia de costos: " + notaMateria);
                        if(notaMateria <2){
                            System.out.println("perdio definitivamente");
                        } else if(notaMateria < 2.9){
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Nota de panaderia dulce");
                        System.out.println("nota exámen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.print("nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.print("nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("el estudiante" + nombreEstudiante + "tiene la siguiente nota en la materia de panaderia dulce: " + notaMateria);
                        if(notaMateria <2){
                            System.out.println("perdio definitivamente");
                        } else if(notaMateria < 2.9){
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Nota de cocina internacional");
                        System.out.println("nota exámen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.print("nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.print("nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("el estudiante" + nombreEstudiante + "tiene la siguiente nota en la materia de cocina internacional: " + notaMateria);
                        if(notaMateria <2){
                            System.out.println("perdio definitivamente");
                        } else if(notaMateria < 2.9){
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");

                        }

                }
                break;
            case "3":
                System.out.println("Programa de Gastronomia");
                System.out.println("Seleccione la materia:\n1 - tipografia\n2 - iconografia\n3 - semantica");
                materia = sc.nextLine();
                switch (materia) {
                    case "1":
                        System.out.println("Nota de tipografia");
                        System.out.println("nota exámen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.print("nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.print("nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("el estudiante" + nombreEstudiante + "tiene la siguiente nota en la materia de tipografia: " + notaMateria);
                        if(notaMateria <2){
                            System.out.println("perdio definitivamente");
                        } else if(notaMateria < 2.9){
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }
                        break;
                    case "2":
                        System.out.println("Nota de iconografia");
                        System.out.println("nota exámen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.print("nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.print("nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("el estudiante" + nombreEstudiante + "tiene la siguiente nota en la materia de iconografia: " + notaMateria);
                        if(notaMateria <2){
                            System.out.println("perdio definitivamente");
                        } else if(notaMateria < 2.9){
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }
                        break;
                    case "3":
                        System.out.println("Nota de semantica");
                        System.out.println("nota exámen parcial: ");
                        notaExamenParcial = sc.nextDouble();
                        System.out.print("nota taller: ");
                        notaTaller = sc.nextDouble();
                        System.out.print("nota final: ");
                        notaFinal = sc.nextDouble();
                        notaMateria = (notaExamenParcial * 0.2) + (notaTaller * 0.3) + (notaFinal * 0.5);
                        System.out.println("el estudiante" + nombreEstudiante + "tiene la siguiente nota en la materia de semantica: " + notaMateria);
                        if(notaMateria <2){
                            System.out.println("perdio definitivamente");
                        } else if(notaMateria < 2.9){
                            System.out.println("Tiene derecho al plan de mejoramiento");
                        } else {
                            System.out.println("Asi le quedo la materia");
                        }
                        break;
                }
                break;
        }
    }
}