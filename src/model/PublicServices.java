package model;
//

import java.util.*;
//

public class PublicServices extends Company implements Taxable {

    public static final String SEWERAGE = "Alcantarillado";
    public static final String ENERGY = "Energia";
    public static final String AQUEDUCT = "Acueducto";
    private String typeCompany;
    private int totalSubs;
    private int totalSubsOneAndTwo;

    //
    /**
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
     * @param typeCompany
     * @param totalSubs
     * @param totalSubsOneAndTwo
     */
    public PublicServices(String name, String nit, String address, String phone, int employees, double valueAseets, String constitutionDate, char type, String legalRepresentative, String typeCompany, int totalSubs, int totalSubsOneAndTwo) {
        super(name, nit, address, phone, employees, valueAseets, constitutionDate, type, legalRepresentative);
        this.typeCompany = typeCompany;
        this.totalSubs = totalSubs;
        this.totalSubsOneAndTwo = totalSubsOneAndTwo;
    }

    //
    /**
     *
     * @return
     */
    public String getTypeCompany() {
        return typeCompany;
    }

    /**
     *
     * @param typeCompany
     */
    public void setTypeCompany(String typeCompany) {
        this.typeCompany = typeCompany;
    }

    /**
     *
     * @return
     */
    public int getTotalSubs() {
        return totalSubs;
    }

    /**
     *
     * @param totalSubs
     */
    public void setTotalSubs(int totalSubs) {
        this.totalSubs = totalSubs;
    }

    /**
     *
     * @return
     */
    public int getTotalSubsOneAndTwo() {
        return totalSubsOneAndTwo;
    }

    /**
     *
     * @param totalSubsOneAndTwo
     */
    public void setTotalSubsOneAndTwo(int totalSubsOneAndTwo) {
        this.totalSubsOneAndTwo = totalSubsOneAndTwo;
    }

    /**
     *
     * @return
     */
    public String toString() {
        String msg += "";
        msg += "Soy una empresa de servicio publico";
        msg += "Nombre: " + super.getName() + "\n";
        msg += "Nit: " + super.getNit() + "\n";
        msg += "Direccion: " + super.getAddress() + "\n";
        msg += "Telefono: " + super.getPhone() + "\n";
        msg += "Empleados: " + super.getEmployees() + "\n";
        msg += "El valor de los activos: " + super.getValueAseets() + "\n";
        msg += "Fecha de constitucion: " + super.getConstitutionDate() + "\n";
        msg += "Tipo de compañia: " + super.getType() + "\n";
        msg += "Nombre del representante legal: " + super.getLegalRepresentative() + "\n";
        return msg;
    }

    /**
     *
     * @return
     */
    public double calcTaxable() {
        double tot = 0.0;

        return tot;
    }
}
