package semana01;

public class ImprimirArreglo {

    public static void main(String[] args) {
        int[] numeros = {8,3,5,1,9,10};
        System.out.println("Elementos del arreglo: ");
        for(int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
