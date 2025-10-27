public class DemoBlanket {
    public static void main(String[] args) {
        Blanket blanket = new Blanket();
        blanket.printBlanket();
        System.out.println("---------------------");
        Blanket blanket2 = new Blanket();
        blanket2.setSize("King");
        blanket2.setMaterial("Cashmere");
        blanket2.setColor("Blue");
        blanket2.setPrice(20.56);
        blanket2.printBlanket();
        System.out.println("-----------------");

        Electric_Blanket electric_blanket = new Electric_Blanket();
        electric_blanket.setHeatSettings(0);
        electric_blanket.setAutomaticShutoff("YES");
        electric_blanket.printBlanket();
    }
}
