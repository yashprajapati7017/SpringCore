package com.SpringORM.Dao;

import com.SpringORM.Entityes.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDao {
    private HibernateTemplate hibernateTemplate;

    @Transactional
    public int insert(Student student){
        Integer result=(Integer) this.hibernateTemplate.save(student);
        return result;
    }

    public Student Fetch(int studentId){
        Student single=this.hibernateTemplate.get(Student.class,studentId);
        return single;
    }
    public List<Student> MultiplrFetch(){
        List<Student> students=this.hibernateTemplate.loadAll(Student.class);
        return students;
    }
    @Transactional
    public void Delete(int studentId){
        Student student=this.hibernateTemplate.get(Student.class,studentId);
        this.hibernateTemplate.delete(student);
    }
    @Transactional
    public void update(Student student){
        this.hibernateTemplate.update(student);
    }

}
