package org.itstack.demo.design.test;

import org.itstack.demo.design.Builder;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_Builder(){
        Builder builder = new Builder();
        double one = 132.52D;
        System.out.println(builder.levelOne(one).getDetail());


//        double two = 98.25D;
//        double third = 85.43D;

        // 豪华欧式

        // 轻奢田园
//        System.out.println(builder.levelTwo(two).getDetail());
//
//        // 现代简约
//        System.out.println(builder.levelThree(third).getDetail());
    }

}
