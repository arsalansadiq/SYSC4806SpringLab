package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class BuddyInfo {
    private String name;
    private String address;
    @Id
    private String number;
    

    public BuddyInfo(){

    }

    public BuddyInfo(String newName,String newAddress,String newNumber){
        super();
        this.name = newName;
        this.address = newAddress;
        this.number=newNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'';
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Arsii","Address1","6476475177");

        // TODO Auto-generated method stub
        System.out.println("Hello "+ buddy.getName());
        System.out.println(buddy.toString());
    }


}
