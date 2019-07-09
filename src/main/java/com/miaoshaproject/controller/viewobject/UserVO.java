package com.miaoshaproject.controller.viewobject;

/**
 * @author 张强
 * @version 1.0
 * @description com.miaoshaproject.controller.viewobject
 * @date 2019/6/10  20:08
 */
public class UserVO {
    private Integer id;
    private String name;
    private Integer age;
    private Byte gender;
    private String telephone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }



}
