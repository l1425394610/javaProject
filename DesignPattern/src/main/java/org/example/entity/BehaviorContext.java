package org.example.entity;

/**
 * @author luyingjian
 * @date 2024/9/18
 */
public class BehaviorContext {
    private Pet pet;

    public BehaviorContext(Pet pet) {
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void daily(){
        pet.eat();
        pet.sleep();
        pet.play();
    }
}
