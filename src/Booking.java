public class Booking {
    private Customer customer;
    private Room room;
    private String startOfStay;
    private String endOfStay;
    private int lengthOfStay;

    public Booking(){}

    /**
     * Method to set the start of a stay
     * @param startOfStay
     * @return
     */
    public boolean setStartOfStay(String startOfStay) {
        if (verifyDate(startOfStay)) {
            this.startOfStay = startOfStay;
            int diff_dates = findDatesDifference();
            if (diff_dates > 0) {
                lengthOfStay = diff_dates;
            }
            return true;
        }
        return false;
    }

    /**
     * Method to set the end of a stay
     * @param endOfStay
     * @return
     */
    public boolean setEndOfStay(String endOfStay) {
        if (verifyDate(endOfStay)) {
            this.endOfStay = endOfStay;
            int diff_dates = findDatesDifference();
            if (diff_dates > 0) {
                lengthOfStay = diff_dates;
            }
            return true;
        }
        return false;
    }

    /**
     * Method to find length of stay
     * @return
     */
    public int findDatesDifference() {
        if (endOfStay != null && startOfStay != null) {
            String[] endOfStay_elements = endOfStay.split("/");
            String[] startOfStay_elements = startOfStay.split("/");
            try {
                return (Integer.parseInt(endOfStay_elements[2]) - Integer.parseInt(startOfStay_elements[2])) * 365
                        + (Integer.parseInt(endOfStay_elements[1]) - Integer.parseInt(startOfStay_elements[1])) * 30
                        + (Integer.parseInt(endOfStay_elements[0]) - Integer.parseInt(startOfStay_elements[0]));
            } catch (NumberFormatException ignored) {
                return 0;
            }
        }
        return 0;
    }

    /**
     * Method to set the foreign keys and make sure they match
     * @param customer
     * @param fullname
     * @param address
     * @param room
     * @param room_number
     * @return
     */
    public boolean setKeys(Customer customer, String fullname, String address, Room room, int room_number) {
        if (customer.getFullName().equals(fullname) && customer.getAddress().equals(address) && room.getRoom_number() == room_number) {
            this.customer = customer;
            this.room = room;
            return true;
        }
        return false;
    }

    /**
     * Method to verify dates
     * Format of dates MM/DD/YYYY
     * @param date
     * @return
     */
    public boolean verifyDate(String date) {
        String[] date_elements = date.split("/");
        if (date_elements.length == 3 && date_elements[0].length() == 2 && date_elements[1].length() == 2 && date_elements[2].length() == 4) {
            int i; int j;
            for (i = 0; i < date_elements.length; i++) {
                for (j = 0; j < date_elements[i].length(); j++) {
                    if (!Character.isDigit(date_elements[i].charAt(j))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
