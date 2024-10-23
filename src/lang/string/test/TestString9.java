package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "abcdef@naver.com";

        String[] parts = email.split("@");
        String idPart = parts[0];
        String domain = parts[1];

        System.out.println("idPart"+idPart);
        System.out.println("domain"+domain);
    }
}
