package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

// Annotation @Service đánh dấu lớp này là một Service, nơi chứa logic nghiệp vụ
@Service
public class StudentService {
    
    // Phương thức để lấy thông tin sinh viên theo ID
    public Student getStudentById(Long id) {
        // Giả sử việc lấy dữ liệu từ cơ sở dữ liệu
        // Ở đây chỉ tạo một sinh viên mẫu và trả về
        return new Student(id, "John Doe");  // Trả về một đối tượng Student với thông tin mẫu
    }
}
