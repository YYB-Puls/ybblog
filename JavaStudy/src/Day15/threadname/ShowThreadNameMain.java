package Day15.threadname;

public class ShowThreadNameMain {
    public static void main(String[] args) {
        //使用无参数的构造方法创建thread类实例,这是它将有一个默认名字
        ShowThreadName defaultName = new ShowThreadName();
        //使用构造方法给线程制定一个名字
        ShowThreadName name = new ShowThreadName("线程的名字");
        defaultName.start();
        name.start();
    }
}
