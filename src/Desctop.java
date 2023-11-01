public class Desctop {
    String cpu;
    String gpu;
    int ram;
    int ssd;

    @Override
    public String toString() {
        return "Desctop{" +
                "gen='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                '}';
    }


}
