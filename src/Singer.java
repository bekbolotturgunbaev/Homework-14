public class Singer extends Person{

    public Singer(String name,String designation,String bandName) {
        super(name, designation, null,null,bandName);
    }

    /**
     * toString
     */
        @Override
        public String toString() {
            return "Name: " + getName() +
                    "\nDasignation: " + getDesignation() +
                    "\nBand Name: " + getBandName();
        }


    /**
     * Methods
     */
    @Override
    public void learn() {
        System.out.println(super.getName()+" teaches singing");
    }

    @Override
    public void walk() {
        System.out.println(super.getName()+" goes for a walk with friends");
    }

    @Override
    public void eat() {
        System.out.println(super.getName()+" goes to a restaurant with friends to eat");
    }

    public void singing() {
        System.out.println(super.getName()+" not only sings but also a rapper");
    }

    public void playGitar() {
        System.out.println(super.getName()+" and his team play guitar");
    }
}
