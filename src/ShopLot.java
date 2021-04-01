public class ShopLot extends Person{
    private String shopName;
    private String contactPerson;
    private String employeeDetail;

    public ShopLot(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getEmployeeDetail() {
        return employeeDetail;
    }

    public void setEmployeeDetail(String employeeDetail) {
        this.employeeDetail = employeeDetail;
    }
}
