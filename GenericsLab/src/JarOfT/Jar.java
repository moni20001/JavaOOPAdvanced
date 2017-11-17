package JarOfT;

import java.util.*;

public class Jar<T> {
    private Stack<T> stack;
    public Jar() {
        this.stack =  new Stack<>();
    }
    public void add(T e){
        this.stack.add(e);
    }
    public T remove(){
      return this.stack.remove(0);
    }
}