package cn.hz.gq.hahaha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller//描述rest服务


@RestController//复合注解 ->里面包括@Controller和@ResponseBody
public class hello {
    @RequestMapping("/he.html")
    public  String sfd(){//返回一个json字符串


        return "frc";
    }
}
