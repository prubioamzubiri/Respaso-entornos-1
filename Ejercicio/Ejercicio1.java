package Ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList<Integer>();

        int entrada;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");

        //Mientras que la entrada sea mayor que 0, se añade a la lista si es par
        while((entrada = sc.nextInt()) > 0)
        {
            if(entrada%2==0)
            {
                lista.add(entrada);
            }
            System.out.println("Introduce otro número");
        }

        boolean repeat = true;
        while(repeat){
            boolean areChanges = false;
            for(int i = 0; i < lista.size() - 1; i++){
                int primero = lista.get(i);
                int segundo = lista.get(i + 1);
                if(segundo > primero){
                    lista.set(i, segundo);
                    lista.set(i + 1, primero);
                    areChanges = true;
                }
            }
            repeat = areChanges == true ? true : false;
        }

        for(int i = 0; i < lista.size(); i++)
        {
            System.out.print(i == lista.size() - 1 ? lista.get(i) : lista.get(i) + ", ");
        }
        System.out.println();

    }
}