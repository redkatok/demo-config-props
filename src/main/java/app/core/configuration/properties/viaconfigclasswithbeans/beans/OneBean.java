package app.core.configuration.properties.viaconfigclasswithbeans.beans;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class OneBean implements BeanWithName {
    private String name;

    @Override
    public String getBeanNameMethodFormInterfaceBeanWithName() {
        return this.name;
    }

    public void doSmthForLol(){
        System.out.println("lol");
    }

}
