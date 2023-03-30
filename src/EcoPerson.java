
public class EcoPerson {

    private int id;
    private String name;
    private int waterCount;
    private int gasCount1;
    private int gasCount2;
    private int electroCount1;
    private int electroCount2;


    public EcoPerson(int id, String name, int waterCount, int gasCount1,
                     int gasCount2, int electroCount1, int electroCount2) {
        this.id = id;
        this.name = name;
        this.waterCount = waterCount;
        this.gasCount1 = gasCount1;
        this.gasCount2 = gasCount2;
        this.electroCount1 = electroCount1;
        this.electroCount2 = electroCount2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWaterCount() {
        return waterCount;
    }

    public int getGasCount1() {
        return gasCount1;
    }

    public int getGasCount2() {
        return gasCount2;
    }

    public int getElectroCount1() {
        return electroCount1;
    }

    public int getElectroCount2() {
        return electroCount2;
    }


    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.getId()).append("|");
        stringBuilder.append(this.getName()).append("|");
        stringBuilder.append(this.getWaterCount()).append("|");
        stringBuilder.append(this.getGasCount1()).append("|");
        stringBuilder.append(this.getGasCount2()).append("|");
        stringBuilder.append(this.getElectroCount1()).append("|");
        stringBuilder.append(this.getElectroCount2()).append("\r\n");

        return stringBuilder.toString();
    }
}
