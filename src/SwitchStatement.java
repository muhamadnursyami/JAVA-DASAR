import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class SwitchStatement {
    public static void main(String[] args) {
        String nilai = "c";

//        Swicth Normal
        switch (nilai) {
            case "A":
                System.out.println("Anda lulus");
                break;
            case "B":
                System.out.println("Anda bagus");
            default:
                System.out.println("Anda salah jurusan");
        }

//  Switch Lamda
        switch (nilai){
            case "A" -> System.out.println("Bagus");
            case "B", "C" -> System.out.println("Cukup");
            default -> {System.out.println("Salah jurusan ");}
        }

    }


}
