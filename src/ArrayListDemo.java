import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Haha");
        //第一种遍历方法使用foreach遍历List
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String str :
                list) {
            System.out.println(str);
        }
        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        for (String str :
                strArray) {
            System.out.println(str);
        }
        //第三种遍历 使用迭代器进行相关遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<String> list1=new LinkedList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        System.out.println(list1.get(1));
    }
}
