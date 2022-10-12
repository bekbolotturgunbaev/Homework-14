public class Programmer extends Person {

    public Programmer(String name, String designation, String companyName) {
        super(name, designation, companyName,null,null);
    }

    /**
     * toString
     */
   @Override
    public String toString() {
        return "Name: " + getName() +
               "\nDasignation: " + getDesignation() +
               "\nCompany Name: " + getCompanyName();
   }


    /**
     * Methods
     */

    @Override
   public void learn() {
       System.out.println(super.getName()+" is learning Java");
   }

   @Override
   public void eat() {
       System.out.println(super.getName()+" eats during the break");
   }

   @Override
   public void walk() {
       System.out.println(super.getName()+" walks to work");
   }

   public void coding() {
       System.out.println(super.getName()+" likes to code");
   }
}
