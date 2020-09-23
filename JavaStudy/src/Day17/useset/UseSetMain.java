package Day17.useset;

import java.util.HashSet;
import java.util.Set;

public class UseSetMain {
    public static void printSet(Set set){
        Object[] elements = set.toArray();
        int size = ((Object[]) elements).length;
        System.out.println("集合大小为:"+size+".其中的元素为:");
        for (int i = 0; i < size; i++){
            System.out.println(elements[i] + ",");
        }
        System.out.println("\n====集合结束====\n");
    }

    public static void main(String[] args) {
        String str1 = "aaaa";
        String str2 = "bbbb";
        String str3 = "aaaa";
        Set set = new HashSet();
        set.add(str1);
        set.add(str2);
        printSet(set);
        boolean addResult = set.add(str3);
        System.out.println("向集合中添加str3结果如下:"+addResult);
        printSet(set);
    }
}
