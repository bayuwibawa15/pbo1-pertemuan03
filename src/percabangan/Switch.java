package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Terimakasih pak\"");
                System.out.println("Dosen : \"Selamat ya!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun dapat B pak ?\"");
                System.out.println("Dosen : \"Sudah nasib nya nak ai\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Padahal ulun rajin masuk pak \"");
                System.out.println("Dosen : \"Tapi ikm kda menggawi tugas\"");
                System.out.println("Mhs   : \"*menghilang*\"");
                break;
            default:
                System.out.println("Mhs   : \"kayapa nih pak nilai ulun D\"");
                System.out.println("Dosen : \"meulang ai ikm semester depan\"");
                System.out.println("Mhs   : \"inggih pak ai kdapapa, asal kda sekelas lwn mantan ulun ja\"");
                System.out.println("Dosen : \"tenang ja , kd purun jua bapak meliat km galau terus\"");
                System.out.println("Mhs   : \"oke pak terimakasih\"");
                break;
        }
    }
}
