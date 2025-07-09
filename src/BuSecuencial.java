import javax.swing.*;

public class BuSecuencial {
    public static void main(String[] args) {
        int arreglo[] = {4, 1, 5, 2, 3};
        int num;
        boolean encontrado = false;
        int posicion = -1;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a buscar: "));

        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == num){
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null, "El num: " + num + " se encuentra en la posicion["+posicion+"]");
        } else {
            JOptionPane.showMessageDialog(null, "El num: " + num + " no se encuentra en el arreglo");
        }
    }
}
