import java.util.Iterator;
import java.util.List;

public class PersonProcessor {

    public static void getEcoPerson(List<EcoPerson> ecoPersonList, int maxResourceUsage) {


        Iterator<EcoPerson> iterator = ecoPersonList.iterator();
        while (iterator.hasNext()) {
            EcoPerson person = iterator.next();
            int resourceWater = person.getWaterCount();
            int resourceGas = person.getGasCount1() + person.getGasCount2();
            int resourceElectro = person.getElectroCount1() + person.getElectroCount2();

            if (resourceWater > maxResourceUsage ||
                    resourceElectro > maxResourceUsage ||
                    resourceGas > maxResourceUsage) {
                iterator.remove();
            }
        }
    }
}
