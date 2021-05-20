package Ficha2;

public class DemoArray {

      public static <T extends Comparable<? super T>> boolean searchPessoa(T[] pessoas, T target){

          boolean found = false;

          if (pessoas[2].compareTo(target)==0) {
              found = true;
          }

          return found;

      }


}
