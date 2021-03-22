package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.LinkedList;
import uaslp.ingenieria.labs.list.Position;

public class Main {

    // Inner classes
    // Outer classes

    public static void main(String[] args) {

        int cuenta =  LinkedList.getListsCount();
        // Wrapper classes -> Integer, Float, Character, Boolean
        //Las wrapper classes son "Inmutables"

        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<String> lista2 = new LinkedList<>();
        LinkedList<Double> lista3 = new LinkedList<>();
        String colors[] = {"negro", "amarillo",
                "verde", "azul", "violeta", "plateado"};
        double numbers[] = {2.678, 5.79, 9.81, 4.3, 4.56, 5.45};

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);

        for (String color : colors)
            lista2.add(color);

        for (double number : numbers)
            lista3.add(number);

        LinkedList<Integer>.Iterator<Integer> it = lista1.getIterator();
        //lista1.getIterator<Integer>()
        //Iterator backupIt = new Iterator(it);

        while(it.hasNext()){
            LinkedList<Integer>.Iterator<Integer> backupIt = lista1.new Iterator<Integer>(it);
            int element = it.next(); //regresar el dato y avanzar el iterador

            if(element == 3){
                lista1.insert(10, Position.BEFORE, backupIt);
            }

            if(element == 7){
                lista1.insert(15, Position.AFTER, backupIt);
            }
        }

        lista1.delete(3);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

        it = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        LinkedList<Integer>.ReverseIterator<Integer> reverseIterator = lista1.getReverseIterator();

        while(reverseIterator.hasNext()){
            int element = reverseIterator.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");
        System.out.println("El tamaño es:" + lista2.getSize());
        LinkedList<String>.Iterator<Integer> itStrings = lista2.getIterator();

        while(itStrings.hasNext()) {
            String element = itStrings.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        LinkedList<String>.ReverseIterator<Integer> reverseitStrings = lista2.getReverseIterator();

        while(reverseitStrings.hasNext()){
            String element = reverseitStrings.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");
        System.out.println("El tamaño es:" + lista3.getSize());
        LinkedList<Double>.Iterator<Integer> itNumbers = lista3.getIterator();

        while(itNumbers.hasNext()) {
            Double element = itNumbers.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        LinkedList<Double>.ReverseIterator<Integer> reverseitNumbers = lista3.getReverseIterator();

        while(reverseitNumbers.hasNext()){
            Double element = reverseitNumbers.next();

            System.out.println("Dato: " + element);
        }
    }
}
