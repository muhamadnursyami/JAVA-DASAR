public class MethodVariabelArgument {
    public static void main(String[] args) {
    sayCongrats("name", 1,2,3,4,5);
    }
    static void sayCongrats(String name, int... values){
//        variabel yang bertipe wajib disikan nilai 0 untuk number
//        nilai null untuk charakter
        int total = 0;
        for (int sum : values){
             total += sum;
        }
        System.out.println(total);
    }
}
