package org.example.entity;

/**
 * @author luyingjian
 * @date 2024/9/18
 */
public abstract class Pet {


    private String name;

    private Integer age;

    private Integer sex;

    public void sleep() {
        System.out.println("sleep......");
    }

    public void play() {
        System.out.println("play......");
    }

    public abstract void eat();

    public void daily() {
        eat();
        sleep();
        play();
    }

}
