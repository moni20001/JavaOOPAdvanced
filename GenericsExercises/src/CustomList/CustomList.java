package CustomList;

import java.util.*;
import java.util.stream.Collectors;

public class CustomList <T extends Comparable>  {
    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    void add(T element){
        this.list.add(element);
    }

   public T remove(int index){
        return list.remove(index);
    }

   public boolean contains(T element){
        return this.list.contains(element);
    }

    public void swap(int index1, int index2){
        T elem1 = this.list.get(index1);
        T elem2 = this.list.get(index2);
        list.set(index1,elem2);
        list.set(index2,elem1);
    }

   public int countGreaterThan(T element){
        int count = 0;
       for (T e: this.list) {
           if(e.compareTo(element)>0){
               count++;
           }
       }

        return count;
    }

   public T getMax(){
       T maxElem = list.get(0);
       for (T e: this.list) {
           if(e.compareTo(maxElem)>0){
               maxElem = e;
           }

       }
       return maxElem;
   }

   public T getMin(){
       T minElem = list.get(0);
       for (T e: this.list) {
           if(e.compareTo(minElem)<0){
               minElem = e;
           }

       }
       return minElem;
   }

   public void printList(){
       Iterator<T> iterator = this.list.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
      // for (T elem:this.list) {
      //     System.out.println(elem.toString());
      // }
   }

   public void sort(){
      this.list =  this.list.stream().sorted((x,y) -> x.compareTo(y)).collect(Collectors.toList());
   }
}
