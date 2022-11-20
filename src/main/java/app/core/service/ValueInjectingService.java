package app.core.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ValueInjectingService {

    //spel - берет весь json и считывает в map
    @Value("#{${homeController}}")
    private Map<String,String> jsonFromApplicationPropertiesToJavaMapField;


    //spel - берет значение из мапы homeController в пропертях по ключу
    @Value("#{${homeController}.lol1}")
    private String valueFromJsonApplicationPropertiesByKeyName;

    //значение установленно напрямую
    @Value(value = "значение прямо установлено в проперти")
    private String strictValue;

    //значение установленно с помощью application properties
    @Value(value = "${controller.home-controller.firstProp}")
    String fromApplicationProperties;

    @Value(value = "${TEST_LOL}")
    String applicationOs;




    public void doSomething(){
        System.out.println(this.jsonFromApplicationPropertiesToJavaMapField);
        System.out.println(this.valueFromJsonApplicationPropertiesByKeyName);
        System.out.println(this.strictValue);
        System.out.println(this.fromApplicationProperties);
        System.out.println(this.applicationOs);
    }

}
