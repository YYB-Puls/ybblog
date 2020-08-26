package Day06.com.call;

public class UserImpl {
    public static void main(String[] args) {
        User2 user = new User2();
        user.name = "张三";
        user.password = 123456;
        
        user.Login();
        user.swin();
    }
}
