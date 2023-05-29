package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

public class DemoJUnitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("#### @BeforeAll");
//        Configuration.browser = "chrome";
    }

    @BeforeEach
    void BeforeEach() {
        System.out.println("#### @BeforeEach");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("#### @AfterEach");
    }

    @Test
    void firstTest(){
        System.out.println("    #### @BeforeAll @Test firstTest");
        int result = 2 + 2;
        Assertions.assertTrue(result == 4);
    }


    @Test
    void secondTest(){
        System.out.println("    #### @BeforeAll @Test secondTest");
        int result = 2 * 2;
        Assertions.assertTrue(result == 4);
    }


    @AfterAll
    static void AfterAll() {
        System.out.println("#### @AfterAll");
//        Configuration.browser = "chrome";
    }

}
