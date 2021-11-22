import com.plugin.api.SampleProvider;
import com.interfaces.UtilityPluginInterface;

public class ImplementationClass {
    public static void main(String args[]){

        UtilityPluginInterface obl=new SampleProvider();
        System.out.println(obl.init("Mahi"));
        System.out.println(obl.sub(5,3));
        System.out.println(obl.add(4,5));
        System.out.println(obl.mul(4,5));

    }
}
