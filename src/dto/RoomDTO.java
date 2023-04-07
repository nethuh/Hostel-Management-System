package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class  RoomDTO {
    String roomTypeID;
    String type;
    double keyMoney;
    Integer qty;

    public String getRoomTypeID() {
        return roomTypeID;
    }

    public void setRoomTypeID(String roomTypeID) {
        this.roomTypeID = roomTypeID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getKeyMoney() {
        return keyMoney;
    }

    public void setKeyMoney(double keyMoney) {
        this.keyMoney = keyMoney;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public RoomDTO(String roomTypeID, String type, double keyMoney, Integer qty) {
        this.roomTypeID = roomTypeID;
        this.type = type;
        this.keyMoney = keyMoney;
        this.qty = qty;
    }

}
