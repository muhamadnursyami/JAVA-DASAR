public class MethodOverloading {
    public static void main(String[] args) {
//        Method Overloading adalah cara untuk menggunakan
//        method dengan menggunakan nama yang sama
//        tetapi harus memiliki parameter nya berbeda
//        dan tipe data yang berbeda

//    Pemanggilan function dengan nama yang sama
        helloWorld();
        helloWorld("Syami");
        helloWorld("Muhamad", "Syami");
    }
// Method dengan nama yang sama semua
    static  void helloWorld () {
        System.out.println("Helloworld1");
    }

    static  void helloWorld(String firstName) {
        System.out.println( "Hello " + firstName);
    }

    static void helloWorld( String firstName, String lastName) {
        System.out.println( "Haii.. "+firstName + lastName);
    }

}
