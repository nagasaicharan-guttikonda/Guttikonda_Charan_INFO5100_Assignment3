/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Employer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sreepad
 */
public class JobDetailsList {
    
    static ArrayList<JobDetails> ja = new ArrayList<JobDetails>();
    
    HashMap<EmployerDirectory, ArrayList<JobDetails>> ea =  new HashMap<EmployerDirectory, ArrayList<JobDetails>>();

    public static ArrayList<JobDetails> getJa() {
        return ja;
    }

    public void setJa(ArrayList<JobDetails> ja) {
        this.ja = ja;
    }

    public HashMap<EmployerDirectory, ArrayList<JobDetails>> getEa() {
        return ea;
    }

    public void setEa(HashMap<EmployerDirectory, ArrayList<JobDetails>> ea) {
        this.ea = ea;
    }
    
    public void addNewJob(JobDetails jd){
        
        this.ja.add(jd);
        
    }
    
    
}
