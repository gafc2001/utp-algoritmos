package semana02;

public class TurismoPeru {
    public static void main(String[] args) {
        String[] ciudades = {"Cusco", "Arequipa", "Iquitos", "Trujillo", "Tacna"};
        int n = ciudades.length;
        
        // Algoritmo de Burbuja
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(ciudades[j].compareTo(ciudades[j+1]) > 0){
                    String tmp = ciudades[j];
                    ciudades[j] = ciudades[j+1];
                    ciudades[j + 1] = tmp;
                }
            }
        }
        
        System.out.println("Ciudades ordenados alfabeticamente");
        for(String ciudad : ciudades){
            System.out.println(ciudad);
        }
    }
}
