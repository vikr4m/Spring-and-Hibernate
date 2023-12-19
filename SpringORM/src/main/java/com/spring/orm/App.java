package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        boolean go = true;
        while(go) {
        	System.out.println("----Welcome to ORM Project----");
            System.out.println("1.Insert");
            System.out.println("2.Update");
            System.out.println("3.Delete");
            System.out.println("4.Show");
            System.out.println("5.Show all");
            System.out.println("6.Exit");
            System.out.print("Enter your choice (1-6): ");
            
        
        
            try {
            	int ch = Integer.parseInt(br.readLine());
            	
            	switch (ch) {
				case 1:	//Insert
					System.out.print("Enter id: ");
					int id = Integer.parseInt(br.readLine());
					System.out.print("Enter name: ");
					String name = br.readLine();
					System.out.print("Enter city: ");
					String city = br.readLine();
					
			        Student student = new Student(id,name,city);
			        int r = studentDao.insert(student);
			        System.out.println(r+" student added..");
			        System.out.println("**************************************");
					
					break;
					
				case 2: //Update
					System.out.print("Enter id: ");
					id = Integer.parseInt(br.readLine());
					System.out.print("Enter name: ");
					name = br.readLine();
					System.out.print("Enter city: ");
					city = br.readLine();
					
			        student = new Student(id,name,city);
			        studentDao.update(student);
			        System.out.println("Student Updated ");
			        System.out.println("**************************************");
					break;
				
				case 3: //Delete
					System.out.print("Enter id: ");
					id = Integer.parseInt(br.readLine());
					studentDao.delete(id);
					System.out.println("**************************************");
					break;
					
				case 4: //Show
					System.out.print("Enter id: ");
					id = Integer.parseInt(br.readLine());
					Student s1 = studentDao.selectone(id);
					System.out.println(s1);
					System.out.println("**************************************");
					break;
					
				case 5: //Show all
					List<Student> selectall = studentDao.selectall();
					for (Student s : selectall) {
						System.out.println(s);
					}
					System.out.println("**************************************");
					break;
					
				case 6: //Exit
					go = false;
					System.out.println("**************************************");
					break;

				default:
					
					break;
				}
            	
            } catch (Exception e) {
            	System.out.println("Invalid input..Try with another one");
            	System.out.println(e.getMessage());
            }
        		
        }
        System.out.println("Thank you..");

        
//        
    }
}
