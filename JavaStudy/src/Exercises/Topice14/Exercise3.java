package Exercises.Topice14;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        }catch (Exception e){

        }finally {
            System.out.println("finally语句块运行了");
        }
    }
}
