package com.SpringORM.Entityes;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Student {

    @Id
    @Column(name="Student_id")
    private int studentId;
    @Column(name = "Student_name")
    private String studentName;
    @Column(name = "Student_course")
    private String studentCourse;

}
