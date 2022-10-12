public class Person {
    private String name;
    private String designation;
    private String companyName;
    private String groupName;
    private String bandName;



    /**
     * Сonstructor
     */
    public Person(String name, String designation , String companyName,String groupName,String bandName) {
        this.name = name;
        this.designation = designation;
        this.companyName = companyName;
        this.groupName = groupName;
        this.bandName = bandName;
    }



    /**
     * Methods
     */
    public void learn() {
        System.out.println("");
    }

    public void walk() {
        System.out.println("");
    }


    public void eat(){
        System.out.println("");
    }



    /**
     * Get and Set
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
