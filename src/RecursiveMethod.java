public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(  rekursive(5));
    }

    static int rekursive (int value) {
        if(value == 1){
            return 1;
        }
        return  value * rekursive(value - 1);
    }
}
