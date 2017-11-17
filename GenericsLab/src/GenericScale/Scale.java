package GenericScale;

import java.util.Comparator;

public class Scale<T extends Comparable<T>> {
    private T leftElem;
    private T rightElem;

    public Scale(T leftElem, T rightElem) {
        this.leftElem = leftElem;
        this.rightElem = rightElem;
    }

    public T getHeavier(){
      if((this.leftElem).compareTo(this.rightElem)>0){
          return this.leftElem;
      }
      else if((this.leftElem).compareTo(this.rightElem)<0){
          return this.rightElem;
      }
      else{
          return null;
      }
    }
}
