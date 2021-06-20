package pizzariadeliver;

import java.util.ArrayList;
import java.util.Scanner;

/**
@author Edson
*/

public class Drink {

    int op;
    String drink = "";
    double valorDrinks;
    int validador = 1;
    ArrayList<String> ListaBebidas = new ArrayList();

    public int validarDrinks(int op) {

        switch (op) {
            case 1:
                selectDrink();
                break;
            case 2:
                validador = validador - 1;
                break;

        }
        return 0;
    }

    public ArrayList selectDrink() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("SELECIONE UMA BEBIDA");
        System.out.println("[1] - Coca Cola 2 LT");
        System.out.println("[2] - Cerveja Heineken 330 ML ");
        System.out.println("[3] - Suco Pratz 900 ML");
        System.out.println("[4] - Agua Mineral 600 ML");
        System.out.println("Insira aqui uma bebida: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                ListaBebidas.add("Coca Cola 2 LT");
                valorDrinks = valorDrinks + 9.5;
                break;

            case 2:
                ListaBebidas.add("Cerveja Heineken 330 ML");
                valorDrinks = valorDrinks + 6.5;
                break;

            case 3:
                ListaBebidas.add("Suco Pratz 900 ML");
                valorDrinks = valorDrinks + 12.5;
                break;

            case 4:
                ListaBebidas.add("Agua Mineral 600 ML");
                valorDrinks = valorDrinks + 3.5;
                break;
        }

        return ListaBebidas;

    }
    
}
