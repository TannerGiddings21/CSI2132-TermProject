import java.util.*;

public class Hotels {
    private HotelChain owner;
    private int number_of_rooms;
    private int stars;
    private String email_address;
    private String phone_number;
    private ArrayList<Room> rooms;

    /**
     * Constructor with all attributes of Hotels
     * @param owner
     * @param number_of_rooms
     * @param stars
     * @param email_address
     * @param phone_number
     */
    public Hotels(HotelChain owner, int number_of_rooms, int stars, String email_address, String phone_number) {
        if (isValidPhoneNumber(phone_number) && isValidNumberOfRooms(number_of_rooms) && isValidStars(stars) && isValidEmailAddress(email_address) && isValidPhoneNumber(phone_number)) {
            this.owner = owner;
            this.number_of_rooms = number_of_rooms;
            this.stars = stars;
            this.email_address = email_address;
            this.phone_number = phone_number;
        }
        rooms = new ArrayList<>();
    }

    /**
     * Constructor without owner attribute
     * @param number_of_rooms
     * @param stars
     * @param email_address
     * @param phone_number
     */
    public Hotels(int number_of_rooms, int stars, String email_address, String phone_number) {
        if (isValidPhoneNumber(phone_number) && isValidNumberOfRooms(number_of_rooms) && isValidStars(stars) && isValidEmailAddress(email_address) && isValidPhoneNumber(phone_number)) {
            this.owner = owner;
            this.number_of_rooms = number_of_rooms;
            this.stars = stars;
            this.email_address = email_address;
            this.phone_number = phone_number;
            rooms = new ArrayList<>();
        }
        rooms = new ArrayList<>();
    }

    /**
     * Null Constructor for Hotels
     */
    public Hotels(){
        rooms = new ArrayList<>();
    }

    /**
     * Setter for number_of_rooms variable
     * @param number_of_rooms
     * @return
     */
    public boolean setNumberOfRooms(int number_of_rooms) {
        if (isValidNumberOfRooms(number_of_rooms)) {
            this.number_of_rooms = number_of_rooms;
            return true;
        }
        return false;
    }

    /**
     * Getter for number of rooms
     * @return
     */
    public int getNumber_of_rooms() {
        return number_of_rooms;
    }

    /**
     * Setter for stars variable
     * @param stars
     * @return
     */
    public boolean setStars(int stars) {
        if (isValidStars(stars)) {
            this.stars = stars;
            return true;
        }
        return false;
    }

    /**
     * Getter for stars variable
     * @return
     */
    public int getStars() {
        return stars;
    }

    /**
     * Setter for email address variable
     * @param email_address
     * @return
     */
    public boolean setEmailAddress(String email_address) {
        if (isValidEmailAddress(email_address)) {
            this.email_address = email_address;
            return true;
        }
        return false;
    }

    /**
     * Getter for email_address variable
     * @return
     */
    public String getEmail_address() {
        return email_address;
    }

    /**
     * Setter method for phone_number
     * @param phone_number
     * @return
     */
    public boolean setPhoneNumber(String phone_number) {
        if (isValidPhoneNumber(phone_number)) {
            this.phone_number = phone_number;
            return true;
        }
        return false;
    }

    /**
     * Getter for phone_number
     * @return
     */
    public String getPhoneNumber() {
        return phone_number;
    }

    /**
     * Method to verify whether an entry for phone_number is valid
     * @param new_phone_number
     * @return
     */
    public boolean isValidPhoneNumber(String new_phone_number) {
        if (phone_number.length() != 10) {
            return false;
        }
        for (int i = 0; i < 10; i++) {
            if (!Character.isDigit(phone_number.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method to verify whether an entry for number_of_its_hotels is valid or not
     * @param number_of_its_hotels
     * @return
     */
    public boolean isValidNumberOfHotels(int number_of_its_hotels) {
        if (number_of_its_hotels >= 0) {
            return true;
        }
        return false;
    }

    /**
     * Method to verify whether and entry for email_address is valid
     * @param email_address
     * @return
     */
    public boolean isValidEmailAddress(String email_address) {
        if (email_address.contains("@")) {
            return true;
        }
        return false;
    }

    /**
     * Method to verify whether an entry for stars is valid
     * @param stars
     * @return
     */
    public boolean isValidStars(int stars) {
        return stars <= 5 && stars >= 0;
    }

    /**
     * Method to verify whether
     * @param number_of_rooms
     * @return
     */
    public boolean isValidNumberOfRooms(int number_of_rooms) {
        return number_of_rooms >= 0;
    }

    /**
     * Method to add rooms to list
     * @param new_room
     * @return
     */
    public boolean addRoom(Room new_room) {

    }
}
