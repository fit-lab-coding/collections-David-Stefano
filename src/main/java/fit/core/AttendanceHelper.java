package fit.core;

import java.util.HashMap;
import java.util.Map;

public class AttendanceHelper {
    public static Map<String, Boolean> random (int qtde, int pct){

        var result = (qtde * pct) / 100;

        Map<String, Boolean> lista= new HashMap<>();

        for(int i =0; i < qtde; i++){
            lista.put("user" + i, (i<result));
        }
        return lista;
    }
}