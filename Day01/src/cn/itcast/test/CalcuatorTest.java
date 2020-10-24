package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalcuatorTest {

    /**
     * 测试Calcuator类
     */
    @Test
    public void testAdd(){
        //System.out.println("我被执行了");
        Calculator c = new Calculator();
        int add = c.add(1, 2);
        //System.out.println(add);
        Assert.assertEquals(3,add );


    }
}
