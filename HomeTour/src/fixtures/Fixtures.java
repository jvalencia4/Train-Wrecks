package fixtures;

public abstract class Fixtures {
private String name;
private String shortDescription;
private String longDescription;

public Fixtures() {
	
}

public Fixtures(String name, String shortDescription, String longDescription) {
this.name=name;
this.shortDescription=shortDescription;
this.longDescription=longDescription;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getShortDescription() {
	return shortDescription;
}
public void setShortDescription(String shortDescription) {
	this.shortDescription=shortDescription;
}

public String getLongDescription() {
	return longDescription;
}

public void setLongDescription(String longDescription) {
	this.longDescription=longDescription;
}
}
