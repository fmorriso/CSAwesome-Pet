public class TesterClass {


    // main method for testing
    public static void main(String[] args) {
        System.out.format("Java version: %s%n", getJavaVersion());
        // Create 2 Pet objects and test all your methods
        Pet pet1 = new Pet("Sparky", 5, 37.5, "dog", "bull terrior");
        Pet pet2 = new Pet("Ratagast", 4, 4.3, "snake", "ball python");
        Pet pet3 = new Pet("Bubba", 3, 3.3, "snake");
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);
    }



    /** get the java version that is running the current program
     * @return string containing the java version running the current program
     */
    private static String getJavaVersion()
    {
        Runtime.Version rtv = Runtime.version();
        return String.format("%s.%s.%s.%s", rtv.feature(), rtv.interim(), rtv.update(), rtv.patch());
    }

}