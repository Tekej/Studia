import java.util.ArrayList;
import java.util.Scanner;

public class LinkedSum {
    interface NumList {
        NumListNode getFirst();
        NumListNode getLast();
        int getSize();
        void add(int value); //metoda powinna dodać nowy element na końcu listy
    }
    interface NumListNode {
        int getValue();
        NumListNode getNext();
        NumListNode getPrevious();
        void setNext(NumListNode next);
        void setPrevious(NumListNode previous);
    }
    static class LinkedNumList implements NumList {
        LinkedNumListNode lk;
        public LinkedNumList(String s){
            lk = new LinkedNumListNode();
            String[] arr = s.split("<->");
            for (int i = 0; i < arr.length-1; i++) {
                add(Integer.parseInt(arr[i]));
            }
        }
        @Override
        public NumListNode getFirst() {
            return null;
        }

        @Override
        public NumListNode getLast() {
            return null;
        }

        @Override
        public int getSize() {
            return lk.numl.size();
        }

        @Override
        public void add(int value) {
            lk.numl.add(value);
        }
        //TODO: tutaj należy zaimplementować wszystkie metody interfejsu
    }
    static class LinkedNumListNode implements NumListNode {
        ArrayList<Integer> numl;
        public LinkedNumListNode(){
            numl = new ArrayList<>();
        }
        @Override
        public int getValue() {
            return 0;
        }

        @Override
        public NumListNode getNext() {
            return null;
        }

        @Override
        public NumListNode getPrevious() {
            return null;
        }
        @Override
        public void setNext(NumListNode next) {
        }
        @Override
        public void setPrevious(NumListNode previous) {
        }
        //TODO: tutaj należy zaimplementować wszystkie metody interfejsu
    }
    public static NumList sum(NumList a, NumList b) {
        return null;
    }
    // można zdekomponować swoje rozwiązanie na dodatkowe metody prywatne, ale nie
    //jest to wymagane
}
