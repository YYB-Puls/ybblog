package Day09;

public class ObjArrClone {
    public static void main(String[] args) {
        // 创建一个长度为2的TestClone对象数组arr
        TestClone[] arr = new TestClone[8];
        // 将arr第一个元素赋值为新对象
        arr[1] = new TestClone();
        // 克隆arr，命名为cloneArr
        TestClone[] cloneArr = arr.clone();
        // 将aar第一个元素的值设置为777；
        arr[1].value = 777;
        // 将cloneArr第一个元素的值设置为999；
        cloneArr[1].value = 999;
        // 打印arr第二个元素的值和cloneArr第二个元素的值
        System.out.println("arr的第二个元素的属性值是"+arr[1].value+",cloneArr的第二元素的属性值是"+cloneArr[1].value);
        // 给cloneArr第二个元素赋值为新对象
        cloneArr[1] = new TestClone();
        // 将aar第二个元素的值设置为777；
        arr[1].value = 777;
        // 将cloneArr第二个元素的值设置为999；
        cloneArr[1].value  = 999;
        // 打印arr第二个元素的值和cloneArr第二个元素的值
        System.out.println("arr的第二个元素的属性值是"+arr[1].value+",cloneArr的第二元素的属性值是"+cloneArr[1].value);
    }
}
