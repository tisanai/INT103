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
public class Club {

    private String fullname;
    private String shortname;
    private Student[] members;
    private int count;
    private Status status;
    private static int runningId;

    public Club(String fullname, String shortname, int maxMembers) {
        this.fullname = fullname;
        this.shortname = shortname;
        this.members = new Student[maxMembers];
        status = Status.OPEN;
    }

    public boolean unsubscribe(long id) {
        Student foundStudent = searchMemberAt(id);
        if (foundStudent == null) {
            return false;
        }
        foundStudent = null;
        count--;
        status = Status.OPEN;
        return true;
    }

    public boolean subscribe(Student std) {
        if (status.equals(Status.CLOSE) || searchMemberAt(std) != -1) {
            return false;
        }
        members[count++] = new Student(std);
        if (count >= members.length) {
            status = Status.CLOSE;
        }
        return true;
    }
    public boolean editInfo(long studentId, String firstName, String lastName, String department){
        Student foundStudent = searchMemberAt(studentId);
        if (foundStudent == null) {
            return false;
        }
        foundStudent.setFirstname(firstName);
        foundStudent.setLastname(lastName);
        foundStudent.setDepartment(department);
        return true;
    }
    
    public Student searchMemberAt(long id) {
        for (int i = 0; i < count; i++) {
            if ((members[i].getStudentId())==(id)) {
                return members[i];
            }
        }
        return null;
    }
    
    public int searchMemberAt(Student std) {
        for (int i = 0; i < count; i++) {
            if (members[i].equals(std)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Club Name:" + fullname+ "(" + shortname+")\n");
        for (int i = 0; i < count; i++) {
            str.append(members[i]+"\n");
            
        }
        return str.toString();
    }

}
