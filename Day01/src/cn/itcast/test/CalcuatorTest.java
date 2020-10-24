package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcuatorTest {

    /**
     * 初始化方法
     */
    @Before
    public void init(){
        System.out.println("init.....");
    }

    /**
     * 释放资源,最后执行
     */
    @After
    public void beat(){
        System.out.println("beat.....");
    }
    /**
     * 测试Calcuator类
     */
    @Test
    public void testAdd(){
        //System.out.println("我被执行了");
        Calculator c = new Calculator();
        int add = c.add(1, 2);
        System.out.println("testAdd..");
        //System.out.println(add);
        Assert.assertEquals(3,add );


    }
}
