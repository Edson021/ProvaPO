package pizzariadeliver;

/**
@author Edson
*/

public class SizePizza {
   
    int QuantidadeSabores;
    double PrecoTamanho;
    double PrecoComBorda;
    String Tamanho;
    int validador = 0;
    EdgeFlavor EdgeFlavor = new EdgeFlavor();

    public int selectSize(int op) {

        switch (op) {
            case 1:
                QuantidadeSabores = 5;
                Tamanho = "Gigante";
                PrecoTamanho = 75;
                PrecoComBorda = 80;
                break;

            case 2:
                QuantidadeSabores = 4;
                Tamanho = "Familia";
                PrecoTamanho = 66;
                PrecoComBorda = 69.5;
                break;

            case 3:
                QuantidadeSabores = 3;
                Tamanho = "Media";
                PrecoTamanho = 52;
                PrecoComBorda = 56.5;
                break;

            case 4:
                QuantidadeSabores = 3;
                Tamanho = "Pequena";
                PrecoTamanho = 42;
                PrecoComBorda = 44.5;
                break;

            case 5:
                QuantidadeSabores = 2;
                Tamanho = "Broto";
                PrecoTamanho = 28;
                validador = 1;
                break;
        }
        return QuantidadeSabores;
    }
}
