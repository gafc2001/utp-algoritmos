package semana01;

public class Insercion {
    public static void main(String[] args) {
        int[] datos = {8,3,5,1,9};
        for(int i = 0; i<datos.length; i++){
            int actual = datos[i];
            int j = i-1;
            while(j>=0 && datos[j] > actual){
                datos[j+1] = datos[j];
                j--;
            }
            datos[j+1] = actual;
        }
        System.out.print("Arreglo ordenado: ");
        for(int i = 0; i<datos.length; i++){
            System.out.print(datos[i] + " ");
        }
    }
}
