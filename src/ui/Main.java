package ui;
//
import java.util.*;
import model.*;
//
public class Main{
    private Holding emp;
    //
    public Main(){
        init();
    }
    public void init(){
        emp = new Holding();
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.msg();
    }

    public void msg(){
        Scanner scanStr = new Scanner (System.in);
		Scanner scanInt = new Scanner (System.in);
		Scanner scanDou = new Scanner (System.in);
        //
        System.out.println("BIENVENIDO AL PROGRAMA PARA EL HOLDING EMPRESARIAL");
        //
        int option = 0;
		boolean exit = false;
		while (!exit){
			menu();
			option = scanInt.nextInt();
            switch (option) {
                case 1:
                    //
                    System.out.println("Digite el nombre de la empresa");
                    String nameE = scanStr.nextLine();
                    System.out.println("Digite el nit");
                    String nitE = scanStr.nextLine();
                    System.out.println("Digite la direccion");
                    String addressE = scanStr.nextLine();
                    System.out.println("Digite el telefono");
                    String phoneE = scanStr.nextLine();
                    System.out.println("Digite el numero de empleados");
                    int employeesE = scanInt.nextInt();
                    System.out.println("Digite el valor de los activos");
                    double valueAseetsE = scanDou.nextDouble();
                    System.out.println("A continuacion la fecha de constitucion");
                    System.out.println("Dia: ");
                    int day = scanInt.nextInt();
                    System.out.println("Mes: ");
                    int month = scanInt.nextInt();
                    System.out.println("Anio: ");
                    int year = scanInt.nextInt();
                    String constitutionDateE = day+"/"+month+"/"+year;
                    System.out.println("Que tipo de empresa es:");
                    System.out.println("1. Agricultura, Caza, Silvicultura Y Pezca");
                    System.out.println("2. Explotacion de minas y canteras");
                    System.out.println("3. Industria manufacturera");
                    System.out.println("4. Electricidad, gas y vapor");
                    System.out.println("5. Construccion");
                    System.out.println("6. Comercio al por mayor y al por menor");
                    System.out.println("7. Transporte, almacenamiento y comunicaciones");
                    System.out.println("8. Est.f/cieros,seguros,b.inmuebles,serv. A companias");
                    System.out.println("9. Comunales, sociales");
                    //
                    char typeE = 'N';
                    int opType = scanInt.nextInt();
                    if (opType == 1) {
                        typeE = 'A';
                    }else if (opType == 2) {
                        typeE = 'B';
                    }else if (opType == 3) {
                        typeE = 'C';
                    }else if (opType == 4) {
                        typeE = 'D';
                    }else if (opType == 5) {
                        typeE = 'E';
                    }else if (opType == 6) {
                        typeE = 'F';
                    }else if (opType == 7) {
                        typeE = 'G';
                    }else if (opType == 8) {
                        typeE = 'H';
                    }else if (opType == 9) {
                        typeE = 'I';
                    }
                    System.out.println("Digite el nombre del representante legal");
                    String legalRepresentativeE = scanStr.nextLine();
                    //
                    System.out.println("Digite si es: ");
                    System.out.println("1. Empresa de manufactura");
                    System.out.println("2. Empresa de Servicio");
                    int opCompany = scanInt.nextInt();
                    if (opCompany == 1) {
                        Company newCompany = new ManufacturingCompany(nameE, nitE, addressE, phoneE, employeesE, valueAseetsE, constitutionDateE, typeE, legalRepresentativeE);
                        emp.addCompany(newCompany);
                    }else if (opCompany == 2) {
                        System.out.println("Digite si es: ");
                        System.out.println("1. Tecnologia");
                        System.out.println("2. Educacion");
                        int opServiceCompany = scanInt.nextInt();
                        if (opServiceCompany == 1) {
                            Company newServiceCompany = new Technology(nameE, nitE, addressE, phoneE, employeesE, valueAseetsE, constitutionDateE, typeE, legalRepresentativeE);
                            emp.addCompany(newServiceCompany);
                        }else if (opServiceCompany == 2) {
                            System.out.println("Digite el numero de registro ante el MEN");
                            int noMENE = scanStr.nextInt();
                            System.out.println("Digite los anios de acreditados");
                            int acreeditedYearsE = scanInt.nextInt();
                            System.out.println("Digite la posicion del Saber 11");
                            int positioSaber11E = scanInt.nextInt();
                            System.out.println("Digite la posicion del Saber pro");
                            int positionSaberProE = scanInt.nextInt();
                            System.out.println("Digite el nombre del rector");
                            String principalNameE = scanStr.nextLine();
                            System.out.println("Digite el sector educativo");
                            System.out.println("1. Bachillerato");
                            System.out.println("2. Universidad");
                            String educationSectorE = "";
                            int opSector = scanInt.nextInt();
                            if (opSector == 1) {
                                educationSectorE = "Bachillerato";
                            }else if (opSector == 2) {
                                educationSectorE = "Universidad";
                            }
                            System.out.println("Numero de estudiantes de estrato uno y dos");
                            int strataOneAndTwoE = scanInt.nextInt();
                            System.out.println("Numero de estudiantes");
                            int quantityE = scanInt.nextInt();
                            //
                            Company newEducation = new Education(nameE, nitE, addressE, phoneE, employeesE, valueAseetsE, constitutionDateE, typeE, legalRepresentativeE, noMENE, acreeditedYearsE, positioSaber11E, positionSaberProE, principalNameE, educationSectorE, strataOneAndTwoE, quantityE);
                            emp.addCompany(newEducation);
                        }
                    }
                break;
                case 2:
                    //
                    System.out.println(emp.showInfo());
                break;
                case 3:
                    //
                    System.out.println("Que tipo de compania es: ");
                    System.out.println("1. Educacion");
                    System.out.println("2. Tecnologia");
                    int type = scanInt.nextInt();
                    System.out.println("Escoja la compania que desea agregar encuestas");
                    System.out.println(emp.shortInfo());
                    int index = scanInt.nextInt();
                    boolean e = false;
                    for (int i=0;!e;i++ ) {
                        System.out.println("Respuesta 1 encuesta #"+i);
                        String a = scanStr.nextLine();
                        System.out.println("Respuesta 2 encuesta #"+i);
                        String b = scanStr.nextLine();
                        System.out.println("Respuesta 3 encuesta #"+i);
                        String c = scanStr.nextLine();

                        emp.addPoll(type, index, a, b, c);

                        if (i >= 10) {
                            System.out.println("Quiere Seguir agregando encuestas?");
                            System.out.println("1. si");
                            System.out.println("2. no");
                            int cont = scanInt.nextInt();
                            if (cont == 1) {
                                if (i>50) {
                                    System.out.println("Ha exedido el limite");
                                    e = true;
                                }
                            }else if (cont == 2) {
                                e = true;
                            }
                        }
                    }
                break;
                case 4:
                    //
                    System.out.println("Que compania decea agregar un edificio");
                    System.out.println(emp.showShortInfo());
                    int indexE = scanInt.nextInt();
                    System.out.println("Cuantos pisos tiene el edificio (recuerde que es de 3 a 7)");
                    int floors = scanInt.nextInt();
                    //
                    emp.addBuilding(indexE, floors);


            }
        }
    }

    public void menu(){
        System.out.println("1. Para registrar una empresa");
        System.out.println("2. Para obtener toda la infromacion del Holding");
        System.out.println("3. Para agregar encuestas a las empresas de servicio");
        System.out.println("4. Para agregar un edificio");
    }
}
