package cn.mrzhang.exam.entity;
/**
 * 实体类  学生类
 */

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String realName;
    private String sex;
    private String collage;
    private String profession;
    private String grade;
    private String classes;
    private String phone;
    private String idCard;
    private String email;

    public Student() {
    }

    public Student(Integer id, String realName, String sex, String collage, String profession, String grade, String classes, String phone, String idCard, String email) {
        this.id = id;
        this.realName = realName;
        this.sex = sex;
        this.collage = collage;
        this.profession = profession;
        this.grade = grade;
        this.classes = classes;
        this.phone = phone;
        this.idCard = idCard;
        this.email = email;
    }
}
