import javax.swing.*;

public class BuSecuencial {
    public static void main(String[] args) {
        int arreglo[] = {4, 1, 5, 2, 3};
        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a buscar: "));
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == dato){
                JOptionPane.showMessageDialog(null, "El num: " + dato + " se encuentra en la posicion["+i+"]");
                break;
            }
            else{
                if(i == arreglo.length - 1){
                    JOptionPane.showMessageDialog(null, "El num: " + dato + " no se encuentra en el arreglo");
                    break;
                }
            }
        }


    }
}
