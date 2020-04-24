package com.example.maokaixin.myapplication;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainActivityTest2Java {
    @Test
    public void isEmail(){
        assertThat(MainActivity.isEmail("54@fjsdlkf.com"),is(true)); // is(true) 表示前面的结果返回是不是true，也可以反向判断 is(false)
    }
}
