/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.university;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.college.College;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author chara
 */
public class University {
    String universityName;
    ArrayList<College> collegeList;
    ArrayList<Department> departmentList;
    College college;
    Department department;
    HashMap<String, CourseSchedule> mastercoursecatalog;
    FacultyProfile facutlyProfile;
    FacultyDirectory facutlyDirectory;
    CourseOffer courseOffer;
    Course course;
    

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public ArrayList<College> getCollegeList() {
        return collegeList;
    }

    public void setCollegeList(ArrayList<College> collegeList) {
        this.collegeList = collegeList;
    }
    public University(String universityName){
        this.universityName = universityName;
        collegeList = new ArrayList<College>();
        coursesStudentsEnrrolled = new HashMap<String,ArrayList<Course>>();
    }
    
    public void addNewCollege(String s){
        college = new College(s);
        collegeList.add(college);
        
    }
    
    HashMap<String,ArrayList<Course>> coursesStudentsEnrrolled ;

    public HashMap<String, ArrayList<Course>> getCoursesStudentsEnrrolled() {
        return coursesStudentsEnrrolled;
    }

    public void setCoursesStudentsEnrrolled(HashMap<String, ArrayList<Course>> coursesStudentsEnrrolled) {
        this.coursesStudentsEnrrolled = coursesStudentsEnrrolled;
    }
    
    public ArrayList<Department> getDepartmenList(String  collegeName) {
        
        collegeList = this.getCollegeList();
        for(College c: collegeList)
         {
             if(c.getCollegeName().equals(collegeName))
             {
                 departmentList = c.getDepartmentList();
             }
         }
        return departmentList;
    }
  
    public void addDepartment(String collegeName , String dept){
         collegeList = this.getCollegeList();
         
         for(College c: collegeList)
         {
             if(c.getCollegeName().equals(collegeName))
             {
                 departmentList = c.getDepartmentList();
             }
         }
         Department d = new Department(dept);
         departmentList.add(d);
        }
    
    
    public void addNewCourse(String collegeName , String departmentName , String courseName , String courseNo , int credits){
         collegeList = this.getCollegeList();
         for(College c: collegeList)
         {
             if(c.getCollegeName().equals(collegeName))
             {
                 departmentList = c.getDepartmentList();
             }
         }
         
         for (Department d: departmentList)
         {
             if(d.getDepartmentName().equals(departmentName))
             {
                 department = d;
             }
        }
         department.newCourse(courseName, courseNo, credits);
    }
    
    
    public ArrayList<Course> viewCourseCatalog(String collegeName, String departmentName)
    {
        collegeList = this.getCollegeList();
        for(College c: collegeList)
         {
             if(c.getCollegeName().equals(collegeName))
             {
                 departmentList = c.getDepartmentList();
             }
         }
         
         for (Department d: departmentList)
         {
             if(d.getDepartmentName().equals(departmentName))
             {
                 department = d;
             }
        }
         CourseCatalog cc = department.getCourseCatalog();
         ArrayList<Course> courses = cc.getCourseList();
         
         return courses;
     }
    
    
    
    public ArrayList<String> viewSemesters(String collegeName, String departmentName)
    {
        ArrayList<String> semesterList = new ArrayList<String>();
        collegeList = this.getCollegeList();
        for(College c: collegeList)
         {
             if(c.getCollegeName().equals(collegeName))
             {
                 departmentList = c.getDepartmentList();
             }
         }
         
         for (Department d: departmentList)
         {
             if(d.getDepartmentName().equals(departmentName))
             {
                 department = d;
             }
        }
         
         mastercoursecatalog = department.getMastercoursecatalog();
         for(String key : mastercoursecatalog.keySet())
         {
             semesterList.add(key);
         }
         
         return semesterList;
         
    }
    public void addSemester(String collegeName,String departmentName,String semester){
        collegeList = this.getCollegeList();
        for(College c: collegeList)
         {
             if(c.getCollegeName().equals(collegeName))
             {
                 departmentList = c.getDepartmentList();
             }
         }
         
         for (Department d: departmentList)
         {
             if(d.getDepartmentName().equals(departmentName))
             {
                 department = d;
             }
        }
        
        HashMap<String, CourseSchedule> mastercoursecatalog = department.getMastercoursecatalog();
        CourseCatalog cc = department.getCourseCatalog();
        CourseSchedule cs = new CourseSchedule(semester, cc);
        mastercoursecatalog.put(semester,cs);
           
    }


    public void scheduleCourse(String collegeName, String departmentName, String semester, String courseName, String faculty, int n) {
          collegeList = this.getCollegeList();
        for(College c: collegeList)
         {
             if(c.getCollegeName().equals(collegeName))
             {
                 departmentList = c.getDepartmentList();
             }
         }
         
         for (Department d: departmentList)
         {
             if(d.getDepartmentName().equals(departmentName))
             {
                 department = d;
             }
        }
         
        HashMap<String, CourseSchedule> mastercoursecatalog = department.getMastercoursecatalog();
        ArrayList<FacultyProfile> facultyList = FacultyDirectory.getTeacherlist();
        CourseCatalog cc = department.getCourseCatalog();
         ArrayList<Course> courses = cc.getCourseList();
         
        for(Course c: courses)
        {
            if(c.getCourseName().equals(courseName))
                course = c;
        }
        
        for(FacultyProfile fp : facultyList)
        {
            if(fp.getFacultyName().equals(faculty))
                facutlyProfile = fp;
        }
        
        courseOffer = new CourseOffer(course);
        courseOffer.AssignAsTeacher(facutlyProfile);
        courseOffer.generatSeats(n);

        CourseSchedule cs = mastercoursecatalog.get(semester);
        ArrayList<CourseOffer> coursesOffered = cs.getSchedule();
        coursesOffered.add(courseOffer);   
    }

    public ArrayList<CourseOffer> getCoursesOffered (String collegeName, String departmentName, String semester) {
         collegeList = this.getCollegeList();
        for(College c: collegeList)
         {
             if(c.getCollegeName().equals(collegeName))
             {
                 departmentList = c.getDepartmentList();
             }
         }
         
         for (Department d: departmentList)
         {
             if(d.getDepartmentName().equals(departmentName))
             {
                 department = d;
             }
        }
         
        HashMap<String, CourseSchedule> mastercoursecatalog = department.getMastercoursecatalog();
        CourseSchedule cs = mastercoursecatalog.get(semester);
        ArrayList<CourseOffer> coursesOffered = cs.getSchedule();
        return coursesOffered;
    }
        
    }
    
    

