package app.core.configuration.properties.viaconfigclass;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ConfigurationProperties(prefix = "mercurial.data")
@Getter
@Setter
public class ConfigProps {

    private String login;
    private String password;
    private String url;

    public String getLogin() {
        return login;
    }

}
