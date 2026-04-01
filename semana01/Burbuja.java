package semana01;

public class Burbuja {
    public static void main(String[] args) {
        int[] numeros = {8,3,5,1,9,2,5,1,1, 25};
        for(int i = 0; i<numeros.length-1; i++){
            for(int j = 0; j < numeros.length - 1 - i; j++){
                if(numeros[j] > numeros[j+1]){
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j+1] = aux;
                }
            }
        }
        System.out.print("Arreglo ordenado: ");
        for(int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
