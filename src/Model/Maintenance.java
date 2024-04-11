/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author NgoQuangNghia
 */
public class Maintenance {
    private int maintenanceId;
    private int roomId;
    private String maintenanceDesc;
    private Date maintenanceDate;
    private int maintenanceCost;

    public Maintenance(int maintenanceId, int roomId, String maintenanceDesc, Date maintenanceDate, int maintenanceCost) {
        this.maintenanceId = maintenanceId;
        this.roomId = roomId;
        this.maintenanceDesc = maintenanceDesc;
        this.maintenanceDate = maintenanceDate;
        this.maintenanceCost = maintenanceCost;
    }

    public int getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(int maintenanceId) {
        this.maintenanceId = maintenanceId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getMaintenanceDesc() {
        return maintenanceDesc;
    }

    public void setMaintenanceDesc(String maintenanceDesc) {
        this.maintenanceDesc = maintenanceDesc;
    }

    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(Date maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public int getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(int maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }
}

