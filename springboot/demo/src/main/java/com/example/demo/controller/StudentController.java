package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

// Annotation @RestController đánh dấu lớp này là một Controller xử lý các yêu cầu HTTP và trả về dữ liệu dưới dạng JSON
@RestController
public class StudentController {

    // Tiêm dependency vào lớp controller từ Spring context bằng annotation @Autowired
    @Autowired
    private StudentService studentService;  // Đưa instance của StudentService vào để sử dụng

    // Phương thức xử lý yêu cầu GET từ người dùng với ID sinh viên
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable Long id) {
        // Gọi phương thức trong service để lấy thông tin sinh viên theo ID
        return studentService.getStudentById(id);  // Trả về đối tượng Student từ service
    }
}
