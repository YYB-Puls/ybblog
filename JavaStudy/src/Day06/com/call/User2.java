package Day06.com.call;

public class User2 {
    public String name;
    public int password;


    public void Login(){
        System.out.println("用户"+name+",密码"+password);
    }

    private void eat(){
        System.out.println("用户吃苹果!");
    }

    public void swin(){
        System.out.println(name+"游泳获得了第一名");
    }
}
