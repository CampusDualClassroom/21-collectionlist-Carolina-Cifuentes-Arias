package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise {

    public static List<String> createArrayList() {
        List<String> arrayList = new ArrayList<>();

        arrayList.add(new String("GKFFD"));
        arrayList.add(new String("TNANA"));
        arrayList.add(new String("MPMSL"));
        arrayList.add(new String("PSWME"));
        arrayList.add(new String("LZMLF"));
        arrayList.add(new String("JYEBV"));
        arrayList.add(new String("YELNT"));
        arrayList.add(new String("JSNKR"));
        arrayList.add(new String("JFESF"));
        arrayList.add(new String("TMJLL"));

        return arrayList;

    }

    public static void printElementsAndIndex(List<String> customList) {
       for (int i = 0; i < customList.size(); i++){
           System.out.println("Índice " + i + " : " +customList.get(i));
       }


    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {
        List<String> list = createArrayList();
        boolean newElement = addElementToList(list, "AAAA");
        System.out.println("Elemento añadido: " + newElement);
        printElementsAndIndex(list);


    }


}
