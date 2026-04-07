package entity;

public class Orders {
    private int orderId;
    private int tableId;
    private int userId;
    private String status;

    public Orders(int tableId, int orderId, int userId, String status) {
        this.tableId = tableId;
        this.orderId = orderId;
        this.userId = userId;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}