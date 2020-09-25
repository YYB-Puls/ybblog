package Exercises.Topice17;

import java.util.List;
import java.util.Set;

/**
 * 编写一个Goods类,类中有两个String类型的属性id和name
 * 分别代表商品的编号和名字,
 * 对于两个Goods类的对象,当id相等的时候,就说明它们代表同一类商品
 * 也就是说,可以认为两个对象相等,根据上面的信息,给Goods类添加hashCode()方法
 * equals()方法,toString()方法
 */
public class Goods {
    private String name;
    private String id;

    public static void printList(Goods goods){
        System.out.println("商品为:"+goods.getName());
        System.out.println("商品编号为:"+goods.getId());
    }

    public static void printSer(Set set){
        Object[] elemp = set.toArray();
        int size = elemp.length;
        for (int i = 0; i < size; i++){
            System.out.print("第"+i+"个对象:"+elemp[i]);
        }
        System.out.println();
    }

    public Goods(String name , String id){
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1 % 10;
    }

    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }

    @Override
    public String toString() {
        return "商品:"+name+",商品编号:"+id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
