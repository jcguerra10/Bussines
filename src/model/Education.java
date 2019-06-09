package model;
//

public class Education extends ServiceCompany implements Taxable {

    private int noMEN;
    private int acreeditedYears;
    private int positioSaber11;
    private int positionSaberPro;
    private String principalName;
    private String educationSector;
    private int strataOneAndTwo;
    private int quantity;

    //
    public Education(String name, String nit, String address, String phone, int employees, double valueAseets, String constitutionDate, char type, String legalRepresentative, int noMEN, int acreeditedYears, int positioSaber11, int positionSaberPro, String principalName, String educationSector, int strataOneAndTwo, int quantity) {
        super(name, nit, address, phone, employees, valueAseets, constitutionDate, type, legalRepresentative);
        this.noMEN = noMEN;
        this.acreeditedYears = acreeditedYears;
        this.positioSaber11 = positioSaber11;
        this.positionSaberPro = positionSaberPro;
        this.principalName = principalName;
        this.educationSector = educationSector;
        this.strataOneAndTwo = strataOneAndTwo;
        this.quantity = quantity;
    }

    /**
     *
     * @return noMEN
     */
    public int getNoMEN() {
        return noMEN;
    }

    /**
     *
     * @param noMEN
     */
    public void setNoMEN(int noMEN) {
        this.noMEN = noMEN;
    }

    /**
     *
     * @return acreeditedYears
     */
    public int getAcreeditedYears() {
        return acreeditedYears;
    }

    /**
     *
     * @param acreeditedYears
     */
    public void setAcreeditedYears(int acreeditedYears) {
        this.acreeditedYears = acreeditedYears;
    }

    /**
     *
     * @return positioSaber11
     */
    public int getPositioSaber11() {
        return positioSaber11;
    }

    /**
     *
     * @param positioSaber11
     */
    public void setPositioSaber11(int positioSaber11) {
        this.positioSaber11 = positioSaber11;
    }

    /**
     *
     * @return positionSaberPro
     */

    public int getPositionSaberPro() {
        return positionSaberPro;
    }

    /**
     *
     * @param positionSaberPro
     */
    public void setPositionSaberPro(int positionSaberPro) {
        this.positionSaberPro = positionSaberPro;
    }

    /**
     *
     * @return principalName
     */
    public String getPrincipalName() {
        return principalName;
    }

    /**
     *
     * @param principalName
     */
    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    /**
     *
     * @return educationSector
     */
    public String getEducationSector() {
        return educationSector;
    }

    /**
     *
     * @param educationSector
     */
    public void setEducationSector(String educationSector) {
        this.educationSector = educationSector;
    }

    /**
     *
     * @return strataOneAndTwo
     */
    public int getStrataOneAndTwo() {
        return strataOneAndTwo;
    }

    /**
     *
     * @param strataOneAndTwo
     */
    public void setStrataOneAndTwo(int strataOneAndTwo) {
        this.strataOneAndTwo = strataOneAndTwo;
    }

    /**
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     *
     * @return msg
     */
    public String toString() {
        String msg = "";
        msg += "SOY UNA EMPRESA DE EDUCACION \n";
        msg += "Nombre: " + super.getName() + "\n";
        msg += "Nit: " + super.getNit() + "\n";
        msg += "Direccion: " + super.getAddress() + "\n";
        msg += "Telefono: " + super.getPhone() + "\n";
        msg += "Empleados: " + super.getEmployees() + "\n";
        msg += "El valor de los activos: " + super.getValueAseets() + "\n";
        msg += "Fecha de constitucion: " + super.getConstitutionDate() + "\n";
        msg += "Tipo de compañia: " + super.getType() + "\n";
        msg += "Nombre del representante legal: " + super.getLegalRepresentative() + "\n";
        msg += "Tax que debe pagar: " + calcTaxable() + "\n";
        return msg;
    }

    /**
     *
     * @return tot
     */
    public double calcTaxable() {
        double tot = 0.0;
        tot = 20 % -getStrataOneAndTwo();
        if (tot < 0) {
            tot = 0.0;
        }
        return tot;
    }
}
