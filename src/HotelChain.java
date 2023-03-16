import java.util.*;
public class HotelChain {
    private int number_of_its_hotels;
    private String phone_number;
    private String email_address;
    private String address_of_central_offices;
    private ArrayList<Hotels> hotels_owned;

    /**
     * Main constructor for class HotelChain
     * @param number_of_its_hotels
     * @param phone_number
     * @param email_address
     * @param address_of_central_offices
    */
    public HotelChain(int number_of_its_hotels, String phone_number, String email_address, String address_of_central_offices) {
        if (isValidEmailAddress(email_address) && isValidNumberOfHotels(number_of_its_hotels) && isValidPhoneNumber(phone_number)) {
            this.email_address = email_address;
            this.number_of_its_hotels = number_of_its_hotels;
            this.phone_number = phone_number;
            this.address_of_central_offices = address_of_central_offices;
            hotels_owned = new ArrayList<>();
        }
    }

    /**
     * Empty constructor
     */
    public HotelChain(){
        hotels_owned = new ArrayList<>();
    }

    /**
     * Getter for number_of_its_hotels instance variable
     * @return
     */
    public int getNumHotels() {
        return number_of_its_hotels;
    }

    /**
     * Setter for number_of_its_hotels attribute.
     * @param number_of_its_hotels
     * @return
     */
    public boolean setNumHotels(int number_of_its_hotels) {
        if (isValidNumberOfHotels(number_of_its_hotels)) {
            this.number_of_its_hotels = number_of_its_hotels;
            return true;
        }
        return false;
    }

    /**
     * Getter for phone_number instance variable
     * @return
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * Setter for phone_number instance variable
     * @param phone_number
     * @return
     */
    public boolean setPhone_number(String phone_number) {
        if (isValidPhoneNumber(phone_number)) {
            this.phone_number = phone_number;
            return true;
        }
        return false;
    }

    /**
     * Getter for email_address instance variable
     * @return
     */
    public String getEmail_address() {
        return email_address;
    }

    /**
     * Setter for email_address instance variable
     * @param email_address
     * @return
     */
    public boolean setEmail_address(String email_address) {
        if (isValidEmailAddress(email_address)) {
            this.email_address = email_address;
            return true;
        }
        return false;
    }

    /**
     * Getter for address_of_central_offices instance variable
     * @return
     */
    public String getAddress_of_central_offices() {
        return address_of_central_offices;
    }

    /**
     * Setter for address_of_central_offices instance variable
     * @param addressOfCentralOffices
     */
    public void setAddress_of_central_offices(String addressOfCentralOffices) {
        this.address_of_central_offices = addressOfCentralOffices;
    }

    /**
     * Converts information in instance of this class to query to insert into database
     * @return
     */
    public String convertToQueryInsert() {
        return "INSERT INTO Hotel_Chains VALUES (" + Integer.toString(number_of_its_hotels) + ", "
                + phone_number + ", " + email_address + ", " + address_of_central_offices + ")";
    }

    /**
     * Converts information in instance of this class to query for the deletion
     * of this instance from the database through its primary key (Phone_number_owner)
     * @return
     */
    public String convertToQueryDelete() {
        return "DELETE FROM Hotel_Chains WHERE Phone_number_owner = " + phone_number;
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
     * Method to verify if a hotel's owner is this instance of Hotel_Chain
     * @param phone_number
     * @return
     */
    public boolean isValidHotelEntry(String phone_number) {
        return phone_number.equals(this.phone_number);
    }

    /**
     * Method to add a hotel to the list of owned hotels
     * @param owner_phone_number
     * @param new_hotel
     * @return
     */
    public boolean addHotel(String owner_phone_number, Hotels new_hotel) {
        if (isValidHotelEntry(owner_phone_number)) {
            hotels_owned.add(new_hotel);
            return true;
        }
        return false;
    }

    /**
     * Method to reset list of hotels
     */
    public void resetHotels() {
        hotels_owned = new ArrayList<>();
    }
}
