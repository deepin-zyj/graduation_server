package com.drivinggrpc.driving.po;

public class UserApply {
    private String user_id;
    private String picture;
    private String name;
    private String sex;
    private String age;
    private String phone;
    private String type;
    private String code;
    private String old_type;
    private String address;

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setOld_type(String old_type) {
        this.old_type = old_type;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getPicture() {
        return picture;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOld_type() {
        return old_type;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public String getType() {
        return type;
    }
}
