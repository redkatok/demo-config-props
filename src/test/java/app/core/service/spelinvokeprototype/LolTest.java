package app.core.service.spelinvokeprototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class LolTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void test() {
        for (int i = 0; i < 10; i++) {
            applicationContext.getBean("lol");
        }
    }

}