package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        //obj1.add(20); // x002 return 값을 버리는 것 (꼭 반환값을 받아야한다)
        ImmutableObj a = obj1.add(20);

        System.out.println(obj1.getValue());
        // System.out.println(obj2.getValue());
        System.out.println(a.getValue());
    }
}
