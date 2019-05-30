package model;
//
import java.util.*;
//
public class PublicServices extends Company implements Taxable{
    public static final String SEWERAGE = "Alcantarillado";
    public static final String ENERGY = "Energia";
    public static final String AQUEDUCT = "Acueducto";
    private String typeCompany;
    private int totalSubs;
    private int totalSubsOneAndTwo;
    //
    public PublicServices(String name, String nit, String address, String phone, int employees, double valueAseets, String constitutionDate, char type, String legalRepresentative, String typeCompany, int totalSubs, int totalSubsOneAndTwo){
        super(name, nit, address, phone, employees, valueAseets, constitutionDate, type, legalRepresentative);
        this.typeCompany = typeCompany;
        this.totalSubs = totalSubs;
        this.totalSubsOneAndTwo = totalSubsOneAndTwo;
    }
    //
	public String getTypeCompany() {
		return typeCompany;
	}

	public void setTypeCompany(String typeCompany) {
		this.typeCompany = typeCompany;
	}

	public int getTotalSubs() {
		return totalSubs;
	}

	public void setTotalSubs(int totalSubs) {
		this.totalSubs = totalSubs;
	}

	public int getTotalSubsOneAndTwo() {
		return totalSubsOneAndTwo;
	}

	public void setTotalSubsOneAndTwo(int totalSubsOneAndTwo) {
		this.totalSubsOneAndTwo = totalSubsOneAndTwo;
	}

    public double calcTaxable(){
        double tot = 0.0;
        
        return tot;
    }
}
