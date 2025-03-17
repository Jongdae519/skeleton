package com.example.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class AppApplicationTests {

    @Test
    void contextLoads() {
        var am = ApplicationModules.of(AppApplication.class);
        am.verify();

        System.out.println(am);

        new Documenter(am).writeDocumentation();
    }



}
