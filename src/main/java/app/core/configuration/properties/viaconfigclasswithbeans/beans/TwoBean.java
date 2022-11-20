package app.core.configuration.properties.viaconfigclasswithbeans.beans;


import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@NoArgsConstructor
@Setter
public class TwoBean implements BeanWithName {
    private String name;

    @Value(value = "#{oneBean.name}")
    private String oneBeanName;

    @Value(value = "#{threeBean.name}")
    private String threeBeanName;

    public String getOneBeanName() {
        return oneBeanName;
    }

    public String getThreeBeanName() {
        return threeBeanName;
    }

    @Override
    public String getBeanNameMethodFormInterfaceBeanWithName() {
        return name;
    }
}
