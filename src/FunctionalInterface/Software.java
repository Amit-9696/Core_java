package FunctionalInterface;
//subclass
public class Software extends FrontEnd implements BackEnd,Database{
    @Override
    public void DevelopServerProgram(String Language) {
        System.out.println("Develop Server Program By Using "+Language);
    }

    @Override
    public void DesignDatabase(String Vendor) {
        System.out.println("Design Database By Using "+Vendor);
    }
}
