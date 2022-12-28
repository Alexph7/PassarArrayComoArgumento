package passararrayemmetodo;

/**
 *
 * @author ph757
 */
public class PassarArrayComoArgumentoEmMetodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.printf("Efeito de passar referência para todo o array%n" + "Os valores originais do Array são:%n");

        //Gera saida de elementos do array original
        for (int i : array) {
            System.out.printf("      %d", i);
        }

        modificarArray(array);
        System.out.printf("%n%n Os Valores Modificados do Array São: %n");

        //Gera saida de elementos do array Modificados
        for (int i : array) {
            System.out.printf("      %d", i);
        }
        System.out.printf("%n%nArray[3] Antes de Passar Pelo Metodo modificarElement: %d%n%n", array[3]);

        modificarElemento(array[3]); // tenta modificar o array[3]
        System.out.printf(
              "%nArray[3] Depois de Passar pelo Método modificarElemento: %d%n%n", array[3]);

    }

    // multiplica cada elemento de um array por 2
    public static void modificarArray(int[] array2) {

        for (int i = 0; i < array2.length; i++) {
            array2[i] *= 2;
        }
    }

    // multiplica argumento por 2
    public static void modificarElemento(int element) {
        element *= 2;

        System.out.printf("Valor do Elemento dentro do Metodo ModificarElemento: %d%n", element);
    }

}
