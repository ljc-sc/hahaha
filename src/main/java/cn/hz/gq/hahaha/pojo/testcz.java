package cn.hz.gq.hahaha.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class testcz {

    @Bean
    public  Car car(){
        Car car =new Car();

         return  car;
    }
    @Bean
    public  User user(){
        User user=new User();

        return  user;
    }
}
