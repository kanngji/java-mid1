package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        sb.append("E");
        System.out.println(sb);

        sb.insert(4,"java");
        System.out.println(sb);

        sb.delete(4,7);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("String = "+ string);
    }
}
