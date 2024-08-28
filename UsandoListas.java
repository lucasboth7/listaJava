import java.util.Scanner;
import java.util.ArrayList;
public class UsandoListas {
    public static void main(String[] main ) {
        Scanner leitor = new Scanner(System.in);
        
        ArrayList< String > minhaLista = new ArrayList();
        
        int numElementos = minhaLista.size();
        System.out.println("Número de elementos: " +numElementos );
        
        boolean estaVazia = minhaLista.isEmpty();
        System.out.println("Esta vazia? " + estaVazia );
        
        
    }
}
