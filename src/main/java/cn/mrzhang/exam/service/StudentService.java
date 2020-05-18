package cn.mrzhang.exam.service;

import cn.mrzhang.exam.entity.Student;

public interface StudentService {
    /**
     * 学生登录
     * @param email
     * @param password
     * @return
     */
    Student login(String email,String password);
}
