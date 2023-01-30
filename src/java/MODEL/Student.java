/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Donald
 */

public class Student {
    private String id;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String DOB;
    private String Gender;
    private String ParentName;
    private String ParentPhone;
    private String ParentOccupation;
    private String AnyHealthIssue;
    private String StudentClass;

    public Student(String id, String FirstName, String MiddleName, String LastName, String DOB, String Gender, String ParentName, String ParentPhone, String ParentOccupation, String AnyHealthIssue, String StudentClass) {
        this.id = id;
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.DOB = DOB;
        this.Gender = Gender;
        this.ParentName = ParentName;
        this.ParentPhone = ParentPhone;
        this.ParentOccupation = ParentOccupation;
        this.AnyHealthIssue = AnyHealthIssue;
        this.StudentClass = StudentClass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getParentName() {
        return ParentName;
    }

    public void setParentName(String ParentName) {
        this.ParentName = ParentName;
    }

    public String getParentPhone() {
        return ParentPhone;
    }

    public void setParentPhone(String ParentPhone) {
        this.ParentPhone = ParentPhone;
    }

    public String getParentOccupation() {
        return ParentOccupation;
    }

    public void setParentOccupation(String ParentOccupation) {
        this.ParentOccupation = ParentOccupation;
    }

    public String getAnyHealthIssue() {
        return AnyHealthIssue;
    }

    public void setAnyHealthIssue(String AnyHealthIssue) {
        this.AnyHealthIssue = AnyHealthIssue;
    }

    public String getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(String StudentClass) {
        this.StudentClass = StudentClass;
    }
    
}

