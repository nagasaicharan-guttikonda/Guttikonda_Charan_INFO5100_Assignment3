/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Employer;

/**
 *
 * @author sreepad
 */
public class JobDetails {
    
    String jobTitle;
    String jobType;
    String[] jobReq;
    int payScale;
    int postNum;
    

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String[] getJobReq() {
        return jobReq;
    }

    public void setJobReq(String[] jobReq) {
        this.jobReq = jobReq;
    }

    public int getPayScale() {
        return payScale;
    }

    public void setPayScale(int payScale) {
        this.payScale = payScale;
    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }
    
    
    
    
}
