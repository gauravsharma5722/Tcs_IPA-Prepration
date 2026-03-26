package Question3;

public class TravelAgencies {
    // regNo - int
// agencyName - String
// packageType - String
// price - int
// flightFacility -boolean
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }
}
