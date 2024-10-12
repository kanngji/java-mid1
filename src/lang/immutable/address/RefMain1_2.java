package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        // 처음부터 다른 인스턴스를 참조하라고 하면된다.
        Address a = new Address("서울");
        Address b = new Address("서울");
        // Address b = a;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        b.setValue("부산"); // b이 값을 부산으로 변경해야하
        System.out.println("a = "+ a);
        System.out.println("부산 -> b"+b);
    }
}
