package jobsheet8;

/**
 *
 * @author HP ZBOOK 15
 */
public class PerulanganBersarang {
    public static void main(String[] args) {

        // membuat variabel
        int x, y, z;

        // melakukan perulangan sebanyak x dan y kali
        for (x = 0; x <= 1; x++){
            for( y = 0; y <= 2; y++){
                for(z = 0; z <= 3; z++) {
                System.out.format("Perulangan [x=%d, y=%d, z=%d] %n", x, y, z);
                }
            }
        }
    }
}
