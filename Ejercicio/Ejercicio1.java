package Ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<Integer>();

        int entrada;

        Scanner sc = new Scanner(System.in);

        //Mientras que la entrada sea mayor que 0, se añade a la lista si es par
        while((entrada = sc.nextInt()) > 0)
        {
            if(entrada % 2 == 0)
            {
                lista.add(entrada);
            }
        }

        ordenar(lista);

        imprimir(lista);

    }

    public static void ordenar(List<Integer> lista)
    {
        for(int i=0;i<lista.size();i++)
        {
            for(int j=0;j<lista.size()-1;j++)
            {
                if(lista.get(j)<lista.get(i))
                {
                    intercambiar(lista, i, i);
                }
            }
        }
    }

    public static void intercambiar(List lista, int a, int b)
    {
        int aux = (int) lista.get(a);
        lista.set(a, lista.get(a));
        lista.set(b, aux);
    }

    public static void imprimir(List lista)
    {
        int i = 0;

        while(i<lista.size())
        {
            System.out.println(lista.get(i));
        }
    }
}