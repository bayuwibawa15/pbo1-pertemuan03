package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 85000;
        double uangDiSaku = 45000;

        if (uangDiSaku<totalBelanja){
            System.out.println("Uang kurang , kurangi belanjaan anda");
        }else{
            System.out.println("Uang cukup, selamat menikmati");
        }
    }
}
