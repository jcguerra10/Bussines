package model;
//
public class Education extends ServiceCompany implements Taxable{
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
	public int getNoMEN() {
		return noMEN;
	}

	public void setNoMEN(int noMEN) {
		this.noMEN = noMEN;
	}

	public int getAcreeditedYears() {
		return acreeditedYears;
	}

	public void setAcreeditedYears(int acreeditedYears) {
		this.acreeditedYears = acreeditedYears;
	}

	public int getPositioSaber11() {
		return positioSaber11;
	}

	public void setPositioSaber11(int positioSaber11) {
		this.positioSaber11 = positioSaber11;
	}

    public int getPositionSaberPro() {
        return positionSaberPro;
    }

    public void setPositionSaberPro(int positionSaberPro) {
        this.positionSaberPro = positionSaberPro;
    }

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getEducationSector() {
		return educationSector;
	}

	public void setEducationSector(String educationSector) {
		this.educationSector = educationSector;
	}

	public int getStrataOneAndTwo() {
		return strataOneAndTwo;
	}

	public void setStrataOneAndTwo(int strataOneAndTwo) {
		this.strataOneAndTwo = strataOneAndTwo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

    public String toString(){
        String msg = "";
        msg += "SOY UNA EMPRESA DE EDUCACION \n";
        msg += "Nombre: "+super.getName()+"\n";
        msg += "Nit: "+super.getNit()+"\n";
        msg += "Direccion: "+super.getAddress()+"\n";
        msg += "Telefono: "+super.getPhone()+"\n";
        msg += "Empleados: "+super.getEmployees()+"\n";
        msg += "El valor de los activos: "+super.getValueAseets()+"\n";
        msg += "Fecha de constitucion: "+super.getConstitutionDate()+"\n";
        msg += "Tipo de compañia: "+super.getType()+"\n";
        msg += "Nombre del representante legal: "+super.getLegalRepresentative()+"\n";
        return msg;
    }

    public double calcTaxable(){
        double tot = 0.0;
        tot = 20% - getStrataOneAndTwo();
        if (tot < 0) {
            tot = 0.0;
        }
        return tot;
    }
}
