package com.miaoshaproject;

import com.miaoshaproject.dao.UserDOMapper;
import com.miaoshaproject.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

/*Springboot的自动化配置*/
@SpringBootApplication(scanBasePackages = {"com.miaoshaproject"})
@RestController
@MapperScan("com.miaoshaproject.dao")
public class App 
{
    @Autowired
    private UserDOMapper userDOMapper;


    @RequestMapping("/zhangqiang")
    public String home(){
        UserDO userDO_zhao = new UserDO();
        userDO_zhao.setAge(21);
        userDO_zhao.setGender((byte)0);
        userDO_zhao.setName("赵雨芝");
        userDO_zhao.setTelephone("15956094694");

        userDOMapper.insert(userDO_zhao);
        UserDO userDO = userDOMapper.selectByPrimaryKey(2);
        if(userDO == null){
            return "用户对象不存在";
        }else{
            return userDO.getName();
        }
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class,args);
    }

}
