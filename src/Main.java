public class Main {
    public static void main(String[] args) {
        Köpek ilkKöpegim = new Köpek("tom","golden",18);

        System.out.println("köpegimin adı " + ilkKöpegim.getIsim( ) +
                ilkKöpegim.getCins()  +
                ilkKöpegim.getYas() );
        ilkKöpegim.setIsim("kara");
        System.out.println("köpegim isim" + ilkKöpegim.getIsim());
    }
}