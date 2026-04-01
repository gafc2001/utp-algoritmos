package semana02;

public class PuestoVacunacion {
    public static void main(String[] args) {
        int[] edades = {45,18,65,30,12};
        int n = edades.length;
        // Algoritmo de Selección
        for(int i = 0; i<n-1; i++){
            int indiceMinimo = i;
            for(int j = i + 1; j<n; j++){
                if(edades[j] < edades[indiceMinimo]){
                    indiceMinimo = j;
                }
            }
            int temp = edades[indiceMinimo];
            edades[indiceMinimo] = edades[i];
            edades[i] = temp;
        }
        
        System.out.println("Edades ordenados de menor a mayor");
        for(int edad: edades){
            System.out.print(edad + " ");
        }
    }
}
