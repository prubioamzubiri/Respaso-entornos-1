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
            if(entrada%2==0)
            {
                lista.add(entrada);
            }
        }

        for(int i=0;i<lista.size();i++)
        {
            for(int j=0;j<lista.size()-1;j++)
            {
                if(lista.get(j)>lista.get(i))
                {
                    int aux = lista.get(j);
                    lista.set(j, lista.get(j));
                    lista.set(j+1, aux);
                }
            }
        }

        for(int i=0;i<lista.size();i++)
        {
            System.out.println(lista.get(i));
        }

    }
}