package model;
//
public class Sanitation{
    public static final String ROOM_TEMPERATURE = "Temperatura ambiente";
    public static final String REFRIGERATION = "Refrigeration";
    public static final String FREEZING = "Congelacion";
    //
    private boolean imported;
    private String importer;
    private String conservation;
    //
	public Sanitation(boolean imported, String importer, String conservation) {
		this.imported = imported;
		this.importer = importer;
		this.conservation = conservation;
	}
    
	public boolean isImported() {
		return imported;
	}

	public void setImported(boolean imported) {
		this.imported = imported;
	}

	public String getImporter() {
		return importer;
	}

	public void setImporter(String importer) {
		this.importer = importer;
	}

	public String getConservation() {
		return conservation;
	}

	public void setConservation(String conservation) {
		this.conservation = conservation;
	}
}
