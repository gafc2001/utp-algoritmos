package semana01;

public class EjemploMaximo {
    public static void main(String[] args) {
        int[] numeros = {8,3,5,1,9};
        int mayor = numeros[0];
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
    }
}
