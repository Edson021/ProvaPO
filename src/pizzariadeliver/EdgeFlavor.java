package pizzariadeliver;

import java.util.Scanner;

/**
@author Edson
*/

public class EdgeFlavor {

    int op;
    String border = "";
    double PrecoBorda;
    int validador = 0;
    Order order = new Order();

    public int validarBorda(int op) {
        switch (op) {
            case 1:
                selectBorder();
                validador = 1;
                break;
            case 2:

                break;
        }
        return 0;
    }

    public String selectBorder() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("SELECIONE UM SABOR DE BORDA");
        System.out.println("[1] - Cheddar");
        System.out.println("[2] - Catupiry ");
        System.out.println("[3] - meia Nutella meia Doce de Leite");
        System.out.println("[4] - Nutella");
        System.out.println("Insira aqui a borda da pizza: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                border = "Cheddar";
                break;

            case 2:
                border = "Catupiry";
                break;

            case 3:
                border = "meia Nutella meia Doce de Leite";
                PrecoBorda += 3;
                break;

            case 4:
                border = "Nutella";
                PrecoBorda += 2;
                break;
        }
        return border;
    }
}
