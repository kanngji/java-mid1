package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정 , valueOf() 사용
        Integer integerObj = Integer.valueOf(10);

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.4);
        System.out.println("newInteger = "+ newInteger);
        System.out.println("newInteger = "+ integerObj);

        System.out.println(longObj);
        System.out.println(doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println(intValue);
        long longValue = longObj.longValue();
        System.out.println(longValue);

        System.out.println("비교");
        System.out.println("==" + (newInteger == integerObj));
        System.out.println("equals: "+ (newInteger.equals(integerObj)));
    }
}
