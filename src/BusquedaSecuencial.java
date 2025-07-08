public class BusquedaSecuencial {

    public static int busquedaSecuencial(int[] arreglo, int dato) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == dato) {
                return i;
            }
        }
        return -1; // Si no se encuentra el elemento, retornar -1
    }

    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int indice = busquedaSecuencial(b, 6);

        if (indice == -1) {
            System.out.println("Error: El elemento no se encuentra en el arreglo");
        } else {
            System.out.println("El elemento se encuentra en el indice: " + indice);
        }

    }
}
