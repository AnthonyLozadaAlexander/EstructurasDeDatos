package Arreglos;

public class InvertirArreglos {
    public static void main(String[] args) {
        int punteroI=0;
        int[] arr = {3, 5, 7, 9, 11};
        System.out.println("Arreglo Original: ");
        mostrarArreglo(arr);
        invertirArreglos(arr, punteroI);
        System.out.println("Arreglo Invertido: ");
        mostrarArreglo(arr);

    }

    public static int[] invertirArreglos(int[] arr, int i){
        int j = arr.length - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }

    public static void mostrarArreglo(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i == 0) System.out.print("[");
            System.out.print(arr[i] + ", ");
            if(i == arr.length - 1) System.out.println("]");
        }
    }
}
