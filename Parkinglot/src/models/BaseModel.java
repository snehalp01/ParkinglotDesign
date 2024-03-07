package models;

import java.time.LocalDateTime;

public abstract class BaseModel {

    protected int id;
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;
    protected String createdBy;
    protected String updateBy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
