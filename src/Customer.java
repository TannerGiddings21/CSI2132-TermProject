public class Customer {
    private String full_name;
    private String address;
    private int length_of_stay;

    /**
     * Constructor with all variables
     * @param full_name
     * @param address
     * @param length_of_stay
     */
    public Customer(String full_name, String address, int length_of_stay) {
        if (isValidLengthOfStay(length_of_stay) && isValidName(full_name)) {
            this.full_name = full_name;
            this.address = address;
            this.length_of_stay = length_of_stay;
        }
    }

    /**
     * Getter for full name
     * @return
     */
    public String getFullName() {
        return full_name;
    }

    /**
     * Setter for full name
     * @param full_name
     * @return
     */
    public boolean setFullName(String full_name) {
        if (isValidName(full_name)) {
            this.full_name = full_name;
            return true;
        }
        return false;
    }

    /**
     * Getter for address
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter for address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Setter for length of stay
     * @param length_of_stay
     * @return
     */
    public boolean setLengthOfStay(int length_of_stay) {
        if (isValidLengthOfStay(length_of_stay)) {
            this.length_of_stay = length_of_stay;
            return true;
        }
        return false;
    }

    /**
     * Getter for length of stay
     * @return
     */
    public int getLength_of_stay() {
        return length_of_stay;
    }

    /**
     * Null Constructor for Customer
     */
    public Customer() {}

    /**
     * Method to validate length of stay
     * @param length_of_stay
     * @return
     */
    public boolean isValidLengthOfStay(int length_of_stay) {
        return length_of_stay >= 0;
    }

    /**
     * Method to validate
     * @param fullname
     * @return
     */
    public boolean isValidName(String fullname) {
        if (fullname.contains("1") || fullname.contains("2") || fullname.contains("3") || fullname.contains("4")
                || fullname.contains("5") || fullname.contains("6") || fullname.contains("7") || fullname.contains("8")
                || fullname.contains("9") || fullname.contains("0") || fullname.contains("/") || fullname.contains(">")
                || fullname.contains("<") || fullname.contains(".") || fullname.contains(",") || fullname.contains("|")
                || fullname.contains("_") || fullname.contains("]") || fullname.contains("[") || fullname.contains("{")
                || fullname.contains("}") || fullname.contains("+") || fullname.contains("=") || fullname.contains("?")
                || fullname.contains("!") || fullname.contains("@") || fullname.contains("#") || fullname.contains("$")
                || fullname.contains("%") || fullname.contains("^") || fullname.contains("&") || fullname.contains("*")
                || fullname.contains("(") || fullname.contains(")") || fullname.contains("`") || fullname.contains("~")) {
            return false;
        }
        return true;
    }
}
