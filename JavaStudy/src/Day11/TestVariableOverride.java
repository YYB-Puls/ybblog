package Day11;

public class TestVariableOverride {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        System.out.println("===使用ParentClass引用parent获取overrideValue的值");
        System.out.println("parentClass.overridValue的值是:"+parent.overrideValue);
        System.out.println("===parent指向了SubClass的对象===");
        parent = new SubClass();
        System.out.println("的值是:"+((SubClass) parent).overrideValue);
        System.out.println("====sub指向了SubClass的对象====");
        SubClass sub = (SubClass) parent;
        System.out.println("sub.overridValue的值是:"+sub.overrideValue);
        System.out.println("parent.overridValue的值是:"+((SubClass) parent).overrideValue);
    }
}
