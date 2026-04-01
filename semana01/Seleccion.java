package semana01;

public class Seleccion {
    public static void main(String[] args) {
        int[] numeros = {8,3,5,1,9,2};
        for(int i = 0; i<numeros.length-1; i++){
            int posMenor = i;
            for(int j=i+1; j<numeros.length;j++){
                if(numeros[j] < numeros[posMenor]){
                    posMenor = j;
                }
            }
            int aux = numeros[i];
            numeros[i] = numeros[posMenor];
            numeros[posMenor] = aux;
        }
        System.out.print("Arreglo ordenado: ");
        for(int i = 0; i<numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
