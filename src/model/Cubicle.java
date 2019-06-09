package model;
//

import java.util.*;
//

public class Cubicle {

    private String employees;
    private String charge;
    private String email;
    private String extension;

    //

    /**
     * Description: this is the constructor of Cubicle
     *
     * @param employees
     * @param charge
     * @param email
     * @param extension
     */
    public Cubicle(String employees, String charge, String email, String extension) {
        this.employees = employees;
        this.charge = charge;
        this.email = email;
        this.extension = extension;
    }

    //

    /**
     *
     * @return employees
     */
    public String getEmployees() {
        return employees;
    }

    /**
     *
     * @param employees
     */
    public void setEmployees(String employees) {
        this.employees = employees;
    }

    /**
     *
     * @return charge
     */
    public String getCharge() {
        return charge;
    }

    /**
     *
     * @param charge
     */
    public void setCharge(String charge) {
        this.charge = charge;
    }

    /**
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     *
     * @param extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
}
