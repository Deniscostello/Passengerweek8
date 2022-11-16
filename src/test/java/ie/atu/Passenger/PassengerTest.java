package ie.atu.Passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PassengerTest {

    @BeforeEach
    void setUp() {
    }

    //Title Tests
    @Test
    void testTitleSuccess(){
        Passenger pass1 = new Passenger("Mr", "Denis", "12345678910", "12345678", 20);
        assertEquals("Mr", pass1.getTitle());
    }
    @Test
    void testTitleFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("M", "Denis", "12345678910", "12345678", 20));
        assertEquals("Please enter 'Mr' , 'Mrs' or 'Ms' ", exMessage.getMessage());
    }

    //Name Tests
    @Test
    void testNameSuccess(){
        Passenger pass2 = new Passenger("Mrs", "Kate", "9876543210", "87654321", 50);
        assertEquals("Kate", pass2.getName());
    }
    //Added name failure test
    @Test
    void testNameFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mrs", "Ka", "9876543210", "87654321", 50));
        assertEquals("Name must be a minimum of 3 characters", exMessage.getMessage());
    }

    //ID Tests
    @Test
    void testIDSuccess(){
        Passenger pass3 = new Passenger("Ms", "Sarah", "10987654321", "123454321", 28);
        assertEquals("10987654321", pass3.getID());
    }
    @Test
    void testIDFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Ms", "Sarah", "12345", "123454321", 28));
        assertEquals("ID must be a minimum of 10 characters", exMessage.getMessage());
    }

    //Phone Tests
    @Test
    void testPhoneSuccess(){
        Passenger pass1 = new Passenger("Mr", "Denis", "12345678910", "12345678", 20);
        assertEquals("12345678", pass1.getPhone());
    }
    @Test
    void testPhoneFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()->new Passenger("Mr", "Denis","12345678910", "1234", 20));
        assertEquals("Phone number must be 7 characters minimum", exMessage.getMessage());
    }

    //Age Tests
    @Test
    void testAgeSuccess(){
        Passenger pass1 = new Passenger("Mr", "Denis", "12345678910", "12345678",20);
        assertEquals(20, pass1.getAge());
    }
    @Test
    void testAgeFailure(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Passenger("Mr", "Denis", "12345678910", "12345678", 2));
        assertEquals("Must be over 16 to fly", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}