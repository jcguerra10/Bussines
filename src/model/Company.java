package model;
//

import java.util.*;
//

/**
 *
 * @author Juan Camilo Guerra
 */
public class Company {

    public static final char AGRI_SILVI_HUNT_FIDH = 'A';
    public static final char EXPLO_MINES_QUARRIES = 'B';
    public static final char MANUFACTURING = 'C';
    public static final char ELEC_GAS_STEAM = 'D';
    public static final char CONSTRUCTION = 'E';
    public static final char COMMERCE_MM = 'F';
    public static final char TRANS_STORAGE = 'G';
    public static final char EST_INSU_ESTATE_SERV = 'H';
    public static final char SOCIAL_COMUNALS = 'I';
    //
    protected String name;
    protected String nit;
    protected String address;
    protected String phone;
    protected int employees;
    protected double valueAseets;
    protected String constitutionDate;
    protected char type;
    protected String legalRepresentative;
    //
    protected Cubicle[][] cubicules;

    //

    /**
     * Description: Constructor of Company
     *
     * @param name
     * @param nit
     * @param address
     * @param phone
     * @param employees
     * @param valueAseets
     * @param constitutionDate
     * @param type
     * @param legalRepresentative
     */
    public Company(String name, String nit, String address, String phone, int employees, double valueAseets, String constitutionDate, char type, String legalRepresentative) {
        this.name = name;
        this.nit = nit;
        this.address = address;
        this.phone = phone;
        this.employees = employees;
        this.valueAseets = valueAseets;
        this.constitutionDate = constitutionDate;
        this.type = type;
        this.legalRepresentative = legalRepresentative;
    }

    //

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return nit
     */
    public String getNit() {
        return nit;
    }

    /**
     *
     * @param nit
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     *
     * @return employees
     */
    public int getEmployees() {
        return employees;
    }

    /**
     *
     * @param employees
     */
    public void setEmployees(int employees) {
        this.employees = employees;
    }

    /**
     *
     * @return valueAseets
     */
    public double getValueAseets() {
        return valueAseets;
    }

    /**
     *
     * @param valueAseets
     */
    public void setValueAseets(double valueAseets) {
        this.valueAseets = valueAseets;
    }

    /**
     *
     * @return constitutionDate
     */
    public String getConstitutionDate() {
        return constitutionDate;
    }

    /**
     *
     * @param constitutionDate
     */
    public void setConstitutionDate(String constitutionDate) {
        this.constitutionDate = constitutionDate;
    }

    /**
     *
     * @return type
     */
    public char getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(char type) {
        this.type = type;
    }

    /**
     *
     * @return legalRepresentative
     */
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    /**
     *
     * @param legalRepresentative
     */
    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    //

    /**
     * Description: this method add a new bulding to a especific company
     *
     * @param floors
     */
    public void addBuilding(int floors) {
        cubicules = new Cubicle[floors][20];
        int k = 0;
        for (int i = 0; i < cubicules.length; i++) {
            k = 0;
            for (k = 0; k < cubicules[0].length; k++) {
                Cubicle newCubicle = new Cubicle(null, null, null, null);
                cubicules[i][k] = newCubicle;
                int n = (int) (Math.random() * 10000) + 1;
                String w = "E-" + n;
                cubicules[i][k].setExtension(w);
            }

        }
    }

    /**
     * Description: this method search in the Cubicules the extension and save
     * in msg
     *
     * @param type
     * @return msg
     */
    public String searchWithType(char type) {
        String msg = "";
        if (type == 'L') {
            for (int i = 0; i < cubicules.length; i++) {
                msg += cubicules[i][0].getExtension() + "\n";
            }
            msg += "\n";
            for (int k = 0; k < cubicules[0].length; k++) {
                int length = cubicules.length - 1;
                msg += cubicules[length][k].getExtension() + "\n";
            }
        } else if (type == 'Z') {
            for (int i = 0; i < cubicules[0].length; i++) {
                msg += cubicules[0][i].getExtension() + "\n";
            }
            msg += "\n";
            boolean exit = false;
            int a = 0;
            int b = cubicules[0].length - 1;
            while (!exit) {
                msg += cubicules[a][b].getExtension() + "\n";
                ++a;
                --b;
                if (a >= cubicules.length) {
                    exit = true;
                }
                if (b <= 0) {
                    exit = true;
                }
            }
            msg += "\n";
            for (int k = 0; k < cubicules[0].length; k++) {
                int length = cubicules.length - 1;
                msg += cubicules[length][k].getExtension() + "\n";
            }
        } else if (type == 'X') {
            boolean exit = false;
            for (int i = 0; !exit; i++) {
                if (i < cubicules.length && i < cubicules[0].length) {
                    msg += cubicules[i][i].getExtension() + "\n";
                } else if (i >= cubicules.length || i >= cubicules[0].length) {
                    exit = true;
                }
            }
            msg += "\n";
            int a = 0;
            int b = cubicules[0].length - 1;
            exit = false;
            while (!exit) {
                msg += cubicules[a][b].getExtension() + "\n";
                ++a;
                --b;
                if (a == cubicules.length) {
                    exit = true;
                }
                if (b == 0) {
                    exit = true;
                }
            }
        } else if (type == 'O') {
            for (int i = 0; i < cubicules[0].length; i++) {
                msg += cubicules[0][i].getExtension() + "\n";
            }
            msg += "\n";
            for (int i = 0; i < cubicules.length; i++) {
                msg += cubicules[i][cubicules[0].length - 1].getExtension() + "\n";
            }
            msg += "\n";
            for (int i = 0; i < cubicules.length; i++) {
                msg += cubicules[i][0].getExtension() + "\n";
            }
            msg += "\n";
            for (int k = 0; k < cubicules[0].length; k++) {
                int length = cubicules.length - 1;
                msg += cubicules[length][k].getExtension() + "\n";
            }
        } else if (type == 'E') {
            boolean exit = false;
            int i = 0;
            int f = 0;
            int k = 0;
            while (!exit) {
                if (cubicules.length % 2 != 0) {
                    if (f < cubicules.length) {
                        for (i = 0; i < cubicules[0].length; i++) {
                            msg += cubicules[f][i].getExtension() + "\n";
                        }
                        msg += "\n";
                    } else {
                        exit = true;
                    }
                    f = f + 1;
                    if (f < cubicules.length) {
                        for (k = cubicules[0].length - 1; k > 0; k--) {
                            msg += cubicules[f][k].getExtension() + "\n";
                        }
                        msg += "\n";
                    } else {
                        exit = true;
                    }
                    f = f + 1;
                } else {
                    msg += "No es posible ya que el numero de pisos es par";
                    exit = true;
                }
            }
        }
        return msg;
    }

    /**
     * Description: this method get the spiral name and search the charge
     * designated
     *
     * @param charge
     * @return
     */
    public String getSpiralEmails(String charge) {
        String msj = "";
        boolean downRigth = false;
        boolean lastUp = false;
        boolean upLeft = false;
        int adder = 0;
        int receiver = 0;

        for (int i = 0; i < cubicules.length; i++) {
            //Abajo
            for (int k = 0; i < cubicules[0].length - adder; k++) {
                if (cubicules[k][i].getCharge().equals(charge)) {
                    msj += cubicules[k][i].getEmail();
                }
                downRigth = true;
            }
            //Abajo derecha
            if (downRigth == true) {
                for (int j = 1; j < cubicules[0].length - adder; j++) {
                    if (cubicules[cubicules.length][j].getCharge().equals(charge)) {
                        msj += cubicules[cubicules.length][j].getEmail();
                    }
                    lastUp = true;
                }
            }

            if (lastUp == true) {
                for (int k = cubicules.length; k > adder; k--) {

                    if (cubicules[k][cubicules.length].getCharge().equals(charge)) {
                        msj += cubicules[k][cubicules.length].getEmail();
                    }
                    upLeft = true;
                }
            }

            if (upLeft == true) {
                for (int m = cubicules.length - adder; m > receiver; m--) {
                    if (cubicules[receiver][m].getCharge().equals(charge)) {
                        msj += cubicules[receiver][m].getEmail();
                    }
                }
            }

            downRigth = false;
            lastUp = false;
            upLeft = false;
            adder++;
            receiver++;
        }

        return msj;

    }

}
