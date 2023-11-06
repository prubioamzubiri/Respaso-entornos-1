package Ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<Integer>();

        int entrada;

        Scanner sc = new Scanner(System.in);

        // Mientras que la entrada sea mayor que 0, se añade a la lista si es par
        while((entrada = sc.nextInt()) > 0)
        {
            if(entrada % 2 == 0)
            {
                lista.add(entrada);
            }
        }

        // Ordenar la lista de enteros de forma ascendente
        lista.sort(null);

        for(int i = 0; i < lista.size(); i++)
        {
            System.out.println(lista.get(i));
        }

    }
}