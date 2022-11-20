package app.core.configuration.properties.viaconfigclasswithbeans.beans;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ThreeBean implements BeanWithName{
    private  String name;

    @Override
    public String getBeanNameMethodFormInterfaceBeanWithName() {
        return name;
    }
}
