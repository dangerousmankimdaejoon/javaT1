package com.example.demo.test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sp_instance")
public class T1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "inst_no")
    private int instNo;

    @Column(name = "logms_no")
    private int logmsNo;

    private String hostname;

    @Column(name = "display_name")
    private String displayName;
    
    //inst_no
    public int getInstNo() {
        return instNo;
    }
    public void setInstNo(int instNo) {
        this.instNo = instNo;
    }
    //logms_no
    public int getLogmsNo() {
        return logmsNo;
    }
    public void setLogmsNo(int logmsNo) {
        this.logmsNo = logmsNo;
    }
    //hostname
    public String gethostname() {
        return hostname;
    }
    public void sethostname(String hostname) {
        this.hostname = hostname;
    }
    //display_name
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
 }
