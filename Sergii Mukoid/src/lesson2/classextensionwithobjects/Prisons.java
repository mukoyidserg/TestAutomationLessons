package lesson2.classextensionwithobjects;


public class Prisons {
                                private String prisonName;
                                private int Guards;
                                private String Security;
                                private int Units;
                                private String Type;
                                private String Facilities;
                                private boolean Operation;
                                private String Location;
                                private String Institution;
                                private boolean Legality;
public Prisons(String prisonName) {
	this.prisonName = prisonName;			
}

public String getPrisonName() {return prisonName;}
public void setPrisonName (String prisonName) {
	this.prisonName = prisonName;
}

public int getGuards() {return Guards;}
public void setGuards (int Guards) {
	this.Guards = Guards;
}
public String getSecurity() {return Security;}
public void setSecurity (String Security) {
	this.Security = Security;
}
public int getUnits() {return Units;}
public void setUnits (int Units) {
	this.Units = Units;
}
public String getType() {return Type;}
public void setType (String Type) {
	this.Type = Type;
}
public String getFaciilities() {return Facilities;}
public void setFacilities (String Facilities) {
	this.Facilities = Facilities;
}
public boolean getOperation() {return Operation;}
public void setOperation (boolean Operation) {
	this.Operation = Operation;
}
public String getLocation() {return Location;}
public void setLocation (String Location) {
	this.Location = Location;
}
public String getInstitution() {return Institution;}
public void setInstitution (String Institution) {
	this.Institution = Institution;
}
public boolean getLegality() {return Legality;}
public void setLegality (boolean Legality) {
	this.Legality = Legality;
}

}

