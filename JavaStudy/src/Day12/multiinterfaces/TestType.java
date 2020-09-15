package Day12.multiinterfaces;

public class TestType {
    public static void main(String[] args) {
        ImplClass impl = new ImplClass();
        InterfaceA  a = impl;
        a.method1();
        InterfaceB b = impl;
        b.method3();
        if (impl instanceof InterfaceA){
            System.out.println("ImplClass也是InterfaceA类型");
        }
        if (impl instanceof InterfaceB){
            System.out.println("ImplClass也是InterfaceB类型");
        }
        if (impl instanceof  Object){
            System.out.println("ImplClass也是Object类型");
        }
    }
}
