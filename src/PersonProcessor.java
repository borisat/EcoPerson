import java.util.Iterator;
import java.util.List;

public class PersonProcessor {

    public static List<EcoPerson> getEcoPerson(List<EcoPerson> personList, int maxResourceUsage) {

        List<EcoPerson> ecoPersonList = personList;
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
        return ecoPersonList;
    }
}
