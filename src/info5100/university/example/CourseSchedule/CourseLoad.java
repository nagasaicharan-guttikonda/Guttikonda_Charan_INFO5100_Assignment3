/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class CourseLoad {
    String semester;
    ArrayList<SeatAssignment> seatassignments;
    HashMap<String , ArrayList<Course>> courseStudentEnrolled;
    
    ArrayList<Course> coursesStudentEnrolled;

    public ArrayList<Course> getCoursesStudentEnrolled() {
        return coursesStudentEnrolled;
    }

    public void setCoursesStudentEnrolled(ArrayList<Course> coursesStudentEnrolled) {
        this.coursesStudentEnrolled = coursesStudentEnrolled;
    }

    public HashMap<String, ArrayList<Course>> getCourseStudent() {
        return courseStudentEnrolled;
    }

    public void setCourseStudent(HashMap<String, ArrayList<Course>> courseStudent) {
        this.courseStudentEnrolled = courseStudent;
    }
    
    
    public CourseLoad(String s){
        seatassignments = new ArrayList<SeatAssignment>();
        semester = s;
    }
    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment();
        seatassignments.add(sa);  //add to students course 
        return sa;
    }
    
    
    public void registerStudent(SeatAssignment sa){
        
        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }
    
}
