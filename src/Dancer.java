public class Dancer extends Person{

    public Dancer(String name,String designation, String groupName) {
        super(name,designation,null,groupName,null);
    }


    /**
     * toString
     */
    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nDasignation: " + getDesignation() +
                "\nGroupName: " + getGroupName();
    }


    /**
     * Methods
     */
    @Override
    public void learn() {
        System.out.println(super.getName()+" teaches dancing");
    }

    @Override
    public void walk() {
        System.out.println(super.getName()+" is walking outside");
    }

    @Override
    public void eat() {
        System.out.println(super.getName()+" is going to eat");
    }

        public void dancing() {
            System.out.println(super.getName()+" is the King of dancing");
    }
}
