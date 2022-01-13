package netology.springboottask1.config;

import netology.springboottask1.profile.DevProfile;
import netology.springboottask1.profile.ProductionProfile;
import netology.springboottask1.profile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    @ConditionalOnProperty(value="netology.profile.dev",havingValue = "true")
    public SystemProfile devProfile(){
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value="netology.profile.dev",havingValue = "false")
    public SystemProfile productionProfile(){
        return new ProductionProfile();
    }

}
