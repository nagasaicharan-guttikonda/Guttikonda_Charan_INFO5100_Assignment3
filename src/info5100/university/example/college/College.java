/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.college;

import info5100.university.example.Department.Department;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author chara
 */
public class College {
    String collegeName;
    Department department;
    HashMap<String, ArrayList<Department>> collegeMap;
    ArrayList<Department> departmentList;

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public College(String n)
    {
        collegeName = n;
        departmentList = new ArrayList<Department>();
    }


    

    public HashMap<String, ArrayList<Department>> getCollegeMap() {
        return collegeMap;
    }

    public void setCollegeMap(HashMap<String, ArrayList<Department>> collegeMap) {
        this.collegeMap = collegeMap;
    }

}