package hello;


import javax.persistence.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;
;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue
    private int id;


    @OneToMany (cascade = CascadeType.PERSIST)
    private List<BuddyInfo> buddyInfo;

    public AddressBook() {
        this.buddyInfo = new ArrayList<BuddyInfo>();
    }
    public AddressBook(List<BuddyInfo> list){
        this.buddyInfo = list;
    }

    public void addBuddy(BuddyInfo aBuddyInfo) {
        if (aBuddyInfo != null) {
            this.buddyInfo.add(aBuddyInfo);
        }

    }

    public long getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddyInfo.size()) {
            return this.buddyInfo.remove(index);
        }
        return null;
    }


    public void setBuddyInfo(ArrayList<BuddyInfo> buddyInfo) {
        this.buddyInfo = buddyInfo;
    }

    @Override
    public String toString() {
        for (BuddyInfo b : buddyInfo) {
            return "buddy: " + b.toString();
        }
        return "";
    }

    public static void main(String[] args) {

//        hello.BuddyInfo buddy1 = new hello.BuddyInfo("Tom", "Carleton", "1234");
//        hello.BuddyInfo buddy2 = new hello.BuddyInfo("Jane", "Ottawa", "123456");
//        hello.BuddyInfo buddy3 = new hello.BuddyInfo("Harry", "Hogwarts", "1234567");
//        hello.AddressBook addressBook = new hello.AddressBook();
//        addressBook.addBuddy(buddy1);
//        addressBook.addBuddy(buddy2);
//        addressBook.addBuddy(buddy3);
//        System.out.println(addressBook.toString());

//
//        Launcher launcher = new Launcher();
//        launcher.launch();
    }



}
