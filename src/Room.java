import java.util.*;

public class Room {
    private int room_number;
    private String[] damages;
    private String view;
    private int capacity;
    private float price;
    private boolean extended;
    private boolean availability;

    private Hotels owner;

    /**
     * Constructor with all attributes
     * @param room_number
     * @param damages
     * @param view
     * @param capacity
     * @param price
     * @param extended
     * @param availability
     */
    public Room(int room_number, String[] damages, String view, int capacity, float price, boolean extended, boolean availability) {
        if (isValidRoomNumber(room_number) && isValidCapacity(capacity) && isValidPrice(price)) {
            this.room_number = room_number;
            this.damages = damages;
            this.view = view;
            this.capacity = capacity;
            this.price = price;
            this.extended = extended;
            this.availability = availability;
        }
    }

    /**
     * Empty constructor
     */
    public Room(){
        damages = new String[0];
    }

    /**
     * Setter method for room number
     * @param room_number
     * @return
     */
    public boolean setRoomNumber(int room_number) {
        if (isValidRoomNumber(room_number)) {
            this.room_number = room_number;
            return true;
        }
        return false;
    }

    /**
     * Getter for room_number
     * @return
     */
    public int getRoom_number() {
        return room_number;
    }

    /**
     * Setter for view
     * @param view
     */
    public void setView(String view) {
        this.view = view;
    }

    /**
     * Getter for view
     * @return
     */
    public String getView() {
        return view;
    }

    public boolean setCapacity(int capacity) {
        if (isValidCapacity(capacity)) {
            this.capacity = capacity;
            return true;
        }
        return false;
    }

    /**
     * Getter for capacity
     * @return
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Setter for price
     * @param price
     * @return
     */
    public boolean setPrice(float price) {
        if (isValidPrice(price)) {
            this.price = price;
            return true;
        }
        return false;
    }

    /**
     * Getter for price
     * @return
     */
    public float getPrice() {
        return price;
    }

    /**
     * Setter for extended
     * @param extended
     */
    public void setExtended(boolean extended) {
        this.extended = extended;
    }

    /**
     * Getter for extended
     * @return
     */
    public boolean getExtended() {
        return extended;
    }

    /**
     * Setter for availability
     * @param availability
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    /**
     * Getter for availability
     * @return
     */
    public boolean getAvailability() {
        return availability;
    }

    /**
     * Method to add damages to list of damages
     * @param new_damage
     */
    public void addDamages(String new_damage) {
        String[] new_damages = new String[damages.length + 1];
        for (int i = 0; i < damages.length; i++) {
            new_damages[i] = damages[i];
        }
        new_damages[damages.length] = new_damage;
        damages = new_damages;
    }

    /**
     * Getter for damages
     * @return
     */
    public String[] getDamages() {
        return damages;
    }

    /**
     * Setter for damages
     * @param damages
     */
    public void setDamages(String[] damages) {
        this.damages = damages;
    }

    /**
     * Method to reset damages to null array
     */
    public void resetDamages() {
        damages = new String[0];
    }

    /**
     * Method to verify if an entry for room_number is valid
     * @param room_number
     * @return
     */
    public boolean isValidRoomNumber(int room_number) {
        return room_number >= 0;
    }

    /**
     * Method to verify if an entry for capacity is valid
     * @param capacity
     * @return
     */
    public boolean isValidCapacity(int capacity) {
        return room_number >= 0;
    }

    /**
     * Method to verify if a price entered is valid
     * @param price
     * @return
     */
    public boolean isValidPrice(float price) {
        return price >= 0;
    }

    /**
     * Setter for owner. Verifies if primary keys match
     * @param owner
     * @param room_number
     * @return
     */
    public boolean setOwner(Hotels owner, int room_number) {
        if (this.room_number == room_number) {
            this.owner = owner;
            return true;
        }
        return false;
    }

    /**
     * Getter for owner.
     * @return
     */
    public Hotels getOwner() {
        return owner;
    }
}
