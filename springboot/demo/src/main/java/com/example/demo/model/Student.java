package com.example.demo.model;

// Lớp Student đại diện cho đối tượng sinh viên
public class Student {
    private Long id;      // ID của sinh viên
    private String name;  // Tên của sinh viên
    
    // Constructor để tạo đối tượng Student với id và name
    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter và Setter để lấy và thiết lập giá trị cho các thuộc tính
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
