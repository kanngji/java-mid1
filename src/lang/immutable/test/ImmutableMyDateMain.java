package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,10,13);
        //MyDate date2 = new MyDate(2024,10,13);
        ImmutableMyDate date2 = date1;
        System.out.println(date1);
        System.out.println(date2);

        System.out.println("2025 -> date1");
        //date1.setYear(2025);
        date1 = date1.withYear(2025); // 불변객체에서 무조건 반환값 받아야한다.
        System.out.println("date1: "+date1);
        System.out.println("date2: "+date2);
    }
}
