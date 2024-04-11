/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

public class Student {
    private int studentId;
    private int accountId;
    private String name;
    private String gender;
    private Date dateOfBirth;
    private String phoneNumber;
    private String address;
    private String class_;
    private int havingRoom;
    private String chagingRoom;
    private String room;

    public Student(int studentId, int accountId, String name, String gender, Date dateOfBirth, String phoneNumber, String address, String class_, int havingRoom, String chagingRoom, String room) {
        this.studentId = studentId;
        this.accountId = accountId;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.class_ = class_;
        this.havingRoom = havingRoom;
        this.chagingRoom = chagingRoom;
        this.room = room;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public int getHavingRoom() {
        return havingRoom;
    }

    public void setHavingRoom(int havingRoom) {
        this.havingRoom = havingRoom;
    }

    public String getChagingRoom() {
        return chagingRoom;
    }

    public void setChagingRoom(String chagingRoom) {
        this.chagingRoom = chagingRoom;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}

