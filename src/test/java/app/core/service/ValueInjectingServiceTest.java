package app.core.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ValueInjectingServiceTest {

    @Autowired
    private ValueInjectingService valueInjectingService;


    @Test
    void test(){
        valueInjectingService.doSomething();
    }

}