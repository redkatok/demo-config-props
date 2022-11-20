package app.core.configuration.properties.viaconfigclasswithbeans;


import app.core.configuration.properties.viaconfigclasswithbeans.beans.OneBean;
import app.core.configuration.properties.viaconfigclasswithbeans.beans.ThreeBean;
import app.core.configuration.properties.viaconfigclasswithbeans.beans.TwoBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfigPropertiesUsage {


    @Bean
    @ConfigurationProperties(prefix = "onebean")
    public OneBean oneBean(){
        return new OneBean();
    }

    @Bean
    @ConfigurationProperties(prefix = "twobean")
    public TwoBean twoBean(){
        return new TwoBean();
    }

    @Bean
    @ConfigurationProperties(prefix = "threebean")
    public ThreeBean threeBean(){
        return new ThreeBean();
    }
}
