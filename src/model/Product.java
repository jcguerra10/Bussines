package model;
//
public class Product{
    private String name;
    private String code;
    private double waterAmount;
    private int units;
    //
    private Sanitation sanitation;
    private Invima invima;
    //
	public Product(String name, String code, double waterAmount, int units, Sanitation sanitation, Invima invima) {
		this.name = name;
		this.code = code;
		this.waterAmount = waterAmount;
		this.units = units;
		this.sanitation = sanitation;
		this.invima = invima;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getWaterAmount() {
		return waterAmount;
	}

	public void setWaterAmount(double waterAmount) {
		this.waterAmount = waterAmount;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public Sanitation getSanitation() {
		return sanitation;
	}

	public void setSanitation(Sanitation sanitation) {
		this.sanitation = sanitation;
	}

	public Invima getInvima() {
		return invima;
	}

	public void setInvima(Invima invima) {
		this.invima = invima;
	}
    //
    public String toString() {
        String msg = "";
        msg += "Nombre del producto: " + getName()+"\n";
        msg += "El codigo del producto es: "+getCode()+"\n";
        return msg;
    }
}
