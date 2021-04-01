import java.util.Comparator;
import java.util.Objects;

public class FoodStore extends ShopLot implements Comparable<FoodStore> {
    private Item[] menu;
    private Person contact;
    private Person[] employees;

    public FoodStore(String shopName) {
        super(shopName);
    }

    public Item[] getMenu() {
        return menu;
    }

    public void setMenu(Item[] menu) {
        this.menu = menu;
    }

    public Person getContact() {
        return contact;
    }

    public void setContact(Person contact) {
        this.contact = contact;
    }

    public Person[] getEmployees() {
        return employees;
    }

    public void setEmployees(Person[] employees){
        this.employees = employees;
    }

    @Override
    public int compareTo(FoodStore o) {
        if(employees.length > o.getEmployees().length){
            return 1;
        }
        else if(employees.length < o.getEmployees().length)
        {
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        FoodStore obj = (FoodStore) o;
        if(contact.getName().equals(obj.getContact().getName())){
            return true;
        }
        else{
            return false;
        }
    }
    }
}
