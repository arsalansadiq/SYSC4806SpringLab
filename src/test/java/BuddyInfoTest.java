import hello.BuddyInfo;

import static org.junit.Assert.*;

public class BuddyInfoTest {
    BuddyInfo buddy1 = new BuddyInfo("Tom","Carleton", "1234");


    @org.junit.Test
    public void getName() {
        assertEquals("Tom",buddy1.getName());
    }

    @org.junit.Test
    public void setName() {
        buddy1.setName("Tomm");
        assertEquals("Tomm",buddy1.getName());
    }

    @org.junit.Test
    public void getAddress() {
        assertEquals("Carleton",buddy1.getAddress());
    }

    @org.junit.Test
    public void setAddress() {
        buddy1.setAddress("ajax");
        assertEquals("ajax",buddy1.getAddress());
    }

    @org.junit.Test
    public void getNumber() {
        assertEquals("1234",buddy1.getNumber());
    }

    @org.junit.Test
    public void setNumber() {
        buddy1.setNumber("123");
        assertEquals("123",buddy1.getNumber());
    }

}