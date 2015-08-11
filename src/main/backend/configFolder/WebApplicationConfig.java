package configFolder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by shian_mac on 8/10/15.
 */
@Configuration
@EnableWebMvc
@ComponentScan( "main.frontend.controller" )
public class WebApplicationConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver internalViewResourceResolver() {

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix( "/WEB-INF/home/" );
        resolver.setSuffix( ".html" );

        return resolver;

    }
}
