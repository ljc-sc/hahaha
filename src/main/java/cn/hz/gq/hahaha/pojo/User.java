package cn.hz.gq.hahaha.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "user")
public @Data class User {//@data自动提供getset方法

    //此处将配置文件和改装类属性绑定，来获取文件的值
    //注意：配置文件定义的属性必须和当前类定义的属性名保持一致。否则绑定不上

    private  String name;
}
