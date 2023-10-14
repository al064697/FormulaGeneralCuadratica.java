import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        char ENTER = '\n';
        //Declarando variables
        int A = 0, B = 0, C = 0;
        try {
            A = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese un valor para A : "));
            B = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese un valor para B : "));
            C = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese un valor para C : "));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Error: valores no aceptados");
            main(args);
            System.exit(0);
        }

        if ((A == 0) &&(B == 0)) {
            JOptionPane.showMessageDialog(null,
                "La ecuacion es denegada");
            System.exit(0);
        }
        else if ((A == 0) && (B != 0)) {
            JOptionPane.showMessageDialog(null,
                "Existe una raiz cuadrada unica con valor de " + C / B);
            System.exit(0);
        }
        else {
            //sacando discriminante
            int discriminante = (int)(Math.pow(B, 2)) - (4 * A * C);

            //Sacando raíces cuadradas
            if (discriminante >= 0) {
                int x1 = (int) ((-(B) + (Math.sqrt(discriminante))) / (2 * A));
                int x2 = (int) ((-(B) - (Math.sqrt(discriminante))) / (2 * A));
                JOptionPane.showMessageDialog(null,
                        "Existen dos raíces cuadradas" + ENTER +
                        "x1 = " + x1 + ENTER + "x2 = " + x2);
                System.exit(0);
            } else if (discriminante == 0) {
                int x1 = (int) ((-B + Math.sqrt(discriminante)) / (2 * A));
                int x2 = (int) ((-B - Math.sqrt(discriminante)) / (2 * A));
                JOptionPane.showMessageDialog(null,
                        "Existen una raiz cuadrada real" + ENTER +
                        "x1 = " + x1 + ENTER + "x2 = " + x2);
                System.exit(0);
            }

            else if(discriminante < 0 ) {
                String x1 = Integer.toString((-B / (2 * A))) + " + " + Integer.toString((int)(Math.sqrt(Math.abs(discriminante))) / (2 * A)) + "i";
                String x2 = Integer.toString((-B / (2 * A))) + " - " + Integer.toString((int)(Math.sqrt(Math.abs(discriminante))) / (2 * A)) + "i";
                JOptionPane.showMessageDialog(null,
                        "Existen dos raices cuadradas compuestas" + ENTER +
                        "x1 = " + x1 + ENTER + "x2 = " + x2);
                System.exit(0);
            }
        }
    }
}