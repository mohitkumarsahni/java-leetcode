public class Main {

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println("Defanged IP: "+defangIPaddr(address));
    }

    private static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
