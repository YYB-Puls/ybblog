package Day14.selfdefineexception;

import Exercises.Topice08.C;

public class UsingTryFinally {
    public static void main(String[] args) throws CapacityTooSmallException{
        if (args.length != 1){
            System.out.println("请将杯子的容积作为参数传递给main()方法");
            return;
        }
        Cup cup = new Cup();
        CupDesigner cupDesigner = new CupDesigner(cup);
        int capacity = Integer.valueOf(args[0]);
        System.out.println("开始设计杯子,杯子的容积为:"+capacity);
        try {
            cupDesigner.designCupCapacity(capacity);
        }catch (CapacityTooBigException e) {
            System.out.println("捕捉到了CapacityTooBigException类型的异常.异常信息如下");
            System.out.println(e.getMessage());
            System.out.println("尝试使用最大的杯子容积设计杯子:");
            try {
                cupDesigner.designCupCapacity(10000);
            }catch (CapacityTooBigException e1){

            }catch (CapacityTooSmallException e1){

            }
        }catch (CapacityTooSmallException e){
            System.out.println("捕捉到了CapacityTooSmallException类型的异常,异常信息如下");
            System.out.println(e.getMessage());
            System.out.println("尝试使用最小的杯子容积设计杯子");
            try {
                cupDesigner.designCupCapacity(0);
            }catch (CapacityTooBigException e1){

            }catch (CapacityTooSmallException e1){

            }
        }

        System.out.println("设计杯子结束");
    }
    /*public static void main(String[] args) throws CapacityTooSmallException,CapacityTooBigException{
        Cup cup = new Cup();
        CupDesigner cupDesigner = new CupDesigner(cup);
        try {
            cupDesigner.designCupCapacity(99999);
        }finally {
            System.out.println("这里是finally语句块");
        }
    }*/
}
