package Threeuple;

public class Threeuple <T,E,K>{
    private T item1;
    private E item2;
    private K item3;

    public Threeuple(T item1, E item2, K item3) {
        setItem1(item1);
        setItem2(item2);
        setItem3(item3);
    }

    private void setItem1(T item1) {
        this.item1 = item1;
    }

    private void setItem2(E item2) {
        this.item2 = item2;
    }

    private void setItem3(K item3) {
        this.item3 = item3;
    }

    public T getItem1() {
        return item1;
    }

    public E getItem2() {
        return item2;
    }

    public K getItem3() {
        return item3;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s",this.item1.toString(),this.item2.toString(),this.item3.toString());
    }
}
