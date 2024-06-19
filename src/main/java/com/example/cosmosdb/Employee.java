package com.example.cosmosdb;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

@Container(containerName = "samplecontainer")
public class Employee {
    @Id
    private String id;
    private String fname;
    private String lname;
    private String country;
    @PartitionKey
    private String employeeid;

    public Employee(){}
    public Employee(String id, String fname, String lname, String country, String employeeid) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.country = country;
        this.employeeid = employeeid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", country='" + country + '\'' +
                ", employeeid='" + employeeid + '\'' +
                '}';
    }
}
