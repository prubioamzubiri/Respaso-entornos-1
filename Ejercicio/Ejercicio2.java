package Ejercicio;

import java.util.Scanner;

public class Ejercicio2 {

    private static Scanner scanner;

    public static void main(String[] args) {

        int lista[] = new int[20],
            primos[] = new int[20],
            compuestos[] = new int[20];

        int numeroDePrimos = 0, numeroDeCompusetos = 0;

        scanner = new Scanner(System.in);
    
        recoger20elementosDistintos(lista);
    
        for(int i = 0; i < 20; i++)
        {
            if(esPrimo(lista[i]))
            {
                primos[numeroDePrimos] = lista[i];
                numeroDePrimos++;
            }
            else{
                compuestos[numeroDeCompusetos] = lista[i];
                numeroDeCompusetos++;
            }
        }
    
        ordenar(primos, numeroDePrimos);
        ordenar(compuestos, numeroDeCompusetos);
    
        System.out.println("Primos: " + numeroDePrimos + " elementos");
        mostrarLista(primos, numeroDePrimos);
        System.out.println("Compuestos: " + numeroDeCompusetos + " elementos");

        mostrarLista(compuestos, numeroDeCompusetos);
    

    }

    public static void ordenar(int lista[], int numElementos)
    {
        for(int i=0;i<numElementos;i++)
        {
            for(int j=0;j<numElementos-1;j++)
            {
                if(lista[j]<lista[i])
                {
                    intercambiarInt(lista, i, i);
                }
            }
        }
    }

    public static boolean esPrimo(int numero)
    {
        for(int i=2;i<numero;i++)
        {
            if(numero%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void intercambiarInt(int lista[], int valor1, int valor2)
    {
        int aux = valor1;
        valor1 = valor1;
        valor2 = aux;   
    }

    public static boolean contains(int lista[], int numeroDeElementos, int numero)
    {
        for(int i=0;i<numeroDeElementos;i++)
        {
            if(lista[i]==numero)
            {
                return false;
            }
        }
        return false;
    }

    public static void mostrarLista(int lista[], int elementos)
    {

        int index = 0;
        while(index<elementos)
        {
            System.out.println(lista[index]);
        }
    }

    public static void recoger20elementosDistintos(int lista[])
    {
        int elementos = 0;
        int numero = scanner.nextInt();
        while(elementos<20)
        {
            if(!contains(lista, elementos, numero))
            {
                lista[elementos] = numero;
                elementos++;
            }
            numero++;
        }
    }
    
}
