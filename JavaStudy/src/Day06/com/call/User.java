package Day06.com.call;

public class User {
    public String name;
    public int password;
    

    public void Login(){
        System.out.println("用户"+name+",密码"+password);
    }

    public void eat(){
        System.out.println("用户吃葡萄!");
    }
}
