package com.example.maokaixin.myapplication;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainActivityTest2 {
    @Test
    public void testIsEmail() {
        assertThat(MainActivity.isEmail("ewer@qq`com"),is(true));
    }
}
