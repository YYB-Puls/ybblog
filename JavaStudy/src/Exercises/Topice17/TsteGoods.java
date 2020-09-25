package Exercises.Topice17;

import java.util.*;


public class TsteGoods {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        /**
         * 字符串与字节数组的转换:将一个字符串转换为一个字节数组,然后在使用这个字节数组生成一个字符串
         * 最后将生成出的字符串输出到控制台
         */
        Scanner input = new Scanner(System.in);

        String string = "请输入字符串";
        char[] c = string.toCharArray();
        for (int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }
        char[] chars = {'请','输','入','字','符'};
        String string1 = new String(chars);
        String string2 = string1.valueOf(chars);
        System.out.println(string1);
        System.out.println(string2);
    }

    private static void test3() {
        /**
         * 编写一个程序,创建两个Goods对象,它们的id属性值分别为GOODS_NO_00001,和GOODS_NO_00002
         * 使用id属性的值作为键值,将两个对象添加到一个Map对象中然后尝试通过键值GOODS_NO_00001来查找对应的对象
         */

        Goods goods1 = new Goods("苹果手机", "GOODS_NO_00001");
        Goods goods2 = new Goods("红米手机", "GOODS_NO_00002");
        Map goodsMap = new HashMap();
        goodsMap.put(goods1.getId(), goods1);
        goodsMap.put(goods2.getId(), goods2);
        Goods goods = (Goods) goodsMap.get("GOODS_NO_00001");
        goods.printList(goods);
    }

    private static void test1() {
        /**
         * 编写一个程序,创建两个Goods对象,让它们的id属性的值都为GOODS_NO_00001,
         * 然后将两个Goods对象添加到一个list对象中,最后输出list中所有元素
         */

        Goods goods1 = new Goods("红米手机", "GOODS_NO_00001");
        Goods goods2 = new Goods("苹果手机", "GOODS_NO_00001");
        List list = new ArrayList();
        list.add(goods1);
        list.add(1,goods2);
        Goods goodsFromList = (Goods) list.get(0);
        Goods goodsFromList1 = (Goods) list.get(1);
        goods1.printList(goodsFromList);
        goods2.printList(goodsFromList1);
    }

    private static void test2() {
        /**
         * 习题3
         * 集合中的元素不允许重复:编写一个程序,创建两个Goods对象,让它们的id属性的值都为
         * GOODS_NO_00001,然后两个Goods对象添加到一个Set对象中,最后输出Set中的所有元素,并将
         * 结果与第2题做对比
         */


        Set<Goods> goodsSet = new HashSet<Goods>();
        goodsSet.add(new  Goods("红米手机", "GOODS_NO_00001"));
        goodsSet.add(new  Goods("苹果手机", "GOODS_NO_00001"));
        Iterator<Goods> iterator = goodsSet.iterator();
        while (iterator.hasNext()){
            Goods goods = iterator.next();
            System.out.println(goods.toString());
        }
    }
}
