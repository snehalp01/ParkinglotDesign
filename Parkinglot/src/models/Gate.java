package models;

import models.enums.GateStatus;
import models.enums.GateType;

public class Gate extends  BaseModel{
    private static int idCounter=0;
    private int gateNumber;
    private GateType gateType;
    private GateStatus gateStatus;
    private String operatorName;

    public Gate(int gateNumber, GateType gateType, GateStatus gateStatus, String operatorName) {
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.gateStatus = gateStatus;
        this.operatorName = operatorName;
        this.id = idCounter++;
    }

    public Gate() {
        this.id = idCounter++;
    }
    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

}
