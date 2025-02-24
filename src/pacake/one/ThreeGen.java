package pacake.one;

public class ThreeGen<T,V,K> {

    private T ob1;
    private V ob2;
    private K ob3;

    public ThreeGen(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public K getOb3() {
        return ob3;
    }

    public void showTypes(){
        System.out.println("ob1: " + ob1.getClass());
        System.out.println("ob2: " + ob2.getClass());
        System.out.println("ob3: " + ob3.getClass());
    }
}
