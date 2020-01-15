/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Umaporn
 */
public class Student {
    private long studentId;
    private String firstname;
    private String lastname;
    private String department;

    public Student(long studentId, String firstname, String lastname, String department) {
        this.studentId = studentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
    }

    public Student(Student std){
        this(std.getStudentId(), std.getFirstname(), std.getLastname(), std.getDepartment());
    }
    public long getStudentId() {
        return studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDepartment() {
        return department;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.studentId != other.studentId) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "studentId=" + studentId + ", firstname=" + firstname + ", lastname=" + lastname + ", department=" + department;
    }
    
    
    
    
    
}
