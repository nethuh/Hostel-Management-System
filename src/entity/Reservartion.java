package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;


public class Reservartion implements SuperEntity{
    String res_ID;
    LocalDate date;
    String studentID;
    String roomTypeID;
    String status;

    public String getRes_ID() {
        return res_ID;
    }

    public void setRes_ID(String res_ID) {
        this.res_ID = res_ID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(String roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Reservartion(String res_ID, LocalDate date, String studentID, String roomTypeID, String status) {
        this.res_ID = res_ID;
        this.date = date;
        this.studentID = studentID;
        this.roomTypeID = roomTypeID;
        this.status = status;
    }
}
