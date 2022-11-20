package app.core.configuration.properties.viaconfigclasswithbeans;

import app.core.configuration.properties.viaconfigclasswithbeans.beans.BeanWithName;
import app.core.configuration.properties.viaconfigclasswithbeans.beans.TwoBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Objects;


@SpringBootTest
class BeansConfigPropertiesUsageTest {

    @Autowired
    private List<BeanWithName> beanWithNames;

    @Autowired
    private TwoBean twoBean;


    @Test
    public void test() {
        Assertions.assertTrue(beanWithNames.stream()
            .allMatch(beanWithName -> beanWithName.getBeanNameMethodFormInterfaceBeanWithName() != null && !Objects.equals(beanWithName.getBeanNameMethodFormInterfaceBeanWithName(), "")));
        Assertions.assertNotNull(twoBean.getOneBeanName());
        Assertions.assertNotNull(twoBean.getOneBeanName());
    }

}