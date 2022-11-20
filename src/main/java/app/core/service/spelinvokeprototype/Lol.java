package app.core.service.spelinvokeprototype;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Component
@Scope(scopeName = SCOPE_PROTOTYPE)
public class Lol {

    @Value(value = "#{oneBean.doSmthForLol()}")
    public Void invoke;

}
