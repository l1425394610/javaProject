package org.example;

import org.example.entity.*;
import org.example.service.Command;
import org.example.service.impl.InputCommandImpl;
import org.example.service.impl.PrintCommandImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author luyingjian
 * @date 2024/9/18
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.strategyPattern();
    }

    /**
     * 模板模式
     */
    public void templatePattern(){
        Pet dog = new Dog();
        System.out.println("dog:");
        dog.daily();
        System.out.println("cat:");
        Pet cat = new Dog();
        cat.daily();
    }

    /**
     * 建造者模式
     */
    public void builderPattern(){
        User user = new User.UserBuilder()
                .setName("张三")
                .setSex(1)
                .setAge(18)
                .build();
    }

    /**
     * 策略模式
     */
    public void strategyPattern(){
        Map<String, Command> map = new HashMap<>();
        map.put("print",new PrintCommandImpl());
        map.put("input",new InputCommandImpl());

        System.out.println(map.get("print").execute());
    }
}