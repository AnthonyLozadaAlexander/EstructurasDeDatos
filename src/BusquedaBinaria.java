public class BusquedaBinaria {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int indice = BusquedaBinaria(a, 2);

        if(indice == -1){
            System.out.println("Error: El elemento no se encuentra en el arreglo");
        }
        else{
            System.out.println("El elemento se encuentra en el indice: " + indice);
        }
    }

    public static int BusquedaBinaria(int [] arreglo, int dato){
        int inicio = 0, fin=0, mitad=0;
        fin = arreglo.length - 1;

        while(inicio <= fin){
            mitad = (inicio + fin) / 2; // Calcular el punto medio
            if(arreglo[mitad] == dato){
                return mitad;
            }
            else if(arreglo[mitad] < dato){
                inicio = mitad + 1; // hacia la derecha
            }
            else{
                fin = mitad - 1;
            }
        }

        // Si no se encuentra el elemento, retornar -1
        return -1;
    }
}
