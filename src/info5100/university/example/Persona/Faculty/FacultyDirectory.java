/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.*;
import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyDirectory {

    Department department;
    static ArrayList<FacultyProfile> teacherlist;

    public FacultyDirectory() {

        //department = d;
        teacherlist = new ArrayList();

    }

    public static ArrayList<FacultyProfile> getTeacherlist() {
        return teacherlist;
    }

    public void setTeacherlist(ArrayList<FacultyProfile> teacherlist) {
        this.teacherlist = teacherlist;
    }

    //public FacultyProfile newStudentProfile(Person p) {

        //FacultyProfile sp = new FacultyProfile(p);
       // teacherlist.add(sp);
        //return sp;
    //}

    public FacultyProfile findTeachingFaculty(String id) {

        for (FacultyProfile sp : teacherlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public static void addFaculty(FacultyProfile fp)
    {
        getTeacherlist().add(fp);
    }
    
}
