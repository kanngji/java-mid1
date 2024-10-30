package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간을 (밀리초)
        long currentTimeMills = System.currentTimeMillis();
        System.out.println(currentTimeMills);

        // 현재 시간을 (나노초)
        long currentNano = System.nanoTime();
        System.out.println(currentNano);

        // 환경 변수를 읽는다.
        System.out.println(System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties = "+ System.getProperties());
        System.out.println("java version "+ System.getProperty("java.version"));

        // 배열을 고속으로 복사한다
         char[] originalArray = {'h','e','l','l','o'};
         char[] copiedArray = new char[5];
         System.arraycopy(originalArray,0,copiedArray,0,originalArray.length);

         // 배열 출력
        System.out.println("copedArray = " + copiedArray);
        System.out.println("copedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
    }
}
