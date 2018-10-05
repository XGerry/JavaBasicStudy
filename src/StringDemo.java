/**
 * String,StringBuffer,StringBuilder
 */

public class StringDemo {
    public static void main(String[] args) {
        char[] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
        String str = new String(helloArray);
        System.out.println(str);

        str = "Hello World!";
        System.out.println(str.length());

        String str1 = "test";
        String str2 = "Test";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.toUpperCase().concat(str2));

        StringBuffer stringBuffer = new StringBuffer("Test1");
        int capacity = stringBuffer.capacity();
        System.out.println(capacity);
        stringBuffer.append("Hello");
        stringBuffer.append("world");
        stringBuffer.delete(1, 2);
        capacity = stringBuffer.capacity();
        System.out.println(capacity);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        StringBuilder sb = new StringBuilder("Test1");
        int size = sb.capacity();
        System.out.println(size);

        //System.exit(0);

        String aa = new String("ab");
        String bb = new String("ab");
        String aaa = "ab";
        String bbb = "ab";
        System.out.println(aa.hashCode()+"/"+bb.hashCode()+"/"+aaa.hashCode()+"/"+bbb.hashCode());
        if (aa == bb)
            System.out.println("aa==bb");
        if (aaa == bbb)
            System.out.println("aaa==bbb");
        if (aa.equals(bb))
            System.out.println("aa equals bb");
        if (aaa.equals(bbb))
            System.out.println("aaa equals bbb");


    }
}

