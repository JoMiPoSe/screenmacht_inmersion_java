import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java!");
        //System.out.println("Pelicula Matrix");
        //De claración de variables.
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milemio
                """;
        double mediaEvaluacionesUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println(sinopsis);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) /3;
        System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023){
            System.out.println("Pelicula Popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota o evaluación que le darias a Matriz");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionesUsuario = mediaEvaluacionesUsuario + notaMatrix;

        }
        System.out.println("La media de la pelicula Matrix calculado por el usuario es: " + mediaEvaluacionesUsuario / 3);

    }
}