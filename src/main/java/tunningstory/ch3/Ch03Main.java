package tunningstory.ch3;

public class Ch03Main {
    static final String A_VAL = "abcde";
    public static void main(String[] args) {
        String result = useString();
        System.out.println("result = " + result);
        StringBuffer result1 = useStringBuffer();
        StringBuilder result2 = useStringBuilder();

        Ch03Main test = new Ch03Main();
        test.check(result1);
        test.check(result2);
    }

    public void check(CharSequence cs) {
        StringBuffer sbr = new StringBuffer(cs);
        System.out.println("sbr = " + sbr.toString());
    }
    /**
     * 매 연산마다 새로운 String 객체 생성한다.
     * @return
     */
    public static String useString() {
        String a = new String();
        for (int i = 0; i < 100; i++) {
            a += A_VAL;
        }
        return a;
    }
    /**
     * 매 연산마다 새로운 객체를 생성하지 않고
     * 할당된 메모리의 크기를 확장하는 방식이다.
     * @return
     */
    public static StringBuilder useStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(A_VAL);
        }
        return sb;
    }

    /**
     * StringBuilder + Thread Safe 하다.
     * @return
     */
    public static StringBuffer useStringBuffer() {
        StringBuffer sbr = new StringBuffer();

        for (int i = 0; i < 100; i++) {
            sbr.append(A_VAL);
        }
        return sbr;
    }
}
