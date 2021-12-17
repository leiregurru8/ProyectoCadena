package utils;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T extends Comparable<T>> {
    public List<T> mergeSort(List<T> lista) {
        //Obtener el tamaño de la lista
        int n = lista.size();
        if(n < 2) { //CASO BASE
            //Si la lista contiene menos de dos elementos, llegamos al caso base (no hay más que ordenar)
            return lista;
        } else { //CASO RECURSIVO
            //Buscamos el índice que marca la mitad de la lista para dividirlos
            int mid = n / 2;
            //Dividimos la lista en dos
            List<T> listaIzqda = lista.subList(0, mid);
            List<T> listaDrcha = lista.subList(mid, n);
            //Llamadas recursivas sobre las dos mitades de la lista
            listaIzqda = mergeSort(listaIzqda);
            listaDrcha = mergeSort(listaDrcha);
            //Juntar las dos mitades
            List<T> listaOrdenada = new ArrayList<T>();
            int i = 0;
            int d = 0;
            //Mientres queden elementos en las dos mitades, compararlos
            while((i < listaIzqda.size()) && (d < listaDrcha.size())) {
                T elementoIzqda = listaIzqda.get(i);
                T elementoDrcha = listaDrcha.get(d);
                if (elementoIzqda.compareTo(elementoDrcha) < 0) {
                    listaOrdenada.add(elementoIzqda);
                    i++;
                } else {
                    listaOrdenada.add(elementoDrcha);
                    d++;
                }
            }
            //Cuando una de las dos mitades (lista) ya haya sido comparado y pasado a la lista ordenada,
            //llevar los elementos restantes de la otra mitad (lista) a la lista ordenada
            while(i < listaIzqda.size()) {
                T elementoIzqda = listaIzqda.get(i);
                listaOrdenada.add(elementoIzqda);
                i++;
            }
            while(d < listaDrcha.size()) {
                T elementoDrcha = listaDrcha.get(d);
                listaOrdenada.add(elementoDrcha);
                d++;
            }
            return listaOrdenada;
        }
    }
}