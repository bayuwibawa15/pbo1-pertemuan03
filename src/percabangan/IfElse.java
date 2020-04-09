package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 45000;
        double uangDiSaku = 78000;

        if (uangDiSaku<totalBelanja) {
            System.out.println("Uang kurang , kurangi belanjaan anda");
        }else if(uangDiSaku>totalBelanja){
            double angsul = uangDiSaku-totalBelanja;
            System.out.println("Angsulan anda "+angsul);
        }else{
            System.out.println("Uang cukup, selamat menikmati");
        }
    }
}
