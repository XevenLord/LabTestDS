public class Person {
    private Person[] numOfEmployee;
    private String name;
    private String contactNumber;

    public Person(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public Person() {
    }

    /*public Person[] getNumOfEmployee() {
        return numOfEmployee;
    }

    public void setNumOfEmployee(Person[] numOfEmployee) {
        this.numOfEmployee = numOfEmployee;
    }*/

    public String getName() {
        return name;
    }

 /*   public void setName(String name) {
        this.name = name;
    }*/

    public String getContactNumber() {
        return contactNumber;
    }

   /* public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
*/
    public void setContact(String name, String contactNumber){
        this.name = name;
        this.contactNumber = contactNumber;
    }


}
