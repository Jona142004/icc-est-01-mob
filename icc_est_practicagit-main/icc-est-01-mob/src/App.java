public class App {
    public static void main(String[] args) throws Exception {
        metodos metodosOrdenamiento = new metodos();

        int[] arreglo = {5,7,30,12,9};

        int[] arregloOrdenado = metodosOrdenamiento.sortByBumbble(arreglo);
        metodosOrdenamiento.printArreglo(arregloOrdenado);
        int[] arregloOrdenadoescendete = metodosOrdenamiento.sortByBumbbleDescendete(arreglo);
        metodosOrdenamiento.printArreglo(arregloOrdenadoescendete);
        String cadena = "esto vamos a ordenar";
        String [] palabras = cadena.split(" ");
        String [] palabrasOrdenar = metodosOrdenamiento.sortByBumbblePalabras(palabras);
        metodosOrdenamiento.printlnArregloPalabras(palabras);
  

    }
}
