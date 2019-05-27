package model;
//
import java.util.*;
//
public class Company{
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
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getEmployees() {
		return employees;
	}

	public void setEmployees(int employees) {
		this.employees = employees;
	}

	public double getValueAseets() {
		return valueAseets;
	}

	public void setValueAseets(double valueAseets) {
		this.valueAseets = valueAseets;
	}

	public String getConstitutionDate() {
		return constitutionDate;
	}

	public void setConstitutionDate(String constitutionDate) {
		this.constitutionDate = constitutionDate;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getLegalRepresentative() {
		return legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

    /*public String toString(){
        String msg = "";
        msg += "El nombre de la empresa es: "+getName();
        return msg;
    }*/
}
