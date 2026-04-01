package semana02;

public class RegistroNotas {
    public static void main(String[] args) {
        double[] notas = {15.5, 11.0, 18.2, 09.5, 14.0};
        int n = notas.length;

        // Algoritmo de Inserción
        for (int i = 1; i < n; i++) {
            double clave = notas[i];
            int j = i - 1;

            while (j >= 0 && notas[j] > clave) {
                notas[j + 1] = notas[j];
                j = j - 1;
            }
            notas[j + 1] = clave;
        }

        System.out.print("Notas ordenadas ascendentemente: ");
        for (double nota : notas) {
            System.out.print(nota + " | ");
        }
    }
}
