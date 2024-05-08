import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {
    public static int contadorImpares(List<Integer> miLista){
        int e = 0; 
        for (int i = 0; i < miLista.size(); i++){
            if (miLista.get(i) % 2 != 0){
                e++;
            }
        }
        return e;
    }

    public static List<Integer> numerosConsecutivos(List<Integer> miLista){
        List<Integer> nuevaLista = new ArrayList<>();
        for (int i = 0; i < miLista.size(); i++){
            Integer e = miLista.get(i);
            if (i > 0 && miLista.get(i - 1) == e - 1){
                nuevaLista.addLast(e);
            }else if (miLista.get(i + 1) == e + 1){
                nuevaLista.addLast(e);
            }
        }
        return nuevaLista;
    }

}