package lesson2;

public class Cities {
	private int population;
	private int area;
	private int gdp;
	private int divisions;
	private int yearFound;
	private String country;
	private String name;
	private int elevation;
	private int populGrowth;
	private int populDensity;
	private int majorId;

	public Cities(int population, String name) {
		this.population = population;
		this.name = name;
	}

	public Cities(String country, String name) {
		this.country = country;
		this.name = name;
	}

	public Cities() {
		divisions = 10000;
	}

	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}

	public int getMajorId() {
		return majorId;
	}

	public void setPopul(int population) {
		this.population = population;
	}

	public int getPopul() {
		return population;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getArea() {
		return area;
	}

	public void setGdp(int gdp) {
		this.gdp = gdp;
	}

	public int getGdp() {
		return gdp;
	}

	public void setDivisions(int divisions) {
		this.divisions = divisions;
	}

	public int getDivisions() {
		return divisions;
	}

	public void setYearFound(int population) {
		this.yearFound = yearFound;
	}

	public int getYearFound() {
		return yearFound;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;
	}

	public void setElevation(int elevation) {
		this.elevation = elevation;
	}

	public int getElevation() {
		return elevation;
	}

	public void setPopulGrowth(int populGrowth) {
		this.populGrowth = populGrowth;
	}

	public int getPopulGrowth() {
		return populGrowth;
	}

	public void setPopulDensity(int populDensity) {
		this.populDensity = populDensity;
	}

	public int getPopulDensity() {
		return populDensity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {

		Cities cityKyiv = new Cities();
		Cities cityLisbon = new Cities(700000, "Lisbon");
		Cities citySevilla = new Cities("Spain", "Sevilla");
		People cityKyivMajor = new People();
		cityKyivMajor.setId(cityKyiv.getMajorId());

		cityKyiv.setPopul(6000000);
		System.out.println("Population of Kyiv city is " + cityKyiv.getPopul());
		System.out.println("Kyiv has such number of divisions as " + cityKyiv.getDivisions());

		Cities cityVinnytsa = new Cities();
		cityVinnytsa.setGdp(500000);
		System.out.println(cityVinnytsa.getGdp());
	}

}