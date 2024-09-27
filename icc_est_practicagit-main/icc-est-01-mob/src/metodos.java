public class metodos {
    public metodos(){
        System.out.println("se creo el objeto");
    }
    public int[] sortByBumbble(int[] arreglo) {

        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++){
            for(int j = i+1; j < tamanio; j++){
                if(arreglo[i] > arreglo[j]){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }

        }
        return arreglo;
    } 
    public int[] sortByBumbbleDescendete(int[] arreglo) {

        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio; i++){
            for(int j = i+1; j < tamanio; j++){
                if(arreglo[i] < arreglo[j]){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
                
            }
            
        }
        return arreglo;
    }      
    public String[] sortByBumbblePalabras(String[] palabras) {

        int tamanio = palabras.length;

        for (int i = 0; i < tamanio; i++){
            for(int j = i+1; j < tamanio; j++){
                if(palabras[i].compareToIgnoreCase(palabras[j]) > 0){
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;
                }
            }

        }
        return palabras;
    }
           
    public void printArreglo(int[]arreglo){
        for (int elemento : arreglo){ //for each el arreglo va instanciando cada elemento del arreglo se va almacenando
            System.out.print(elemento + "-");
        }
    }
        public void printlnArregloPalabras(String[]arreglo){
            for (String elemento : arreglo){ //for each el arreglo va instanciando cada elemento del arreglo se va almacenando
                System.out.print(elemento + "-");
    }
    
    //ordenar las palabras alfabeticamente
    
}
}
//ordenar las palabras alfabeticamente