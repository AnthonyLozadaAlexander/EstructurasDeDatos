import javax.swing.*;

public class BuSecuencial_Example_1 {
    public static void main(String[] args) {
        int arreglo[] = {4, 1, 5, 2, 3};
        //              [0][1][2][3][4]
        int dato;
        int indice = -1;
        boolean flag = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
        int i = 0;
        while(i < arreglo.length && flag == false)
        {
            if(arreglo[i] == dato)
            {
                flag = true;
                indice = i;
            }
            i++;
        }

        if(flag == false){
            JOptionPane.showMessageDialog(null, "El numero no se encuentra en el arreglo");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero: " + dato + " se encuentra en la posicion["+indice+"]");
        }
    }
}
