package app.core.configuration.properties.viaconfigclass;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class ConfigPropsTest {

    @Autowired
    private ConfigProps configProps;

    @Test
    public void test() {
        Assert.isTrue(configProps.getLogin() != null, "login не заполнен");
        Assert.isTrue(configProps.getPassword() != null, "password не заполнен");
        Assert.isTrue(configProps.getUrl() != null, "url не заполнен");
    }

}