package model;
//
import java.util.*;
//
public class Technology extends ServiceCompany{
    private ArrayList<String> services;
    //
    public Technology(String name, String nit, String address, String phone, int employees, double valueAseets, String constitutionDate, char type, String legalRepresentative){
        super(name, nit, address, phone, employees, valueAseets, constitutionDate, type, legalRepresentative);
        services = new ArrayList<String>();
        services.add("Consultoria");
        services.add("Software a la medida");
        services.add("Infraestructura");
        services.add("Software");
        services.add("Plataforma");
    }

    public String toString(){
        String msg = "";
        msg += "SOY UNA EMPRESA DE TECNOLOGIA \n";
        msg += "Nombre: "+super.getName()+"\n";
        msg += "Nit: "+super.getNit()+"\n";
        msg += "Direccion: "+super.getAddress()+"\n";
        msg += "Telefono: "+super.getPhone()+"\n";
        msg += "Empleados: "+super.getEmployees()+"\n";
        msg += "El valor de los activos: "+super.getValueAseets()+"\n";
        msg += "Fecha de constitucion: "+super.getConstitutionDate()+"\n";
        msg += "Tipo de compañia: "+super.getType()+"\n";
        msg += "Nombre del representante legal: "+super.getLegalRepresentative()+"\n";
        if (polls != null){
            int k=0;
            for (int i=0;i<polls.length;i++) {
                k=0;
                for (k=0;k<polls[0].length;k++) {
                    if (polls[i][k] != null) {
                        msg += polls[i][k];
                    }
                }
            }
        }
        return msg;
    }

    public int energyxtree(int kilowatts){
        int trees = 0;
        if (kilowatts>=1 && kilowatts<=1000) {
            trees = 8;
        }else if (kilowatts>=1001 && kilowatts<=3000) {
            trees = 35;
        }else if (kilowatts>3000) {
            trees = 500;
        }
        return trees;
    }

}
