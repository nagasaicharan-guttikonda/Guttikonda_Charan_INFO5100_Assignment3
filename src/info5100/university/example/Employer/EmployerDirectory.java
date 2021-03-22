/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Employer;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sreepad
 */
public class EmployerDirectory {
    
    
    String[] employer = {"Accenture", "Amazon", "Microsoft", "Cisco", "Google", "Deloitte", "Wells Fargo"}; 

    static List<String> employerList; 
    
    public EmployerDirectory(){
        
        employerList = Arrays.asList(employer);
        
    }
    
    public static List<String> getEmployerList() {
        return employerList;
    }

    public void setEmployerList(List<String> employerList) {
        this.employerList = employerList;
    }
    
        
        
    }
   
