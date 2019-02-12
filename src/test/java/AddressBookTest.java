import hello.BuddyInfo;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AddressBookTest {

    ArrayList<BuddyInfo> buddyInfo = new ArrayList<BuddyInfo>();
    BuddyInfo buddy = new BuddyInfo("Tom","Address","123456");
    BuddyInfo buddy2 = new BuddyInfo("Tom","Address","123456");
    @org.junit.Test
    public void addBuddy() {

         buddyInfo.add(buddy);
         buddyInfo.add(buddy2);
         assertEquals(2,buddyInfo.size());
    }

    @org.junit.Test
    public void removeBuddy() {

        buddyInfo.add(buddy);
        buddyInfo.add(buddy2);
        buddyInfo.remove(buddy2);
        assertEquals(1,buddyInfo.size());
    }

}