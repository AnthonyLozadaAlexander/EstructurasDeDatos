import javax.swing.*;

public class BuSecuencial {
    public static void main(String[] args) {
        int arreglo[] = {4, 1, 5, 2, 3};
        int dato;
        boolean encontrado = false;
        int posicion = -1;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a buscar: "));

        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == dato){
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null, "El num: " + dato + " se encuentra en la posicion["+posicion+"]");
        } else {
            JOptionPane.showMessageDialog(null, "El num: " + dato + " no se encuentra en el arreglo");
        }
    }
}
