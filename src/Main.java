import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        int fechaDeLanzamiento = 1999;
        int numeroDeResenhas = 0;
        double notaResenhas = 0;
        double evaluacionMedia = 0;
        double calificaciones = 0;
        double i = 0;
        boolean planBasico = true;
        boolean buscando = false;
        String nombre = "Matrix";
        String sinopsis = """
                Matrix es una película que narra la aventura de Neo,
                un joven hacker que es convocado por el movimiento de resistencia liderado por Morfeo,
                que lucha contra la dominación de los seres humanos por las máquinas.
                Morfeo le ofrece dos pastillas de diferentes colores:
                con una continuará en la ilusión y con otra descubrirá la verdad.
                """;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la pelicula a evaluar: ");
        String buscarPelicula = teclado.nextLine();

        buscando = nombre.equalsIgnoreCase(buscarPelicula);

        if (buscando && planBasico){

            System.out.println(nombre);
            System.out.println(sinopsis);
            System.out.println("Escribe de 0 a 5 cuanto te gusto, " +
                    "si acabaste tu calificacion ingresa un numero negativo");

            while(i>=0){
                Scanner ciclo = new Scanner(System.in);
                calificaciones = ciclo.nextDouble();
                if (calificaciones >=0 && calificaciones<=5){
                    notaResenhas = notaResenhas + calificaciones;
                    numeroDeResenhas++;

                } else if (calificaciones>0){
                    System.out.println("lo siento no esta dentro del rango permitido");
                } else {
                    i = calificaciones;
                    System.out.println("Notas terminadas:");
                }
            }

            evaluacionMedia = notaResenhas / numeroDeResenhas;

            System.out.println("La media de la pelicula " + nombre + " es: " + evaluacionMedia + " estrellas.");

            System.out.println("Cantidad de reseñas: " + numeroDeResenhas);
            if (evaluacionMedia == 5){
                System.out.println("Clasificada como: EXCELENTE!");
            } else if (evaluacionMedia <5 && evaluacionMedia >=3) {
                System.out.println("Clasificada como: RECOMENDADA!");
            } else {
                System.out.println("Clasificada como: NO RECOMENDAD!");
            }

        } else {
            System.out.println("La pelicula que buscas no esta disponible o no esta incluida en tu plan.");
        }

    }
}