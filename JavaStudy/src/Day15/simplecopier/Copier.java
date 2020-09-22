package Day15.simplecopier;

public class Copier {
    private String name;
    public Copier(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public synchronized void copyPages(int pages){
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"\t正在使用复印机\t"+name);
        long time = pages * 1000;
        try {
            thread.sleep(time);
        }catch (InterruptedException e){
            System.out.println("对不起,程序运行出错,错误信息为:"+e.getMessage());
        }
        System.out.println(thread.getName()+"\t用完了复印机\t"+name);
    }
}
