package model;
//
import java.util.*;
//
public class ManufacturingCompany extends Company{
    private ArrayList<Product> products;

    public ManufacturingCompany(String name, String nit, String address, String phone, int employees, double valueAseets, String constitutionDate, char type, String legalRepresentative){
        super(name, nit, address, phone, employees, valueAseets, constitutionDate, type, legalRepresentative);
        products = new ArrayList<Product>();
    }

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
    public String toString(){
        String msg = "";
        msg += "SOY UNA EMPRESA DE MANUFACTORIA \n";
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
}
