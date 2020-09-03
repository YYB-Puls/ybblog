package Day09;

public class ObjArrClone {
    public static void main(String[] args) {
        TestClone[] arr = new TestClone[2];
        arr[1] = new TestClone();

        TestClone[] cloneArr = arr.clone();
        arr[1].value = 777;
        cloneArr[1].value = 999;
        System.out.println("arr的第二个元素的value属性的值是"+arr[1].value+",cloneArr的第二个元素的value属性值是"+cloneArr[1].value);
        cloneArr[1] = new TestClone();
        arr[1].value = 777;
        cloneArr[1].value = 999;
        System.out.println("arr的第二个元素的value属性的值是"+arr[1].value+",cloneArr的第二个元素的value属性值是"+cloneArr[1].value);
    }
}
