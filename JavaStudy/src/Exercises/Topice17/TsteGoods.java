package Exercises.Topice17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TsteGoods {
    public static void main(String[] args) {
        /**
         * 习题3
         * 集合中的元素不允许重复:编写一个程序,创建两个Goods对象,让它们的id属性的值都为
         * GOODS_NO_00001,然后两个Goods对象添加到一个Set对象中,最后输出Set中的所有元素,并将
         * 结果与第2题做对比
         */
        Goods goods1 = new Goods("红米手机", "GOODS_NO_00001");
        Goods goods2 = new Goods("苹果手机", "GOODS_NO_00001");
        Set set = new HashSet();
        set.add(goods1);
        set.add(goods2);

        boolean booleanSet = set.add(goods2);
        System.out.println(booleanSet);

       /*
         编写一个程序,创建两个Goods对象,让它们的id属性的值都为GOODS_NO_00001,
         然后将两个Goods对象添加到一个list对象中,最后输出list中所有元素

        Goods goods1 = new Goods("红米手机", "GOODS_NO_00001");
        Goods goods2 = new Goods("苹果手机", "GOODS_NO_00001");
        List list = new ArrayList();
        list.add(goods1);
        list.add(1,goods2);
        Goods goodsFromList = (Goods) list.get(0);
        Goods goodsFromList1 = (Goods) list.get(1);
        goods1.printList(goodsFromList);
        goods2.printList(goodsFromList1);*/
    }
}
