package model;
//
import java.util.*;
//
public class Holding{
    private ArrayList<Company> companys;
    private Cubicle[][] cubicules;
    //
    public Holding(){
        companys = new ArrayList<Company>();
        Company d = new Technology("Apple", "12457478", "cll 16 # 123 - 12", "3215489657", 1250, 1200, "12/5/2019", 'I', "Juancho");
        companys.add(d);
    }
    //
    public void addCompany(Company newCompany){
        companys.add(newCompany);
    }

    public String showInfo(){
        String msg = "";
        if (companys!=null) {
            for (int i=0;i<companys.size();i++) {
                msg+=companys.get(i);
            }
        }
        return msg;
    }

    public String shortInfo(){
        String msg = "";
        if (companys!=null) {
            for (int i=0;i<companys.size();i++) {
                if (companys.get(i) instanceof ServiceCompany) {
                    msg += i+") "+companys.get(i).getName()+"\n";
                }
            }
        }
        return msg;
    }

    public String showShortInfo(){
        String msg = "";
        if (companys!=null) {
            for (int i=0;i<companys.size();i++) {
                msg += i+") "+companys.get(i).getName()+"\n";
            }
        }
        return msg;
    }

    public void addPoll(int type, int index, String a, String b, String c){
        if (type == 1) {
            Education cast = (Education)companys.get(index);
            cast.addPoll(a, b, c);
        }else if (type == 2) {
            Technology cast = (Technology)companys.get(index);
            cast.addPoll(a, b, c);
        }

    }

    public void addBuilding(int index, int floors){
        companys.get(index).addBuilding(floors);
    }

    public String searchWithType(int index, char type){
        String msg = "";
        msg += companys.get(index).searchWithType(type);
        return msg;
    }
}
