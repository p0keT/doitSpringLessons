package doit.spring.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("doit.spring.lessons")
public class JavaConfig {

//    @Bean
//    public MessageProvider provider(){
//        return new SimpleMessageProvider();
//    }
//
//    @Bean
//    public MessageRenderer renderer(@Autowired MessageProvider provider){
//        return new SimpleMessageRenderer(provider);
//    }
}
