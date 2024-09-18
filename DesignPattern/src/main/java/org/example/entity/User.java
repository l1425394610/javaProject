package org.example.entity;

/**
 * @author luyingjian
 * @date 2024/9/18
 */
public class User {

    private String name;

    private Integer sex;
    private Integer age;



    public User(UserBuilder builder) {
        this.name = builder.name;
        this.sex = builder.sex;
        this.age = builder.age;
    }


    public static class UserBuilder {
        private String name;

        private Integer sex;

        private Integer age;


        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setSex(Integer sex) {
            this.sex = sex;
            return this;
        }

        public UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
