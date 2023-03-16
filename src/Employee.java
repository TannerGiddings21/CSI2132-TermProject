public class Employee {
    private String fullname;
    private String ssn;
    private String position;
    private Employee manager;

    /**
     * Full constructor for Employee
     * @param fullname
     * @param ssn
     * @param position
     */
    public Employee(String fullname, String ssn, String position) {
        if (verifyFullName(fullname) && verifyFullName(position) && verifySSN(ssn)) {
            this.fullname = fullname;
            this.ssn = ssn;
            this.position = position;
        }
    }

    public Employee(){}

    /**
     * Setter for full name
     * @param fullname
     * @return
     */
    public boolean setFullname(String fullname) {
        if (verifyFullName(fullname)) {
            this.fullname = fullname;
            return true;
        }
        return false;
    }

    /**
     * Getter for full name
     * @return
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Setter for ssn
     * @param ssn
     * @return
     */
    public boolean setSNN(String ssn) {
        if (verifySSN(ssn)) {
            this.ssn = ssn;
            return true;
        }
        return false;
    }

    /**
     * Getter for ssn
     * @return
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Setter for manager
     * @param manager_ssn
     * @param employee_ssn
     * @param manager
     * @return
     */
    public boolean setManager(String manager_ssn, String employee_ssn, Employee manager) {
        if (manager_ssn.equals(manager.getSSN()) && ssn.equals(employee_ssn)) {
            this.manager = manager;
            return true;
        }
        return false;
    }

    /**
     * Getter for manager
     * @return
     */
    public Employee getManager() {
        return manager;
    }

    /**
     * Setter for position
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    /**
     * Method to verify an entry for SSN
     * @param ssn
     * @return
     */
    public boolean verifySSN(String ssn) {
        if (ssn.length() > 9) {
            return false;
        }

        for (int i = 0; i < ssn.length(); i++) {
            if (!Character.isDigit(ssn.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method to verify an entry for full name
     * @param fullname
     * @return
     */
    public boolean verifyFullName(String fullname) {
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
