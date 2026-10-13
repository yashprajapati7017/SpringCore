package com.SpringORM;

import com.SpringORM.Dao.StudentDao;
import com.SpringORM.Entityes.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        boolean go=true;
        Scanner sc=new Scanner(System.in);
        while(go){
            System.out.println("*********Welcome to this side************");
            System.out.println("Press 1 to insert data");
            System.out.println("press 2 to get all student");
            System.out.println("press 3 to get single student");
            System.out.println("press 4 to delete student");
            System.out.println("press 5 to update student");
            System.out.println("press 6 to exit");
            System.out.println("******************************************");
            int choise=sc.nextInt();

            try{

                switch (choise){
                    case 1:
                        System.out.println("*************************");
                        System.out.println("Enter the student ID");
                        int uid=sc.nextInt();
                        System.out.println("Enter the student name");
                        String uname=sc.next();
                        System.out.println("Enter the student course");
                        String ucourse=sc.next();

                        Student student =new Student();
                        student.setStudentId(uid);
                        student.setStudentName(uname);
                        student.setStudentCourse(ucourse);
                        int result=studentDao.insert(student);
                        System.out.println("student add "+result);
                        System.out.println("*************************");
                    break;


                    case 2:
                        System.out.println("*************************");
                        List<Student> allstudent=studentDao.MultiplrFetch();
                        for(Student s:allstudent){
                            System.out.println("ID "+s.getStudentId());
                            System.out.println("name "+s.getStudentName());
                            System.out.println("course "+s.getStudentCourse());
                            System.out.println("______________________________");
                        }
                        System.out.println("***************************");
                    break;

                    case 3:
                        System.out.println("*************************");
                        System.out.println("Enter the  Id of Student");
                        int Id=sc.nextInt();
                        Student su =studentDao.Fetch(Id);
                        System.out.println("ID "+su.getStudentId());
                        System.out.println("name "+su.getStudentName());
                        System.out.println("course "+su.getStudentCourse());
                        System.out.println("*************************");

                     break;

                    case 4:
                        System.out.println("*************************");
                        System.out.println("Enter the Id to delete");
                        int delete=sc.nextInt();
                        studentDao.Delete(delete);
                        System.out.println("student delete");
                        System.out.println("*************************");
                        break;

                    case 5:
                        System.out.println("*************************");

                        System.out.println("Enter the student ID");
                        int nid=sc.nextInt();
                        System.out.println("Enter the student name");
                        String nname=sc.next();
                        System.out.println("Enter the student course");
                        String ncourse=sc.next();

                        Student student1 =new Student();
                        student1.setStudentId(nid);
                        student1.setStudentName(nname);
                        student1.setStudentCourse(ncourse);

                        studentDao.update(student1);
                        System.out.println("update profile");

                        System.out.println("*************************");

                    break;


                    case 6:
                        System.out.println("*************************");
                        System.out.println("system off");
                        go=false;
                        break;
                }


            }catch(Exception e){
                System.out.println("Invaild condition");
                System.out.println(e.getMessage());
            }



        }
    }
}