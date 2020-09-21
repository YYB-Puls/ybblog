package Day14.selfdefineexception;



public class DesignCupMain {
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
            System.out.println("异常捕捉结束");
        }finally {
            System.out.println("这里是finally语句块");
        }

        System.out.println("设计杯子结束");
    }

    /*public static void main(String[] args) {
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
            }catch (CapacityTooBigException e){
                System.out.println("捕捉到了CapacityTooBigException类型的异常.异常信息如下");
                System.out.println(e.getMessage());
                System.out.println("异常捕捉结束");
            }catch (CapacityTooSmallException e){
                System.out.println("捕捉到了CapacityTooSmallException类型的异常,异常信息如下");
                System.out.println(e.getMessage());
                System.out.println("异常捕捉结束");
            }

            System.out.println("设计杯子结束");
        }*/
    }

