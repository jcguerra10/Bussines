package model;
//

public class Product {

    private String name;
    private String code;
    private double waterAmount;
    private int units;
    //
    private Sanitation sanitation;
    private Invima invima;

    //
    /**
     *
     * @param name
     * @param code
     * @param waterAmount
     * @param units
     * @param sanitation
     * @param invima
     */
    public Product(String name, String code, double waterAmount, int units, Sanitation sanitation, Invima invima) {
        this.name = name;
        this.code = code;
        this.waterAmount = waterAmount;
        this.units = units;
        this.sanitation = sanitation;
        this.invima = invima;
    }

    /**
     *
     * @return
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
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return
     */
    public double getWaterAmount() {
        return waterAmount;
    }

    /**
     *
     * @param waterAmount
     */
    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    /**
     *
     * @return
     */
    public int getUnits() {
        return units;
    }

    /**
     *
     * @param units
     */
    public void setUnits(int units) {
        this.units = units;
    }

    /**
     *
     * @return
     */
    public Sanitation getSanitation() {
        return sanitation;
    }

    /**
     *
     * @param sanitation
     */
    public void setSanitation(Sanitation sanitation) {
        this.sanitation = sanitation;
    }

    /**
     *
     * @return
     */
    public Invima getInvima() {
        return invima;
    }

    /**
     *
     * @param invima
     */
    public void setInvima(Invima invima) {
        this.invima = invima;
    }

    //
    /**
     *
     * @return
     */
    public String toString() {
        String msg = "";
        msg += "Nombre del producto: " + getName() + "\n";
        msg += "El codigo del producto es: " + getCode() + "\n";
        return msg;
    }
}
