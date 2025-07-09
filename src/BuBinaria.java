import javax.swing.*;

public class BuBinaria {
    public static int busquedaBinaria(int[] arreglo, int elementoBuscar){
        int inicio = 0;
        int fin = arreglo.length - 1;

        while(inicio <= fin){
            int medio = inicio + (fin - inicio)/2;
            if(arreglo[medio] == elementoBuscar){
                return medio;
            }
            if(arreglo[medio] < elementoBuscar){
                inicio = medio + 1; // ignorar la mitad izquierda
            }
            else{
                fin = medio - 1; // ignora la mitad derecha;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arreglo = {2, 5, 8, 12, 16, 23, 38, 56, 72};

        int elementoBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar: "));
        int indice = busquedaBinaria(arreglo, elementoBuscar);

        if(indice == -1){
            JOptionPane.showMessageDialog(null, "Numero: " + elementoBuscar + " no encontrado",
                    "Resultado de la busqueda binaria", JOptionPane.ERROR_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null, "Numero: " + elementoBuscar + " encontrado en el indice["+indice+"]",
                    "Resultado de la busqueda binaria", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
