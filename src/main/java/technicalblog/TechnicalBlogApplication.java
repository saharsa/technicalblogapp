package technicalblog;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TechnicalBlogApplication {

    public static void main(String [] args){
        SpringApplication app = new SpringApplication(TechnicalBlogApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
        app.run(args);
    }

}
