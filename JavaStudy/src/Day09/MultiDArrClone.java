package Day09;

public class MultiDArrClone {
    public static void main(String[] args) {
        //创建一个二维的int数组
        int[][] multiArr = new int[3][3];
        //让cloneMultiArr指向clone的数组
        int[][] cloneMultiArr = multiArr.clone();
        //给元素cloneMultArr[1][2]赋值999
        cloneMultiArr[1][2] = 999;
        //输出数组元素值
        System.out.println("cloneMultiArr[1][2]的属性值是"+cloneMultiArr[1][2]+",MultiArr[1][2]的属性值是:"+multiArr[1][2]);
        //再次clone
        cloneMultiArr[1] = multiArr[1].clone();
        //分别给两个数组的元素赋值
        multiArr[1][2] = 999;
        cloneMultiArr[1][2] = 777;
        //输出元素值
        System.out.println("cloneMultiArr[1][2]的属性值是"+cloneMultiArr[1][2]+",MultiArr[1][2]的属性值是:"+multiArr[1][2]);
    }
}
