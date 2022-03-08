package models;


public class User {
    
    private int userID;
    private String username;
    private String password;
    private String email;
    private float remainingMoney;
    private float totalMoneyLoaded;
    private float discount;
    private String avatar;
    private int role;
    private int status;
    private String timeCreated;

    public User() {
    }

    public User(int userID, String username, String password, String email, float remainingMoney, float totalMoneyLoaded, float discount, String avatar, int role, int status, String timeCreated) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.remainingMoney = remainingMoney;
        this.totalMoneyLoaded = totalMoneyLoaded;
        this.discount = discount;
        this.avatar = avatar;
        this.role = role;
        this.status = status;
        this.timeCreated = timeCreated;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getRemainingMoney() {
        return remainingMoney;
    }

    public void setRemainingMoney(float remainingMoney) {
        this.remainingMoney = remainingMoney;
    }

    public float getTotalMoneyLoaded() {
        return totalMoneyLoaded;
    }

    public void setTotalMoneyLoaded(float totalMoneyLoaded) {
        this.totalMoneyLoaded = totalMoneyLoaded;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }

    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", username=" + username + ", password=" + password + ", email=" + email + ", remainingMoney=" + remainingMoney + ", totalMoneyLoaded=" + totalMoneyLoaded + ", discount=" + discount + ", avatar=" + avatar + ", role=" + role + ", status=" + status + ", timeCreated=" + timeCreated + '}';
    }
  

    
    

}
